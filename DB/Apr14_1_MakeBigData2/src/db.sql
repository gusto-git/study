-- apr14_air table
-- 측정일시, 권역명, 측정소명, 미세먼지, 초미세먼지, 오존, 통합대기환경등급

drop table apr14_air cascade constraint purge;
drop sequence apr14_air_seq;

create table apr14_air (
	aa_no number(3) primary key,
	aa_MSRDT date not null,
	aa_MSRRGN_NM varchar2(10 char) not null,
	aa_MSRSTE_NM varchar2(10 char) not null,
	aa_PM10 number(3) not null,
	aa_PM25 number(3) not null,
	aa_O3 number(4,3) not null,
	aa_IDEX_NM varchar2(10 char) not null
);

-- sequence 
create sequence apr14_air_seq;

-- insert
insert into APR14_AIR values(apr14_air_seq.nextval, sysdate, '도시권', '강남구', 53, 25, 5.214, '나쁨');

-- select
select * from APR14_AIR ;

-- truncate
truncate table apr14_air;

-- 시간순 정렬
select * from APR14_AIR order by aa_MSRDT;







