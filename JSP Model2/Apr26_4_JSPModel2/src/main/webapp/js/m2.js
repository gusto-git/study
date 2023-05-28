//alert("coo");
//M 역할
//	front-end 개발자 B(유효성 검사 파일도 Frond-end A개발자가 만듬)

function check(){
	let x = document.f.x;
	let y = document.f.y;
	
	if(isEmpty(x) || isNotNumber(x) || isEmpty(y) || isNotNumber(y)){
		alert("Oops!");
		return false;
	}
	return true;
}
