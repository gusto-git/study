-- �������̺�
-- s_name, s_maker, s_price, s_exp(Date)

create table apr06_snack (
	s_no number(3) primary key,
	s_name varchar2(10 char) not null,
	s_maker varchar2(10 char) not null,
	s_price number(4) not null,
	s_exp date not null
);

create sequence apr06_snack_seq;

insert into apr06_snack values(apr06_snack_seq.nextval, '���޴��ݵ����', 'ũ���', 500, sysdate);

-- Ư�� �ð� / ��¥
-- �����Լ� : to_date('��', '����')
-- ����(�빮��!) - YYYY, MM , DD , AM/PM, HH(12�ð�), HH24(��õ), MI , SS

select * from apr06_snack;
insert into apr06_snack values(
apr06_snack_seq.nextval, '������', 'ũ���', 3000, to_date('2022-03-10 23', 'YYYY-MM-DD HH24'));
insert into apr06_snack values(
apr06_snack_seq.nextval, '������', 'ũ���', 2500, to_date('2021-02-11 20', 'YYYY-MM-DD HH24'));
insert into apr06_snack values(
apr06_snack_seq.nextval, '�Ҹ���', '������', 1800, to_date('2020-11-03 10', 'YYYY-MM-DD HH24')); 
insert into apr06_snack values(
apr06_snack_seq.nextval, '����', 'ũ���', 1500, to_date('2021-11-04 09', 'YYYY-MM-DD HH24')); 
insert into apr06_snack values(
apr06_snack_seq.nextval, '���� ũ������ũ', '�Ե�', 3200, to_date('2021-01-01 01', 'YYYY-MM-DD HH24'));
insert into apr06_snack values(
apr06_snack_seq.nextval, '��������', '������', 2900, to_date('2020-02-06 14', 'YYYY-MM-DD HH24'));
insert into apr06_snack values(
apr06_snack_seq.nextval, '����Ĩ', 'ũ���', 1300, to_date('2021-03-05 12', 'YYYY-MM-DD HH24'));
insert into apr06_snack values(
apr06_snack_seq.nextval, '��Ĩ', '�Ե�', 1200, to_date('2022-05-05 03', 'YYYY-MM-DD HH24'));
insert into apr06_snack values(
apr06_snack_seq.nextval, '����������', 'ũ���', 3300, to_date('2023-02-14 14', 'YYYY-MM-DD HH24'));
insert into apr06_snack values(
apr06_snack_seq.nextval, '�����۽� ��Ʈ', 'ũ���', 2300, to_date('2022-02-02 14', 'YYYY-MM-DD HH24'));
------------------------------------------------------------------------------------------------------------
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
select s_maker from apr06_snack; -- ȸ�縸 ����
select distinct s_maker from apr06_snack; -- �ߺ������ϰ� �ѹ����� ����

-- Ư�� �÷��� ���ϴ� ��� selecet�� from ���̿� �÷����� ����ȴ�.
-- ��Ī : select�� �ȿ����� ���� ����� ����( +, - , *, /)
-- ������ 100���� ���� ���� �����Ͷ�
select s_price / 100 from apr06_snack;
-- ���� > �÷��� ��ü�� s_price/100�� �Ǿ����
-- ������ ���α׷��� ���� �����ؼ� ����ϴٺ���
-- �÷����� �̿��ؼ� ���� �ҷ����� ��찡 ���� ����
-- �� �� ��Ī �̶�� ���� ����ؼ� �򰥸��� �����ϴ� �뵵�� ��� 

-- ��Ī ����� �� 1 : AS ����ϱ�
select s_price / 100 as s_price from apr06_snack;
-- ��Ī ����� �� 2 : ���� ����ϱ� (V)
select s_price/ 100 s_price from apr06_snack; -- as ��� ����
-- �÷� ��� Ȯ���ϰ� �ʹ�( s_name, s_price/10)
select s_name, s_price / 10 s_price from apr06_snack;

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

-- TO_DATE(���ڿ�, ����(DATETIME����)) : ������ �����͸� ��¥������ ��ȯ
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

-----------------------------------------------------------------------------------
-- ���ó�¥ ���� ���� ��ȸ (���̺� ���(�÷���)) : ���� / �÷�(������) : 2023��
select to_char(sysdate, 'YYYY') || '��' ���� from dual;
-- ���� ��¥ ���� �� ��ȸ(�÷��� :�� / �÷� : 04��)
select to_char(sysdate, 'MM') || '��' �� from dual;
-- ���� ��¥ ���� �� ��ȸ(�÷��� :�� / �÷� : 06��)
select to_char(sysdate, 'DD') || '��' �� from dual;

-- ���� �ð� ���� ��/�� ��ȸ(�÷��� : ���� '��', '��' / �÷� : '11��', '10��')
select to_char(sysdate, 'HH') || '��' �� , to_char(sysdate,'MM') || '��' �� from dual;

-- ������ �������� �������� ��ȸ **
-- ��Ī�� ����, Ư�����ڰ� ���� ��� : ��Ī�� ū����ǥ�� �����ֱ�
select to_char(sysdate, 'AM') "����/����" from dual;

-- ���ڿ� 2023-05-05 ���� 05:05�� 2023.05.05�� ��ȸ
select to_char(to_date('2023-05-05 ���� 05:05', 'YYYY-MM-DD AM HH:MI'),'YYY.MM.DD') from dual;

-- ���� ��¥ ���� 3���� ������ ���� ��� ��ĥ���� ��ȸ
select to_char(last_day(add_months(sysdate, -3)), 'MM/DD') from dual;
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
-- 		CONCAT(S1, S2) : �� ���ڿ��� ���� ex)CONCAT('ABCD', 'EFG') -> ABCDEFG
--		SUBSTR(S1, N, K) : ���ڿ��� n��°���� k��ŭ�� ���̸� ��ȯ
--			ex) SUBSTR('ABCDEFG', 3, 4)  1���� ����
--		INSTR(s1, s2, n, k) : s1�� n��°���� �����ؼ� ã�����ϴ�
--				s2�� k��° ��Ÿ���� ���ڿ��� ��ġ�� ��ȯ
select instr('hello','l',1,2) from dual;
-- 		LPAD(s, n, c) : ���ڿ� s�� ���ʺ��� ������ �ڸ��� n���� ������ ���� c�� ä��
select lpad('abc',5,'*') from dual;
--		SPAD(s, n, c) : ���ڿ� s�� �����ʺ��� ������ �ڸ��� n���� ������ ���� c�� ä��
select rpad('abc',5,'*') from dual;
--		LTRIM(s1, s2) : ���ڿ� s1�� �������� ������ ���� s2�� ���ʿ��� ����
select ltrim('*abc*', '*') from dual;
-- 		RTRIM(s1, s2) : ���ڿ� s1�� �������� ������ ���� s2�� �����ʿ��� ����
select rtrim('*abc*', '*') from dual;
------------------------------------------------------------------------------------------------
-- ���� / �м� �Լ� - SELECT �÷��� �ʰ� HAVING ������ �ַ� ���!
--		AVG(�÷���) : ���
SELECT AVG(S_PRICE) FROM APR06_SNACK;
-- 		COUNT(�÷���) : �˻��Ǵ� ������ ��
SELECT COUNT(S_NAME) FROM APR06_SNACK;
--		MAX(�÷���) : �ִ밪
SELECT MAX(S_PRICE) FROM APR06_SNACK;
-- 		MIN(�÷���) : �ּҰ�
SELECT MIN(S_PRICE) FROM APR06_SNACK;
-- 		SUM(�÷���) : �հ�(����)
SELECT SUM(S_PRICE) FROM APR06_SNACK;
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
	b_content varchar2(200 char) not null,
	b_when date not null
);

create sequence board_seq;

-- 2. ���̺��� ���� �ľ��ؼ� ��� ���̺� �����(board_reply)
--  [���� : ���� �޴� ���̺��� �� ������ �����Ǹ� ���õ� ��۵� ������ �ǵ���]

create table board_reply(
	br_no number(3) primary key,
	br_b_no number(3) not null,
	br_owner varchar2(10 char) not null,
	br_content varchar2(200 char) not null,
	br_when date not null,
		constraint fx_board_reply foreign key(br_b_no)
			references board(b_no)
			on delete cascade
);

create sequence board_reply_seq;

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

-- ������ 3000���� ������ ��������� ��ȸ
select * from apr06_snack where s_price = 3000;

-- ��� �����̸�, ���� ��ȸ
select s_name, s_price from apr06_snack;

-- ��� �����̸�, ������ȸ(�÷��� : �̸�(����) / data : ������(3000��)
	-- ��Ī : ���⳪ Ư������, ���ڰ� ������ ū����ǥ
	-- ������ + ( + 3000 + ��)
select s_name || '(' || s_price || '��)' "�̸�(����)" from apr06_snack;

-- 2000�� ������ ���� �̸�, ����, ������� ��ȸ
select s_name, s_price, s_exp from apr06_snack where s_price <= 2000;

-- ��� ������ ��հ��� ������? (�Ҽ��� ù°�ڸ�����) 
select round(avg(s_price),1) from apr06_snack;

-- 1500�� �̻��� ���� �� �ּҰ����� ������ 
select min(s_price) from apr06_snack where s_price >= 1500;

-- ���� �̸��� ������ 30% ���ε� �ݾ� 
select s_name, s_price * 0.7 from apr06_snack 

-- 500���� ������ ����?
select count(*) from apr06_snack where s_price = 500;

-- ������ �̸� , ����, ������� ��ȸ
select s_name, s_price, s_exp from apr06_snack;
-- ��� ���� �̸�, ����, vat(������ 10%�ΰ���)
select s_name, s_price, s_price * 0.1 vat from apr06_snack;
-- ��� ���� �̸�, ����, �ǸŰ�(selliong_price) ��ȸ(20%���� �ݾ�) ��ȸ
select s_name, s_price, s_price*0.8 selling_price from apr06_snack;
-- 4500�� ���� ū �ݾ��� ���� ��հ� ��ȸ
select avg(s_price) from apr06_snack where s_price > 2000;
-- ������ ������, �ְ�, �� ���� ���� ��� ���� ��ȸ
select  min(s_price), max(s_price), count(*) from apr06_snack;
-- 3000�� �̻��� ������ ��ü ���� ��ȸ
select * from apr06_snack where s_price >= 3000;
-- 3000�� �̸��� ������ �̸�, ����, �ǸŰ� ��ȸ 
select s_name, s_price, s_price*0.8 selling_price from apr06_snack where s_price < 3000;
-- ��Ϲ���Ĩ�� ���� ��ȸ
select s_price from apr06_snack where s_name = '�Ҹ���';
-- ũ��� ȸ���� ���� ���� ������ ��ȸ
select sum(s_price) from apr06_snack where s_maker = 'ũ���';
-- 5�� ������ �Ծ�� �ϴ� ���� �̸�, ����, ������� ��ȸ
select s_name, s_price, s_exp from apr06_snack where to_char(s_exp, 'MM') < 6;
select s_name, s_price, s_exp from apr06_snack where s_exp < to_date('2023-06-01 00:00:00', 'YYYY-MM-DD HH24:MI:ss');

----------------------------------------------------------------------------------------
-- ���迬����
-- 		 AND, NOT, OR, BETWEEN, IN
--	AND�� BETWEEN

-- ������ 1000�� �̻� 3000�� ������ ������ ��ü���� ��ȸ
-- AND
select * from apr06_snack where 1000 <= s_price and s_price <= 3000;

-- BETWEEN �̿�
select * from apr06_snack where s_price between 1000 and 3000; 

-- and�� between ����
-- �̻�/���� ���� ���� �ȿ����� between�� ����
-- 1000�� �ʰ� 3000�� �̸� �̷� ������ ��ȸ�� �� between ����� �ָ�

-- ������ 1000��, 2000��, 3000�� �� ������ ��ü���� ��ȸ
select * from apr06_snack where s_price = 1000 or s_price = 2000 or s_price = 3000;

select * from apr06_snack where s_price in(1000, 2000, 3000); 
-- s_price(����)�� 1000,2000,3000�̳ĸ� ���³��ִ� :in ������
-- ���ϰ� ȿ����
-- ���ӵ��� �ʴ� ������ �޾ƿ��� ���� �� in ������ �������

-- �� ����� �ݴ�Ǵ� ��� ���� �޾ƿ��� �ʹٸ� ? -> not ������
-- �� not �����ڸ� ��� ����ؾ� �ұ�?
select * from apr06_snack where s_price not in(1000, 2000, 3000);

