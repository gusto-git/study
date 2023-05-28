-- ����, 3000g, 10000��, Ȩ�÷���, ������, 1000��, ������ 500��
-- ��, 500g, 5000��, Ȩ�÷���, ������, 500��, ������ 300��
-- ����, 2000g, 5000��, �̸�Ʈ, ������, 800��, ������ 800��
-----------------------------------------------------------------------
-- ���̺� ����� �� �ֱ�
drop table apr12_market cascade constraint purge;
drop sequence apr12_market_seq;
drop table apr12_product cascade constraint purge;
drop sequence apr12_product_seq;

create table apr12_market(
	m_no number(3) primary key,
	m_name varchar2(10 char) not null,
	m_location varchar2(10 char) not null,
	m_land number(4) not null,
	m_parking number(4) not null
);
create sequence apr12_market_seq;

insert into apr12_market values(apr12_market_seq.nextval, 'Ȩ�÷���',
	'������', 1000, 500);
insert into apr12_market values(apr12_market_seq.nextval, 'Ȩ�÷���',
	'������', 500, 300);
insert into apr12_market values(apr12_market_seq.nextval, '�̸�Ʈ',
	'������', 800, 800);
	
select * from apr12_market;
---------------------------------------------------------------
create table apr12_product(
	p_no number(4) primary key,
	p_name varchar2(10 char) not null,
	p_weight number(4) not null,
	p_price number(5) not null,
	p_m_no number(3) not null, 	-- market�� ����� �κ�
	constraint fk_apr12_product foreign key(p_m_no)
		references apr12_market(m_no)
		on delete cascade
);
create sequence apr12_product_seq;

insert into apr12_product values(apr12_product_seq.nextval, '����', 3000, 10000, 1);
insert into apr12_product values(apr12_product_seq.nextval, '��', 500, 5000, 2);
insert into apr12_product values(apr12_product_seq.nextval, '����', 2000, 5000, 3);

select * from apr12_product
---------------------------------------------------------------
-- create table : DBA
-- drop table : DBA
-- create sequence : DBA
-- ���� �ϳ��� ������ ��� ����
-- ȸ�簡�� �����ڿ� ������ �˷��� -> ���� �۾����� �� ������ ������?
---------------------------------------------------------------
-- CRUD
-- C(create) - INSERT
--		SEQUNECE ���, ��¥ ����ְ�, �� �ְ�, ...
-- R(read) - SELECT
--		���� ��κ��� �ð��� �Ҿ���

-- U - UPDATE
--		�� ����
UPDATE ���̺��
	SET �÷��� = ��, �÷��� = ��, ... -- �ٲܳ���
	WHERE ����;
	
-- ���� ��¥��
update apr12_product
	set p_price = 10000
	where p_name = '��';
-- ���߸� [��������]�� �̸� ����
update apr12_product
	set p_name = '��������'
	where p_name like '%����%'; 
-- ��� ��Ʈ�� ������ 30% ���̱�
update apr12_market
	set m_parking = m_parking * 0.7;
-- Ȩ�÷��� �������� ��ǰ���� 10% ����
update apr12_product
	set p_price = p_price * 0.9
	where p_m_no in (
		select m_no 
		from apr12_market
		where m_name = 'Ȩ�÷���' and m_location = '������'
	);
-- ���� ��� ��ǰ 10% ����
update apr12_product
	set p_price = p_price * 0.9
	where p_price = (
		select max(p_price)
		from apr12_product
	);

select * from apr12_product;
select * from apr12_market;
---------------------------------------------------------------------
-- D - delete
DELETE FROM ���̺��
	WHERE ���ǽ�;

-- �� ����
delete from apr12_product
	where p_name = '��';

-- ���� ���� ������ ��ǰ �� ����
delete from apr12_product
	where p_m_no = (
		select m_no 
		from apr12_market
		where m_land = (
			select max(m_land)
			from apr12_market
		)
	);
	
---------------------------------------------------------------------
-- Ȩ�÷��� �������� ����
delete from apr12_market
	where m_name = 'Ȩ�÷���' and m_location = '������';
-- Ȩ�÷��� �������� �������µ�, �� �ȿ� �ִ� ��ǰ���� ��� ����..?
-- �׳� �ΰų� / ���� ���� / ����ΰų� ...
-- ������ ����.. ���߿� ������Ʈ �� �� �������� �� ���� �ؾ��ؿ�
select * from apr12_product;
select * from apr12_market;
---------------------------------------------------------------------
-- 1. OracleDB ������ ���� �����͸� ǥ���� �� �ִ� DB�ڷᱸ���� ����� SQL���� �ۼ����ּ���
create table apr12_computer(
	c_no number(3) primary key,
	c_name varchar2(10 char) not null,
	c_os varchar2(20 char) not null,
	c_format date not null,
	c_weight number(3,2) not null,
	c_cpu varchar2(10 char) not null
);

create sequence apr12_computer_seq;

-- - ��ǻ�� �̸� : ��ǻ��1
-- - �ü�� : Windows 10 Pro
-- - ���˳�¥ : 2023-04-12
-- - ���� : 5.12kg
-- - CPU : i5-1234
insert into apr12_computer values(apr12_computer_seq.nextval, '��ǻ��1',
	'Windows 10 Pro', to_date('2023-04-12', 'YYYY-MM-DD'), 5.12, 'i5-1234');

-- - ��ǻ�� �̸� : ��ǻ��2
-- - �ü�� : Windows 11 Pro
-- - ���˳�¥ : 2023-03-12
-- - ���� : 5.23kg
-- - CPU : i7-5678
insert into apr12_computer values(apr12_computer_seq.nextval, '��ǻ��2',
	'Windows 11 Pro', to_date('2023-03-12', 'YYYY-MM-DD'), 5.23, 'i7-5678');
	
-- 2. 1������ ���� ���̺� ���� �����͸� �߰��ϴ� sql���� �ۼ����ּ���
-- (1�� ���⿡ �ִ� �����͵� �߰��� ��(�� 3���� ������)
-- - ��ǻ�� �̸� : ��ǻ��3
-- - �ü�� : Windows 10 Pro
-- - ���˳�¥ : 2023-02-12
-- - ���� : 3.22kg
-- - CPU : i7-1234
insert into apr12_computer values(apr12_computer_seq.nextval, '��ǻ��3',
	'Windows 10 Pro', to_date('2023-02-12', 'YYYY-MM-DD'), 3.22, 'i7-1234');

-- 3. 1������ ���� ���̺���, �������� ���� ������ ��ǻ���� ��¥��
--    �� ��ǻ�� ���� ��ȸ�ϴ� SQL���� �ۼ����ּ���
select min(c_format), count(*) from apr12_computer;

-- 4. 1������ ���� ���̺���, ���� �ֱٿ� ������ ��ǻ���� �̸��� ��ȸ�ϴ� SQL���� �ۼ����ּ���
select c_name
	from apr12_computer
	where c_format = (
		select max(c_format)
		from apr12_computer
	);

-- 5. 1������ ���� ���̺��� 2��°�� ������ ��ǻ�� ~ 3��°�� ������ ��ǻ����
--    ��ü ������ ��ȸ�ϴ� SQL���� �ۼ����ּ���
select *
	from(
		select rownum rn, c_name, c_os, c_format, c_weight, c_cpu
		from(
			select *
			from apr12_computer
			order by c_weight
		)
	)
	where rn between 2 and 3;
	
drop table apr12_computer cascade constraint purge;
drop sequence apr12_computer_seq;









------------------------------------------------------------------------------------------------------------------------


