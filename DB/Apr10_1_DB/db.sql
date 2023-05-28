-- 패턴 연산자
-- 문자열을 포함하는 검색 : like '패턴'의 형태
--	문자열 패턴에 존재하는 %는 뭐가 들어갈지 모른다는 뜻
--	like '%ㅋ' : ㅋ으로 끝나는거
-- 	like 'ㅋ%' : ㅋ으로 시작하는거
--	like '%ㅋ%' : ㅋ이 포함
-- 그럼 like 대신에 (= '%ㅋ')이런 식으로는 안되나여
--		-> 등호를 써서 식으로 표현하면 패턴으로 인식하는게 아니라 
--		'%ㅋ' 자체를 문자로 인식

select * from apr06_snack;
--	apr06_snack
--	'해'가 들어가는 회사에서 만든 과자 이름 조회
select s_name from APR06_SNACK where s_maker like '%오%';
-- '이'가 들어가는 과자들의 평균가를 조회
select round(avg(s_price),1) from apr06_snack where s_name like '%이%';
-- 크라운 과자거나, 몽쉘 ~ 인거 이름, 제조사, 가격 조회
select s_name, s_maker, s_price from APR06_SNACK where s_maker like '크라운' or s_name like '몽쉘%';
-- 과자의 이름이 '새콤달콤'을 포함하거나, '몽쉘'을 포함하는 과자의 이름, 제조사, 가격 조회
select s_name, s_maker, s_price from APR06_SNACK where s_name like '%새콤달콤%' or s_name like '%몽쉘%';
select s_name, s_maker, s_price from APR06_SNACK where s_name like in('%새콤달콤%, %몽쉘%'); -- error!
-- like in ~ 구조가 없다

-- REGEXP_LIK(컬럼명, 패턴1|패턴2|...)
-- 다양한 패턴을 한번에 찾고 싶다면 |(파이프)를 넣어서 패턴 추가하면 됨
-- 정규식(REGEX)을 이용하여 문자를 찾는 방법
-- 패턴 앞에 ^를 넣으면 : 패턴 값으로 시작하는 문자열 찾기
-- 패턴 뒤에 $를 넣으면 : 패턴 값으로 끝나는 문자열 찾기

-- 과자의 이름이 '새콤달콤'으로 시작하거나, '이'로 끝나는 과자의 이름, 제조사, 가격 조회
select s_name, s_maker, s_price from apr06_snack where regexp_like(s_name, '^새콤달콤|이$');
-----------------------------------------------------------------------------------------------
-- 집합 연산자
--  합집합
--		UNION : 중복되는 값을 제외하고 출력

SELECT 1 ID, '수학' SUBJECT, 90 SCIRE FROM DUAL
	UNION
SELECT 1 ID, '수학' SUBJECT, 90 SCIRE FROM DUAL
	UNION
SELECT 1 ID, '수학' SUBJECT, 90 SCIRE FROM DUAL; -- 중복된 값이라 값이 하나만 출력

-- UNION ALL : 중복되더라도 모두 출력
SELECT 1 ID, '수학' SUBJECT, 90 SCIRE FROM DUAL
	UNION all
SELECT 1 ID, '수학' SUBJECT, 90 SCIRE FROM DUAL
	UNION ALL
SELECT 1 ID, '수학' SUBJECT, 90 SCIRE FROM DUAL; -- 중복된 값도 모두 출력 

-- 교집합
--		 INTERSECT : 두 테이블의 집합 중 공통되는 값 출력
SELECT 1 ID, '수학' SUBJECT, 90 SCORE FROM DUAL
	UNION
SELECT 2 ID, '영어' SUBJECT, 80 SCORE FROM DUAL
	INTERSECT
SELECT 1 ID, '수학' SUBJECT, 90 SCORE FROM DUAL; -- 공통된 1 ID ~ 부분이 출력된다.

-- 차집합
--		MINUS : 첫번째 SELECT문 중에서 두번째 SELECT문에는 없는 값을 출력
SELECT 1 ID, '수학' SUBJECT, 90 SCORE FROM DUAL
	MINUS
SELECT 1 ID, '수학' SUBJECT, 80 SCORE FROM DUAL -- 첫번째 SELECT문 출력
	MINUS
SELECT 1 ID, '수학' SUBJECT, 90 SCORE FROM DUAL; -- 값이 같아져서 반환이 안됨 

-- 연산자 우선순위(오른쪽이 최우선)
-- OR > AND > NOT > 비교연산자 > 괄호

-- 과자 테이블에서 회사가 크라운이고 가격이 1000원 이하거나 3000원 이상인 과자 전체조회
SELECT * FROM APR06_SNACK WHERE S_MAKER '크라운' AND (S_PRICE <= 1000 OR S_PRICE >= 2000);

-- GROUP BY : 그룹으로 묶여 연산해서 하나의 결과를 나타내는 것 
--	회사별 과자, 평균가격, 최소가격, 최고가격
--	GROUP BY 하기 전 최고가, 최소가, 평균가 구하면
select max(s_price), min(s_price), avg(s_price) from apr06_snack;
-- group by를 이용해서 회사별로 그룹을 지으면
select s_maker, max(s_price), min(s_price), avg(s_price)
	from apr06_snack
	group by s_maker;
	
	
-- ROLLUP 연산자
-- ROULLUP BY ROLLUP(그룹대상)
--	컬럼에 대한 소계(subtotal)을 만들어줌
--	group by 절의 컬럼 갯수가 n개라면, rollup을 썼을 때는 n+1개
	
-- 회사이름, 회사별 과자 가격 총 합계와 모든 과자들의 가격 합계
select s_maker, sum(s_price) from apr06_snack
	group by rollup(s_maker); -- s_maker 부분에 null로 나오고 sum의 전체값이나옴
-- s_maker부분이 null값이면 '전체', 그게 아니면 s_maker 값을 그대로
select nvl2(s_maker,s_maker,'전체') s_maker, sum(s_price)
	from apr06_snack
	group by rollup(s_maker);
	
-- DECODE(컬럼명, 조건, 조건에 맞는 결과값, 조건에 맞지 않을 때 결과값)
select decode(s_maker, null, '전체', s_maker) s_maker, sum(s_price)
	from apr06_snack
	group by rollup(s_maker);
-- decode 사용시 조건 자리에 비교연산자(x), 산술연산자(o)
------------------------------------------------------------------------------------------------------
-- HAVING : group by 절에 의해서 생성된 결과 중 원하는 조건에 부합하는 자료만 찾고 싶을 때 사용 	
--	WHERE와 HAVING 모두 조건을 이용해서 원하는 데이터만 뽑아온다는 공통점
--	HAVING  : 그룹의 결과를 제한
--		VS
--	WHERE : 전체에 대한 결과를 제한 
	
-- 회사별 평균 가격이 2000원 이상인 회사의 이름과 과자 평균 가격을 조회
select s_maker, avg(s_price) 
	from apr06_snack
	group by s_maker
	having avg(s_price) >= 2000;

	
-- ORDER BY : 정렬, 기본값 오름차순(ASC), 내림차순 정렬(DESC)
-- 가장 마지막에 ORDER BY [정렬대상 ASC(생략가능) / DESC]
select * from apr06_snack order by s_price desc;

-- where + group by + having + order by
-- 롯데 또는 해태 회사의 과자 평균 가격이 1300원 이상일 때 각 회사의 평균가격 내림차순 정렬
select s_maker,avg(s_price) from apr06_snack
where s_maker in ('롯데','크라운')
group by s_maker
having avg(s_price) >= 1300
order by avg(s_price) desc;
-------------------------------------------------------------------------------------------------------------------
-- 테이블에 데이터를 검색, 삽입, 수정, 삭제 (CRUD) 하는데 사용하는 문장인
-- 데이터 조작어(DML)
-- 이 중에서 데이터를 넣게하는 명령어인 INSERT
-- 데이터를 검색하거나 조회할 수 있는 명령어인 SELECT 구조를 뜯어봤음

-- INSERT
-- insert into [테이블명] values(값, 값, ....) 의 형태
-- insert primary key를 줄 수 없는 상황에서는
-- 강제적으로 고유 번호값을 부여하는 방법으로 Primaty key를 줬었고
-- 고유 번호값은 일일히 수작업 한게 아니라
-- 번호값을 찍어내는 공장인 SEQUENCE라는 기능 활용
-- 테이블과 무관, 단점으로 INSERT에 실패해도 SEQUENCE 값은 무조건 올라가고
-- 테이블 삭제해도 남아있기 때문에 지우려면 같이 지워야 한다. 

-- SELECT
-- select [distinct] [컬럼명], [컬럼명 as 별칭 || 컬럼명 별칭],
-- [연산자], [통계함수],...
-- from [테이블명]
-- where [조건식]
-- group by [그룹대상]
-- having [함수 포함 조건]
-- order by [정렬대상 asc / desc]

-- distinct : 중복제거
-- 컬럼에 별칭 부여 : AS를 붙이거나 띄어쓰기만 하거나 
-- 연산자1 : 산술연산자(+,-,*,/), 문자 이어붙여주는 ||
-- DUAL 더미 테이블을 이용해서 유용한 내장함수(숫자, 문자, 날짜, 통계, NULL 관련..)
-- 전체 데이터 중 조건에 맞는 데이터를 찾아주는 where절(조건식) 다루면서
-- 연산자2 : 비교연산자(=,!=,>,<,>=,<=)
-- 연산자3 : 관계연산자 AND와 BETWEEN의 차이
--			연속되지 않는 값 받아올 때 : IN, OR
--			반대되는 값 받아올 때 : NOT
--				이때 NOT의 위치는 IN의 앞  
-- 연산자4 : 패턴연산자 >> 문자열 포함 검색
--			LIKE '%패턴%'의 형태
--			LIKE 대신 등호(=) 사용하면 안되는 이유 : 패턴을 문자로 인식해버리기 때문
-- 연산자5 : 집합 연산자
--		UNION / UNION ALL (합집합)
--			중복되는 값 제외하고 출력 / 중복되더라도 모두 출력
--		INTERSECT (교집합)
--			집합 중 공통되는 값을 출력
--		MINUS(차집합)
--			먼저 나온 SELECT문 중에서 뒤에 나온 SELECT문에 없는 값을 출력
-- 연산자 우선순위 : 괄호 -> 비교연산자 -> NOT -> AND -> OR 

-- GROUP BY : 그룹으로 묶어서 연산하여 하나의 결과를 나타냄
-- ROLLUP 연산자 : 컬럼에 대한 소계(SUBTOTAL)를 만들어줌
-- HAVING절 VS WHERE절

-- ORDER BY : 정렬
--		오름차순 : ASC(DEFAULT 값이라 명시 안해도 됨), 내림차순 : DESC
-- 그룹의 결과를 제한 VS 조건을 사용해서 전체의 결과를 제한

-----------------------------------------------------------------------------------------------
-- ** 서브쿼리(SUBQUERY)
--		SELECT 문 안에 다시 SELECT문을 사용하는 기술
--		하나의 SQL문 안에 다른  SQL문이 중첩된 질의문을 의미
--		다른 테이블에서 가져온 데이터로 현재 테이블에 있는 정보를 찾거나 가공할 때 사용
--		데이터가 대량일 때 데이터를 모두 합쳐서 연산하는 JOIN보다
--		필요한 데이터만 찾아서 공급해주는 SUBQUERY가 성능이 더 좋다.

-- 주질의(MAIN QUERY, 외부질의)와 부속질의(SUBQUERY, 내부질의)로 구성

-- 평균가보다 가격이 낮은 과자의 이름과 가격 정보를 조회
SELECT S_NAME, S_PRICE FROM APR06_SNACK 
WHERE S_PRICE < AVG(S_PRICE); -- ERROR!

select s_name, s_price from apr06_snack
where s_price < (select avg(s_price)from apr06_snack);
	
-- 팁 : 부분으로 나눠서 구성해보면 조금 더 가독성이 올라감, 조건에 맞게 잘 찾을 수 도 있음
--	메인 쿼리의 where절에서 서브쿼리의 결과와 비교ㅕ할때는 반드시 비교연산자 사용
-- 괄호주의 ! : 괄호 넣지 않으면 오류(where절 이후 select문은 괄호 속에 넣어야한다.

-- 제일 비싼 과자 이름, 제조사, 가격 조회
select s_name, s_maker, s_price from apr06_snack
where s_price = (select max(s_price) from apr06_snack);

-- 제일 싼 과자는 어디서 만드나요?
select s_maker from apr06_snack
where s_price = (select min(s_price) from apr06_snack);

-- 평균가보다 비싼 과자는 몇 종류
select count(*) from apr06_snack
where s_price > (select avg(s_price) from apr06_snack);

-- 유통기한이 가장 오래 남은 과자의 전체 정보 조회
select * from apr06_snack
where s_exp = (select max(s_exp) from apr06_snack);
----------------------------------------------------------------------------------------------------
-- 과자 회사 테이블 apr06_maker
-- 회사 이름 , 주소, 직원수 
select distinct s_maker from apr06_snack;
-- 과자 테이블에 맞춰서 데이터 넣기(크라운 롯데 오리온)
create table apr06_maker(
	m_name varchar2(10 char) primary key,
	m_addr varchar2(20 char) not null,
	m_employee number(3) not null
);

create 
	insert into apr06_maker values('크라운','서울',700);
	insert into apr06_maker values('롯데','대구',350);
	insert into apr06_maker values('오리온','부산',500);
	
select * from apr06_maker;

drop table apr06_maker;
drop sequence apr06_maker_seq;

----------------------------------------------------------------------------------------------------------------------
-- 직원수가 제일 적은 회사에서 만드는 과자 이름 가격
select s_name,s_price 
	from apr06_snack 
	where s_maker = (
		select m_name 
		from apr06_maker
		where m_employee = (
			select min(m_employee)
			from apr06_maker
			)
	);

-- 제일 비싼 과자를 만드는 회사는 어디에 있는지
select m_addr 
from apr06_maker
	where m_name = (
	select s_maker 
		from apr06_snack
		where s_price = (
		select max(s_price)
		from apr06_snack
		)
	);

-- 부산에 있는 회사에서 만드는 과자의 평균가
select avg(s_price) 
	from apr06_snack
	where s_maker = (
		select m_name 
		from apr06_maker
		where m_addr = '부산'
	);
	
-- 평균가 이상의 과자를 만드는 회사의 이름, 위치
-- = 를 쓰면 단일값 이상의 결과를 내보낼 수 없어서 'single row ~ ' 발생
-- 관계연산자 in을 사용
select m_name , m_addr
	from apr06_maker
	where m_name in (
		select s_maker
		from apr06_snack
		where s_price >= (
			select avg(s_price)
			from apr06_snack
		)
	);
	
-- 평균가
select avg(s_price) from apr06_snack;

-- 평균가 이상의 과자를 만드는 회사 
select s_maker from apr06_snack
	where s_price >= (select avg(s_price) from apr06_snack);
	
-------------------------------------------------------------------------------------------------------------------------
-- 1. 음료 테이블과 카페 테이블 만들기
-- 음료테이블 : 음료이름 / 가격 / 판매하는 카페의 이름
-- 카페테이블 : 카페이름 / 지역 / 좌석 수
-- [조건]  각 테이블에서 음료이름, 카페이름은 고유한 값을 가진다

-- 2. 조건에 맞는 테이블생성
-- A카페 : 서울 / 좌석 100
--	(아메리카노 , 2000원) , (라떼, 3000원), (녹차, 2500원) 판매
-- B카페 : 독도 / 좌석 80
--	(홍차, 2500원), (스무디, 3000원), (에스프레소, 4000원) 판매

create table apr10_drink (
	d_name varchar2(10 char) primary key,
	d_price number(5) not null,
	d_cafe varchar2(10 char) not null
	
);

insert into apr10_drink values('아메리카노',2000,'A카페');
insert into apr10_drink values('라떼',3000,'A카페');
insert into apr10_drink values('녹차',2500,'A카페');
insert into apr10_drink values('홍차',2500,'B카페');
insert into apr10_drink values('스무디',3000,'B카페');
insert into apr10_drink values('에스프레소',4000,'B카페');

select * from apr10_drink;

create table apr10_cafe (
	c_name varchar2(10 char) primary key,
	c_location varchar2(10 char) not null,
	c_seat number(3) not null
);
	
insert into apr10_cafe values('A카페', '서울', 100);
insert into apr10_cafe values('B카페', '독도', 80);

select * from apr10_cafe;

drop table apr10_cafe cascade constraint purge;

-------------------------------------------------------------------------------------------------------------
-- 전체 음료 평균가보다 비싼 음료는 몇 종류?
select avg(d_price) from apr10_drink;
select count(*)
	from apr10_drink
	where d_price > (
		select avg(d_price) 
		from apr10_drink
	);


select count(*) from apr10_drink
	where d_price > (select avg(d_price) from apr10_drink);
-- 제일 싼 음료를 파는 카페의 이름?
select min(d_price) from apr10_drink;

select c_name
	from apr10_cafe
	where c_name = (
		select d_cafe 
		from apr10_drink
		where d_price = (
			select min(d_price)
			from apr10_drink
		)
	);	
	
select c_name 
	from apr10_cafe
	where c_name = (
		select d_cafe
		from apr10_drink
		where d_price = (
			select min(d_price) 
			from apr10_drink
		)
	);
	
	
-- 서울에 있는 카페에서 만든 음료의 평균가?
select avg(d_price)
	from apr10_drink
	where d_cafe = (
		select c_name 
		from apr10_cafe 
		where c_location = '서울'
	);
	
select avg(d_price)
	from apr10_drink
	where d_cafe = (
		select c_name
		from apr10_cafe
		where c_location = '서울'
		);

-- 좌석이 90석 이상인 카페에서 파는 음료의 이름?
select d_name 
	from apr10_drink
	where d_cafe = (
	select c_name
		from apr10_cafe
		where c_seat >= 90
		);
		
-- 전체 음료 기준 평균가 이하의 음료 이름?
select d_name
	from apr10_drink
	where d_price <= (
		select avg(d_price)
		from apr10_drink
	);
		
-- 가장 비싼 음료를 파는 카페는 어디에 위치하고 있는지?
select c_location
	from apr10_cafe
	where c_name = (
		select d_cafe
		from apr10_drink
		where d_price = (
			select max(d_price)
			from apr10_drink)
	);
	
	










