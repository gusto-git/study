function appleRegCheck(){
	let lBox = document.appleRegForm.a_location;
	let pBox = document.appleRegForm.a_price;
	let iBox = document.appleRegForm.a_introduce;
	
	if(isEmpty(lBox)){
		alert("옳바른 지역을 입력하세요");
		lBox.value="";
		lBox.focus();
		return false; // 여기서 false가 나오면 reg.jsp -> AppleRegController로 넘어가지지 않는다. 
	
	} else if(isEmpty(pBox) || isNotNumber(pBox)){
		alert("옳바른 가격을 입력하세요");
		pBox.value="";
		pBox.focus();
		return false;
	
	} else if(isEmpty(iBox) || atLeastLetter(iBox, 5) ){
		alert("소개 똑바로 쓰세요");
		iBox.value="";
		iBox.focus();
		return false;
	}
	return ture;
}