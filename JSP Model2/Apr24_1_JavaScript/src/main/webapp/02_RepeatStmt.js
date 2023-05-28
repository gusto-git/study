//alert('확인')
// 02_RepeatStmt.js
// 반복문(RepeatStatement)
//		동일한 작업을 여러번 반복할 때 사용
// for / while / do-while

// for 1~10 출력
for(let i = 1; i < 11; i++){
	console.log(i);
}
console.log('------')

// while 1~10출력
let i1 = 1;
while(i1 < 11){
	console.log(i1);
	i1++;
}
console.log('------')

// do-while
let i2 = 1;
do{
	console.log(i2);
	i2++;
} while(i2 < 11);

// 반복문 깨기:
//	break : 멈추고 해당 반복문 빠져나옴
//	continue : 해당 반복문을 멈추고 다음 반복문 실행
//	return : 비공식적 break