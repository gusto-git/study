<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>v2.jsp</title>
</head>
<body>
	<%-- 
		EL(Expression Language)
		 	값을 받을 때 Java 대신 사용 가능 
		 	.jsp에서만 사용 가능!(.jsp를 톰캣이 Servlet으로 바꿀 때 EL을 Java코드로 번역해줌)
		 	
		 	문법 : ${XXX }
				- 연산자 사용이 가능하다.
				- 형변환이 자동으로 가능하다.
				- 값은 없으면 그냥 넘긴다. -> 에러가 나지 않는다
				- import가 없어도 된다. <% %> 보다 효율적이다.
			파라미터 값 읽기 : ${param.파라미터명 }
			어트리뷰트 값 읽기 : ${어트리뷰트명 }
			어트리뷰트 값 읽기(객체)도 가능하다
					주소값 : ${어트리뷰트명}
					속성값 : ${어트리뷰트명.멤버변수명}
			어트리뷰트 값 읽기(배열[], List)
					AL, [] 자체 : ${어트리뷰트명}
					인덱스 위치의 객체 : ${어트리뷰트명[인덱스]}
					인덱스 위치의 객체 속성 : ${어트리뷰트명[인덱스].멤버변수명 } 
					
			반복문, 조건문 - EL(x) /  CustomTag를 이용하면 반복문, 조건문 사용할 수 있다. 
	 --%>
	<h1>v2</h1>
	${param.x }<br> <%-- input의 name을 그대로 받으려면 param.name--%>
	${param.y }<br>
	${param.x * param.y }<br>
	${z }
	
	${ll }<br>
	${ll.name } - ${ll.age } - ${ll.height } - ${ll.weight }<br>
	${param.fjfjnn }<br> <%--없는 값 --%>
	
	${ls }<br>
	${ls[2] }<br>
	${ls[1].name }<br>
	${ls[2].age }
	
	
	
	
</body>
</html>