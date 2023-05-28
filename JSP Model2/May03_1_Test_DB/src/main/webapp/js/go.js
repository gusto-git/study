// go.js 페이지 이동하는 JavaScript 코드만 작성하는 부분

// 상세정보보기
function goAppleDetail(loc){
	// 특정한 데이터의 디테일을 보고 싶음
	location.href = "AppleDetailController?a_location=" + loc;
}

// 데이터 삭제하기
function deleteApple(loc){
	let t = confirm(`${loc} 사과 정말 지우려고?`) // 확인을 누르면 true, 취소 false
	
	if (t){ //알림창에서 확인을 눌렀으면
		location.href="AppleDeleteController?a_location=" + loc; // a_location은 dao에서 쓴 String location (delete 메소드)와 같아야한다.
	}
}