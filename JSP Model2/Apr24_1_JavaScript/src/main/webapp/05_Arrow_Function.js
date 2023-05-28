//05_Arrow_Function
alert('확인');

//화살표함수(Arrow Function)
//		04_Function.js 파일에서 다뤘던 함수 [함수선언문]이라고 함

/* function sayHello(){
	console.log('Hello');
}
sayHello*/

//	화살표 함수[함수표현식]이라고 함 
//let sayHi = function sayHello(){
//	console.log('Hello');
//}
//sayHi();

// 함수선언문과 함수 표현식의  문법적 차이
//		호출하는 타이밍이 다름

// 함수 선언문은 어디서든지 호출해서 사용이 가능
sayHello(); // 함수 만들기 이전에 먼저 부를 수 있음!
function sayHello(){
	console.log('Hello');
}

// JS는 프로그램이 실행되기 전에 모든 [함수선언문]을 찾아서 모아서
// 메모리에 저장하고 있다가 필요할 때 내부적으로 끌어 올려서 사용
// 이미 저장이 되어 있기 때문에 -> 함수가 먼저 호출되어도 오류없이 작동 잘함
// 실제 코드가 끌어올려지는 것은 아니고, 실제 메모리상에는 큰 변화가 없음
// 이것을 '호이스팅(Hoisting)'이라고 함

// [함수  표현식]은 코드에 도달하면 생성

// 그래서 둘중에 뭘  쓰면되나요? -> 편한거
// 나는 조금 더 자유를 원한다? -> 함수 선언문
/**
 1.
let add = function (num1, num2){
	return num1 + num2;
}

// 2.
let add = (num1, num2) =>{
	return num1 + num2;
}

// 3. return 생략 가능
let add = (num1, num2) =>(
	num1 + num2
) -> 이렇게 표현해야 생략이 가능하다.
// 요즘은 표현식을 더 많이쓴다.

// 4. 리턴할 코드가 한줄이라면 -> 중괄호도 생략가능
let add = (num1, num2) => num1 + num2;

// 5. 파라미터 (인자)가 하나만 필요햐ㅏ다면 -> 파라미터 소괄호도 생략가능
let sayHi = name => `Hello, ${name}`;
 */

// 6. 파라미터가 없는 함수는 소괄호 생략이 [불가능]
let sayYourName = () =>{
	console.log('외쳐!');
}

// Function vs Method
//		지금까지 공부해온 function은 진짜 funtion!!!
let pertson = {
	name : 'lee',
	walk : function (){
		console.log('됴각됴각');
	} // Method : 객체의 속성(프로퍼티)로 할당된 함수, 객체의 속성으로 들어가야 메소드라고 부른다
}
















