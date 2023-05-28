-- [옵션]
--	= 제약조건(Constraint)이라고도 함
--		데이터 무결성을 보장하기 위한 용도
--		* 데이터 무결성 : DB에 저장된 데이터의 일관성과 정확성을 지켜주는 것

-- 1. 도메인 무결성 제약조건
--	= 도메인 제약(Domain Constraint)이라고도 함
--		테이블 안의 튜플(행)들이 각 속성의 도메인에 지정된 값만 가져야 한다는 조건
--		데이터타입(type), 널(null/not null), 기본값(default), 체크(check)

-- 2. 개체 무결성 제약조건
--	= 기본키 제약(Primary key Constraint)이라고도 함
--		개체(Entity) : 사람, 사물, 장소, 사건 등과 같이 독립적으로 존재하면서,고유하게 식별이 가능한 단위
--					   아무리 많은 개체가 존재해도, 내가 원하는 '유일한'개체를 발견할 수 있어야 함
--				       테이블은 기본키를 지정하고, Null 값을 가져서는 안되며,
--					   테이블 안에 오직 하나의 값만 존재해야 한다는 조건! 

-- 3. 참조 무결성 제약조건
--	= 외래키 제약(Foreign key Constraint)이라고도 함
--		테이블 간의 참조 관계를 선언하는 제약조건
--		참조를 받는 테이블의 외래키는 참조하는 테이블의 기본키와 동일해야 하며,
--		참조를 받는 테이블의 값이 변경되면 참조하는 테이블의 제약 받게 됨
----------------------------------------------------------------------------------------------------------------------
-- 1) Not null : NULL은 값이 비어있다는 뜻
--				 0이나 띄어쓰기도 아닌 정말로 값이 없는 상태
--				 NOT NULL은 NULL을 허용하지 않겠다.
--  			 -> 필수적으로 입력해야 할 컬럼에 설정
--     			 -> 가장 많이 사용되는 제약 조건 중 하나
--				 -> ** 테이블 만들 때 가급적 값이 들어가게 해줘야 한다.**

-- not null 부여방법1 : Constraint 키워드를 이용해서 제약조건명을 부여
create table example(
	col1 varchar2(10 char),
	col2 varchar2(10 char) constraint col2_notnull not null
);
-- col2 varchar2(10 char) constraint [제약조건명] [제약조건]

-- not null 부여방법2 : 제약조건명(constraint 제약조건명)을 따로 부여하지 않는 경우 (Orcale이 자동 부여)
create table example2(
	col1 varchar2(10 char),
	col2 varchar2(10 char) not null
);

-- 2) Unique : 해당 컬럼에 들어가는 값이 전체 테이블에서 유일해야 한다는 조건
--		NOT NULL과 함께 사용 가능 / UNIQUE는 많이 사용하지 않는다.
create table example3(
	col1 varchar2(10 char) unique,
	col2 varchar2(10 char) unique not null,
	col3 varchar2(10 char),
	constraint col3_unique unique(col3)
);
-- constraint 제약조건명 제약조건(컬럼명)

-- 3) primary key(기본키) : Null을 허용하지 않고 + 중복된 데이터도 허용하지 않음
--		(NOT NULL + UNIQUE -> PRIMARY KEY)
-- 		데이터의 특정 조건을 검색하거나, 수정 등의 작업을 할 때 기본키로 구분 
--		ID, 주민번호, 회원번호, 글 번호와 같이 중복되지 않는 것이 기본키에 해당
--		일반적으로 테이블에는 1개의 기본키는 무조건 가졌으면 좋겠음****
--		가급적 PK(기본키)는 테이블당 하나만
create table example4(
	col1 varchar(10 char) primary key,
	col2 varchar(10 char) not null,
	col3 varchar(10 char) not null
);
-- PK 여러개 줄때(여러 컬럼을 묶을 때)
create table example5(
	col1 varchar(10 char),
	col2 varchar(10 char),
	col3 varchar(10 char),
	constraint PK_example5 primary key(col1, col2)
);
-- constraint PK명 primary key(컬럼명, 컬럼명)

-- *** 진짜 어려움
-- 4) Foreign key(외래키) : 다른 테이블의 특정 컬럼을 조회해서
--		동일한 데이터가 있는 경우에만 입력이 허용
--		참조하는 테이블은 PK나 Unique로 지정된 컬럼만을 FK로 지정할 수 있다.
-- 		외래키 설정을 위해서는 참조받는 컬럼이 먼저 생성되어야만 하고
--		외래키를 심을 테이블이 그 이후에 생성이 되어야 함

-- 외래키를 심을 테이블의 형식
create table 테이블명(
 	컬럼명 자료형, -- 쉼표 빼먹지 않기
 	constraint FK명 foreign key(컬럼명)
 	references 대상테이블명(대상테이블의 기본키(or 고유키) 컬럼명)
 	on delete set null || on delete cascade
 	-- 참조 받는 테이블에서 행 부분을 지웠을 때
 	-- 이 테이블에 연결된 행에 대해서 NULL값을 먹일지
 	-- 아니면 그 행도 같이 지울지에 대한 옵션(둘 중 하나 선택)
);

create table example6(
	ex6_id varchar2(10 char) primary key
);

insert into example6 values('10');
insert into example6 values('20');
insert into example6 values('30');
select * from example6;

create table example7(
	ex7_id varchar2(10 char),
	constraint fk_ex7 foreign key(ex7_id)
		references example6(ex6_id)
		on delete cascade
);
-- 학과, 학생들의 데이터가 각각 5개 이상씩 넣기
insert into example7 values('10');
insert into example7 values('20');
insert into example7 values('30');
insert into example7 values('40'); -- 안들어가짐(example6에는 '40'이 없어서 erorr!
select * from example7;

-- ex6_id가 '10'인 컬럼을 지우면 어떻게 될까?
delete from example6 where ex6_id = '10'; -- ex6의 '10'을 삭제했지만 ex7의 '10'도 같이 삭제된다.

-- 예제 1
-- 학과테이블과 이 테이블을 참조하는 학생 테이블 만들기!
-- 학과 테이블 : 학과코드(4자리 숫자), 학과이름(10글자 이내) /null값 없게
create table major(
	m_code number(4) primary key,
	m_name varchar2(10 char) not null
);
insert into MAJOR values(1001,'컴퓨터공학과');
insert into MAJOR values(2001,'경영학과');
insert into MAJOR values(3001,'법학과');
insert into MAJOR values(4001,'정보통신과');
insert into MAJOR values(5001,'체육교육과');
insert into MAJOR values(1001,'경찰행정학과'); -- PK로 인해 에러가 발생 -> error발생
insert into MAJOR values(6001); --not null은 꼭 채워줘야한다. -> error!
select * from major;

-- 학생 테이블 : 학생번호(3자리 숫자), 학생이름(10글자 이내), 학생이 소속된 학과의 코드
create table student(
	s_no number(3) primary key,
	st_name varchar2(10 char) not null,
	s_code number(4) not null,
	constraint fk_student foreign key(s_code)
		references major(m_code)
		on delete cascade
);
-- 학과, 학생들의 데이터가 각각 5개 이상씩 넣기
insert into student values(101,'홍길동',1001);
insert into student values(102,'김길동',2001);
insert into student values(103,'박길동',1001);
insert into student values(104,'최길동',2001);
insert into student values(105,'이길동',1001);
insert into student values(106,'홍길동',6001); -- 연결한 major 테이블에 6001번 코드라는 데이터가 없어서 -> error!
select * from student;

-- 학과가 없어지면, 해당하는 학과의 학생의 정보도 지워지게 만들기
delete from major where m_code = 1001;

----------------------------------------------------------------------------------
-- 5) Check : 데이터 값의 범위나 조건을 설정해서 조건에 해당하는 데이터만 허용
create table example8(
	col1 number(3) constraint ex8_check check(col1 between 1 and 9) -- 1~9 숫자만 넣을 수 있다.
);

insert into example8 values(10); -- 1 ~ 9 사이의 숫자가 아니라서 오류! 

drop table example8 cascade constraint purge;
select * from all_talbes -- 내가 만든 테이블 확인할 때
----------------------------------------------------------------------------------
-- 6) Default : 아무런 데이터를 입력하지 않았을 때 지정한 데이터가 자동 입력
create table example9(
	col1 number(4) default 999
);

insert into example9 values(default); -- 999
insert into example9 values(null);    -- null 
insert into example9 values(0);       -- 0 
insert into example9 values(123);     -- 123

select * from example9;
drop table example9 cascade constraint purge;
------------------------------------------------------------------------------------
-- 커피테이블(apr05_coffee)
-- 컬럼 : 커피 이름 / 가격 / 칼로리(소수점 1자리) / 만든 날짜(date) : null값 없이, 날짜
drop table apr05_coffee cascade constraint purge;

create table apr05_coffee(
	c_name varchar2(10 char) primary key,
	c_price number(5) not null,
	c_kcal number(4,1) not null,
	c_start date not null
);

insert into apr05_coffee values('아메리카노',3000,20.1,sysdate); 
insert into apr05_coffee values('카페라떼',3500,28.7,sysdate); 
insert into apr05_coffee values('바닐라라떼',4200,200.5,sysdate); 
insert into apr05_coffee values('녹차라떼',3000,158.1,sysdate); 
select * from apr05_coffee;

-- 우리는 이제 DDL에서 create를 다룰 수 있게 되었음
-- 비교적 쉬운 ALTER, DROP, TRUNCATE 

-- 데이터 타입 변경 / 컬럼의 크키(용량) 변경
alter table [테이블명] modify [컬럼명] [데이터타입(용량)];

-- 커피테이블 c_name 부분을 세자리 숫자로 변경
-- 이미 테이블 안에 값이 있는 상태면 데이터 타입 변경이 불가능하다
alter table apr05_coffee modify c_name number(3);

-- 데이터 지우기
delete from apr05_coffee where c_name = '아메리카노';

-- 원래대로 돌려놓기
alter table apr05_coffee modify c_name varchar2(10 char);

-- c_name의 용량을 10자리 -> 2자리
-- 값이 있는 상태에서 용량을 적게 변경하면 error! 발생
alter table apr05_coffee modify c_name varchar2(2 char);

-- 데이터 지우기
delete from apr05_coffee where c_name = '아메리카노';

-- ** 주의사항!!
-- 		데이터 타입을 변경할 때는 해당 컬럼의 값을 모두 지워야 변경이 가능 
--		그렇지 않으면 오류가 발생한다.
--		컬럼의 용량을 줄일 경우 해당 컬럼의 용량을 조회해서 변경할 길이보다
--		큰 값이 있는지 확인하고 -> 그 값을 변경해야 한다.

-- 테이블 구조 확인법
-- instant client cmd
-- sqlplus ID/PW@IP주소:1521/xe
-- 앞부분이 'sql > '로 바뀌면
-- desc 테이블명;

-- 컬럼명 변경
alter table [테이블명] rename column [기존컬럼명] to [바꿀컬럼명];
alter table apr05_coffee rename column c_name to c_name2;

-- 컬럼 추가 
alter table [테이블명] add [컬럼명] [데이터타입] [제약조건(생략가능)];
-- 기존에 데이터가 없어야 not null 가능
alter table apr05_coffee add c_taste varchar2(10 char) not null;

-- 컬럼삭제
alter table [테이블명] drop column [컬럼명];
alter table apr05_coffee drop column c_taste;

------------------------------------------------------------------------- 여기까지 복습함
-- 테이블 내의 내용 지우기
truncate table [테이블명];
truncate table apr05_coffee;
select * from apr05_coffee;
-- 테이블 안의 데이터는 모두 삭제가 되었지만, 테이블 구조 자체는 그대로 남아있음

--테이블 완전삭제(휴지통에 넣기 + 휴지통비우기)
drop table [테이블명] cascade constraint purge;
drop table apr05_coffee cascade constraint purge;

-- 테이블 삭제(휴지통에 넣기)
drop table [테이블명] cascade constraint;
drop table apr05_coffee cascade constraint;
select * from apr05_coffee;

-- 테이블 복원(휴지통에서 복원)
flashback table [테이블명] to before drop;
flashback table apr05_coffee to before drop;

-- 휴지통 비우기
purge recyclebin; 
------------------------------------------------------------
-- DDL : 사실상 신입에게 맡기지 않음!
-- 경력있는 DBA들이 테이블을 만들어서 CRUD정도만 하게끔!
------------------------------------------------------------

------------------------------------ 복습은 여기까지 20230405

-- 예제)
-- 1. 노트북에 대한 테이블을 생성
-- 노트북의 이름(20자)/ 가격(7자리) / CPU(10글자) / RAM(숫자 2) / HDD(숫자 4자리) / 보증기간(날짜)
-- [하나의 PK(기본키)를 가져야 하고, 모든 값은 채워 넣어야만 함]

create table notebook (
	n_name varchar2(20 char) primary key,
	n_price number(7) not null,
	n_cpu varchar2(10 char) not null,
	n_ram number(2) not null,
	n_hdd number(4) not null,
	n_warranty date not null
);

-- 예제2)
-- 노트북 사양이 좋아져서 128GB짜리 RAM을 사용하게 되었음
-- 	이 때 RAM 컬럼의 용량을 변경하는 문장 
alter table notebook modify n_ram number(3);

-- 예제3)
-- 노트북 크기에 대한 컬럼을 추가하는 문장
-- 	[단위 cm, 소수점 두번째 자리까지 나타낼 것]
--  [이 컬럼은 빈 값으로 넣을 수 없음]
alter table notebook add n_size number(5,2);

-- 예제4)
-- 노트북에 앞으로 hdd 대신 ssd가 장착
alter table notebook rename column n_hdd to n_ssd;
alter table notebook rename column n_ssd to n_hdd;
-- 예제5)
-- 보증기간 컬럼을 삭제하는 문장 작성
alter table notebook drop column n_warranty; 

-- 예제6)
-- 노트북의 가격이 [800000 ~2300000] 사이의 값만 들어갈 수 있게
--	해당 컬럼을 변경하는 문장 작성
alter table notebook modify n_price number(7) constraint n_check check(n_price between 800000 and 2300000);
	
-- 예제7)
--	만든테이블을 완전히 삭제하는 문장 작성
drop table notebook cascade constraint purge;

---------------------------------------------------------------------------------
-- 엄청난 시행착오를 겪어서 -> DB 설치 
-- CMD 기반 SQLPLUS를 다뤄보면서 DBA들이 하는 업무를 살짝 맛봤음
--		계정생성 , 권한부여, tablespace ...
-- 테이블 , 행, 열, 스키마, 도메인, 인스턴스
-- SQL 명령문 중에 정의어(DDL)를 배우면서 테이블도 만들어봤음
-- 테이블 생성시 필요한 자료형(주력)
-- 문자형 : varchar2 / 숫자형: number / 날짜 : date
-- 문자형 : varchar2에 용량 입력할때는 char를 넣어서 글자 단위로 넣을 수 있게 하자
-- 숫자형 : number에 용량을 입력할 때는 정밀도 / 범위 잘 조절해서 만들자
-- 날자형 date.. 조만간 볼것 
-- 어려운 제약조건 ! / not null, primary key, foreign key ... 
-- 테이블의 구조 수정 , 삭제하면서 DDL 완료

--------------------------------------------------------------------------------- 
-- 예제 8 과제테이블
-- 		과자 이름/ 회사/ 가격 정보를 넣고싶음
--		테이블 하나에 primary key 
--	    not null 모두

-- 초코파이 -> 오리온 / 롯데 : 단일값 x
-- 회사 : 오리온이 여러개 만듬 : 단일값 x
-- 가격 : 같은 가격 과자 많음 : 단일값 x
-- PK를 어디에? -> 번호값 컬럼을 만들어서 여기에 PK를 주는 것도 한가지 방법!

create table snack(
	s_no number(3) primary key,
	s_name varchar2(10 char) not null,
	s_brand varchar2(10 char) not null,
	s_price number(6) not null
);
-------------------------------------------------------------------------------
-- 지금부터 DML 시작
-- **중요** 데이터 조작어(Data Manipulation Language)
-- 테이블에 데이터를 검색, 삽입, 수정, 삭제 하는데 사용하는 문장
-- SELECT, INSERT, UPDATE, DELETE 등이 있음
-- 위를 줄여서 CRUD(CREATE, READ, UPDATE, DELETE)
-- 여기서 말하는  C는 CREATE TABLE X -> 이건 DBA의 작업
-- 이거는 데이터를 만든다는 의미 C (INSERT - 의미)
---------------------------------------------------------------------------------
-- C (insert)
insert into 테이블명(컬럼명, 컬럼명, 컬럼명 ....) values(값, 값, 값)...
insert into SNACK(s_no, s_name, s_brand, s_price) values(1, '꼬북칩', '오리온', 2200 );

-- 입력할 때 순서 바꾸기? -> 가능
insert into SNACK(s_name, s_no, s_price, s_brand) values('초코파이', 2, 3300, '오리온');

-- 컬럼에 값을 안넣기 -> error not null 때문에 
-- 만약에 null이 허용되는 경우 였으면 null이 가능한 컬럼을 빼고 
-- 값을 입력했어도 정상적으로 들어갔을 것
insert into SNACK(s_name , s_price) values('땅콩카라멜', 3500); -- null이었으면 가능했을 것 

-- (컬럼명, 컬럼명, ..) 넣지 않고 컬럼 순서대로 넣는방법!
insert into SNACK values('3','썬칩', '크라운', 1900);

select * from snack;
------------------------------------------------------------------------------------------------
-- 테이블 지우고
-- 다시 테이블 생성해서 값 5개 정도만 넣기 
drop table snack cascade constraint purge;

insert into snack values(1, '꼬북칩', '오리온', 2200);
insert into SNACK values(2, '초코파이', '오리온', 3800);
insert into SNACK values(3, '썬칩', '오리온', 1800);
insert into SNACK values(4, '프링글스', '켈로그', 2500);
insert into SNACK values(5, '바나나킥', '농심', 2100);

select * from snack;

--과자 종류가 많으니 데이터 만들 때마다 과자의 번호가 자동으로 계산되었으면 함
-- factory pattern!! 공장 자동화
-- MySQL : Autoincrement 옵션
-- OrcaleDB : Sequence 옵션
-- 번호 자동으로 생성 해주는데 Sequence와 연결된 테이블과는 무관
-- (테이블 삭제했을때, Sequence 남아 있음.. sequence도 같이 지워줘야
-- 단점 : insert 실패해도 sequence count는 올라간다
-- 한번 증가된 값은 다시 내릴 수 없음 

-- (테이블과는 무관한)sequence 생성
create sequence 시퀀스명;

-- 테이블 명 뒤에 _seq를 붙여주는 문화가 있음(테이블명_seq)
create sequence snack_sqe;

-- 구체적인 시퀀스
create sequence 시퀀스명
	increment by 1 -- 증가값 (1씩 증가)
	start with 1 -- 시작값
	minvalue 1 -- 최소값
	maxvalue 999 -- 최대값 
	nocylce / cycle -- 최대값에 도달하면 시작값부터 다시 반복할지 말지 여부
	nocache /  cache -- 시퀀스를 미리 만들어놓고 메모리에서 가져다 쓸지 말지 
	noorder / order -- 요청 순서대로 값을 생성할지 말지
	
-- sequence 삭제
drop sequence 시퀀스명;
drop sequence snack_sqe;
-- sequence 사용 : 시퀀스.nextval
-- 기존에 있던 데이터 모두 삭제한 후에 다시 값을 만들어 넣어볼게ㅐ요
-- 테이블은 그냥 두고 데이터만 모두 삭제
truncate table snack;

insert into apr05_snack values(apr05_snack_seq.nextval,'초코파이','롯데',5000);
insert into apr05_snack values(apr05_snack_seq.nextval,'초코파이','오리온',5000);
insert into apr05_snack values(apr05_snack_seq.nextval,'마이쮸','롯데',500);
insert into apr05_snack values(apr05_snack_seq.nextval,'허니버터칩','해태',3000);
insert into apr05_snack values(apr05_snack_seq.nextval,'꼬북칩','크라운',2000);
insert into apr05_snack values(apr05_snack_seq.nextval,'꼬북칩(이건실패한것)','크라운',2000);
insert into apr05_snack values(apr05_snack_seq.nextval,'양파링','농심',5000);


insert into SNACK values(snack_sqe.nextval, '꼬북칩', '오리온', 2200);
insert into SNACK values(snack_sqe.nextval, '초코파이', '오리온', 3800);
insert into SNACK values(snack_sqe.nextval, '썬칩', '오리온', 1800);
insert into SNACK values(snack_sqe.nextval, '프링글스', '켈로그', 2500);
insert into SNACK values(snack_sqe.nextval, '바나나킥', '농심', 2100);
insert into SNACK values(snack_sqe.nextval, '바나나킥(이건실패시킬것)', '농심', 2100);
insert into SNACK values(snack_sqe.nextval, '양파링', '농심', 2500);


select * from apr05_snack;
 -------------------------------------------------------------------------------------------------
 
