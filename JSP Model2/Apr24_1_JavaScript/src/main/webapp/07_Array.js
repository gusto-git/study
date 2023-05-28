//07_Array.js
//alert('ss')

// 배열(Array) : 순서가 있는 list
let students = ['홍길동', '김길동','박길동'];
console.log(students[1]); // index는 0부터 시작 

//  배열은 문자 뿐만 아니라 숫자, 객체, 함수, ... 포함 가능
let arr = [
	'gusto',
	100,
	true,
	{
		name : 'me',
		age : 4,
	},
	function(){
		console.log('test')
	}
]
console.log(arr);

// 배열의 길이 
console.log(students.length) 

let days = ['월', '화', '수'];
console.log(days);

// push() : 애별 끝에 추가(여러개도 가능)
days.push('목');
console.log(days);

// pop() : 배열 끝의 요소를 제거
days.pop(days);
console.log(days);

// shift() / unshift() : 배열의 제일 앞에 있는 요소 제거 / 배열의 제일 앞에 있는 요소 추가
days.unshift('일');
console.log(days);

days.shift('일');
console.log(days);

// unshift()는 요소 여러개 추가가능
days.unshift('목', '금', '토', '일');
console.log(days);

// 배열을 사용하는 이유 중 하나 : 반복문을 원할하게 사용하기 위해서 ! 
for(let i = 0; i < days.length; i++){
	console.log(days[i]);
}
console.log('------------------');
// for...of (Java의 for-each와 동일)
for(let day of days){
	console.log(day);
}