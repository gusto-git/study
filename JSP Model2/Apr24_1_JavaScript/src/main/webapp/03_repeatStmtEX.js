// 03_repeatStmtEX.js
//alert('확인');

// let row = 0;
// let col = 0; 

// documnet.write() 웹페이가 로딩될 때 실행되면, 웹페이지에 가장 먼저 출력!
//	보통 테스트용도 or 디버깅 용도로 사용
//  중간에 document.write()실행이되면 웹페이지 안에 먼저 로딩된 모든 데이터를 지우고 자신의 데이터를 출력하는 특징


// 펑션이 실행되는지 펑션을 만들때마다 확인해주는 습관이 좋다.

	//	document.write('<h1>안녕?</h1>'); html 태그 이용가능
	//  반복문을 활용해서 
	//	행의 개수, 열의 개수 입력하면 행 x 열의 테이블이 만들어지게 
	//	각 td안에 숫자가 카운팅 되서 값이 나오게
//	
//	
//	document.write("<table border='1'>");
//	document.write("<tr height='50px'>");
//	document.write("<td width='50px' align='center'>1</td> ");
//	document.write("<td width='50px' align='center'>2</td> ");
//	document.write("<td width='50px' align='center'>3</td> ");
//	document.write("</tr>");
//	
//	document.write("<tr height='50px'>");
//	document.write("<td width='50px' align='center'>4</td> ");
//	document.write("<td width='50px' align='center'>5</td> ");
//	document.write("<td width='50px' align='center'>6</td> ");
//	document.write("</tr>");
//	
//	document.write("<tr height='50px'>");
//	document.write("<td width='50px' align='center'>7</td> ");
//	document.write("<td width='50px' align='center'>8</td> ");
//	document.write("<td width='50px' align='center'>9</td> ");
//	document.write("</tr>");
//	document.write('</table>');
function makeTable(){	
	let row = prompt('행 개수를 입력해주세요')
	let col = prompt('열 개수를 입력해주세요')
	alert(row + 'X' + col + '의 table을 만듭니다')
	
	let count = 1;
	document.write("<table border='1'>");
		for(let i = 0;  i < row; i++){
			document.write("<tr height='50px'>")
			for(let j = 0; j < col; j++){
				document.write("'<td width='50px' align='center'>");
				document.write(count);
				document.write("</td>");
				count++; // 각 행에 1씩 더해진다.
		}	
		document.write("</tr>")
	}			
	document.write("</table>");
}