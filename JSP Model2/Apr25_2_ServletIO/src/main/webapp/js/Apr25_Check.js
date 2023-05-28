// Apr25_Check

// 이름 : 필수, 최소 2글자
// 키 : 필수, 최소 3글자, 숫자만
// 몸무게 : 필수 , 최소 2글자, 숫자만
// 사진 : 필수 jpg, png, gif 

function checkBMI(){
	let nameInput = document.bmiForm.name;
	let heightInput = document.bmiForm.height;
	let weightInput = document.bmiForm.weight;
	let photoInput = document.bmiForm.photo;
	
	if(isEmpty(nameInput) || atLeastLetter(nameInput, 2)){
		alert('이름을 입력하세요');
			nameInput.value="";
			nameInput.focus();
			return false;
			
	} else if(isEmpty(heightInput) || atLeastLetter(heightInput, 3) ||
	 isNotNumber(heightInput)){
		alert('정확한 키를 입력하세요');
			heightInput.value="";
			heightInput.focus();
			return false;

	}else if(isEmpty(weightInput) || atLeastLetter(weightInput, 2) || 
	isNotNumber(weightInput)){
		alert('정확한 몸무게를 입력하세요');
			weightInput.value="";
			weightInput.focus();
			return false;
			
	} else if(isEmpty(photoInput) ||
	(isNotType(photoInput,"jpg") && isNotType(photoInput,"png") 
	&& isNotType(photoInput,"gif"))){
		photoInput.value="";
		photoInput.focus();
		return false;
	}
	
	return true;
}












