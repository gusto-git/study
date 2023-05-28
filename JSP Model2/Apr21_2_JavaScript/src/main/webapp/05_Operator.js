/**
 * 05_Operator.js
 */
// console.log('연결완료');
// 산술연산자 : + - * / %

// 거듭제곱
//let num1 = 2**3;
//console.log(num1);

// 연산자 줄여서 쓰는 것도 가능! : 자바 방식가능

let num1 = 10;
num1 = num1 + 5;
num1 += 5; 
console.log(num1);

let num2 = 20;
num2++; // 증감 연산자도 가능하다
console.log(num2); // 21

let result = num2++; // 후위연산자
console.log(result); // 21
console.log(num2); // 22

let result2 = ++num2; // 전위연산자
console.log(result2); // 23

// ++을 변수 뒤에 담으면 증가시키기 전의 값을 담고
//		앞에 적으면 증가시킨 값을 담음

// 비교연산자(Java때와 같음!)
// < > <= >= == !=
console.log('-------')
console.log(10 > 5);
console.log(10 == 5);
console.log(10 < 5);
console.log('-------')

// "10"과 10이 같은지 비교해주세요
console.log("10" == 10); // true (자동형변환 덕분에)
console.log('10' === 10); // 단순히 값만 비교하는게 아니라 자료형까지 비교
// ===, !== : 일치연산자

// 논리연산자
// ||(OR)
//		여러개 중에 하나라도 true면  true 변환
//		모든 값이 false 일때만 false를 반환
//		첫번째 true값을 발견하는 즉시 멈춤

// &&(AND)
//		모든 값이 true여야 true반환
//		하나라도 false 나오면 false 를 반환
//		첫번째 false 값을 발견하는 즉시 멈춤

// !(NOT)
//		반대의 값을 반환
//		true -> false / false -> true




