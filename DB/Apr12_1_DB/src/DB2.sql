-- 배추, 3000g, 10000원, 홈플러스, 강남점, 1000평, 주차장 500석
-- 무, 500g, 5000원, 홈플러스, 강서점, 500평, 주차장 300석
-- 배추, 2000g, 5000원, 이마트, 서초점, 800평, 주차장 800석
-----------------------------------------------------------------------
-- 테이블 만들고 값 넣기
drop table apr12_market cascade constraint purge;
drop sequence apr12_market_seq;
drop table apr12_product cascade constraint purge;
drop sequence apr12_product_seq;

create table apr12_market(
	m_no number(3) primary key,
	m_name varchar2(10 char) not null,
	m_location varchar2(10 char) not null,
	m_land number(4) not null,
	m_parking number(4) not null
);
create sequence apr12_market_seq;

insert into apr12_market values(apr12_market_seq.nextval, '홈플러스',
	'강남점', 1000, 500);
insert into apr12_market values(apr12_market_seq.nextval, '홈플러스',
	'강서점', 500, 300);
insert into apr12_market values(apr12_market_seq.nextval, '이마트',
	'서초점', 800, 800);
	
select * from apr12_market;
---------------------------------------------------------------
create table apr12_product(
	p_no number(4) primary key,
	p_name varchar2(10 char) not null,
	p_weight number(4) not null,
	p_price number(5) not null,
	p_m_no number(3) not null, 	-- market과 연결된 부분
	constraint fk_apr12_product foreign key(p_m_no)
		references apr12_market(m_no)
		on delete cascade
);
create sequence apr12_product_seq;

insert into apr12_product values(apr12_product_seq.nextval, '배추', 3000, 10000, 1);
insert into apr12_product values(apr12_product_seq.nextval, '무', 500, 5000, 2);
insert into apr12_product values(apr12_product_seq.nextval, '배추', 2000, 5000, 3);

select * from apr12_product
---------------------------------------------------------------
-- create table : DBA
-- drop table : DBA
-- create sequence : DBA
-- 계정 하나로 여러명 사용 가능
-- 회사가면 개발자용 계정을 알려줌 -> 위의 작업들을 할 권한은 없을듯?
---------------------------------------------------------------
-- CRUD
-- C(create) - INSERT
--		SEQUNECE 사용, 날짜 집어넣고, 값 넣고, ...
-- R(read) - SELECT
--		거의 대부분의 시간을 할애함

-- U - UPDATE
--		값 수정
UPDATE 테이블명
	SET 컬럼명 = 값, 컬럼명 = 값, ... -- 바꿀내용
	WHERE 조건;
	
-- 무를 공짜로
update apr12_product
	set p_price = 10000
	where p_name = '무';
-- 배추를 [김장용배추]로 이름 수정
update apr12_product
	set p_name = '김장용배추'
	where p_name like '%배추%'; 
-- 모든 마트의 주차장 30% 줄이기
update apr12_market
	set m_parking = m_parking * 0.7;
-- 홈플러스 강서점의 상품가격 10% 할인
update apr12_product
	set p_price = p_price * 0.9
	where p_m_no in (
		select m_no 
		from apr12_market
		where m_name = '홈플러스' and m_location = '강서점'
	);
-- 제일 비싼 상품 10% 할인
update apr12_product
	set p_price = p_price * 0.9
	where p_price = (
		select max(p_price)
		from apr12_product
	);

select * from apr12_product;
select * from apr12_market;
---------------------------------------------------------------------
-- D - delete
DELETE FROM 테이블명
	WHERE 조건식;

-- 무 삭제
delete from apr12_product
	where p_name = '무';

-- 가장 좁은 매장의 상품 다 삭제
delete from apr12_product
	where p_m_no = (
		select m_no 
		from apr12_market
		where m_land = (
			select max(m_land)
			from apr12_market
		)
	);
	
---------------------------------------------------------------------
-- 홈플러스 강남점이 폐점
delete from apr12_market
	where m_name = '홈플러스' and m_location = '강남점';
-- 홈플러스 강남점이 없어지는데, 그 안에 있던 상품들은 어떻게 할지..?
-- 그냥 두거나 / 같이 삭제 / 비워두거나 ...
-- 정답이 없음.. 나중에 프로젝트 할 때 팀원끼리 잘 상의 해야해용
select * from apr12_product;
select * from apr12_market;
---------------------------------------------------------------------
-- 1. OracleDB 서버에 다음 데이터를 표현할 수 있는 DB자료구조를 만드는 SQL문을 작성해주세요
create table apr12_computer(
	c_no number(3) primary key,
	c_name varchar2(10 char) not null,
	c_os varchar2(20 char) not null,
	c_format date not null,
	c_weight number(3,2) not null,
	c_cpu varchar2(10 char) not null
);

create sequence apr12_computer_seq;

-- - 컴퓨터 이름 : 컴퓨터1
-- - 운영체제 : Windows 10 Pro
-- - 포맷날짜 : 2023-04-12
-- - 무게 : 5.12kg
-- - CPU : i5-1234
insert into apr12_computer values(apr12_computer_seq.nextval, '컴퓨터1',
	'Windows 10 Pro', to_date('2023-04-12', 'YYYY-MM-DD'), 5.12, 'i5-1234');

-- - 컴퓨터 이름 : 컴퓨터2
-- - 운영체제 : Windows 11 Pro
-- - 포맷날짜 : 2023-03-12
-- - 무게 : 5.23kg
-- - CPU : i7-5678
insert into apr12_computer values(apr12_computer_seq.nextval, '컴퓨터2',
	'Windows 11 Pro', to_date('2023-03-12', 'YYYY-MM-DD'), 5.23, 'i7-5678');
	
-- 2. 1번에서 만든 테이블에 다음 데이터를 추가하는 sql문을 작성해주세요
-- (1번 보기에 있는 데이터도 추가할 것(총 3개의 데이터)
-- - 컴퓨터 이름 : 컴퓨터3
-- - 운영체제 : Windows 10 Pro
-- - 포맷날짜 : 2023-02-12
-- - 무게 : 3.22kg
-- - CPU : i7-1234
insert into apr12_computer values(apr12_computer_seq.nextval, '컴퓨터3',
	'Windows 10 Pro', to_date('2023-02-12', 'YYYY-MM-DD'), 3.22, 'i7-1234');

-- 3. 1번에서 만든 테이블에서, 포맷한지 가장 오래된 컴퓨터의 날짜와
--    총 컴퓨터 수를 조회하는 SQL문을 작성해주세요
select min(c_format), count(*) from apr12_computer;

-- 4. 1번에서 만든 테이블에서, 가장 최근에 포맷한 컴퓨터의 이름을 조회하는 SQL문을 작성해주세요
select c_name
	from apr12_computer
	where c_format = (
		select max(c_format)
		from apr12_computer
	);

-- 5. 1번에서 만든 테이블에서 2번째로 가벼운 컴퓨터 ~ 3번째로 가벼운 컴퓨터의
--    전체 정보를 조회하는 SQL문을 작성해주세요
select *
	from(
		select rownum rn, c_name, c_os, c_format, c_weight, c_cpu
		from(
			select *
			from apr12_computer
			order by c_weight
		)
	)
	where rn between 2 and 3;
	
drop table apr12_computer cascade constraint purge;
drop sequence apr12_computer_seq;









------------------------------------------------------------------------------------------------------------------------


