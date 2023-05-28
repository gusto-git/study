function check(){
	let numBox=document.nbForm.userAns;
	
	if(isEmpty(numBox)
	|| atLeastLetter(numBox, 3)
	||  isNotNumber(numBox)
	|| numBox.value[0] == numBox.value[1]
	|| numBox.value[1] == numBox.value[2]
	|| numBox.value[2] == numBox.value[0]) {
		alert("제대로쓰세요");
		numBox.value="";
		numBox.focus();
		return false;
	}
	return true;
}