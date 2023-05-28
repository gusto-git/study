// 회원가입용 유효성 검사
function  signUpCheck(){
//	alert("connected");

	let m_id = document.singupForm.m_id;
	let m_pw = document.singupForm.m_pw;
	let m_pwChk = document.singupForm.m_pwChk;
	let m_name = document.singupForm.m_name;
	let m_phone = document.singupForm.m_phone;
	let m_photo = document.singupForm.m_photo;
	
	if(isEmpty(m_id)){
		alert("ID 똑바로 쓰자");
		m_id.value="";
		m_id.focus();
		return false;
	} else if(isEmpty(m_pw) || notEqualPW(m_pw, m_pwChk)){
		alert("PW 똑바로 쓰자");
		m.pw.value="";
		m_pw.focus();
		return false;
	} else if(isEmpty(m_name)){
		alert("이름 똑바로 쓰자")
		m.name.value="";
		m.name.focus();
		return false;
		
	} else if(isEmpty(m_phone)){
		alert("번호 똑바로 쓰자")
		m.phone.value="";
		m.phone.focus();
		return false;
		
	} else if(isEmpty(m_photo || isNotType(m_photo, "jpg") || isNotType(m_photo, "png") || isNotType(m_photo, "gif"))){
		alert("사진 똑바로 넣자")
		m.photo.value="";
		m.photo.focus();
		return false;
	}
	return true;

}

function loginCheck(){
	
	let m_id = document.loginForm.m_id;
	let m_pw = document.loginForm.m_pw
	
	if(isEmpty(m_id)){
		alert("ID 똑바로 쓰자");
		m_id.value="";
		m_id.focus();
		return false;
		
	} else if(isEmpty(m_pw)){
		alert("PW 똑바로 쓰자");
		m.pw.value="";
		m_pw.focus();
		return false;
	}
	 return true;	
}

// 정보 수정용 유효성 검사

function updateCheck(){

	let m_pw = document.updateForm.m_pw;
	let m_pwChk = document.updateForm.m_pwChk;
	let m_name = document.updateForm.m_name;
	let m_phone = document.updateForm.m_phone;
	let m_photo = document.updateForm.m_photo;
	
	if(isEmpty(m_pw) || notEqualPW(m_pw, m_pwChk)){
		alert("PW 똑바로 쓰자");
		m.pw.value="";
		m_pw.focus();
		return false;
	} else if(isEmpty(m_name)){
		alert("이름 똑바로 쓰자")
		m.name.value="";
		m.name.focus();
		return false;
		
	} else if(isEmpty(m_phone)){
		alert("번호 똑바로 쓰자")
		m.phone.value="";
		m.phone.focus();
		return false;
		
	} else if(isEmpty(m_photo || isNotType(m_photo, "jpg") || isNotType(m_photo, "png") || isNotType(m_photo, "gif"))){
		alert("사진 똑바로 넣자")
		m.photo.value="";
		m.photo.focus();
		return false;
	}
	return true;
}
