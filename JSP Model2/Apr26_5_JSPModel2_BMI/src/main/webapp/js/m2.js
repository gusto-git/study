function bmicheck(){
	
	let namebox = document.f.name;
	let heightbox = document.f.height;
	let weightbox = document.f.weight;
	let photobox = document.f.photo;
	
	if(isEmpty(namebox) || atLeastLetter(namebox, 2)){
		alert('이름을 입력하세요');
			namebox.value="";
			namebox.focus();
			return false;
			
	} else if (isEmpty(heightbox) || atLeastLetter(heightbox, 3) || isNotNumber(heightbox)){
		alert('키를 다시입력하세요');
			heightbox.value="";
			heightbox.focus();
			return false;
			
	} else if (isEmpty(weightbox) || atLeastLetter(weightbox, 2) || isNotNumber(weightbox)){
		alert('몸무게를 다시입력하세요');
			weightbox.value="";
			weightbox.focus();
			return false;
			
	} else if (isEmpty(photobox) ||
	(isNotType(photobox,"jpg") && isNotType(photobox,"png") 
	&& isNotType(photobox,"gif"))){
		photobox.value="";
		photobox.focus();
		return false;
	}
	return true;
}