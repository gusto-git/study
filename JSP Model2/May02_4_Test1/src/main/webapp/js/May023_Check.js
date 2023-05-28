function calcCheck(){
	let xBox = document.CalcForm.x;
	let yBox = document.CalcForm.y;
	
	if(isEmpty(xBox) || isNotNumber(xBox) || isEmpty(yBox)|| isNotNumber(yBox)){
		alert("제대로 입력하세요");
		xBox.value="";
		yBox.value="";
		xBox.focus();
		return false;
		
	}
	
	return true;
	
}