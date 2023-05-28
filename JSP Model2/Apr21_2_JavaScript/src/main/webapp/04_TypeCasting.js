/**
 *  04_TypeCasting.js
 */
 
 document.write('잉잉');
 // String() -> 문자형으로 변환
 // Number() -> 숫자형으로 변환
 // Boolean() -> 논리형으로 변환
 
 // 형변환은 왜 필요할까
 // 자료형이 다른 두 변수를 계산했을 때 원하지 않은 
// let math = prompt('수학점수?');
// let eng = prompt('영어점수?');
// let avg = (math + eng) / 2;
// console.log('평균점수 :' + avg)
// 
 // 변수에 직접 값을 할당해서 평균점수 다시
// let math2 = 80;
// let eng2 = 90;
// let avg2 = (math2 + eng2) / 2;
// console.log(avg2);
// 
 // prompt로 입력받은 값은 무조건 문자형(String)
 // "80"+ "90" = 170(x) / "8090"(o)
 // "8090" / 2 = 4045
 // "8090"은 분명히 문자열이나, /2가 계산이됨
 // 	숫자형이 아니더라도 표현식(+-*/)을 활용했을 때 숫자형으로 변환할 수 있다면
 //		자동을 형변환이 되어 계산된다. -> '자동형변환'
 
 // 자동형변환이 좋아 보이지만
 //		원인을 찾기 힘든 에러를 발생시킬 여지는 충분!
 //		항상 의도를 가지고 원하는 타입(자료형)으로 변환을 해서 사용하는 것 -> '명시적형변환'
// 
// let math3 = Number(prompt('수학점수?'));
// let eng3 = Number(prompt('영어점수?'));
// let avg3 = (math3 + eng3) / 2;
// console.log(avg3);
 
 // String() : 괄호안에 값을 문자형으로 바꿔줌
 document.write("String()<br>");
 document.write(
	String(3) + '<br>',
	String(true) + '<br>',
	String(false) + '<br>',
	String(null) + '<br>'
);
 
 document.write("======================<br>");
 // Number() : 괄호안에 값을 숫자형으로 바꿔줌
 document.write(
		Number("1234")+ '<br>',
		Number('asdf') + '<br>', // NaN
		Number(true) + '<br>', // 1
		Number(false) + '<br>' // 0
);
 
 document.write("======================<br>");
 // Boolean() : 괄호 안의 값을 논리형으로 바꿔줌
 
 // false
 // 	-   숫자 0
 //		-   빈 문자열 ('')/ 띄어쓰기 x
 //		-	null
 //		-	undefined
 //		-	NaN
 //		이외의 나머지는 모두 true가 나옴
 
 // 주의사항..? 인지해두면 좋은거!
 Number(null); // 0 
 Number(undefined); // NaN
 