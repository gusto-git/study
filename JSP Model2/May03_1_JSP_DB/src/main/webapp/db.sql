-- 사과 테이블
-- 지역(PK), 색, 맛, 가격, 소개에 대한 정보가 담기도록 테이블 생성
-- 데이터 4~5개 정도 넣ㄴ어주세요

create table may03_apple(
	a_location varchar2(10 char) primary key,
	a_color varchar2(10 char) not null,
	a_flavor varchar2(10 char) not null,
	a_price number(5) not null,
	a_introduce varchar2(100 char) not null
);

insert into may03_apple values('거창','빨간색','맛있는맛',4000,'정말맛있는사과');
insert into may03_apple values('고창','빨간색','단맛',3500,'정말단사과');
insert into may03_apple values('밀양','빨간색','신맛',26000,'정말신사과');
insert into may03_apple values('김해','간색','떫은맛',6000,'정말떫은사과');
insert into may03_apple values('대구','빨간색','맛있는맛',7200,'정말맛있는사과');

select * from may03_apple;