-- 과일(may24_fruit) : 이름, 가격
-- table 생성
-- insert(10개)

create table may24_fruit (
	f_name varchar2(10 char) primary key,
	f_price number(5) not null
);

insert into MAY24_FRUIT values('멜론', 6800);
insert into MAY24_FRUIT values('수박', 12000);
insert into MAY24_FRUIT values('사과', 3200);
insert into MAY24_FRUIT values('배', 4300);
insert into MAY24_FRUIT values('딸기', 8800);
insert into MAY24_FRUIT values('오렌지', 2200);
insert into MAY24_FRUIT values('한라봉', 5900);
insert into MAY24_FRUIT values('샤인머스켓', 13600);
insert into MAY24_FRUIT values('파인애플', 8200);
insert into MAY24_FRUIT values('키위', 3000);

select * from MAY24_FRUIT order by f_price;

drop table may24_fruit;

