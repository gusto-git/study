// 06_Object.js
//alert('s')

// 객체(Object) - JSON Parsing
let dog = {
	name : '콩이', 
	age : 3,
} // 이런식으로 쓰는게 객체 

// 객체는 {}(중괄호)안에서 구성
// Key와 Value로 구성된 프로퍼티(속성)이 중괄호 안에 포함
// 각각 쉼표로 구분, 마지막에는 쉼표가 없어도 되고 있어도 됨

// 접근
console.log(dog.name); // 변수명.key값 -> value값이 리턴
console.log(dog['age']); // 변수명['key'] -> value값이 리턴

// 속성 추가
dog.gender = 'Male';
dog['furColor'] = 'black'; // {}안에 추가 된거랑 같다

// 삭제
delete dog.furColor;

console.log(dog['gender']);
console.log(dog['furColor']);

let name = 'gusto';
let age = 100;
// 의 객체 -> 이름 /나이/ 성별
// 이미 선언한 변수 사용해서

/*let person = {
	name : name,
	age : age,
	gender : 'female',	
}*/

let person = {
	name,
	age,
	gender : 'Female',
}// 이때 key이름과 value에서 받아올 변수의 이름이 같아야 쓸수있다.
console.log(person.name);
// 존재하지 않는 속성에 접근하면 에러가 아닌 undefined가 나옴
console.log(person.hairColor); 

// 만약에 어떤 속성이 있는지 알고 싶으면 -> in 연산자 사용
//		in : 어떤 값이 있는지 확인 하는 용도
console.log('phone' in person); // false
console.log('name' in person); // true

for(let k in person){
	console.log(k); // key 값
	console.log(person[k]); // value 값 
}

// 함수로 객체만들기
function makeObject(name, age){
	return {
		name,
		age,
		hobby : 'sleeping',
		
	}
}
let gusto = makeObject('gusto', 100);
console.log(gusto);
























