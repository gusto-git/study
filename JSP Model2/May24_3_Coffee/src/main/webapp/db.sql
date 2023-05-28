-- Coffee 테이블
-- 이름, 가격 , 원두, 원산지, 파는곳, 칼로리

create table may24_coffee(
	c_no number(3) primary key,
	c_name varchar2(10 char) not null,
	c_price number(5) not null,
	c_bean varchar2(10 char) not null,
	c_country varchar2(20 char) not null,
	c_store varchar2(10 char) not null,
	c_kcal number(5,2) not null
);

create sequence may24_coffee_seq;

insert into may24_coffee values(may24_coffee_seq.nextval, '아메리카노', 2500, '아라비카', '에티오피아', '스타벅스', 10);
insert into may24_coffee values(may24_coffee_seq.nextval, '아메리카노', 2700, '로부스타', '마다가스카르', '엔젤인어스', 12);
insert into may24_coffee values(may24_coffee_seq.nextval, '카페라떼', 3500, '버번', '프랑스', '텐퍼센트', 180);
insert into may24_coffee values(may24_coffee_seq.nextval, '돌체라떼', 4500, '핑크버번', '에티오피아', '스타벅스', 255);
insert into may24_coffee values(may24_coffee_seq.nextval, '카페모카', 4200, '로부스타', '마다가스카르', '하삼동', 290);
insert into may24_coffee values(may24_coffee_seq.nextval, '카푸치노', 4400, '아라비카', '에티오피아', '벤티', 110);
insert into may24_coffee values(may24_coffee_seq.nextval, '카라멜마끼아또', 5300, '로부스타', '마다가스카르', '스타벅스', 200);
insert into may24_coffee values(may24_coffee_seq.nextval, '더블샷', 3200, '아라비카', '에티오피아', '하삼동', 10);
insert into may24_coffee values(may24_coffee_seq.nextval, '에스프레소', 2500, '버번', '프랑스', '텐퍼센트', 5);
insert into may24_coffee values(may24_coffee_seq.nextval, '콜드 브루', 4000, '버번', '프랑스', '투썸플레이스', 5);
insert into may24_coffee values(may24_coffee_seq.nextval, '콜드 브루 라떼', 4500, '아라비카', '에티오피아', '스타벅스', 265);


select * from may24_coffee order by c_price;



