//alert("connected")

// 회원가입 페이지로 넘어가기
function signupGo(){
	location.href = "SignUpController";
}

function logout(){
	let really = confirm("정말로 로그아웃");
	if(really){
		location.href = "LoginController"
	}
}

// 내정보로 이동하기
function memberInfoGo(){
	location.href = "MemberInfoController";
}


// 회원 탈퇴하기
function bye(){
	let t = prompt('진짜 탈퇴하시겠습니까? (Y/N)')
	if(t == 'Y' || t == 'y'){
		location.href = "DeleteMemberController";
	}
	
}