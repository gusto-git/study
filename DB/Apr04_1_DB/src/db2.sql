-- [테이블]을 만들어보자!
create talbe 테이블명(
	컬러명 자료형 [옵션],
	컬럼명 자료형,
	...
	컬럼명 자료형
);

-- 자료형 (dataType) : 크게 3가지 타입이 있음!


-- 문자형 :
--	char(용량)
--		무조건 그 용량 그대로 저장
--		만약에 char(10)인 경우 : 글자를 3글자만 사용했다. 
--		나머지 부분은 띄어쓰기로 총 10글자를 만들어서 메꿈
--		처리속도가 빠른 편!
create table test(
	t_name char(5)
);

--	varchar2(용량 char) : 주력으로 사용
--		정해진 용량만큼 데이터를 넣지 않아도 알아서 용량을 조절해서 저장
--		용량을 조절하는 만큼 처리속도가 느림!
create table test(
	t_name varchar2(5 char)
);

-- 문자형 용량
--		varchar(5) : 5 byte
--			영어, 숫자, 띄어쓰기는 1byte
--			한글은 한 글자가 3byte
--			글자수 계산이 애매해진다.
--			varchar2(5 char)
--				한글 / 영어 5글자 -> 최대 15byte까지 사용
--			-> 문자형 자료형을 쓸 때에는 용량에 char를 넣어서 쓰자 !? 
create table test(
	t_name varchar2(5)
);

create table test2(
	t_name varchar2(5 char)
);

-- 문자형의 값 넣을 때에는 작은 따옴표 !!! ****
insert into test values('가나다'); -- 용량 초과로 인한 에러 발생 ! 
insert into test2 values('가나다'); 

drop table test cascade constraint purge;
drop table test2 cascade constraint purge;
---------------------------------------------------------------------
-- 숫자형
-- 		NUMBER(P,S) : 십진수 기준
-- 		number(5) : 숫자 5자리까지 입력 가능
--		number(5, 3) : 소수점 포함해서 숫자가 5개, 소수점 아래 3자리
--			ex) 12.345 총 숫자는 5개, 소수점 아래 3자리 

--			P : 정밀도(Precision) / S : 범위(Scale)
--			 P는 소수점 기준 모든 유효숫자를 의미
--			 만약에 P에 명시한 자릿수보다 더 큰 숫자값을 입력하면 오류 발생
--			 S의 숫자가 양수면 소수점 이하, 음수면 소수점 이상(소수점 기준 왼쪽) 의미
--			 S의 숫자 이상의 숫자를 입력하면, S에 명시한 숫자로 반올림 처리 
--		 	 S가 음수면 소수점 기준 왼쪽 자릿수 만큼 반올림 처리

-- ex) 123.54
--		number(3) -> 124로 저장(S쪽 명시 X -> 0 라고 봐도 무방)
--					 P가 3이라서 소수점 첫째자리에서 반올림했다.
--		number(3,2) -> error! : P가 3, 숫자 세개가 가능,
--					   123.54는 유효숫자가 5자리여서 오류,
--					   유효숫자가 P보다 크면 오류 발생
--		number(5,2) -> 123.54로 저장
-- 		number(7,1) -> 123.5(S가 1이고, 소수점 둘째자리가 반올림되서 5)
--		number(7,-1) -> 120(S가 -1이고, 소수점 왼쪽 첫째자리 3이 반올림되어 120이 됨)

-------------------------------------------------------------------------------------------
-- 날짜형
--  Date : 년도, 월, 일, 시, 분, 초까지 입력가능
--	Timestamp : 년도, 월, 일, 시, 분, 초, 밀리초까지 입력 가능
--	-> 주력은 Date!!

--

