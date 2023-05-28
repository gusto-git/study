-- 주석!

-- DB 사용을 위해서는 cmd에서 진행이 가능
-- BUT!! SQL의 경과나 Query 검증 등을 위해서
-- 대부분의 개발자들을 개발자 툴(tool)이라는 것을 사용함
-- DBeaver(디비버), Oracle-SQL Developer, ....

-- 용어 정리!!
-- 테이블(릴레이션) : 데이터베이스에서 정보를 구분하여 저장하는 기본단위
--					  행과 열로 이루어진 데이터들의 집합!

-- 행(Row)			: 테이블을 구성하는 데이터들 중 가로 한줄(→)
--					  튜플(Tuple), 레코드(Record)라고도 부름

-- 열(Column)		: 테이블을 구성하는 데이터들 중 세로 한줄(↓)
--					: 필드(Filed), 속성(Attribute)라고도 부름

-- 스키마(Schjema)  : 데이터베이스에서 기본 구조를 정의하는것
--					: 쉽게 말하자면 제목 부분(이름, 나이, 성별)
--					: 테이블의 헤더를 나타내며, 속성과 자료타입을 가지고 있음
--					: 속성명 or 필드명

-- 인스턴스(Instance) : 테이블에 실제로 저장된 데이터의 값

-- 도메인	          : 속성이 가질 수 있는 값의 집합
--					  : 특정 속성에서 사용할 데이터의 범위를 사용자가 지정
--					  : ex) p_age number(3)면 정수를 3자리 까지만 받겠다는 의미.
--					  : 나이가 3자리를 넘어가면 값이 받아지지 않음

-- 사람 테이블 생성
create table 테이블명(
	속성명 범위(도메인),
	속성명 범위(도메인),
	속성명 범위(도메인)
	);

-- 여러줄 실행 : 해당하는 줄 모두 드래그로 덮어서 -> arlt + x	
create table person(
	p_name varchar2(10 char),
	p_age number(3),
	p_gender varchar2(2 char)
);

-- 테이블에 값 넣기
insert into 테이블명 values(p_name값, p_age값, p_gender값);
-- 한줄 실행 : 커서를 해당하는 줄 아무데나 놓고 -> alt + s
insert into PERSON values('홍길동', 10, '남');
insert into PERSON values('홍길동', 10, '남');
insert into PERSON values('김길동', 20, '여자');
insert into PERSON values('최길동', 30, '남');
insert into PERSON values('최길동', 1000, '남'); -- 조건보다 높은 값이 나와서 입력이 안된다.

-- 내가 넣은 값 확인
select * from person;

-- 테이블 구성할 때 여러 조건들을 살피게 됨
--	지금 만든 테이블 상황 상 [홍길동]은 같은 인물임
--	다른 인물일 수도 있지만, 지금의 조건만 놓고 보면 같은 인물이라고 판단 될 수도 있음
--  지금은 같은 인물이라고 치고

-- 중복값을 없애기! 홍길동 2명 있는거 1개로 줄이겠다!
select distinct * from person; -- 중복값 없애는 법

-- 테이블 지우기
drop table 테이블명 cascade constraint purge;
drop table person cascade constraint purge;

-- 테이블(릴레이션)의 특징
--	1. 속성은 단일값만 가짐
--  	각 속성의 값은 도메인에 정의된 값만 가지며, 그 값은 모두 단일 값이어야 한다.
--	ex) p_age : 최대 3자리 정수로 된 값만 가지며, 값은 하나만 넣을 수 있음 -> 홍길동이 10살인데 만 나이로 8살이야 x

--  2. 속성은 서로 다른 이름을 가짐
--		각 속성마다 p_name, p_age, p_gender라는 이름을 가지고 있음
--		컬럼명(속성명)은 중복해서 만들지 않기, 중복 되면 오류난다.

-- ex) 컬럼명 중복 : 오류!
create table test(
	t_no number(3),
	t_no varchar2(10 char)
);

-- 3. 하나의 속성 값은 모두 같은 도메인 값을 가짐
--		1번과 같은 맥락, p_age : 최대 3자리로 된 정수 값을 가짐

-- 4. 속성의 순서는 상관이 없음
--		속성 순서가 달라도 테이블 스키마는 같음
-- ex)
select * from person;
select p_age, p_gender, p_name from person; 
select p_name from person;
-- 순서만 바뀌었지 내용에는 변화가 없다!

-- 테이블 내의 중복된 행(튜플)은 허용하지 않는다.
--  홍길동에 대한 정보가 똑같이 한번 더 들어가면 동일인물인지 아닌지 여부 확인 불가능
--  즉, 모든 튜플에는 차별성이 있어야!!(생일추가한다거나, 전화번호를 추가한다거나)
------------------------------------------
-- SQL 명령문의 종류!
-- 데이터의 정의어(DDL/ Data Definition Language)
--		테이블의 관계나 구조를 생성하는데 사용
--		Create, Alter, Drop ... 등이 있음

-- 데이터 조작어(DML/ Data Manipulation Language) **** 매우 중요
-- 		테이블에 있는 데이터를 검색, 삽입, 수정, 삭제 하는데 사용
--      Select, Insert, Update, Delete 등 (줄여서 CRUD)
--		Select문은 특별히 질의어(Query)라고 함

-- 데이터 제어어(DCL/ Data Control Language)
-- 		데이터베이스에 접근하고 객체들을 사용하도록 권한주고 회수하고 사용
--		Grant, Revoke,... 
--      제어어는 DBA(Database Administrator)의 업무! 

-- 트랜젝션 처리어(TCL/ Transaction Control Language)
--		DML에 의해 조작된 결과를 작업단위(트랜잭션) 별로 제어하는데 사용
--		Commit, Rollback, Savepoint, ....
--------------------------------------------------------------------------
-- SQL이라는 언어로 DB를 제어해볼건데
-- DB메이커가 달라고 SQL문 자체는 거의 비슷
-- 대/소문자 구분 안함 -> 다 대문자로 받아들임
-- 낙타체가 안통함(pName) -> 뱀체로(p_name)
-- 데이터 자체는 대소문자 확실히 구별함*****
-- 'a', 'A'는 다름 

