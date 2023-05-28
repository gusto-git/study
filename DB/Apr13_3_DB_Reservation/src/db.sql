-- 어떤 식당의 예약 프로그램 (프랜차이즈)
drop table apr13_restaurant cascade constraint purge;
drop sequence apr13_restaurant_seq;

-- 특정 식당에 대한 테이블 (apr13_restaurant)
-- 식당 지점, 식당 주인, 좌석 수
create table apr13_restaurant(
	r_location varchar2(10 char) primary key,
	r_owner varchar2(10 char) not null,
	r_seat number(3) not null
);

create sequence apr13_restaurant_seq;

-- 확인용 insert 2개
-- select * 확인
insert into APR13_RESTAURANT values('강남', '홍길동', 100);
insert into APR13_RESTAURANT values('강북', '김길동', 80);
SELECT * FROM APR13_RESTAURANT;

-- 예약 테이블(apr13_reservation)
-- 예약자이름, 예약시간, 예약자 전화번호, 예약지점
drop table apr13_reservation cascade constraint purge;
drop sequence apr13_reservation_seq;

create table apr13_reservation (
	r_no number(3)primary key,
	r_name varchar(10 char) not null,
	r_time date not null,
	r_phone varchar(20 char) not null,
	r_location varchar(10 char)not null
);

create sequence apr13_reservation_seq;

-- 확인용 insert 2개
-- select * 확인

insert into apr13_reservation values(apr13_reservation_seq.nextval,
	'최길동', to_date('2023-04-14 14:00', 'YYYY-MM-DD HH24:MI'),
	'010-1111-222', '강남');
	
insert into apr13_reservation values(apr13_reservation_seq.nextval,
	'최길동', to_date('2023-04-14 14:00', 'YYYY-MM-DD HH24:MI'),
	'010-1111-222', '강북');

SELECT * FROM APR13_reservation;
SELECT * FROM APR13_RESTAURANT;
-- 확인용 insert 2개
-- select * 확인
insert into APR13_RESTAURANT values('강남', '홍길동', 100);
insert into APR13_RESTAURANT values('강북', '김길동', 80);
SELECT * FROM APR13_RESTAURANT;

-- 예약 테이블(apr13_reservation)
-- 예약자이름, 예약시간, 예약자 전화번호, 예약지점
drop table apr13_reservation cascade constraint purge;
drop sequence apr13_reservation_seq;

create table apr13_reservation (
	r_no number(3)primary key,
	r_name varchar(10 char) not null,
	r_time date not null,
	r_phone varchar(20 char) not null,
	r_location varchar(10 char)not null
);

create sequence apr13_reservation_seq;

-- 확인용 insert 2개
-- select * 확인

insert into apr13_reservation values(apr13_reservation_seq.nextval,
	'최길동', to_date('2023-04-14 14:00', 'YYYY-MM-DD HH24:MI'),
	'010-1111-222', '강남');
	
insert into apr13_reservation values(apr13_reservation_seq.nextval,
	'최길동', to_date('2023-04-14 14:00', 'YYYY-MM-DD HH24:MI'),
	'010-1111-222', '강북');

SELECT * FROM APR13_reservation;

-- 예약번호 오름차순 정렬
select * from apr13_reservation order by r_no;
