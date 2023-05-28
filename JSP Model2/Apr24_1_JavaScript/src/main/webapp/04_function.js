// alert('확인');

//	함수(Function)
//		서비스를 만들다보면 같거나 기능을 가지기마련
//		매번 새롭게 만든지 말고-> 자주사용하는 기능을 하나로 묶어다 불러서 쓰자

// function 함수(파라미터){
	// 내용
// }의 형태고 함수명(파라미터);으로 호출

function showError(){
	alert('에러발생!!');
}

// showError(); html 실행과 동시에 발생
// 원하는 타이밍에 함수를 부르고 싶다면, 다양한 이벤트를 통해 부르면 된다(이벤트는 다음에~)

// 파라미터 있는 함수
//
//function saymyname(name){
//	let msg = `Hello, ${name}`;
//	alert(msg);
//}
//saymyname(); // Hello, undefined 파라미터를 비울경우  undefined 발생 
//undefind 뜨는 걸 방지
//function sayMyName(name){
//	let msg = "Hello";
//	if(name){
//		msg += `, ${name}`;
//	}
//	alert(msg);
//	
//}
//sayMyName('lee');
// 같은 이름의 펑션명(함수명)을 사용하면 위에 있는 함수 한개만 실행된다.

let msg = "Hello"; // 현재 .js파일 어디에서나 접근이 가능한 변수 : 전역변수(Global Variable)
console.log('함수 호출전');
console.log(msg);

function sayMyName(name){
	let msg = "Hello"; // 함수 안에서만 접근 가능한 변수 : 지역변수(Local Variabale)
	if(name){
		msg += `, ${name}`;
	}
	
	console.log('함수 내부');
	console.log(msg);
}
sayMyName('lee');
console.log('함수 호출 후');
console.log(msg); // Hello 출력 함수 안에서 쓴 함수는 함수 밖에서 사용이 불가능

// 지역변수는 함수 내에서 전역변수와 같은 이름으로 지을 수 있고,
// 서로 간섭받지 않음!

// c.f) 전역변수가 많아지면 관리하기가 힘들어지기 때문에
//		-> 함수에서 필요한 변수는 가능하면 함수 안에서 만드는 지역변수를 사용하자

// OR를 사용해서 기본값 넣기
function sayHello(name){
	let newName = name || 'Friend'
	let msg = `Hello, ${newName}`;
	console.log(msg);
}
sayHello(); // parameter에 값을 넣지 않으면 'Friend'
sayHello("lee"); // parameter에 값을 넣으면 값이 뜸
console.log('--------------------')
// 처음부터 기본값 설정(default value)
function sayHello2(name = 'Friend'){
	let msg = `Hello, ${name}`;
	console.log(msg);
}
sayHello2();
sayHello2('lee');

// 정리
// 함수는 한번에 한 작업(기능)만 넣는 것이 좋다
//		함수 하나가 여러 작업을 진행하게 된다면, 되도록 함수 나눠서 구부낳기
//		1함수 1기능
// 함수명은 읽기 쉽고, 어떤 기능인지 알 수 있게 네이밍!
// 함수명 중복은 불가하다.



