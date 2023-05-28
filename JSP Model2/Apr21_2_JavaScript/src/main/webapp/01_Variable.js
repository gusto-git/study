/**
 *  01_Variable.js
 */
 // 인터프리터 언어 : 고급언어로 작성된 코드를 한 단계씩 해석하여 실행시키는 방법
 // 오타안나게 주의
 
 // 1. 변수
 // 	: 데이터를 담는 그릇
 
 // 변수에 접근하는 방법
 //		 alert() : 경고창을 띄어주는 함수
// alert("까꿍");
 // 	console.log : 로그를 띄워주는 함수
 console.log("확인");
 // 	document.write() : 웹페이지에 내용을 출력 << 나중에!

// name = "chung";
// age = 100;
// 안쓰는 이유 : 전역변수의 형태이기 때문에 이런 방식은 위험하다.

// 이걸 방지하기 위해서 변수 선언의 형태로는 3가지
//		var, let, const

// var : var(iable) : 중복해서 선언이 가능하다 + 초기화 허용
var a = 10; // 변수 선언 + 초기화
console.log(a);
var a = 20; // 변수 선언 + 초기화
console.log(a);
var a; // 변수 선언 : 마지막에 할당된 값이 이 변수에 저장 
console.log(a);
//		기존에 선언해 둔 변수를 까먹고 다시 값을 할당하는 실수를 할 수가 있음 

//	let : Java변수만들때와 같은 느낌(변수명 중복 X)
//let name = "gusto";
//console.log(name);
//let name = "lee"; 이미 name이 gusto로 선언되어 있기 때문에 에러발생
//cosole.log(name);

// let은 한 번 선언한 후에 값을 바꿔줄 수는 있음!
let name = "gusto";
console.log(name);
name = "lee";
console.log(name);

// const : 값이 절대로 바뀌지 않는 상수
//		수정이 안되고, 수정하고자 하면 에러 발생 
//		const 변수명 대문자로 사용하는 문화가 있다.
const PI = 3.141592;
console.log(PI);
//PI=6.123242;
//console.log(PI);

// 정리!!
//		JS에서 변수를 선언할 때
//		변할 수 있는 값은 var, let
//		변하지 않는 값은 const

// JS 변수명 짓는 조건!(Java랑 동일)
//		1. 변수는 문자와 숫자, $, _만 가능
//		2. 첫글자 숫자 불가능
//		3. 예약어 사용 불가능 예: const, console  등
//		4. 변수명은 읽기 쉽고 이해하기 좋게
//		5. const변수를 만들때는 가급적 대문자로 작성 








