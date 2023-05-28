package com.gusto.may231.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.gusto.db.manager.GustoDBManager;

public class BoardDAO {
	private int allBoardMsgCount;
	
	private static final BoardDAO BDAO = new BoardDAO();
	
	private BoardDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public static BoardDAO getBdao() {  // getBdao를 통해서 method 접근 가능하도록 만듬 
		return BDAO;
	}
	
	// 전체 글 갯수 가져오기 countAllBoardMsg();
	
	public void countAllBoardMsg() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		try {
			con = GustoDBManager.connect("leePool");
			
			String sql = "select count(*) from may23_board";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); //select 문은 rs에
			rs.next();
			allBoardMsgCount = rs.getInt("count(*)"); // 맴버변수에 해당 전체 게시글 수를 담는다.
			System.out.println(allBoardMsgCount);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		GustoDBManager.close(con, pstmt, rs);
	}
	
	// 검색어 입력했을때 해당하는 게시글 갯수 가져오기
	private int countSearchMsg(String search) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = GustoDBManager.connect("leePool");
			String sql = "select count(*) from may23_board, may23_member b_writer = m_id and b_text like '%'||?||'%'";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, search); // 바로 위에 파라미터에 있는 search임
			rs = pstmt.executeQuery();
			rs.next(); // 카운팅하는거라 반복문이 필요없다. 
			return rs.getInt("count(*)"); // 갯수를 리턴 시켜준다. 
			
		} catch (Exception e) {
			e.printStackTrace();
			return 0; // 리턴시킬게 없으면 0을 리턴한다. 
			
		} finally {
			GustoDBManager.close(con, pstmt, rs);
		}
	}
	
	
	// 검색어 값 가져오기
	public void searchBoardMsg(HttpServletRequest req) {
		// 새로운 요청이 일어났을 때 (페이지 전환)에도 검색어는 살아있어야함
		String search = req.getParameter("search"); // <input name=search에서 가져옴>
		// 검색(요청) -> 25개 -> 한 페이지에 게시글 10개 보여줄 거다.
		// 검색한 것의 2페이지로 요청
		// 검색한 것의 3페이지로 요청해도 남아있어야함
		// 그래서 session이 필요하다.
		req.getSession().setAttribute("search", search);
	}
	
	// 게시판에 처음 접근  or 검색어 입력을 하지 않았을 때 
	public  void clearSearch(HttpServletRequest req) {
		req.getSession().setAttribute("search", null);
		
	}
	
	// 게시글 보이게 하기 - select(R)
	public void getBoardMsg(int pageNo, HttpServletRequest req) { // pageNo을 받아오기 전 파라미터로 쓸거기 때문에 넣어둠
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = GustoDBManager.connect("leePool"); // db연결 
			
			// 게시글 전체 갯수 
			int boardCount = allBoardMsgCount;
			String search = (String) req.getSession().getAttribute("search"); // 검색어 가지고오겠다.
			if (search == null) { // 검색어가 없다. -> 게시글 전체조회
				search = "";
			} else { // 검색어가 있다.
				boardCount =  countSearchMsg(search); // 검색어가 있을때 countSearchMsg를 쓰기 위해 만든것
			}
			
			int boardPerPage = 3; // 한페이지에 표시될 게시글의 수 
			// 게시글에 따라 나뉘는 페이지 수(소수점 올림)
			int pageCount = (int) Math.ceil(boardCount / (double) boardPerPage);
			req.setAttribute("pageCount", pageCount);
			req.setAttribute("pageNo", pageNo);
			
			int start = boardPerPage * (pageNo -1 ) + 1; // 페이지 당 첫번째 게시글의 번호
			int end = (pageNo == pageCount) ? boardCount : (start + boardPerPage - 1); // 페이지 당 마지막 게시글의 번호 
			
			String sql = "select * "
					+ "	from( "
					+ "		select rownum as rn, b_no, b_writer, b_when, b_text, m_photo "
					+ "			from( "
					+ "				select *  "
					+ "					from may23_board, may23_member "
					+ "					where b_writer = m_id and b_text like '%'||?||'%' "
					+ "					order by b_when desc "
					+ " 			) "				
					+ "	) "
					+ "where rn >= ? and rn <= ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, search);
			pstmt.setInt(2, start);
			pstmt.setInt(3, end);
			
			rs = pstmt.executeQuery();
			
			ArrayList<Board> boards = new ArrayList<Board>();
			Board board = null;
			while (rs.next()) {
				board = new Board();
				board.setB_no(rs.getInt("b_no"));
				board.setB_writer(rs.getString("b_writer"));
				board.setB_when(rs.getDate("b_when"));
				board.setB_text(rs.getString("b_text"));
				board.setM_photo(rs.getString("m_photo"));
				boards.add(board);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		GustoDBManager.close(con, pstmt, rs);
		
		
	}
	
}
