--  요식업 프랜차이즈

-- 홍콩반점 강남점은 홍길동(1)이 운영하고 100석
-- 홍콩반점 종로점은 김길동(2)이 운영하고 80석
-- 한신포차 강서점은 홍길동(3)이 운영하고 150석
-- 잠실포차 잠실점은 최길동(4)이 운영하고 130석
drop table apr11_store cascade constraint purge;
drop sequence apr11_store_seq cascade constraint purge;

create table apr11_franchise (
	f_no number(3) primary key, 	-- 식당번호
	f_name varchar2(10 char) not null,
	f_location varchar2(10 char) not null,
	f_ceo number(3) not null, 		--사장님번호
	f_seat number(3) not null
);

create sequence apr11_franchise_seq;

insert into apr11_franchise values(apr11_franchise_seq.nextval,'홍콩반점','강남','1',100);
insert into apr11_franchise values(apr11_franchise_seq.nextval,'홍콩반점','종로','2',80);
insert into apr11_franchise values(apr11_franchise_seq.nextval,'한신포차','강서','3',150);
insert into apr11_franchise values(apr11_franchise_seq.nextval,'잠실포차','잠실','4',130);

select * from apr11_franchise;
-- 사장님을 varchar2가 아닌 number롤 둔 이유는 다음 테이블에서 나온다.
--------------------------------------------------------------------------------------------------
-- 홍길동, 1990-03-01일생, 남자
-- 김길동, 1992-02-01일생, 여자
-- 홍길동, 1991-12-12일생, 여자
-- 최길동, 1989-09-09일생, 남자

drop table apr11_ceo cascade constraint purge;
drop sequence apr11_ceo_seq cascade constraint purge;

create table apr11_ceo (
	c_no number(3) primary key, -- 사장님 번호랑 일치하게 만들어줘야함
	c_name varchar2(10 char) not null,
	c_birthday date not null,
	c_gender char(2 char) not null
);
create sequence apr11_ceo_seq;

insert into apr11_ceo values(apr11_ceo_seq.nextval,'홍길동',to_date('1990-03-01', 'YYYY-MM-DD'),'남자');
insert into apr11_ceo values(apr11_ceo_seq.nextval,'김길동',to_date('1992-02-01', 'YYYY-MM-DD'),'여자');
insert into apr11_ceo values(apr11_ceo_seq.nextval,'홍길동',to_date('1991-12-12', 'YYYY-MM-DD'),'여자');
insert into apr11_ceo values(apr11_ceo_seq.nextval,'최길동',to_date('1989-09-09', 'YYYY-MM-DD'),'남자');

select * from apr11_ceo;

-- 매장당 메뉴 5개 정도입력
-- 짜장면, 5000원, 홍콩반점 강남점(100석)
-- 불닭발, 12000원, 한신포차 강서점(150석)
drop table apr11_menu cascade constraint purge;
drop sequence apr11_menu_seq 

create table apr11_menu (
	m_no number(2) primary key,
	m_name varchar2(10 char) not null,
	m_price number(5) not null,
	m_f_no number(3) not null
);

create sequence apr11_menu_seq;

insert into apr11_menu values(apr11_menu_seq.nextval,'짜장면', 5000, 1);
insert into apr11_menu values(apr11_menu_seq.nextval,'짜장밥', 5500, 1);
insert into apr11_menu values(apr11_menu_seq.nextval,'볶음밥', 7000, 1);
insert into apr11_menu values(apr11_menu_seq.nextval,'유산슬', 20000, 1);
insert into apr11_menu values(apr11_menu_seq.nextval,'멘보샤', 15000, 1);
insert into apr11_menu values(apr11_menu_seq.nextval,'짜장밥', 6000, 2);
insert into apr11_menu values(apr11_menu_seq.nextval,'짬뽕밥', 8000, 2);
insert into apr11_menu values(apr11_menu_seq.nextval,'차돌짬뽕', 10000, 2);
insert into apr11_menu values(apr11_menu_seq.nextval,'고추잡채', 16000, 2);
insert into apr11_menu values(apr11_menu_seq.nextval,'삼선짜장', 13000, 2);
insert into apr11_menu values(apr11_menu_seq.nextval,'불닭발', 18000, 3);
insert into apr11_menu values(apr11_menu_seq.nextval,'계란찜', 6000, 3);
insert into apr11_menu values(apr11_menu_seq.nextval,'모래집', 10000, 3);
insert into apr11_menu values(apr11_menu_seq.nextval,'문어발', 4000, 3);
insert into apr11_menu values(apr11_menu_seq.nextval,'해물떡볶이', 16000, 3);
insert into apr11_menu values(apr11_menu_seq.nextval,'어묵탕', 10000, 4);
insert into apr11_menu values(apr11_menu_seq.nextval,'콘치즈', 12000, 4);
insert into apr11_menu values(apr11_menu_seq.nextval,'오징어땅콩', 15000, 4);
insert into apr11_menu values(apr11_menu_seq.nextval,'한치', 9000, 4);
insert into apr11_menu values(apr11_menu_seq.nextval,'제육볶음', 12000, 4);

select * from apr11_menu;

----------------------------------------------------------------------------------------------------------------------
-- 좌석수 제일 많은 식당 운영하는 사람의 전체정보
select *
	from apr11_ceo
	where c_no = (
		select f_ceo 
		from apr11_franchise
		where f_seat = (
			select max(f_seat) 
			from apr11_franchise
		)
	);
	
-- 프랜차이즈 메뉴 전체의 이름, 가격
-- 을 가격 오름차순 -> 가격이 같다면 메뉴명 가나다 역순 정렬 
-- order by 컬럼명(asc/desc), 컬럼명(asc/desc)
select m_name, m_price from apr11_menu order by m_price asc, m_name desc;
-- 전체 사장님들 이름, 생일 조회
select c_name, c_birthday from apr11_ceo;
-- 프렌차이즈 식당 몇개
select count(*) from apr11_franchise;
-- 프렌차이즈 메뉴 전체 평균가
select avg(m_price) from apr11_menu;
-------------------------------------------------------------------------------------------------------------------------
-- 제일 비싼 메뉴의 이름, 가격
select m_name, m_price 
	from apr11_menu 
	where m_price =(
		select max(m_price)
		from apr11_menu
	);

select m_name, m_price 
	from APR11_MENU
	where m_price = (
		select max(m_price)
		from apr11_menu
	);
	
-- 최연장자 사장님의 이름, 생일
select c_name, c_birthday
	from apr11_ceo
	where c_birthday =(
		select min(c_birthday)
		from apr11_ceo
	);

-- 좌석수 제일 적은 식당의 이름, 지점명, 좌석수
select f_name, f_location, f_seat
	from apr11_franchise
	where f_seat in (
		select min(f_seat)
		from apr11_franchise
	); -- 같은 좌석수를 가질 수 있음으로 in이 좀 더 정확하다.

--홍콩반점 강남점을 운영하는 사람의 이름, 생일
select c_name, c_birthday
	from apr11_ceo
	where c_no in (
		select f_ceo
			from apr11_franchise
			where f_name = '홍콩반점' and f_location = '강남'
	); -- 한 사장님이 가게를 두개 운영할 수 있어서 = 아닌 in을 사용한다. 


-- '짜장'이 들어간 음식은 어디가면 먹을 수 있나요? (짜장이 들어간 음식을 파는 식당이름, 지점명)

select f_name, f_location
	from apr11_franchise
	where f_no in (
		select m_f_no 
			from apr11_menu
			where m_name like '%짜장%'
	);
	
-- 최연소 사장님의 가게 메뉴이름, 가격
select m_f_no, m_name, m_price
	from apr11_menu
	where m_f_no in (
		select f_no
		from apr11_franchise
		where f_ceo in (
			select c_no
			from apr11_ceo
			where c_birthday = (
				select max(c_birthday) 
				from apr11_ceo
		)
	)
); -- in을 쓰는 경우(값이 여러개 일 경우?), in만쓸 경우 첫번째만 나온느 경우가 있어서 사전에 막는 것
-----------------------------------------------------------------------------------------------------------------------	
select * from apr11_franchise, apr11_ceo; -- 모든 가능성을 다 합쳐버림 
-- 이런식으로 합치면 테이블이 합쳐지면서 모든 경우의 수가 다 나오기 때문에
-- 조건식을 사용해서 진짜 맞는 데이터를 가지고 와야 함!
select * from apr11_franchise, apr11_ceo where f_ceo = c_no;	
	
-- 전체 식당 이름, 지점명, 사장님이름, 사장님 생일
select f_name, f_location, c_name, c_birthday 
	from apr11_franchise, apr11_ceo where f_ceo = c_no;
	
-- 전체 메뉴명, 가격, 식당이름, 지점명
select m_name, m_price, f_name, f_location from apr11_menu, apr11_franchise where m_f_no = f_no;

-- 좌석수가 100석 이상인 식당의 메뉴명, 가격, 식당이름, 지점명, 좌석수
select m_name, m_price, f_name, f_location, f_seat 
	from apr11_menu, apr11_franchise 
	where m_f_no = f_no and f_seat >= 100;

-- 규모가 제일 큰  식당의 메뉴명, 가격, 식당이름 ,지점명, 좌석수
select m_name, m_price, f_name, f_location, f_seat
	from apr11_menu, apr11_franchise
	where m_f_no = f_no and f_seat = (
		select max(f_seat)
		from apr11_franchise
	);

-- 최연장자 사장님네 전체 메뉴명, 가격, 식당이름, 지점명, 사장님이름, 생일을 메뉴명 가나다순 > 식당이름 가나다순
select m_name, m_price, f_name, f_location, c_name, c_birthday
	from apr11_franchise, apr11_ceo, apr11_menu
	where c_no = f_ceo and m_f_no = f_no 
	and c_birthday = (
		select min(c_birthday)
		from apr11_ceo 
	)
	order by m_name , f_name ;

------------------------------------------------------------------------------------------
-- 메뉴가 1000개 이상 있다고 가정
-- 메뉴 데이터 갯수를 나눠서 페이지로 보여주고 싶음
-- 어떻게 해야할까?
-- 메뉴테이블에 m_no가 있음(Primary key)
-- Sequence로 처리
-- sequence는 insert 실패해도 counting이 됨
-- 메뉴데이터 삭제 할 수도 있음
-- -> m_no가 정확하게 1,2,3,4 ... ,10000이 아님
-------------------------------------------------------------------------------------------
-- 가상필드(Rownum) ****************** 매우매우 중요함
-- 		select 할 때마다 자동으로 부여됨
--		* 와는 함께 사용이 불가능!
--      order by보다 먼저 부여 -> 편리하다 	
--		무조건 1번부터 조회 해야합니다.

--	메뉴 이름을 가나다 순으로 정렬해서 메뉴의 전체 정보 조회 
-- select rownum, *from apr11_menu order by m_name asc; error!
select rownum, m_no, m_name, m_price, m_f_no from apr11_menu order by m_name asc;

-- order by 하기 전에 rownum이 먼저 생성되어서
-- sequence를 먹인 m_no와 대부분 같게 나온다.

-- 메뉴 이름을 가나다 순으로 정렬해서 menu테이블 rownum 1~3까지 전체 정보를 조회
select rownum, m_no, m_name, m_price, m_f_no 
	from apr11_menu 
	where rownum >= 1 and rownum <= 3
	order by m_name asc;
	
-- 우리가 의도한 것 : 이름순으로 정렬한 후 그 뒤에 번호값(rownum)을 부여하기 원함
select rownum, m_no, m_name, m_price 
	from(
		select m_no, m_name, m_price, m_f_no
		from apr11_menu order by m_name 			
		)
		where rownum >= 1 and rownum <= 3; 

-- rownum 3번 ~ 11번 
select rownum, m_no, m_name, m_price 
	from(
		select m_no, m_name, m_price,
		from apr11_menu order by m_name 			
		)
		where rownum >= 3 and rownum <= 11; -- erorr! : 무조건 1번부터 조회해야 한다. 

-- 가장 바깥으로 select 하나 더 씌어주면 됨
-- select문을 rownum 거으로 씌우면서 rownum은 숫자만 부여하고 효력을 잃어 버려서 *을 사용할 수 있게 된다.

select * 
	from(
		select rownum rn, m_no, m_name, m_price
		from(
			select m_no, m_name, m_price
			from apr11_menu order by m_name
		)
	)
where rn >= 3 and rn <= 11;

-- ~길동 이라는 이름을 가진 사장님네 메뉴명, 가격, 식당명, 지점명, 사장님이름을
-- 가격 내림차순 > 메뉴명 가나다 순 정렬 후
-- 3번째 8번째 정보 조회 

SELECT *
FROM (
    SELECT ROWNUM rn, m_name, m_price, f_name, f_location, c_name
    FROM (
        SELECT m_name, m_price, f_name, f_location, c_name
        FROM APR11_FRANCHISE f, APR11_MENU m, APR11_CEO c
        WHERE c.c_no = f.f_ceo AND m.m_f_no = f.f_no AND c.c_name LIKE '%길동'
        ORDER BY m_price DESC, m_name
    )
)
WHERE rn BETWEEN 3 AND 8;

	

select *
	from(
		select rownum rn, m_name, m_price, f_name, f_location, c_name
		from(
			select m_name, m_price, f_name, f_location, c_name
				from apr11_franchise, apr11_ceo, apr11_menu 
				where c_no = f_ceo and m_f_no = f_no 
				and c_name like '%길동'
				order by m_price desc , m_name asc
		)
	)
where rn between 3 and 8;
	
-- 김씨 성을 가진 사장님네 메뉴명, 가격, 사장님 이름, 사장님 성별
-- 가격 오름차순 정렬 -> 2~3번째 자료 추출
select *
	from(
		select rownum rn, m_name, m_price, c_name, c_gender
		from(
			select m_name, m_price, c_name, c_gender
					from apr11_ceo, apr11_menu, apr11_franchise
					where m_f_no = f_no and c_no = f_ceo
					and c_name like '김%'
					order by m_price asc
				)
			)
			where rn between 2 and 3; 
	
--------------------------------------------------------------------------------------------------------------------------	
-- join
-- 하나의 명령문에 의해 여러 테이블에 저장된 데이터를 한번에 조회 할 수 있는 기능
-- 마치 하나의 테이블인 것처럼 보여줌 

			
create table tb1(name varchar2 (10 char), age number(3));	
create table tb2(name varchar2 (10 char), age number(3));	

insert into tb1 values('김길동', 30);
insert into tb1 values('박길동', 35);
insert into tb1 values('최길동', 40);
insert into tb1 values('오길동', 40);

insert into tb2 values('김길동', 30);
insert into tb2 values('정길동', 50);
insert into tb2 values('이길동', 55);

select * from tb1;
select * from tb2;

-------------------------------------------------------------------------------------------------------------------
-- cross join : 별도의 조건없이 두 테이블 간의 가능한 모든 결과를 조회(모든 경우의 수)
-- 사실상 안쓴다.
select * from tb1, tb2;
select * from tb1 cross join tb2;

-- inner join : 조건에 해당하는 값만 나옴
select * from tb1 inner join tb2 on tb1.name = tb2.name;
select * from tb1 A, tb2 B where A.name = B.name; -- EQUI 조인(동등조인)
-- EQUI 조인 : JOIN ~ USING(조인대상 컬럼명) : 조인대상 컬럼명은 1번만 출력 나머지는 그대로 출력
select * from tb1 join tb2 using (name); 
-- 자연조인(Natural join) : 조건절 없이 양쪽에 같은 이름을 가진 동일한 컬럼만 조회
select * from tb1 natural join tb2; 

-- outer join : 기준 테이블의 데이터가 모두 조회(누락없이)되고,
--				대상 테이블에 데이터가 있는 경우 해당 컬럼의 값을 가져오기 위함
-- (+) 를 이용한 outer join : null이 출력되는 테이블의 컬럼(+) 기호 추가

-- left outer join : 왼쪽 테이블에 값이 있을 시 오른쪽 테이블이 조건에 맞지 않아도 나옴
--  (조건에 맞지 않으면 null를 매꿈)
-- * left를 right보다 더 많이 씀(왼쪽 테이블을 기준으로 둔다)

select * from tb1 left outer join tb2 on tb1.name = tb2.name;
select * from tb1, tb2 where tb1.name = tb2.name(+);

-- right outer join : 오른쪽 테이블에 값이 있을 시 왼쪽 테이블이 조건에 맞지 않아도 나옴
-- (조건에 맞지 않으면 null를 매꿈)
select * from tb1 right outer join tb2 on tb1.name = tb2.name;
select * from tb1,tb2 where tb1.name(+) = tb2.name;

-- full outer join : 한쪽 테이블에 값이 있을시, 다른쪽 테이블이 조건에 맞지 않아도 나옴
select * from tb1 full outer join tb2 on tb1.name = tb2.name;

-- self join ** 헷갈림
-- 하나의 테이블 안에 있는 컬럼끼리 연결하는 조인이 필요한경우
-- 단어 뜻 그대로 스스로 JOIN한다는 것

-- 한 사이트에 회원이 5명이 있고 관리자가 2명 있다
-- 회원의 이름은 각각 회원1 ~ 회원5 , 관리자 이름은 관리자1 ~ 관리자 2
-- 회원의 ID름은 각각 MEMBER1~MEBER2 , 관리자 ID MANAGER1 ~ MANAGER2
-- 회원1 ~ 회원 3까지 관리자 1이 관리, 나머지는 관리자 2가 관리

create table apr11_member(
	m_id varchar2(10 char) primary key,
	m_name varchar2(10 char) not null,
	m_manager varchar2(10 char) -- 관리자들은 관리를 받지 않으니 제약조건 x
);

insert into apr11_member values('member1', '회원1', 'manager1');
insert into apr11_member values('member2', '회원2', 'manager1');
insert into apr11_member values('member3', '회원3', 'manager1');
insert into apr11_member values('member4', '회원4', 'manager2');
insert into apr11_member values('member5', '회원5', 'manager2');

insert into apr11_member values('manager1', '관리자1', null);
insert into apr11_member values('manager2', '관리자2', null);

select * from apr11_member;

-- 각 관리자가 어떤 회원을 관리하는지 알고 싶음
-- 관리자 id, 관리자 이름, 회원 id
select * from apr11_member A join apr11_member B on A.m_id = B.m_id;

select A.m_id, A.m_name, B.m_id -- 같은 테이블이지만 셀프조인을 하기 위해 테이블 별로 별칭을 넣어서 구분
		from apr11_member A join apr11_member B
		on A.m_id = B.m_manager; 
		-- 계정 ID와 관리자 계정이 같은 값들을 연결해서
		-- 관리하는 회원 ID값을 가져올 수 있도록 






