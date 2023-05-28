///**
// * 06_ConditionalStmt.js
// */
//// alert('확인!')
// 
// // 조건문(Conditional Statement)
// 
// // if : 가장 기본적인 조건문
// //		if절 괄호 속의 조건을 보고 성립(true)하면 실행이 되도록
// 
// // 18살 이상이면 alert로 어서오세요!
// 
// let age = 20;
// if(age >= 18) {
////	alert('어서오세요');
//}
//
//// let, const가 다른 블록에서 같은 이름으로 선언이 가능하다
//let a = 1; 
//if(true){
//	let a = 2;
//	console.log('if문 속의  let a 가'+ a); //2
//}
//console.log('if문 밖의 let a가 ' + a); // 1
//
//// if-else
//const b = 100;
//// b가 10보다 크면 console.log로 b는 10보다 큽니다
//// 그 외 나머지 : console.log 다릅니다.
//
//
//if(b > 10){
//	console.log('b는 10보다 큽니다')
//} else{
//	console.log('다릅니다')
//}
//
//// if-else if-else
//// 변수 c에 숫자를 입력받아서
//// c가 10보다 크면 [너무 큰 숫자]
//// c가 10보다 같으면 [정답] 
//// c가 10보다 작으면 [너무 작은 숫자]
//// 가 크롬 개발자 도구 console에 뜨게
//
////let c = prompt('c의 값은?')
//let c = propt('숫자쓰세요~');
//if (Number(c) > 10){
//	console.log('너무 큰 숫자')
//} else if(c == 10){
//	console.log('정답')
//} else if(c < 10){
//	console.log('너무 작은 숫자')
//}

// switch-case
// 사과 : 100원
// 바나나 : 200원
// 키위 : 300원
// 멜론 : 500원
// 수박 : 500원
// 나머지 과일은 그런거 없는데요?가 alert로
// 사고싶은 과일을 입력받아서 해당하는 가격을 출력?

//let fruit = prompt('과일 입력:');
//switch(fruit){
//	case '사과' :
//		alert('100원')  //backtick
//		break;
//	case '바나나' :
//		alert('200원')
//		break;
//	case '키위' :
//		alert('300원')
//		break;	
//	case '멜론' :
//	case '수박' :
//		alert('500원')
//		break;		
//	default :
//		alert('그런거 없는데요?')	
//}

let fruit = prompt('과일 입력:');
switch(fruit){
	case '사과' :
		alert(`${fruit} :100원`)  //backtick
		break;
	case '바나나' :
		alert(`${fruit} :200원`)
		break;
	case '키위' :
		alert(`${fruit} :300원`)
		break;	
	case '멜론' :
	case '수박' :
		alert(`${fruit} :500원`)
		break;		
	default :
		alert('그런거 없는데요?')	
}

