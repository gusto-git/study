-- 사과 테이블
-- db 만들었을 때 효율적으로 사용하기 위해서 자바빈을 만들어줘야한다.

create table may031_apple(
	a_location varchar2(10 char) primary key,
	a_color varchar2(10 char) not null,
	a_flavor varchar2(10 char) not null,
	a_price number(4) not null,
	a_introduce varchar2(100 char) not null
);

insert into MAY031_APPLE values('김해', '빨간색', '단맛', 5000, '정말 맛있는 김해 사과');
insert into MAY031_APPLE values('부산', '파란색', '쓴맛', 4000, '정말 맛있는 부산 사과');
insert into MAY031_APPLE values('대구', '초록색', '떫은맛', 3000, '정말 맛있는 대구 사과');
insert into MAY031_APPLE values('대전', '노란색', '매운맛', 1000, '정말 맛있는 대전 사과');
insert into MAY031_APPLE values('광주', '보라색', '추억의맛', 2400, '정말 맛있는 광주 사과');

select * from MAY031_APPLE;

select count(*) from MAY031_APPLE;

-- 사과 데이터를 가격순으로 정렬한 후에 3~7번째 까지 데이터만 볼 수 있도록 
select * from(
select rownum as rn, a_location, a_color, a_flavor, a_price, a_introduce
from(
select * from MAY031_APPLE order by a_price
	)
)
where rn >= 3 and rn <= 7;


-- 김해 데이터 전부 받아오기 
select * from MAY031_APPLE where a_location ='김해';





