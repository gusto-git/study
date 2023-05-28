/**
 *  03_DialogBox.js
 */
 
 // 대화상자
 //		alert, prompt. cofirm
 
 // alert : 알려줌(일방적인 경고창)
// alert("경고!");
 
 // prompt : 값을 입력받을 수 있음
 let name = prompt("이름을 입력하세요.");
 alert(`안녕하세요. ${name}님. 환영합니다!`);
 // prompt에 값을 넣지 않고 그냥 취소해버리면? -> null(아무 냉요이 없다)
 
 // prompt 값에는 default값도 넣을 수 있음
 //	뭔가에 대한 값을 넣을 때, 안내하거나 힌트를 주는 역할도 가능!
 //	2개의 파라미터로 promt(보여줄 메세지, 입력받을 default값)
 
 let reservation = prompt("예약일을 입력하세요", "2023-04-");
 
 // confrm : 확인받음
 // 값 : 확인 -> true / 취소 -> false 
 let isAdult = confirm("당신은 성인입니까?");
 alert(isAdult);
 
 // 정리
 	alert('하잉!'); // 메세지를 보여주는 기능
 	prompt('점심 뭐먹었요?'); // 메세지를 보여주고 값을 입력하게 해주는 기능
 	confirm('JS 재밌나요?');
 	
 // 단점
 //		1. 창이 떠 있는 동안 스크립트가 일시적으로 정지
 //		2. 스타일링이 불가능!(위치, 모양을 지정할 수가 없음)
 //		3. 브라우저들마다 모양이 제각각 다름
 //		-> 빠르고 간단하게 적용 가능한 장점이 있어서 광범위하게 사용하고 있음
 
 
 	