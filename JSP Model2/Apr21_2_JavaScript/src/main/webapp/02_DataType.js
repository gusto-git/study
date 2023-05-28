/**
 * 02_DataType.js
 */
 
// alert("확인");
// 	2. 자료형

//	문자형 : String
let name1 = "gusto";
let name2 = 'gusto';
let name3 = `gusto`; // ~표시 키 

let msg = "I'm a girl.'";
let msg2 = 'i\'m a girl.'; // 작은 따옴표 사용시 \ 역슬래시 넣으면 '를 특수문자로 인식


// 문자열 내부에 변수를 표현할 때 사용하면  좋은 backtick!
// 		${변수명}을 넣어서 표현
let msg3 = `My name is ${name1}`;// ${}일때 ``가 아니면 오류
document.write(msg3 + "<br>");
let msg4 = "My name is ${name1}";
document.write(msg4 + "<br>"); // ${name1}이 그대로 노출!
let msg5 = `I am ${100+99} years old.`;
document.write(msg5 + "<br>");
document.write("-----------------------<br>");

// 숫자형 Number(정수/실수)
let age = 100;
let height = 189.4;

// document.write 이용해서 두 변수로 사칙연산 (덧셈, 뺄셈, 곱셈 , 나눗셈)
document.write(age + height + "<br>");
document.write(age - height + "<br>");
document.write(age * height + "<br>");
document.write(age / height + "<br>");
document.write(age % height + "<br>");

let a = 1 / 0;
console.log(a) // Infinity(무한대) 출력

let b = name1 / 2;
console.log(b) // NaN : Not a Number : 숫자가 아니다

// 글자끼리 더하기 
let aa = "나는 ";
let bb = " 입니다";
console.log(aa + name1 + bb);
console.log(aa + age + "살" + bb);

// 논리형
 let c = true; // 참
 let d = false; // 거짓
 
 console.log(name1 == "gusto");
 console.log(age > 2000);
 
 // null, undefind
 let e;
 console.log(e);  // undefined(값이 할당되지 않은 상태)
 let f = null;
 console.log(f); // null(존재하지 않는 값)
 
 // 변수의 자료형을 알아낼 때 사용 : typeof연산자
 // 		직접 코드를 짰다면 이 연산자는 필요 x
 //			다른 개발자가 코드를 짰을 때 변수에 대한 데이터타입(자료형)이 헷갈릴때
 //			or API를 통해서 받아온 데이터의 자료형을 알아내서 다른 방식으로 처리해야 할 때 
 console.log(typeof name1);
 console.log(typeof age);
 console.log(typeof c);
 console.log(typeof e);
 console.log(typeof f); // object? -> 초창기 자바스크립트의 오류
 