function getDrink(){
	a: while(true){ // 무한 반복
		if(money < 500){
			alert('잔액이 부족합니다. 돈을 더 넣으세요');
			break; // while을 깬다.
		}
		let drink= propmt('음료를 골라주세요.', '\'멈춰\'를 입력하시면 잠시 멈춥니다.');
		
		switch(drink){
			case "콜라" :
				alert(`${drink}를 선택했습니다. ${money}에서 500원을 차감합니다.`)
				money -= 500;
				console.log('현재금액 : ' + money + '원');
				break; // switch-case 깨짐
		}
		
		
		
		
		
		
		
		
	} // while
} // function