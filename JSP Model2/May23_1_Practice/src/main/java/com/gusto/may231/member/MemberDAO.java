package com.gusto.may231.member;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gusto.db.manager.GustoDBManager;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

// MODEL
public class MemberDAO {
	// index.jsp의 <jsp:include=${lp}> 부분
	public static boolean loginCheck(HttpServletRequest req) {
		Member m = (Member) req.getSession().getAttribute("loginMember");
		if (m != null) {
			// 로그인이 성공 + 상태유지
			req.setAttribute("lp", "member/welcome.jsp");
			return true;
			
		} else {
			// 로그인 상태 아니거나 + 실패
			req.setAttribute("lp", "member/login.jsp");
			return false;
		}
	}

	// 회원가입 
	public static void signUp(HttpServletRequest req) {
		// 파일 업로드 우선
		String path = null;
		MultipartRequest mr = null;
		try {
			path = req.getServletContext().getRealPath("img"); // webapp의 img 폴더
			System.out.println(path);
			
			mr = new MultipartRequest(req, path, 20*1024*1024, "UTF-8", new DefaultFileRenamePolicy());
			
			
		} catch (Exception e) { // 파일 업로드 실패한 경우 
			e.printStackTrace();
			req.setAttribute("r", "회원가입 실패(사진파일용량)");
			return; // 사진 업로드 실패하면 아래 작성할 DB작업은 하지 못하게 막는 작업(강제종료)
		}
		
		// 파일 업로드 성공시에 계속 진행
		// CRUD 중 C(INSERT)
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			// db 연결 : context.xml , ojdbc9.jar, gustodbmanager.jar
			con = GustoDBManager.connect("leePool");
			
			// 요청 파라미터 값 받아와서 변수 그릇에 넣기
			// signup.jsp에서 받아오는 값을 의미
			String id = mr.getParameter("m_id"); // 괄호 안은 요청 파라미터 명의미
			String pw = mr.getParameter("m_pw");
			String name = mr.getParameter("m_name");
			String phone = mr.getParameter("m_phone");
			// 생일 
			// 202305023 : 년도는 4자리 , 받아올땐 string으로 받아짐
			String y = mr.getParameter("m_y");
			int m = Integer.parseInt(mr.getParameter("m_m"));
			int d = Integer.parseInt(mr.getParameter("m_d"));
			String birthday = String.format("%s%02d%02d", y,m,d); 

			// 파일 이름 받아오기
			String photo = mr.getFilesystemName("m_photo");
			photo = URLEncoder.encode(photo, "UTF-8").replace("+", " ");
			// 여기 까지하면 요청 파라미터 값을 정상적으로 받아 올 수 있음
			
			// 미완성 sql문 작성 
			String sql = "insert into MAY23_MEMBER values(?, ?, ?, ?, to_date(?, 'YYYYMMDD'), ?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, phone);
			pstmt.setString(5, birthday);
			pstmt.setString(6, photo);
			
			if (pstmt.executeUpdate() == 1) { // db에 데이터가 하나 잘들어가면
				req.setAttribute("r", "회원가입 성공!");
				
			} 
			
		} catch (Exception e) { // id중복, db연결상태 안좋을떄
			e.printStackTrace();
			// db쪽 문제로 회원가입은 실패했지만, 사진파일은 업로드가 되어있는 상태
			// 위에서 사진이 업로드 되고나서 회원가입을 하는 순서로 작성했기 때문
			// 따라서 사진 파일을 지워야함(참고: 파일명은 한글처리가 되어있지 않아아함)
			File f = new File(path + "/" + mr.getFilesystemName("m_photo"));
			f.delete();
			req.setAttribute("r", "회원가입 실패-DB문제");
			
		}
		GustoDBManager.close(con, pstmt, null);
		
	}

	// 로그인 기능
	// 세션 쿠키를 사용하기 때문에 res 필요 
	public static void login(HttpServletRequest req, HttpServletResponse res) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = GustoDBManager.connect("leePool");
			req.setCharacterEncoding("UTF-8");
			// login.jsp에서 요청 파라미터로 받아옴(m_id, m_pw)
			String id = req.getParameter("m_id");
			String pw = req.getParameter("m_pw");
			
//			String sql = "select * from may23_member"; // 회원 1000명이면 그거 다 불러달라 -> 적합하지 않음
//			String sql = "select * from may23_member where m_id = ? and m_pw = ? ";  부적합 : 해킹에 취약함
//				drop table may23_member cascade constraint purge;
			// 해킹 기법 - SQL Injection : 보안상 취약점을 이용해서 데이터베이스가 비정상적인 동작을 하게 하는 기법
			
			String sql = "select * from may23_member where m_id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery(); // 해당하는 모든 정보가 rs에 담긴다.
			
			if (rs.next()) { // 데이터가 있는 지 + 있으면 그 데이터를 가르키게 만드는 구문
				String dbPw = rs.getString("m_pw"); // rs에서 해당하는 m_pw를 dbPw에 담는다.
				if (dbPw.equals(pw)) { // 입력받은 비밀번호(pw)와, dbPw(db에 있는 pw)가 같으면 빈 javabean에 rs로 받은 정보 다 넣기 
					Member m = new Member(rs.getString("m_id"), dbPw, rs.getString("m_name") , rs.getString("m_phone"), 
						 rs.getDate("m_birthday"), rs.getString("m_photo"));
					
					req.getSession().setAttribute("loginMember", m); // 세션 loginMember에 m(자바빈) 담기
					req.getSession().setMaxInactiveInterval(600); // 600초 동안 유지 
					
					Cookie c = new Cookie("lastLoginId", id);
					c.setMaxAge(60 * 60 * 24 * 3);
					res.addCookie(c);
					req.setAttribute("r", "로그인 성공");
				} else {
					req.setAttribute("r", "로그인 실패(PW 오류)");
				}
				
			} else {
				req.setAttribute("r", "로그인 실패(미가입 ID)");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "로그인 실패(DB서버)");
		}
		GustoDBManager.close(con, pstmt, rs);
	}

	// 로그아웃 기능
	public static void logout(HttpServletRequest req) {
//		// 세션 끊기 : 비추
//		req.getSession().setMaxInactiveInterval(-1);
		
		// loginMember에 대한 session만 null 처리
		req.getSession().setAttribute("loginMember", null);
		req.setAttribute("r", "로그아웃 성공!");
	}
	
	// 회원 탈퇴 -> DB에 있는 데이터 지우고 + 회원 프로필 사진도 지워야함
	// SESSION에는 여전히 정보가 남아 있어서 SESSION도 삭제 해야한다.  -> 이건 CONTROLLER에서 진행
	public static void delete(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = GustoDBManager.connect("leePool");
			// 로그인멤버 세션에 담겨있는 정보 받아서 자바빈에 입히기
			Member m = (Member) req.getSession().getAttribute("loginMember");
			String m_id = m.getM_id();
			
			String sql = "delete from may23_member where m_id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, m_id);
			
			if (pstmt.executeUpdate() == 1) {
				req.setAttribute("r", "탈퇴성공");
				// 탈퇴가 됐다면 프로필 사진도 지워야함
				String m_photo = m.getM_photo(); // 인코딩 처리되어있어서 디코딩필요
				m_photo = URLDecoder.decode(m_photo, "UTF-8");
				String path = req.getServletContext().getRealPath("img");
				File f = new File(path + "/" + m_photo);
				f.delete();
			} else {
				req.setAttribute("r", "이미 탈퇴처리됨");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "탈퇴실패(DB문제)");
		}
		GustoDBManager.close(con, pstmt, null);
		
	}
	
	// 정보수정 - U(update)
	public static void update(HttpServletRequest req) {
		// 사진 파일 업로드에 실패하면 -> 거기서 수정 못하도록
		
		String path = null;
		MultipartRequest mr = null;
		// 현재 로그인한 상태의 세션 정보를  자바빈에 담기 
		Member m = (Member) req.getSession().getAttribute("loginMember");
		
		String old_m_photo = m.getM_photo(); // 기존사진
		String new_m_photo = m.getM_photo(); // 새로 사진 업로드
		
		try {
			path = req.getServletContext().getRealPath("img");
			mr = new MultipartRequest(req, path, 20*1024*1024, "UTF-8", new DefaultFileRenamePolicy());
			
			// 사진을 바꿀수도 안바꿀수도이씅ㅁ
			new_m_photo = mr.getFilesystemName("m_photo"); // 새로 선택한 파일명
			if (new_m_photo != null) { // 새로운 파일을 선택했다면
				new_m_photo = URLEncoder.encode(new_m_photo, "UTF-8").replace("+", " ");
				
			}else { // 새로운 파일 안 넣었다면
				new_m_photo = old_m_photo;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일 업로드 문제..(용량같은거)");
			return;
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = GustoDBManager.connect("leePool");
			
			String id = mr.getParameter("m_id"); // 괄호 안은 요청 파라미터 명의미
			String pw = mr.getParameter("m_pw");
			String name = mr.getParameter("m_name");
			String phone = mr.getParameter("m_phone");
			// 생일 
			// 202305023 : 년도는 4자리 , 받아올땐 string으로 받아짐
			String y = mr.getParameter("m_y");
			int m_m = Integer.parseInt(mr.getParameter("m_m"));
			int m_d = Integer.parseInt(mr.getParameter("m_d"));
			String birthday = String.format("%s%02d%02d", y,m_m,m_d); 
			
			String sql = "update MAY23_MEMBER set m_pw = ?, m_name = ?, m_phone = ?, m_birthday = to_date(?, 'YYYYMMDD'), m_photo = ? where m_id = ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, pw);
			pstmt.setString(2, name);
			pstmt.setString(3, phone);
			pstmt.setString(4, birthday);
			pstmt.setString(5, new_m_photo);
			pstmt.setString(6, id);
			
			if (pstmt.executeUpdate() == 1) {
				req.setAttribute("r", "정보 수정 성공");
				if (!new_m_photo.equals(old_m_photo)) { // 프사를 바꿨으면
					// 기존 파일지우기
					new File(path + "/" + URLDecoder.decode(old_m_photo, "UTF-8")).delete();
				}
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
				m = new Member(id, pw, name, phone, sdf.parse(birthday), new_m_photo);
				req.getSession().setAttribute("loginMember", m); // 새로운 데이터(m)를 loginMember에 넣는다.
			} else {
				req.setAttribute("r", "정보수정실패");
				if (!new_m_photo.equals(old_m_photo)) { // 프사를 바꿨으면 -> 올라간 사진 삭제
					new File(path + "/" + URLDecoder.decode(new_m_photo, "UTF-8")).delete();
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "정보수정실패 DB");
			if (!new_m_photo.equals(old_m_photo)) { // 프사를 바꿨으면 -> 올라간 사진 삭제
				try {
					new File(path + "/" + URLDecoder.decode(new_m_photo, "UTF-8")).delete();
				} catch (UnsupportedEncodingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		GustoDBManager.close(con, pstmt, null);
	}


}
