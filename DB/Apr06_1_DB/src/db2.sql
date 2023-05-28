-- ���� ���̺�
-- s_name, s_maker, s_price, s_exp(Date)

create table snack(
	s_no number(3) primary key,
	s_name varchar2(10 char) not null,
	s_maker varchar2(10 char) not null,
	s_price number(4) not null,
	s_exp date not null
);

drop table snack cascade constraint purge;
create sequence snack_seq;
drop sequence snack_seq;

insert into snack values(snack_seq.nextval, '����Ĩ', '������', 2200, sysdate);
select * from snack;

insert into snack values(
snack_seq.nextval, '������', 'ũ���', 4000, to_date('2023-01-01 23','YYYY-MM-DD HH24'));
insert into snack values(
snack_seq.nextval, '������', 'ũ���', 2500, to_date('2023-02-06 01','YYYY-MM-DD HH24'));
insert into snack values(
snack_seq.nextval, '��������', '������', 4200, to_date('2023-03-15 07','YYYY-MM-DD HH24'));
insert into snack values(
snack_seq.nextval, '����', 'ũ���', 1900, to_date('2023-04-07 12','YYYY-MM-DD HH24'));
insert into snack values(
snack_seq.nextval, '����', '�Ե�', 4800, to_date('2023-06-28 16','YYYY-MM-DD HH24'));
insert into snack values(
snack_seq.nextval, '��Ĩ', '������', 1800, to_date('2023-07-07 16','YYYY-MM-DD HH24'));
insert into snack values(
snack_seq.nextval, '�����۽�', '�̷α�', 2700, to_date('2023-10-01 01','YYYY-MM-DD HH24'));
insert into snack values(
snack_seq.nextval, '����������', '�Ե�', 3900, to_date('2023-11-02 19','YYYY-MM-DD HH24'));
insert into snack values(
snack_seq.nextval, '����Ĩ', 'ũ���', 1800, to_date('2023-12-31 23','YYYY-MM-DD HH24'));
insert into snack values(
snack_seq.nextval, '���޴���', 'ũ���', 500, to_date('2023-02-01 01','YYYY-MM-DD HH24'));


-- Ư�� �ð� / ��¥
-- �����Լ� : to_date('��', '����')
-- ����(�빮��!) - YYYY, MM , DD , AM/PM, HH(12�ð�), HH24(��õ), MI , SS
insert into snack values (snack_seq.nextval, '����Ĩ', '������', 1900, sysdate);



-- CRUD : R(read) - select
select [distinct(��������)] [�÷���], [�÷��� as ��Ī || �÷��� ��Ī] , [������], [����Լ�], ...
from [���̺��]
where [���ǽ�]
group by [�׷���]
having [�Լ� ���� ����]
order by [���Ĵ�� asc || desc (��������(�⺻) || ��������)]
-- ���¸� ������ ����

-- ���� ���̺� ��ü ��ȸ
-- '*' : ���̺� ���� ��� �÷��� �����Ͷ�
select * from apr06_snack;

-- distinct : �ߺ�����
select s_maker from snack;
select distinct s_maker from snack;

-- Ư�� �÷��� ���ϴ� ��� selecet�� from ���̿� �÷����� ����ȴ�.
-- ��Ī : select�� �ȿ����� ���� ����� ����( +, - , *, /)
-- ������ 100���� ���� ���� �����Ͷ�
select s_price / 10 from snack;
-- ���� > �÷��� ��ü�� s_price/100�� �Ǿ����
-- ������ ���α׷��� ���� �����ؼ� ����ϴٺ���
-- �÷����� �̿��ؼ� ���� �ҷ����� ��찡 ���� ����
-- �� �� ��Ī �̶�� ���� ����ؼ� �򰥸��� �����ϴ� �뵵�� ��� 

-- ��Ī ����� �� 1 : AS ����ϱ�
select s_price / 10 as s_price from snack;
-- ��Ī ����� �� 2 : ���� ����ϱ� (V)
select s_price / 10 s_price from snack;
-- �÷� ��� Ȯ���ϰ� �ʹ�( s_name, s_price/10)
select s_name, s_price / 10 s_price from snack;

-- ������! (���������)
-- DUAL ���̺�
--		1. ����Ŭ ��ü���� �������ִ� ���� ���̺�
--      2. �����ϰ� �Լ��� �̿��ؼ� ����� ������� Ȯ���� �� ����ϴ� ���̺�

select 2+5 from dual;

select 1+'4' from dual; -- 5
-- ��κ��� �ٸ� ���� [���ڿ켱] -> 14
-- Oracle�� [���ڿ켱] -> �����ڰ� ����'��' ��������!

select 1+'a' from dual; -- error! : ����� �� ���� ���ڴ� ���ڷ� �� �ٲ۴�.

-- ���ڵ� �� ���ִ� �����ڰ� ���� : || 
select 1 || 'a' from dual; -- -> 1a  
-----------------------------------------------------------------------------
-- ��¥ / �ð� �Լ� 

-- YYYY : 4�ڸ� ����
-- YYY, YY, Y : ���� 4�ڸ� ������ ������ 3�ڸ�, 2�ڸ�, 1�ڸ� ǥ�� 
-- MM : ��
-- DD : ��
-- DAY : ����(������ ~ �Ͽ���)
-- DY : ����(�� ~ ��)
-- HH, HH12 : 12�ð� / AM or PM : ���� OR ����
-- HH24 : 24�ð� / MI : �� / SS : �� 

-- SYSDATE : ���� ��¥ / �ð� ��ȯ

-- TO_DATE(���ڿ�, ����(DATETIME����) : ������ �����͸� ��¥������ ��ȯ
select to_date('2023-04-06 ���� 06:00', 'YYYY-MM-DD AM HH:MI') from dual;

-- TO_CHAR(DATE, DATETIME����) : ��¥�� �����͸� ���������� ��ȯ
select to_char(sysdate, 'YYYY.MM.DD')from dual;

-- Ư�� ��¥ ���� �޾ƿ��� ������ sysdate �ڸ��� to_date �Լ� �־ ����� ��!
select to_char(to_date('2023-04-06', 'YYYY-MM-DD'), 'YYYY.MM.DD')from dual;
-- TO_DATE : ��¥�� / TO_CHAR : ������

-- ADD_MONTHS(date, ����) : ��¥���� ������ �޸�ŭ ����(1 : ������, -1 : ����)
select add_months(sysdate, -3) from dual;

-- LAST_DAY(date) : �ش� �ϴ� ���� ������ ���� ��ȯ
select last_day(sysdate) from dual;

----------------------------------------------------------------------------------- ���������
-- ���ó�¥ ���� ���� ��ȸ (���̺� ���(�÷���)) : ���� / �÷�(������) : 2023��
select to_char(sysdate, 'YYYY') ||'��' ���� from dual;

-- ���� ��¥ ���� �� ��ȸ(�÷��� :�� / �÷� : 04��)
select to_char(sysdate, 'MM') || '��' �� from dual;

-- ���� ��¥ ���� �� ��ȸ(�÷��� :�� / �÷� : 06��)
select to_char(sysdate, 'DD') || '��' �� from dual;

-- ���� �ð� ���� ��/�� ��ȸ(�÷��� : ���� '��', '��' / �÷� : '11��', '10��')
select to_char(sysdate, 'HH') || '��' �� , to_char(sysdate, 'MI') || '��' �� from dual;

-- ������ �������� �������� ��ȸ **
-- ��Ī�� ����, Ư�����ڰ� ���� ��� : ��Ī�� ū����ǥ�� �����ֱ�
select to_char(sysdate, 'AM') "����/����" FROM DUAL;

-- ���ڿ� 2023-05-05 ���� 05:05�� 2023.05.05�� ��ȸ
SELECT TO_CHAR(TO_DATE('2023-05-05 ���� 05:05', 'YYYY-MM-DD AM HH:MI'),'YYYY.MM.DD') FROM DUAL;

-- ���� ��¥ ���� 3���� ������ ���� ��� ��ĥ���� ��ȸ
SELECT TO_CHAR(LAST_DAY(ADD_MONTHS(SYSDATE, -3)), 'MM/DD') FROM DUAL;
-------------------------------------------------------------------------------------------------
-- <������ �����Լ�>
-- 1. �����Լ�
--		ABS(����) : ���밪 ��� ex) ABS(-4.5)
--		ROUND(����, m) : ���� �ݿø�, m�� �ݿø� ���� �ڸ��� ex)ROUND(5.36,1) 
--		POWER(����, n) : ������ n����  ex)POWER(2,3) -> 8
--		TRUNC(����, m) : ������ m��° �ڸ������� ����� ���� ���� ex)TRUNC(123.456, 2)
--		MOD(m, n) : ���� m�� n���� ���� ������ ex)MOD(12,10)
--		SQRT(����) : ������ ������(���ڴ� ���) ex) SQRT(9.0)
--      FLOOR(���� or ��) : �� ���ϱ� ex)FLOOR(10/4) 
--			(��� : �۰ų� ������ ���� ������ ���� �ִ밪)
--		CEIL(���� or ��) : �۰ų� ������ ���� ������ ���� �ּҰ� ex) CEIL(3)
-------------------------------------------------------------------------------------------------
-- 2. �����Լ�
-- 		CONCAT(S1, S2) : �� ���ڿ��� ����
select concat('abc', 'bcd') from dual; -- abcbcd
--		SUBSTR(S1, N, K) : ���ڿ��� n��°���� k��ŭ�� ���̸� ��ȯ
select substr('abcbddwdfqsxc', 1, 4) from dual; -- abcb
--		INSTR(s1, s2, n, k) : s1�� n��°���� �����ؼ� ã�����ϴ� s2�� k��° ��Ÿ���� ���ڿ��� ��ġ�� ��ȯ
select instr('abcdefghfi', 'f', 1, 2) from dual; -- 9
-- 		LPAD(s, n, c) : ���ڿ� s�� ���ʺ��� ������ �ڸ��� n���� ������ ���� c�� ä��
select lpad('asdb', 6, 'o') from dual; -- ooasdb
--		RPAD(s, n, c) : ���ڿ� s�� �����ʺ��� ������ �ڸ��� n���� ������ ���� c�� ä��
select rpad('asdb', 6, 'o') from dual; -- asdboo
--		LTRIM(s1, s2) : ���ڿ� s1�� �������� ������ ���� s2�� ���ʿ��� ����
select ltrim('asdqwesdfx', 'as') from dual; -- dqwesdfx
-- 		RTRIM(s1, s2) : ���ڿ� s1�� �������� ������ ���� s2�� �����ʿ��� ����
select rtrim('asdqwesdfx', 'dfx') from dual; -- asdqwes
------------------------------------------------------------------------------------------------
-- ���� / �м� �Լ� - SELECT �÷��� �ʰ� HAVING ������ �ַ� ���!
--		AVG(�÷���) : ���
select avg(s_price) from snack;
-- 		COUNT(�÷���) : �˻��Ǵ� ������ ��
select count(*) from snack;
--		MAX(�÷���) : �ִ밪
select max(s_price) from snack;
-- 		MIN(�÷���) : �ּҰ�
select min(s_price) from snack;
-- 		SUM(�÷���) : �հ�(����)
select sum(s_price) from snack;
-------------------------------------------------------------------------------------------------
-- NULL ���� �Լ�
--  ���� ���� ���ǿ� NOT NULL�� �����ؼ� ������ �����͸� �Է��ϰ� �س��µ�
--	NULL : Ȯ�ε��� ���� ���̳� ���� ������� ���� �� / 0�̳� ����ִ� ������ �ƴ�!

-- 	NVL�Լ� : NULL�� ��츸 ������ ������ ��ġ�ϴ� �Լ�
--		NVL(��, NULL�� �� ��ó��)
SELECT NVL(NULL, 'B') FROM ���̺��

--	NVL2 �Լ� : NULL ���ο� ���� ������ ������ ��ġ�ϴ� �Լ�
--		NVL2(��, ���� ���� �� ��ġ��, ���� �� ��ġ��)
SELECT NVL2(NULL, 'A', 'B') FROM ���̺��

-- ===============================================================================================
-- ������Ʈ���� �Խ��ǿ� ���� ���̺�� �̸� [�����ϴ�] �Խ��� ��� ���̺��� ���������
-- �Խ��� ���̺� : [�ۼ��� / �Խ��� �۳��� / �ۼ��ð�]
--	��� ���̺�  : [�ۼ��� / ��� �� ���� / �ۼ��ð�]

-- 1. ���̺� ������ �ľ��ؼ� �Խ��� ���̺� �����(BOARD) 
-- �ۼ��� PK? : �� ����� �Խñ� �ѹ��� ���Ŷ�� ���� X
-- ���� PK? : �� ������ ������� �ߺ��� ���� ������������, ���� �Ȱ��� �� �ִ�.
-- �ð� PK? : ���� ���� �ϳ� ���� �ð��� �ۼ��� ���� ����
-- 

create table board(
	b_no number(3) primary key,
	b_owner varchar2(10 char) not null,
	b_txt varchar2(200 char) not null,
	b_time date not null
);

create sequence board_seq;

-- 2. ���̺��� ���� �ľ��ؼ� ��� ���̺� �����(board_reply)
--  [���� : ���� �޴� ���̺��� �� ������ �����Ǹ� ���õ� ��۵� ������ �ǵ���]
--  ��� ���̺�  : [�ۼ��� / ��� �� ���� / �ۼ��ð�]
create table board_reply (
	br_no number(3) primary key,
	br_b_no number(3) not null,
	br_owner varchar2(10 char) not null,
	br_txt varchar2(200 char) not null,
	br_time date not null,
	constraint fk_board_reply foreign key(br_b_no)
		references board(b_no)
		on delete cascade
);
create sequence board_reply_seq;

drop table board_reply cascade constraint purge;
drop sequence board_reply_seq;

-- �Խ��� ���̺� �� 2���� �ְ�, �� �Խñ� ���� ��� 2���� �ޱ�
insert into board values(board_seq.nextval, 'ȫ�浿', '�ȳ��ϼ���', sysdate);
insert into board values(board_seq.nextval, 'hong', 'hi', sysdate);
select * from board;

insert into board_reply values(board_reply_seq.nextval, 1,'��','����!',sysdate);
insert into board_reply values(board_reply_seq.nextval, 2,'��','����!',sysdate);
insert into board_reply values(board_reply_seq.nextval, 1,'��','����!',sysdate);
insert into board_reply values(board_reply_seq.nextval, 2,'��','����!',sysdate);
select * from board_reply;

-- �Խñ� �ϳ� ������ ��, ��۵� �������� �� Ȯ��
delete from board where b_no = 1;
----------------------------------------------------------------------------------
select [distinct] [�÷���], [�÷��� as ��Ī || �÷��� ��Ī],[������],[����Լ�],...
from [���̺��]
where [���ǽ�]
group by [�׷���]
having [�Լ� ���� ����]
order by [���Ĵ�� asc/desc]

--  where �� (���ǽ�)
--		��ü ������ �߿��� ������ ���ǿ� �´� �����͸� ã���ִ� ����
--		���ǽ��� �񱳿����� ����� �����ϴ�
--		=, !=, ^=, <>, > , >=, <, <=, ...
--		2, 3, 4��°�� [�����ʴ�]�� ���̴� ������
--		2, 4���� ��� ǥ��ȭ�� �ϴٺ��� ����ϰ� �Ǿ���
--		3���� ��쿡�� ��� DBMS���� �������� ���ؼ� ����ϰ� �Ǿ���

-- ������ 3900���� ������ ��������� ��ȸ
select  * from snack where s_price = 3900;
-- ��� �����̸�, ���� ��ȸ
select s_name, s_price from snack;
-- ��� �����̸�, ������ȸ(�÷��� : �̸�(����) / data : ������(3000��)
-- ��Ī : ���⳪ Ư������, ���ڰ� ������ ū����ǥ
-- ������ + ( + 3000 + ��)
select s_name || '('  || s_price || '��)' "�̸�(����)" from snack;
-- 2000�� ������ ���� �̸�, ����, ������� ��ȸ
select s_name, s_price, s_exp from snack where s_price <= 2000;
-- ��� ������ ��հ��� ������? (�Ҽ��� ù°�ڸ�����) 
select round(avg(s_price), 1) from snack;
-- 1500�� �̻��� ���� �� �ּҰ����� ������ 
select min(s_price) from snack where s_price >= 1500;
-- ���� �̸��� ������ 30% ���ε� �ݾ� 
select s_name, s_price * 0.3 from snack;
-- 500���� ������ ����?
select count(s_price) from snack where s_price = 500;
-- ������ �̸� , ����, ������� ��ȸ
select s_name, s_price, s_exp from snack;
-- ��� ���� �̸�, ����, vat(������ 10%�ΰ���)
select s_name, s_price, s_price * 0.1 vat from snack;
-- ��� ���� �̸�, ����, �ǸŰ�(selliong_price) ��ȸ(20%���� �ݾ�) ��ȸ
select s_name, s_price, s_price * 0.8 selling_price from snack;
-- 4500�� ���� ū �ݾ��� ���� ��հ� ��ȸ
select avg(s_price) from snack where s_price > 4500;
-- ������ ������, �ְ�, �� ���� ���� ��� ���� ��ȸ
select min(s_price), max(s_price), count(*) from snack;
-- 3000�� �̻��� ������ ��ü ���� ��ȸ
select * from snack where s_price >= 3000;
-- 3000�� �̸��� ������ �̸�, ����, �ǸŰ� ��ȸ 
select s_name, s_price, s_price * 0.8 selling_price from snack where s_price < 3000;
-- �������� ���� ��ȸ
select s_price from snack where s_name = '������';
-- ũ��� ȸ���� ���� ���� ������ ��ȸ
select sum(s_price) from snack where s_maker = 'ũ���';
-- 5�� ������ �Ծ�� �ϴ� ���� �̸�, ����, ������� ��ȸ
select s_name, s_price, s_exp from snack where to_char(s_exp, 'MM') < 6;

----------------------------------------------------------------------------------------
-- ���迬����
-- AND, NOT, OR, BETWEEN, IN
-- AND�� BETWEEN

-- ������ 1000�� �̻� 3000�� ������ ������ ��ü���� ��ȸ
-- AND
SELECT * FROM SNACK WHERE S_PRICE >= 1000 AND S_PRICE <= 3000;
-- BETWEEN �̿�
SELECT * FROM SNACK WHERE S_PRICE BETWEEN 1000 AND 3000;
-- AND�� BETWEEN ����
-- �̻�/���� ���� ���� �ȿ����� between�� ����
-- �ʰ�/�̸� ���� ���� �ȿ����� ����� ����
-- ������ 1000��, 2000��, 3000�� �� ������ ��ü���� ��ȸ
SELECT * FROM SNACK WHERE S_PRICE IN(1000, 2000, 3000);
-- s_price(����)�� 1000,2000,3000�̳ĸ� ���³��ִ� : IN ������
-- ���ӵ��� ���� ���� �޾� �ö� ȿ�������� ���� ����
-- ����� �ݴ�Ǵ� ��� ���� �޾ƿ��� �ʹٸ� ? -> NOT ������
SELECT * FROM SNACK WHERE S_PRICE NOT IN(100, 2000, 3000);


