//may03_Check.js

// 지역 입력하는 부분 : 빈칸이면 안넘어가게
// 가격 입력하는 부분 : 빈칸 x , 숫자만입력
// 소개 입력하는 부분 : 빈간 x , 최소 5글자 이상 


function appleRegCheck(){
	let lBox = document.appleRegForm.a_location;
	let pBox = document.appleRegForm.a_price;
	let iBox = document.appleRegForm.a_introduce;
	
	if(isEmpty(lBox)){
		alert("지역 똑바로 쓰세요");
		lBox.value="";
		lBox.focus();
		return false;
	} else if(isEmpty(pBox) || isNotNumber(pBox)){
		alert("가격 똑바로 쓰세요");
		pBox.value="";
		pBox.focus();
		return false;
		
	} else if(isEmpty(iBox) || atLeastLetter(iBox,5)){
		alert("소개 똑바로 쓰세요");
		iBox.value="";
		iBox.focus();
		return false;
	}
	
	
	return true;
}