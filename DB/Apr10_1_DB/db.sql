-- ���� ������
-- ���ڿ��� �����ϴ� �˻� : like '����'�� ����
--	���ڿ� ���Ͽ� �����ϴ� %�� ���� ���� �𸥴ٴ� ��
--	like '%��' : ������ �����°�
-- 	like '��%' : ������ �����ϴ°�
--	like '%��%' : ���� ����
-- �׷� like ��ſ� (= '%��')�̷� �����δ� �ȵǳ���
--		-> ��ȣ�� �Ἥ ������ ǥ���ϸ� �������� �ν��ϴ°� �ƴ϶� 
--		'%��' ��ü�� ���ڷ� �ν�

select * from apr06_snack;
--	apr06_snack
--	'��'�� ���� ȸ�翡�� ���� ���� �̸� ��ȸ
select s_name from APR06_SNACK where s_maker like '%��%';
-- '��'�� ���� ���ڵ��� ��հ��� ��ȸ
select round(avg(s_price),1) from apr06_snack where s_name like '%��%';
-- ũ��� ���ڰų�, ���� ~ �ΰ� �̸�, ������, ���� ��ȸ
select s_name, s_maker, s_price from APR06_SNACK where s_maker like 'ũ���' or s_name like '����%';
-- ������ �̸��� '���޴���'�� �����ϰų�, '����'�� �����ϴ� ������ �̸�, ������, ���� ��ȸ
select s_name, s_maker, s_price from APR06_SNACK where s_name like '%���޴���%' or s_name like '%����%';
select s_name, s_maker, s_price from APR06_SNACK where s_name like in('%���޴���%, %����%'); -- error!
-- like in ~ ������ ����

-- REGEXP_LIK(�÷���, ����1|����2|...)
-- �پ��� ������ �ѹ��� ã�� �ʹٸ� |(������)�� �־ ���� �߰��ϸ� ��
-- ���Խ�(REGEX)�� �̿��Ͽ� ���ڸ� ã�� ���
-- ���� �տ� ^�� ������ : ���� ������ �����ϴ� ���ڿ� ã��
-- ���� �ڿ� $�� ������ : ���� ������ ������ ���ڿ� ã��

-- ������ �̸��� '���޴���'���� �����ϰų�, '��'�� ������ ������ �̸�, ������, ���� ��ȸ
select s_name, s_maker, s_price from apr06_snack where regexp_like(s_name, '^���޴���|��$');
-----------------------------------------------------------------------------------------------
-- ���� ������
--  ������
--		UNION : �ߺ��Ǵ� ���� �����ϰ� ���

SELECT 1 ID, '����' SUBJECT, 90 SCIRE FROM DUAL
	UNION
SELECT 1 ID, '����' SUBJECT, 90 SCIRE FROM DUAL
	UNION
SELECT 1 ID, '����' SUBJECT, 90 SCIRE FROM DUAL; -- �ߺ��� ���̶� ���� �ϳ��� ���

-- UNION ALL : �ߺ��Ǵ��� ��� ���
SELECT 1 ID, '����' SUBJECT, 90 SCIRE FROM DUAL
	UNION all
SELECT 1 ID, '����' SUBJECT, 90 SCIRE FROM DUAL
	UNION ALL
SELECT 1 ID, '����' SUBJECT, 90 SCIRE FROM DUAL; -- �ߺ��� ���� ��� ��� 

-- ������
--		 INTERSECT : �� ���̺��� ���� �� ����Ǵ� �� ���
SELECT 1 ID, '����' SUBJECT, 90 SCORE FROM DUAL
	UNION
SELECT 2 ID, '����' SUBJECT, 80 SCORE FROM DUAL
	INTERSECT
SELECT 1 ID, '����' SUBJECT, 90 SCORE FROM DUAL; -- ����� 1 ID ~ �κ��� ��µȴ�.

-- ������
--		MINUS : ù��° SELECT�� �߿��� �ι�° SELECT������ ���� ���� ���
SELECT 1 ID, '����' SUBJECT, 90 SCORE FROM DUAL
	MINUS
SELECT 1 ID, '����' SUBJECT, 80 SCORE FROM DUAL -- ù��° SELECT�� ���
	MINUS
SELECT 1 ID, '����' SUBJECT, 90 SCORE FROM DUAL; -- ���� �������� ��ȯ�� �ȵ� 

-- ������ �켱����(�������� �ֿ켱)
-- OR > AND > NOT > �񱳿����� > ��ȣ

-- ���� ���̺��� ȸ�簡 ũ����̰� ������ 1000�� ���ϰų� 3000�� �̻��� ���� ��ü��ȸ
SELECT * FROM APR06_SNACK WHERE S_MAKER 'ũ���' AND (S_PRICE <= 1000 OR S_PRICE >= 2000);

-- GROUP BY : �׷����� ���� �����ؼ� �ϳ��� ����� ��Ÿ���� �� 
--	ȸ�纰 ����, ��հ���, �ּҰ���, �ְ���
--	GROUP BY �ϱ� �� �ְ�, �ּҰ�, ��հ� ���ϸ�
select max(s_price), min(s_price), avg(s_price) from apr06_snack;
-- group by�� �̿��ؼ� ȸ�纰�� �׷��� ������
select s_maker, max(s_price), min(s_price), avg(s_price)
	from apr06_snack
	group by s_maker;
	
	
-- ROLLUP ������
-- ROULLUP BY ROLLUP(�׷���)
--	�÷��� ���� �Ұ�(subtotal)�� �������
--	group by ���� �÷� ������ n�����, rollup�� ���� ���� n+1��
	
-- ȸ���̸�, ȸ�纰 ���� ���� �� �հ�� ��� ���ڵ��� ���� �հ�
select s_maker, sum(s_price) from apr06_snack
	group by rollup(s_maker); -- s_maker �κп� null�� ������ sum�� ��ü���̳���
-- s_maker�κ��� null���̸� '��ü', �װ� �ƴϸ� s_maker ���� �״��
select nvl2(s_maker,s_maker,'��ü') s_maker, sum(s_price)
	from apr06_snack
	group by rollup(s_maker);
	
-- DECODE(�÷���, ����, ���ǿ� �´� �����, ���ǿ� ���� ���� �� �����)
select decode(s_maker, null, '��ü', s_maker) s_maker, sum(s_price)
	from apr06_snack
	group by rollup(s_maker);
-- decode ���� ���� �ڸ��� �񱳿�����(x), ���������(o)
------------------------------------------------------------------------------------------------------
-- HAVING : group by ���� ���ؼ� ������ ��� �� ���ϴ� ���ǿ� �����ϴ� �ڷḸ ã�� ���� �� ��� 	
--	WHERE�� HAVING ��� ������ �̿��ؼ� ���ϴ� �����͸� �̾ƿ´ٴ� ������
--	HAVING  : �׷��� ����� ����
--		VS
--	WHERE : ��ü�� ���� ����� ���� 
	
-- ȸ�纰 ��� ������ 2000�� �̻��� ȸ���� �̸��� ���� ��� ������ ��ȸ
select s_maker, avg(s_price) 
	from apr06_snack
	group by s_maker
	having avg(s_price) >= 2000;

	
-- ORDER BY : ����, �⺻�� ��������(ASC), �������� ����(DESC)
-- ���� �������� ORDER BY [���Ĵ�� ASC(��������) / DESC]
select * from apr06_snack order by s_price desc;

-- where + group by + having + order by
-- �Ե� �Ǵ� ���� ȸ���� ���� ��� ������ 1300�� �̻��� �� �� ȸ���� ��հ��� �������� ����
select s_maker,avg(s_price) from apr06_snack
where s_maker in ('�Ե�','ũ���')
group by s_maker
having avg(s_price) >= 1300
order by avg(s_price) desc;
-------------------------------------------------------------------------------------------------------------------
-- ���̺� �����͸� �˻�, ����, ����, ���� (CRUD) �ϴµ� ����ϴ� ������
-- ������ ���۾�(DML)
-- �� �߿��� �����͸� �ְ��ϴ� ��ɾ��� INSERT
-- �����͸� �˻��ϰų� ��ȸ�� �� �ִ� ��ɾ��� SELECT ������ ������

-- INSERT
-- insert into [���̺��] values(��, ��, ....) �� ����
-- insert primary key�� �� �� ���� ��Ȳ������
-- ���������� ���� ��ȣ���� �ο��ϴ� ������� Primaty key�� �����
-- ���� ��ȣ���� ������ ���۾� �Ѱ� �ƴ϶�
-- ��ȣ���� ���� ������ SEQUENCE��� ��� Ȱ��
-- ���̺�� ����, �������� INSERT�� �����ص� SEQUENCE ���� ������ �ö󰡰�
-- ���̺� �����ص� �����ֱ� ������ ������� ���� ������ �Ѵ�. 

-- SELECT
-- select [distinct] [�÷���], [�÷��� as ��Ī || �÷��� ��Ī],
-- [������], [����Լ�],...
-- from [���̺��]
-- where [���ǽ�]
-- group by [�׷���]
-- having [�Լ� ���� ����]
-- order by [���Ĵ�� asc / desc]

-- distinct : �ߺ�����
-- �÷��� ��Ī �ο� : AS�� ���̰ų� ���⸸ �ϰų� 
-- ������1 : ���������(+,-,*,/), ���� �̾�ٿ��ִ� ||
-- DUAL ���� ���̺��� �̿��ؼ� ������ �����Լ�(����, ����, ��¥, ���, NULL ����..)
-- ��ü ������ �� ���ǿ� �´� �����͸� ã���ִ� where��(���ǽ�) �ٷ�鼭
-- ������2 : �񱳿�����(=,!=,>,<,>=,<=)
-- ������3 : ���迬���� AND�� BETWEEN�� ����
--			���ӵ��� �ʴ� �� �޾ƿ� �� : IN, OR
--			�ݴ�Ǵ� �� �޾ƿ� �� : NOT
--				�̶� NOT�� ��ġ�� IN�� ��  
-- ������4 : ���Ͽ����� >> ���ڿ� ���� �˻�
--			LIKE '%����%'�� ����
--			LIKE ��� ��ȣ(=) ����ϸ� �ȵǴ� ���� : ������ ���ڷ� �ν��ع����� ����
-- ������5 : ���� ������
--		UNION / UNION ALL (������)
--			�ߺ��Ǵ� �� �����ϰ� ��� / �ߺ��Ǵ��� ��� ���
--		INTERSECT (������)
--			���� �� ����Ǵ� ���� ���
--		MINUS(������)
--			���� ���� SELECT�� �߿��� �ڿ� ���� SELECT���� ���� ���� ���
-- ������ �켱���� : ��ȣ -> �񱳿����� -> NOT -> AND -> OR 

-- GROUP BY : �׷����� ��� �����Ͽ� �ϳ��� ����� ��Ÿ��
-- ROLLUP ������ : �÷��� ���� �Ұ�(SUBTOTAL)�� �������
-- HAVING�� VS WHERE��

-- ORDER BY : ����
--		�������� : ASC(DEFAULT ���̶� ��� ���ص� ��), �������� : DESC
-- �׷��� ����� ���� VS ������ ����ؼ� ��ü�� ����� ����

-----------------------------------------------------------------------------------------------
-- ** ��������(SUBQUERY)
--		SELECT �� �ȿ� �ٽ� SELECT���� ����ϴ� ���
--		�ϳ��� SQL�� �ȿ� �ٸ�  SQL���� ��ø�� ���ǹ��� �ǹ�
--		�ٸ� ���̺��� ������ �����ͷ� ���� ���̺� �ִ� ������ ã�ų� ������ �� ���
--		�����Ͱ� �뷮�� �� �����͸� ��� ���ļ� �����ϴ� JOIN����
--		�ʿ��� �����͸� ã�Ƽ� �������ִ� SUBQUERY�� ������ �� ����.

-- ������(MAIN QUERY, �ܺ�����)�� �μ�����(SUBQUERY, ��������)�� ����

-- ��հ����� ������ ���� ������ �̸��� ���� ������ ��ȸ
SELECT S_NAME, S_PRICE FROM APR06_SNACK 
WHERE S_PRICE < AVG(S_PRICE); -- ERROR!

select s_name, s_price from apr06_snack
where s_price < (select avg(s_price)from apr06_snack);
	
-- �� : �κ����� ������ �����غ��� ���� �� �������� �ö�, ���ǿ� �°� �� ã�� �� �� ����
--	���� ������ where������ ���������� ����� �񱳤��Ҷ��� �ݵ�� �񱳿����� ���
-- ��ȣ���� ! : ��ȣ ���� ������ ����(where�� ���� select���� ��ȣ �ӿ� �־���Ѵ�.

-- ���� ��� ���� �̸�, ������, ���� ��ȸ
select s_name, s_maker, s_price from apr06_snack
where s_price = (select max(s_price) from apr06_snack);

-- ���� �� ���ڴ� ��� ���峪��?
select s_maker from apr06_snack
where s_price = (select min(s_price) from apr06_snack);

-- ��հ����� ��� ���ڴ� �� ����
select count(*) from apr06_snack
where s_price > (select avg(s_price) from apr06_snack);

-- ��������� ���� ���� ���� ������ ��ü ���� ��ȸ
select * from apr06_snack
where s_exp = (select max(s_exp) from apr06_snack);
----------------------------------------------------------------------------------------------------
-- ���� ȸ�� ���̺� apr06_maker
-- ȸ�� �̸� , �ּ�, ������ 
select distinct s_maker from apr06_snack;
-- ���� ���̺� ���缭 ������ �ֱ�(ũ��� �Ե� ������)
create table apr06_maker(
	m_name varchar2(10 char) primary key,
	m_addr varchar2(20 char) not null,
	m_employee number(3) not null
);

create 
	insert into apr06_maker values('ũ���','����',700);
	insert into apr06_maker values('�Ե�','�뱸',350);
	insert into apr06_maker values('������','�λ�',500);
	
select * from apr06_maker;

drop table apr06_maker;
drop sequence apr06_maker_seq;

----------------------------------------------------------------------------------------------------------------------
-- �������� ���� ���� ȸ�翡�� ����� ���� �̸� ����
select s_name,s_price 
	from apr06_snack 
	where s_maker = (
		select m_name 
		from apr06_maker
		where m_employee = (
			select min(m_employee)
			from apr06_maker
			)
	);

-- ���� ��� ���ڸ� ����� ȸ��� ��� �ִ���
select m_addr 
from apr06_maker
	where m_name = (
	select s_maker 
		from apr06_snack
		where s_price = (
		select max(s_price)
		from apr06_snack
		)
	);

-- �λ꿡 �ִ� ȸ�翡�� ����� ������ ��հ�
select avg(s_price) 
	from apr06_snack
	where s_maker = (
		select m_name 
		from apr06_maker
		where m_addr = '�λ�'
	);
	
-- ��հ� �̻��� ���ڸ� ����� ȸ���� �̸�, ��ġ
-- = �� ���� ���ϰ� �̻��� ����� ������ �� ��� 'single row ~ ' �߻�
-- ���迬���� in�� ���
select m_name , m_addr
	from apr06_maker
	where m_name in (
		select s_maker
		from apr06_snack
		where s_price >= (
			select avg(s_price)
			from apr06_snack
		)
	);
	
-- ��հ�
select avg(s_price) from apr06_snack;

-- ��հ� �̻��� ���ڸ� ����� ȸ�� 
select s_maker from apr06_snack
	where s_price >= (select avg(s_price) from apr06_snack);
	
-------------------------------------------------------------------------------------------------------------------------
-- 1. ���� ���̺�� ī�� ���̺� �����
-- �������̺� : �����̸� / ���� / �Ǹ��ϴ� ī���� �̸�
-- ī�����̺� : ī���̸� / ���� / �¼� ��
-- [����]  �� ���̺��� �����̸�, ī���̸��� ������ ���� ������

-- 2. ���ǿ� �´� ���̺����
-- Aī�� : ���� / �¼� 100
--	(�Ƹ޸�ī�� , 2000��) , (��, 3000��), (����, 2500��) �Ǹ�
-- Bī�� : ���� / �¼� 80
--	(ȫ��, 2500��), (������, 3000��), (����������, 4000��) �Ǹ�

create table apr10_drink (
	d_name varchar2(10 char) primary key,
	d_price number(5) not null,
	d_cafe varchar2(10 char) not null
	
);

insert into apr10_drink values('�Ƹ޸�ī��',2000,'Aī��');
insert into apr10_drink values('��',3000,'Aī��');
insert into apr10_drink values('����',2500,'Aī��');
insert into apr10_drink values('ȫ��',2500,'Bī��');
insert into apr10_drink values('������',3000,'Bī��');
insert into apr10_drink values('����������',4000,'Bī��');

select * from apr10_drink;

create table apr10_cafe (
	c_name varchar2(10 char) primary key,
	c_location varchar2(10 char) not null,
	c_seat number(3) not null
);
	
insert into apr10_cafe values('Aī��', '����', 100);
insert into apr10_cafe values('Bī��', '����', 80);

select * from apr10_cafe;

drop table apr10_cafe cascade constraint purge;

-------------------------------------------------------------------------------------------------------------
-- ��ü ���� ��հ����� ��� ����� �� ����?
select avg(d_price) from apr10_drink;
select count(*)
	from apr10_drink
	where d_price > (
		select avg(d_price) 
		from apr10_drink
	);


select count(*) from apr10_drink
	where d_price > (select avg(d_price) from apr10_drink);
-- ���� �� ���Ḧ �Ĵ� ī���� �̸�?
select min(d_price) from apr10_drink;

select c_name
	from apr10_cafe
	where c_name = (
		select d_cafe 
		from apr10_drink
		where d_price = (
			select min(d_price)
			from apr10_drink
		)
	);	
	
select c_name 
	from apr10_cafe
	where c_name = (
		select d_cafe
		from apr10_drink
		where d_price = (
			select min(d_price) 
			from apr10_drink
		)
	);
	
	
-- ���￡ �ִ� ī�信�� ���� ������ ��հ�?
select avg(d_price)
	from apr10_drink
	where d_cafe = (
		select c_name 
		from apr10_cafe 
		where c_location = '����'
	);
	
select avg(d_price)
	from apr10_drink
	where d_cafe = (
		select c_name
		from apr10_cafe
		where c_location = '����'
		);

-- �¼��� 90�� �̻��� ī�信�� �Ĵ� ������ �̸�?
select d_name 
	from apr10_drink
	where d_cafe = (
	select c_name
		from apr10_cafe
		where c_seat >= 90
		);
		
-- ��ü ���� ���� ��հ� ������ ���� �̸�?
select d_name
	from apr10_drink
	where d_price <= (
		select avg(d_price)
		from apr10_drink
	);
		
-- ���� ��� ���Ḧ �Ĵ� ī��� ��� ��ġ�ϰ� �ִ���?
select c_location
	from apr10_cafe
	where c_name = (
		select d_cafe
		from apr10_drink
		where d_price = (
			select max(d_price)
			from apr10_drink)
	);
	
	










