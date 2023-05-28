
-- 커피 테이블 : may25_coffee
--	c_name, c_price

create table may25_coffee (
	c_name varchar2(10 char)  primary key,
	c_price	number(5) not null
);

select * from MAY25_COFFEE;

insert into MAY25_COFFEE values('아메리카노', 2000);
insert into MAY25_COFFEE values('카페라떼', 2500);
insert into MAY25_COFFEE values('에스프레소', 2200);
insert into MAY25_COFFEE values('바닐라라떼', 2600);
insert into MAY25_COFFEE values('녹차라떼', 5000);

