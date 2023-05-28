CREATE TABLE apple (
    a_location VARCHAR2(10 CHAR) PRIMARY KEY,
    a_color VARCHAR2(10 CHAR) NOT NULL,
    a_flavor VARCHAR2(10 CHAR) NOT NULL,
    a_price NUMBER(4) NOT NULL,
    a_introduce VARCHAR2(100 CHAR) NOT NULL
);

insert into APPLE values('김해','빨간색','단맛',5500,'정말 맛있는 김해사과!')
insert into APPLE values('창원','노란색','쓴맛',3300,'정말 맛있는 창원사과!')
insert into APPLE values('마산','초록색','떫은맛',2700,'정말 맛있는 마산사과!')
insert into APPLE values('진해','파란색','매운맛',1600,'정말 맛있는 진해사과!')
insert into APPLE values('진주','연두색','무맛',2500,'정말 맛있는 진주사과!')

select * from APPLE;