-- 과제테이블
-- s_name, s_maker, s_price, s_exp(Date)

create table apr06_snack (
	s_no number(3) primary key,
	s_name varchar2(10 char) not null,
	s_maker varchar2(10 char) not null,
	s_price number(4) not null,
	s_exp date not null
);

create sequence apr06_snack_seq;

insert into apr06_snack values(apr06_snack_seq.nextval, '새콤달콜딸기맛', '크라운', 500, sysdate);

-- 특정 시간 / 날짜
-- 내장함수 : to_date('값', '패턴')
-- 패턴(대문자!) - YYYY, MM , DD , AM/PM, HH(12시간), HH24(추천), MI , SS

select * from apr06_snack;
insert into apr06_snack values(
apr06_snack_seq.nextval, '오예스', '크라운', 3000, to_date('2022-03-10 23', 'YYYY-MM-DD HH24'));
insert into apr06_snack values(
apr06_snack_seq.nextval, '맛동산', '크라운', 2500, to_date('2021-02-11 20', 'YYYY-MM-DD HH24'));
insert into apr06_snack values(
apr06_snack_seq.nextval, '죠리퐁', '오리온', 1800, to_date('2020-11-03 10', 'YYYY-MM-DD HH24')); 
insert into apr06_snack values(
apr06_snack_seq.nextval, '고래밥', '크라운', 1500, to_date('2021-11-04 09', 'YYYY-MM-DD HH24')); 
insert into apr06_snack values(
apr06_snack_seq.nextval, '몽쉘 크림케이크', '롯데', 3200, to_date('2021-01-01 01', 'YYYY-MM-DD HH24'));
insert into apr06_snack values(
apr06_snack_seq.nextval, '초코파이', '오리온', 2900, to_date('2020-02-06 14', 'YYYY-MM-DD HH24'));
insert into apr06_snack values(
apr06_snack_seq.nextval, '꼬북칩', '크라운', 1300, to_date('2021-03-05 12', 'YYYY-MM-DD HH24'));
insert into apr06_snack values(
apr06_snack_seq.nextval, '썬칩', '롯데', 1200, to_date('2022-05-05 03', 'YYYY-MM-DD HH24'));
insert into apr06_snack values(
apr06_snack_seq.nextval, '엄마손파이', '크라운', 3300, to_date('2023-02-14 14', 'YYYY-MM-DD HH24'));
insert into apr06_snack values(
apr06_snack_seq.nextval, '프링글스 솔트', '크라운', 2300, to_date('2022-02-02 14', 'YYYY-MM-DD HH24'));
------------------------------------------------------------------------------------------------------------
-- CRUD : R(read) - select
select [distinct(생략가능)] [컬럼명], [컬럼명 as 별칭 || 컬럼명 별칭] , [연산자], [통계함수], ...
from [테이블명]
where [조건식]
group by [그룹대상]
having [함수 포함 조건]
order by [정렬대상 asc || desc (오름차순(기본) || 내림차순)]
-- 형태를 가지고 있음

-- 과자 테이블 전체 조회
-- '*' : 테이블 내의 모든 컬럼을 가져와라
select * from apr06_snack;

-- distinct : 중복제거
select s_maker from apr06_snack; -- 회사만 나옴
select distinct s_maker from apr06_snack; -- 중복제거하고 한번씩만 나옴

-- 특정 컬럼만 원하는 경우 selecet과 from 사이에 컬럼명을 쓰면된다.
-- 별칭 : select문 안에서는 숫자 계산이 가능( +, - , *, /)
-- 가격을 100으로 나눈 것을 가져와라
select s_price / 100 from apr06_snack;
-- 문제 > 컬럼명 자체가 s_price/100이 되어버림
-- 실제로 프로그래밍 언어와 연동해서 사용하다보면
-- 컬럼명을 이용해서 값을 불러오는 경우가 자주 있음
-- 그 때 별칭 이라는 것을 사용해서 헷갈림을 방지하는 용도로 사용 

-- 별칭 만드는 법 1 : AS 사용하기
select s_price / 100 as s_price from apr06_snack;
-- 별칭 만드는 법 2 : 띄어쓰기 사용하기 (V)
select s_price/ 100 s_price from apr06_snack; -- as 대신 띄어쓰기
-- 컬럼 몇개만 확인하고 싶다( s_name, s_price/10)
select s_name, s_price / 10 s_price from apr06_snack;

-- 연산자! (산술연산자)
-- DUAL 테이블
--		1. 오라클 자체에서 제공해주는 더미 테이블
--      2. 간단하게 함수를 이용해서 계산한 결과값을 확인할 때 사용하는 테이블

select 2+5 from dual;

select 1+'4' from dual; -- 5
-- 대부분의 다른 언어는 [문자우선] -> 14
-- Oracle은 [숫자우선] -> 연산자가 숫자'만' 연산해줌!

select 1+'a' from dual; -- error! : 계산할 수 없는 문자는 숫자로 못 바꾼다.

-- 문자도 더 해주는 연산자가 존재 : || 
select 1 || 'a' from dual; -- -> 1a  
-----------------------------------------------------------------------------
-- 날짜 / 시간 함수 

-- YYYY : 4자리 연도
-- YYY, YY, Y : 각각 4자리 연도의 마지막 3자리, 2자리, 1자리 표현 
-- MM : 월
-- DD : 일
-- DAY : 요일(월요일 ~ 일요일)
-- DY : 요일(월 ~ 일)
-- HH, HH12 : 12시간 / AM or PM : 오전 OR 오후
-- HH24 : 24시간 / MI : 분 / SS : 초 

-- SYSDATE : 현재 날짜 / 시간 반환

-- TO_DATE(문자열, 패턴(DATETIME형식)) : 문자형 데이터를 날짜형으로 반환
select to_date('2023-04-06 오전 06:00', 'YYYY-MM-DD AM HH:MI') from dual;

-- TO_CHAR(DATE, DATETIME형식) : 날짜형 데이터를 문자형으로 반환
select to_char(sysdate, 'YYYY.MM.DD')from dual;

-- 특정 날짜 값을 받아오고 싶으면 sysdate 자리에 to_date 함수 넣어서 만들면 됨!
select to_char(to_date('2023-04-06', 'YYYY-MM-DD'), 'YYYY.MM.DD')from dual;
-- TO_DATE : 날짜형 / TO_CHAR : 문자형

-- ADD_MONTHS(date, 숫자) : 날짜에서 지정한 달만큼 더해(1 : 다음달, -1 : 전달)
select add_months(sysdate, -3) from dual;

-- LAST_DAY(date) : 해당 하는 달의 마지막 날을 반환
select last_day(sysdate) from dual;

-----------------------------------------------------------------------------------
-- 오늘날짜 기준 연도 조회 (테이블 헤더(컬럼명)) : 연도 / 컬럼(데이터) : 2023년
select to_char(sysdate, 'YYYY') || '년' 연도 from dual;
-- 오늘 날짜 기준 월 조회(컬럼명 :월 / 컬럼 : 04월)
select to_char(sysdate, 'MM') || '월' 월 from dual;
-- 오늘 날짜 기준 일 조회(컬럼명 :일 / 컬럼 : 06일)
select to_char(sysdate, 'DD') || '일' 일 from dual;

-- 현재 시간 기준 시/분 조회(컬럼명 : 각각 '시', '분' / 컬럼 : '11시', '10분')
select to_char(sysdate, 'HH') || '시' 시 , to_char(sysdate,'MM') || '분' 분 from dual;

-- 지금이 오전인지 오후인지 조회 **
-- 별칭에 띄어쓰기, 특수문자가 들어가는 경우 : 별칭을 큰따옴표로 감싸주기
select to_char(sysdate, 'AM') "오전/오후" from dual;

-- 문자열 2023-05-05 오전 05:05을 2023.05.05로 조회
select to_char(to_date('2023-05-05 오전 05:05', 'YYYY-MM-DD AM HH:MI'),'YYY.MM.DD') from dual;

-- 오늘 날짜 기준 3달전 마지막 날이 몇월 며칠인지 조회
select to_char(last_day(add_months(sysdate, -3)), 'MM/DD') from dual;
-------------------------------------------------------------------------------------------------
-- <쓸만한 내장함수>
-- 1. 숫자함수
--		ABS(숫자) : 절대값 계산 ex) ABS(-4.5)
--		ROUND(숫자, m) : 숫자 반올림, m은 반올림 기준 자릿수 ex)ROUND(5.36,1) 
--		POWER(숫자, n) : 숫자의 n제곱  ex)POWER(2,3) -> 8
--		TRUNC(숫자, m) : 숫자의 m번째 자리까지만 남기고 값을 버림 ex)TRUNC(123.456, 2)
--		MOD(m, n) : 숫자 m을 n으로 나눈 나머지 ex)MOD(12,10)
--		SQRT(숫자) : 숫자의 제곱근(숫자는 양수) ex) SQRT(9.0)
--      FLOOR(계산식 or 값) : 몫 구하기 ex)FLOOR(10/4) 
--			(결과 : 작거나 같지만 가장 근접한 정수 최대값)
--		CEIL(계산식 or 값) : 작거나 같지만 가장 근접한 정수 최소값 ex) CEIL(3)
-------------------------------------------------------------------------------------------------
-- 2. 문자함수
-- 		CONCAT(S1, S2) : 두 문자열을 연결 ex)CONCAT('ABCD', 'EFG') -> ABCDEFG
--		SUBSTR(S1, N, K) : 문자열의 n번째부터 k만큼의 길이를 반환
--			ex) SUBSTR('ABCDEFG', 3, 4)  1부터 시작
--		INSTR(s1, s2, n, k) : s1의 n번째부터 시작해서 찾고자하는
--				s2가 k번째 나타내는 문자열의 위치를 반환
select instr('hello','l',1,2) from dual;
-- 		LPAD(s, n, c) : 문자열 s의 왼쪽부터 지정한 자릿수 n까지 지정한 문자 c로 채움
select lpad('abc',5,'*') from dual;
--		SPAD(s, n, c) : 문자열 s의 오른쪽부터 지정한 자릿수 n까지 지정한 문자 c로 채움
select rpad('abc',5,'*') from dual;
--		LTRIM(s1, s2) : 문자열 s1을 기준으로 지정한 문자 s2를 왼쪽에서 제거
select ltrim('*abc*', '*') from dual;
-- 		RTRIM(s1, s2) : 문자열 s1을 기준으로 지정한 문자 s2를 오른쪽에서 제거
select rtrim('*abc*', '*') from dual;
------------------------------------------------------------------------------------------------
-- 집계 / 분석 함수 - SELECT 컬럼명 쪽과 HAVING 절에서 주로 사용!
--		AVG(컬럼명) : 평균
SELECT AVG(S_PRICE) FROM APR06_SNACK;
-- 		COUNT(컬럼명) : 검색되는 데이터 수
SELECT COUNT(S_NAME) FROM APR06_SNACK;
--		MAX(컬럼명) : 최대값
SELECT MAX(S_PRICE) FROM APR06_SNACK;
-- 		MIN(컬럼명) : 최소값
SELECT MIN(S_PRICE) FROM APR06_SNACK;
-- 		SUM(컬럼명) : 합계(총합)
SELECT SUM(S_PRICE) FROM APR06_SNACK;
-------------------------------------------------------------------------------------------------
-- NULL 관련 함수
--  현재 제약 조건에 NOT NULL로 설정해서 무조건 데이터를 입력하게 해놨는데
--	NULL : 확인되지 않은 값이나 아직 적용되지 않은 값 / 0이나 비어있는 공란은 아님!

-- 	NVL함수 : NULL인 경우만 지정한 값으로 대치하는 함수
--		NVL(값, NULL일 때 대처값)
SELECT NVL(NULL, 'B') FROM 테이블명
--	NVL2 함수 : NULL 여부에 따라 지정한 값으로 대치하는 함수
--		NVL2(값, 값이 있을 때 대치값, 없을 때 대치값)
SELECT NVL2(NULL, 'A', 'B') FROM 테이블명
-- ===============================================================================================
-- 웹사이트에서 게시판에 대한 테이블과 이를 [참조하는] 게시판 댓글 테이블을 만들려고함
-- 게시판 테이블 : [작성자 / 게시판 글내용 / 작성시간]
--	댓글 테이블  : [작성자 / 댓글 글 내용 / 작성시간]

-- 1. 테이블 구조를 파악해서 게시판 테이블 만들기(BOARD) 
-- 작성자 PK? : 한 사람이 게시글 한번만 쓸거라는 보장 X
-- 내용 PK? : 글 내용이 길어지면 중복될 일은 적어지겠지만, 글이 똑같을 수 있다.
-- 시간 PK? : 정말 만에 하나 같은 시간에 작성할 수도 있음
-- 

create table board(
	b_no number(3) primary key,
	b_owner varchar2(10 char) not null,
	b_content varchar2(200 char) not null,
	b_when date not null
);

create sequence board_seq;

-- 2. 테이블의 구조 파악해서 댓글 테이블 만들기(board_reply)
--  [조건 : 참조 받는 테이블의 글 내용이 삭제되면 관련된 댓글도 삭제가 되도록]

create table board_reply(
	br_no number(3) primary key,
	br_b_no number(3) not null,
	br_owner varchar2(10 char) not null,
	br_content varchar2(200 char) not null,
	br_when date not null,
		constraint fx_board_reply foreign key(br_b_no)
			references board(b_no)
			on delete cascade
);

create sequence board_reply_seq;

-- 게시판 테이블에 값 2개를 넣고, 각 게시글 마다 댓글 2개씩 달기
insert into board values(board_seq.nextval, '홍길동', '안녕하세요', sysdate);
insert into board values(board_seq.nextval, 'hong', 'hi', sysdate);
select * from board;

insert into board_reply values(board_reply_seq.nextval, 1,'박','으악!',sysdate);
insert into board_reply values(board_reply_seq.nextval, 2,'김','으악!',sysdate);
insert into board_reply values(board_reply_seq.nextval, 1,'이','으악!',sysdate);
insert into board_reply values(board_reply_seq.nextval, 2,'최','으악!',sysdate);
select * from board_reply;

-- 게시글 하나 지웠으 때, 댓글도 지워지는 지 확인
delete from board where b_no = 1;
----------------------------------------------------------------------------------
select [distinct] [컬럼명], [컬럼명 as 별칭 || 컬럼명 별칭],[연산자],[통계함수],...
from [테이블명]
where [조건식]
group by [그룹대상]
having [함수 포함 조건]
order by [정렬대상 asc/desc]

--  where 절 (조건식)
--		전체 데이터 중에서 지정한 조건에 맞는 데이터를 찾아주는 문장
--		조건식은 비교연산자 사용이 가능하다
--		=, !=, ^=, <>, > , >=, <, <=, ...
--		2, 3, 4번째는 [같지않다]로 쓰이는 연산자
--		2, 4번의 경우 표준화를 하다보니 사용하게 되었다
--		3번의 경우에는 몇몇 DBMS와의 차별성을 위해서 사용하게 되었다

-- 가격이 3000원인 과자의 모든정보를 조회
select * from apr06_snack where s_price = 3000;

-- 모든 과자이름, 가격 조회
select s_name, s_price from apr06_snack;

-- 모든 과자이름, 가격조회(컬럼명 : 이름(가격) / data : 오예스(3000원)
	-- 별칭 : 띄어쓰기나 특수문자, 숫자가 있으면 큰따옴표
	-- 오예스 + ( + 3000 + 원)
select s_name || '(' || s_price || '원)' "이름(가격)" from apr06_snack;

-- 2000원 이하의 과자 이름, 가격, 유통기한 조회
select s_name, s_price, s_exp from apr06_snack where s_price <= 2000;

-- 모든 과자의 평균가가 얼마인지? (소수점 첫째자리까지) 
select round(avg(s_price),1) from apr06_snack;

-- 1500원 이상의 과자 중 최소가격은 얼마인지 
select min(s_price) from apr06_snack where s_price >= 1500;

-- 과자 이름과 가격의 30% 할인된 금액 
select s_name, s_price * 0.7 from apr06_snack 

-- 500원인 과자의 갯수?
select count(*) from apr06_snack where s_price = 500;

-- 모든과자 이름 , 가격, 유통기한 조회
select s_name, s_price, s_exp from apr06_snack;
-- 모든 과자 이름, 가격, vat(가격의 10%부가세)
select s_name, s_price, s_price * 0.1 vat from apr06_snack;
-- 모든 과자 이름, 가격, 판매가(selliong_price) 조회(20%할인 금액) 조회
select s_name, s_price, s_price*0.8 selling_price from apr06_snack;
-- 4500원 보다 큰 금액의 과자 평균가 조회
select avg(s_price) from apr06_snack where s_price > 2000;
-- 과자의 최저가, 최고가, 총 과자 종류 몇가지 인지 조회
select  min(s_price), max(s_price), count(*) from apr06_snack;
-- 3000원 이상인 과자의 전체 정보 조회
select * from apr06_snack where s_price >= 3000;
-- 3000원 미만인 과자의 이름, 가격, 판매가 조회 
select s_name, s_price, s_price*0.8 selling_price from apr06_snack where s_price < 3000;
-- 허니버터칩의 가격 조회
select s_price from apr06_snack where s_name = '죠리퐁';
-- 크라운 회사의 과자 가격 총합의 조회
select sum(s_price) from apr06_snack where s_maker = '크라운';
-- 5월 안으로 먹어야 하는 과자 이름, 가격, 유통기한 조회
select s_name, s_price, s_exp from apr06_snack where to_char(s_exp, 'MM') < 6;
select s_name, s_price, s_exp from apr06_snack where s_exp < to_date('2023-06-01 00:00:00', 'YYYY-MM-DD HH24:MI:ss');

----------------------------------------------------------------------------------------
-- 관계연산자
-- 		 AND, NOT, OR, BETWEEN, IN
--	AND와 BETWEEN

-- 가격이 1000원 이상 3000원 이하인 과자의 전체정보 조회
-- AND
select * from apr06_snack where 1000 <= s_price and s_price <= 3000;

-- BETWEEN 이용
select * from apr06_snack where s_price between 1000 and 3000; 

-- and와 between 차이
-- 이상/이하 조건 범위 안에서는 between이 편함
-- 1000원 초과 3000원 미만 이런 범위면 조회할 때 between 사용이 애매

-- 가격이 1000원, 2000원, 3000원 인 과자의 전체정보 조회
select * from apr06_snack where s_price = 1000 or s_price = 2000 or s_price = 3000;

select * from apr06_snack where s_price in(1000, 2000, 3000); 
-- s_price(가격)이 1000,2000,3000이냐를 나태내주는 :in 연산자
-- 편하고 효율적
-- 연속되지 않는 값들을 받아오고 싶을 때 in 연산자 사용하자

-- 이 결과에 반대되는 결과 값을 받아오고 싶다면 ? -> not 연산자
-- 이 not 연산자를 어디에 사용해야 할까?
select * from apr06_snack where s_price not in(1000, 2000, 3000);

