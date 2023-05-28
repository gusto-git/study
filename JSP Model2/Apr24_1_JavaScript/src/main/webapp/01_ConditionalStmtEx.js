/**
 * 
 */
// alert("확인");
 
// function kkk(){
//	alert('ㅋㅋㅋㅋ');
//}

// '돈넣기' 라는 버튼을 클릭하면 [돈을 넣어주세요] 라는 경고창이 뜨도록 만들기 - 함수 이용

function coin(){
	alert('돈을 넣어주세요');
}

// 버튼 3개를 추가해서 각각 100원 500원 1000원 텍스트 넣기
// 각 버튼에 기능 넣기 
let money = 0;
function btn1(){
	money += 100;
	console.log('현재금액 : ' + money + '원');
	choiceDrink();
	
}
function btn2(){
	money += 500;
	console.log('현재금액 : ' + money + '원');
	choiceDrink();
}
function btn3(){
	money += 1000;
	console.log('현재금액 : ' + money + '원');
	choiceDrink();
}	

// 500원 미만 : '선택할 수 있는 음료 없음!'
// 500원 이상 : '콜라선택가능!'
// 700원 이상 : '콜라, 사이다 선택가능!'
// 1000원 이상 : 콜라, 사이다, 닥터페퍼 선택가능!
// 2000원 이상 : 콜라, 사이다, 닥터페퍼, 맥주 선택가능!
// 3000원 이상 : 콜라, 사이다, 닥터페퍼, 맥주, 소주 선택가능!

function choiceDrink(){
	if(money >= 3000){
	alert('콜라, 사이다, 닥터페퍼, 맥주,소주 선택가능!');
	}else if(money >= 2000){
	alert('콜라, 사이다, 닥터페퍼, 맥주 선택가능!');
	}else if(money >= 1000){
	alert('콜라, 사이다, 닥터페퍼 선택가능!');
	}else if(money >= 700){
	alert('콜라, 사이다 선택가능!');
	}else if(money >= 500){
	alert('콜라 선택가능!');
	}else{
	alert('선택할 수 있는 음료 없음!');
	}
	
}

// function명 : getDrink()
// 반복문 사용해서 500원 보다 적으면 [잔액이 부족합니다. 돈을 더 넣으세요]
// 뽑을 음료를 써주세요! 
// 음료를 입력하면 해당 하는 금액만큼 빠지고 
// [콜라를 선택했습니다. 1000원에서 500원을 차감합니다.] alert
// [현재금액 500원]
// 예) 1100원을 입력한 상태에서 돈을 더 넣을 생각일 때 [멈춰]를 입력하면 
// 잠시 멈추고 돈을 더 입력할 수 있도록 만들기
// 돈이 부족한데 더 비싼 음료를 쓰면 [돈이 부족합니다]
// 없는 음료를 고르면 [다시 선택하세요]가 alert
// 반복문 while / 조건문 swtich-case
//			if(money < 500);{
//				alert('돈이 부족합니다.');
//				break a;
//			}
function getDrink(){
 a:	while(true){ // 무한 반복
		if(money < 500){
			alert('잔액이부족합니다. 돈을 더 넣으세요');
			break; // while을 깬다.
		}
	let drink = prompt('뽑을 음료를 골라주세요.', '\'멈춰\'를 입력하면 잠시 멈춥니다.');
	
	switch(drink) {
		case "콜라" :
			alert(`${drink}를 선택했습니다. ${money}에서 500원을 차감합니다.`);
			money -= 500;
			console.log('현재금액 : ' + money + " 원");
			break; // switch-case 깨짐  -> 다시 while 문으로 돌아간다.
			// 위에 이미 500원 이하 일때 if문이 작성되어 있어서 따로 작성 안함
			
		case "사이다":
			if(money < 700){
				alert('돈이 부족합니다.')
				break a;
			}	
			alert(`${drink}를 선택했습니다. ${money}에서 700원을 차감합니다.`);
			money -= 700;
			console.log('현재금액 : ' + money + " 원");
			break;
			
		case "닥터페퍼":
			if(money < 1000){
				alert('돈이 부족합니다.')
				break a;
			}	
			alert(`${drink}를 선택했습니다. ${money}에서 1000원을 차감합니다.`);
			money -= 1000;
			console.log('현재금액 : ' + money + " 원");
			break;	
			
		case "맥주":
			if(money < 2000){
				alert('돈이 부족합니다.')
				break a;
			}	
			alert(`${drink}를 선택했습니다. ${money}에서 2000원을 차감합니다.`);
			money -= 2000;
			console.log('현재금액 : ' + money + " 원");
			break;		
			
		case "소주":
			if(money < 3000){
				alert('돈이 부족합니다.')
//				break; // switch-case문이 깨져서 따른 음료 고를 수 있음
				break a; // 반복문이 깨짐
			}	
			alert(`${drink}를 선택했습니다. ${money}에서 3000원을 차감합니다.`);
			money -= 3000;
			console.log('현재금액 : ' + money + " 원");
			break;	
		
		case "멈춰":
			alert('잠시 멈춤!')
			break a;	
		
		default:
			alert(`${drink}는(은)없습니다. 다시 선택해주세요.`);
			break;
			
		}
	} 
} 
















