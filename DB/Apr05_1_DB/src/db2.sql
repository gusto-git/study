-- [�ɼ�]
--	= ��������(Constraint)�̶�� ��
--		������ ���Ἲ�� �����ϱ� ���� �뵵
--		* ������ ���Ἲ : DB�� ����� �������� �ϰ����� ��Ȯ���� �����ִ� ��

-- 1. ������ ���Ἲ ��������
--	= ������ ����(Domain Constraint)�̶�� ��
--		���̺� ���� Ʃ��(��)���� �� �Ӽ��� �����ο� ������ ���� ������ �Ѵٴ� ����
--		������Ÿ��(type), ��(null/not null), �⺻��(default), üũ(check)

-- 2. ��ü ���Ἲ ��������
--	= �⺻Ű ����(Primary key Constraint)�̶�� ��
--		��ü(Entity) : ���, �繰, ���, ��� ��� ���� ���������� �����ϸ鼭,�����ϰ� �ĺ��� ������ ����
--					   �ƹ��� ���� ��ü�� �����ص�, ���� ���ϴ� '������'��ü�� �߰��� �� �־�� ��
--				       ���̺��� �⺻Ű�� �����ϰ�, Null ���� �������� �ȵǸ�,
--					   ���̺� �ȿ� ���� �ϳ��� ���� �����ؾ� �Ѵٴ� ����! 

-- 3. ���� ���Ἲ ��������
--	= �ܷ�Ű ����(Foreign key Constraint)�̶�� ��
--		���̺� ���� ���� ���踦 �����ϴ� ��������
--		������ �޴� ���̺��� �ܷ�Ű�� �����ϴ� ���̺��� �⺻Ű�� �����ؾ� �ϸ�,
--		������ �޴� ���̺��� ���� ����Ǹ� �����ϴ� ���̺��� ���� �ް� ��
----------------------------------------------------------------------------------------------------------------------
-- 1) Not null : NULL�� ���� ����ִٴ� ��
--				 0�̳� ���⵵ �ƴ� ������ ���� ���� ����
--				 NOT NULL�� NULL�� ������� �ʰڴ�.
--  			 -> �ʼ������� �Է��ؾ� �� �÷��� ����
--     			 -> ���� ���� ���Ǵ� ���� ���� �� �ϳ�
--				 -> ** ���̺� ���� �� ������ ���� ���� ����� �Ѵ�.**

-- not null �ο����1 : Constraint Ű���带 �̿��ؼ� �������Ǹ��� �ο�
create table example(
	col1 varchar2(10 char),
	col2 varchar2(10 char) constraint col2_notnull not null
);
-- col2 varchar2(10 char) constraint [�������Ǹ�] [��������]

-- not null �ο����2 : �������Ǹ�(constraint �������Ǹ�)�� ���� �ο����� �ʴ� ��� (Orcale�� �ڵ� �ο�)
create table example2(
	col1 varchar2(10 char),
	col2 varchar2(10 char) not null
);

-- 2) Unique : �ش� �÷��� ���� ���� ��ü ���̺��� �����ؾ� �Ѵٴ� ����
--		NOT NULL�� �Բ� ��� ���� / UNIQUE�� ���� ������� �ʴ´�.
create table example3(
	col1 varchar2(10 char) unique,
	col2 varchar2(10 char) unique not null,
	col3 varchar2(10 char),
	constraint col3_unique unique(col3)
);
-- constraint �������Ǹ� ��������(�÷���)

-- 3) primary key(�⺻Ű) : Null�� ������� �ʰ� + �ߺ��� �����͵� ������� ����
--		(NOT NULL + UNIQUE -> PRIMARY KEY)
-- 		�������� Ư�� ������ �˻��ϰų�, ���� ���� �۾��� �� �� �⺻Ű�� ���� 
--		ID, �ֹι�ȣ, ȸ����ȣ, �� ��ȣ�� ���� �ߺ����� �ʴ� ���� �⺻Ű�� �ش�
--		�Ϲ������� ���̺��� 1���� �⺻Ű�� ������ �������� ������****
--		������ PK(�⺻Ű)�� ���̺�� �ϳ���
create table example4(
	col1 varchar(10 char) primary key,
	col2 varchar(10 char) not null,
	col3 varchar(10 char) not null
);
-- PK ������ �ٶ�(���� �÷��� ���� ��)
create table example5(
	col1 varchar(10 char),
	col2 varchar(10 char),
	col3 varchar(10 char),
	constraint PK_example5 primary key(col1, col2)
);
-- constraint PK�� primary key(�÷���, �÷���)

-- *** ��¥ �����
-- 4) Foreign key(�ܷ�Ű) : �ٸ� ���̺��� Ư�� �÷��� ��ȸ�ؼ�
--		������ �����Ͱ� �ִ� ��쿡�� �Է��� ���
--		�����ϴ� ���̺��� PK�� Unique�� ������ �÷����� FK�� ������ �� �ִ�.
-- 		�ܷ�Ű ������ ���ؼ��� �����޴� �÷��� ���� �����Ǿ�߸� �ϰ�
--		�ܷ�Ű�� ���� ���̺��� �� ���Ŀ� ������ �Ǿ�� ��

-- �ܷ�Ű�� ���� ���̺��� ����
create table ���̺��(
 	�÷��� �ڷ���, -- ��ǥ ������ �ʱ�
 	constraint FK�� foreign key(�÷���)
 	references ������̺��(������̺��� �⺻Ű(or ����Ű) �÷���)
 	on delete set null || on delete cascade
 	-- ���� �޴� ���̺��� �� �κ��� ������ ��
 	-- �� ���̺� ����� �࿡ ���ؼ� NULL���� ������
 	-- �ƴϸ� �� �൵ ���� �������� ���� �ɼ�(�� �� �ϳ� ����)
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
-- �а�, �л����� �����Ͱ� ���� 5�� �̻� �ֱ�
insert into example7 values('10');
insert into example7 values('20');
insert into example7 values('30');
insert into example7 values('40'); -- �ȵ���(example6���� '40'�� ��� erorr!
select * from example7;

-- ex6_id�� '10'�� �÷��� ����� ��� �ɱ�?
delete from example6 where ex6_id = '10'; -- ex6�� '10'�� ���������� ex7�� '10'�� ���� �����ȴ�.

-- ���� 1
-- �а����̺�� �� ���̺��� �����ϴ� �л� ���̺� �����!
-- �а� ���̺� : �а��ڵ�(4�ڸ� ����), �а��̸�(10���� �̳�) /null�� ����
create table major(
	m_code number(4) primary key,
	m_name varchar2(10 char) not null
);
insert into MAJOR values(1001,'��ǻ�Ͱ��а�');
insert into MAJOR values(2001,'�濵�а�');
insert into MAJOR values(3001,'���а�');
insert into MAJOR values(4001,'������Ű�');
insert into MAJOR values(5001,'ü��������');
insert into MAJOR values(1001,'���������а�'); -- PK�� ���� ������ �߻� -> error�߻�
insert into MAJOR values(6001); --not null�� �� ä������Ѵ�. -> error!
select * from major;

-- �л� ���̺� : �л���ȣ(3�ڸ� ����), �л��̸�(10���� �̳�), �л��� �Ҽӵ� �а��� �ڵ�
create table student(
	s_no number(3) primary key,
	st_name varchar2(10 char) not null,
	s_code number(4) not null,
	constraint fk_student foreign key(s_code)
		references major(m_code)
		on delete cascade
);
-- �а�, �л����� �����Ͱ� ���� 5�� �̻� �ֱ�
insert into student values(101,'ȫ�浿',1001);
insert into student values(102,'��浿',2001);
insert into student values(103,'�ڱ浿',1001);
insert into student values(104,'�ֱ浿',2001);
insert into student values(105,'�̱浿',1001);
insert into student values(106,'ȫ�浿',6001); -- ������ major ���̺� 6001�� �ڵ��� �����Ͱ� ��� -> error!
select * from student;

-- �а��� ��������, �ش��ϴ� �а��� �л��� ������ �������� �����
delete from major where m_code = 1001;

----------------------------------------------------------------------------------
-- 5) Check : ������ ���� ������ ������ �����ؼ� ���ǿ� �ش��ϴ� �����͸� ���
create table example8(
	col1 number(3) constraint ex8_check check(col1 between 1 and 9) -- 1~9 ���ڸ� ���� �� �ִ�.
);

insert into example8 values(10); -- 1 ~ 9 ������ ���ڰ� �ƴ϶� ����! 

drop table example8 cascade constraint purge;
select * from all_talbes -- ���� ���� ���̺� Ȯ���� ��
----------------------------------------------------------------------------------
-- 6) Default : �ƹ��� �����͸� �Է����� �ʾ��� �� ������ �����Ͱ� �ڵ� �Է�
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
-- Ŀ�����̺�(apr05_coffee)
-- �÷� : Ŀ�� �̸� / ���� / Į�θ�(�Ҽ��� 1�ڸ�) / ���� ��¥(date) : null�� ����, ��¥
drop table apr05_coffee cascade constraint purge;

create table apr05_coffee(
	c_name varchar2(10 char) primary key,
	c_price number(5) not null,
	c_kcal number(4,1) not null,
	c_start date not null
);

insert into apr05_coffee values('�Ƹ޸�ī��',3000,20.1,sysdate); 
insert into apr05_coffee values('ī���',3500,28.7,sysdate); 
insert into apr05_coffee values('�ٴҶ��',4200,200.5,sysdate); 
insert into apr05_coffee values('������',3000,158.1,sysdate); 
select * from apr05_coffee;

-- �츮�� ���� DDL���� create�� �ٷ� �� �ְ� �Ǿ���
-- ���� ���� ALTER, DROP, TRUNCATE 

-- ������ Ÿ�� ���� / �÷��� ũŰ(�뷮) ����
alter table [���̺��] modify [�÷���] [������Ÿ��(�뷮)];

-- Ŀ�����̺� c_name �κ��� ���ڸ� ���ڷ� ����
-- �̹� ���̺� �ȿ� ���� �ִ� ���¸� ������ Ÿ�� ������ �Ұ����ϴ�
alter table apr05_coffee modify c_name number(3);

-- ������ �����
delete from apr05_coffee where c_name = '�Ƹ޸�ī��';

-- ������� ��������
alter table apr05_coffee modify c_name varchar2(10 char);

-- c_name�� �뷮�� 10�ڸ� -> 2�ڸ�
-- ���� �ִ� ���¿��� �뷮�� ���� �����ϸ� error! �߻�
alter table apr05_coffee modify c_name varchar2(2 char);

-- ������ �����
delete from apr05_coffee where c_name = '�Ƹ޸�ī��';

-- ** ���ǻ���!!
-- 		������ Ÿ���� ������ ���� �ش� �÷��� ���� ��� ������ ������ ���� 
--		�׷��� ������ ������ �߻��Ѵ�.
--		�÷��� �뷮�� ���� ��� �ش� �÷��� �뷮�� ��ȸ�ؼ� ������ ���̺���
--		ū ���� �ִ��� Ȯ���ϰ� -> �� ���� �����ؾ� �Ѵ�.

-- ���̺� ���� Ȯ�ι�
-- instant client cmd
-- sqlplus ID/PW@IP�ּ�:1521/xe
-- �պκ��� 'sql > '�� �ٲ��
-- desc ���̺��;

-- �÷��� ����
alter table [���̺��] rename column [�����÷���] to [�ٲ��÷���];
alter table apr05_coffee rename column c_name to c_name2;

-- �÷� �߰� 
alter table [���̺��] add [�÷���] [������Ÿ��] [��������(��������)];
-- ������ �����Ͱ� ����� not null ����
alter table apr05_coffee add c_taste varchar2(10 char) not null;

-- �÷�����
alter table [���̺��] drop column [�÷���];
alter table apr05_coffee drop column c_taste;

------------------------------------------------------------------------- ������� ������
-- ���̺� ���� ���� �����
truncate table [���̺��];
truncate table apr05_coffee;
select * from apr05_coffee;
-- ���̺� ���� �����ʹ� ��� ������ �Ǿ�����, ���̺� ���� ��ü�� �״�� ��������

--���̺� ��������(�����뿡 �ֱ� + ���������)
drop table [���̺��] cascade constraint purge;
drop table apr05_coffee cascade constraint purge;

-- ���̺� ����(�����뿡 �ֱ�)
drop table [���̺��] cascade constraint;
drop table apr05_coffee cascade constraint;
select * from apr05_coffee;

-- ���̺� ����(�����뿡�� ����)
flashback table [���̺��] to before drop;
flashback table apr05_coffee to before drop;

-- ������ ����
purge recyclebin; 
------------------------------------------------------------
-- DDL : ��ǻ� ���Կ��� �ñ��� ����!
-- ����ִ� DBA���� ���̺��� ���� CRUD������ �ϰԲ�!
------------------------------------------------------------

------------------------------------ ������ ������� 20230405

-- ����)
-- 1. ��Ʈ�Ͽ� ���� ���̺��� ����
-- ��Ʈ���� �̸�(20��)/ ����(7�ڸ�) / CPU(10����) / RAM(���� 2) / HDD(���� 4�ڸ�) / �����Ⱓ(��¥)
-- [�ϳ��� PK(�⺻Ű)�� ������ �ϰ�, ��� ���� ä�� �־�߸� ��]

create table notebook (
	n_name varchar2(20 char) primary key,
	n_price number(7) not null,
	n_cpu varchar2(10 char) not null,
	n_ram number(2) not null,
	n_hdd number(4) not null,
	n_warranty date not null
);

-- ����2)
-- ��Ʈ�� ����� �������� 128GB¥�� RAM�� ����ϰ� �Ǿ���
-- 	�� �� RAM �÷��� �뷮�� �����ϴ� ���� 
alter table notebook modify n_ram number(3);

-- ����3)
-- ��Ʈ�� ũ�⿡ ���� �÷��� �߰��ϴ� ����
-- 	[���� cm, �Ҽ��� �ι�° �ڸ����� ��Ÿ�� ��]
--  [�� �÷��� �� ������ ���� �� ����]
alter table notebook add n_size number(5,2);

-- ����4)
-- ��Ʈ�Ͽ� ������ hdd ��� ssd�� ����
alter table notebook rename column n_hdd to n_ssd;
alter table notebook rename column n_ssd to n_hdd;
-- ����5)
-- �����Ⱓ �÷��� �����ϴ� ���� �ۼ�
alter table notebook drop column n_warranty; 

-- ����6)
-- ��Ʈ���� ������ [800000 ~2300000] ������ ���� �� �� �ְ�
--	�ش� �÷��� �����ϴ� ���� �ۼ�
alter table notebook modify n_price number(7) constraint n_check check(n_price between 800000 and 2300000);
	
-- ����7)
--	�������̺��� ������ �����ϴ� ���� �ۼ�
drop table notebook cascade constraint purge;

---------------------------------------------------------------------------------
-- ��û�� ���������� �޾ -> DB ��ġ 
-- CMD ��� SQLPLUS�� �ٷﺸ�鼭 DBA���� �ϴ� ������ ��¦ ������
--		�������� , ���Ѻο�, tablespace ...
-- ���̺� , ��, ��, ��Ű��, ������, �ν��Ͻ�
-- SQL ��ɹ� �߿� ���Ǿ�(DDL)�� ���鼭 ���̺� ��������
-- ���̺� ������ �ʿ��� �ڷ���(�ַ�)
-- ������ : varchar2 / ������: number / ��¥ : date
-- ������ : varchar2�� �뷮 �Է��Ҷ��� char�� �־ ���� ������ ���� �� �ְ� ����
-- ������ : number�� �뷮�� �Է��� ���� ���е� / ���� �� �����ؼ� ������
-- ������ date.. ������ ���� 
-- ����� �������� ! / not null, primary key, foreign key ... 
-- ���̺��� ���� ���� , �����ϸ鼭 DDL �Ϸ�

--------------------------------------------------------------------------------- 
-- ���� 8 �������̺�
-- 		���� �̸�/ ȸ��/ ���� ������ �ְ����
--		���̺� �ϳ��� primary key 
--	    not null ���

-- �������� -> ������ / �Ե� : ���ϰ� x
-- ȸ�� : �������� ������ ���� : ���ϰ� x
-- ���� : ���� ���� ���� ���� : ���ϰ� x
-- PK�� ���? -> ��ȣ�� �÷��� ���� ���⿡ PK�� �ִ� �͵� �Ѱ��� ���!

create table snack(
	s_no number(3) primary key,
	s_name varchar2(10 char) not null,
	s_brand varchar2(10 char) not null,
	s_price number(6) not null
);
-------------------------------------------------------------------------------
-- ���ݺ��� DML ����
-- **�߿�** ������ ���۾�(Data Manipulation Language)
-- ���̺� �����͸� �˻�, ����, ����, ���� �ϴµ� ����ϴ� ����
-- SELECT, INSERT, UPDATE, DELETE ���� ����
-- ���� �ٿ��� CRUD(CREATE, READ, UPDATE, DELETE)
-- ���⼭ ���ϴ�  C�� CREATE TABLE X -> �̰� DBA�� �۾�
-- �̰Ŵ� �����͸� ����ٴ� �ǹ� C (INSERT - �ǹ�)
---------------------------------------------------------------------------------
-- C (insert)
insert into ���̺��(�÷���, �÷���, �÷��� ....) values(��, ��, ��)...
insert into SNACK(s_no, s_name, s_brand, s_price) values(1, '����Ĩ', '������', 2200 );

-- �Է��� �� ���� �ٲٱ�? -> ����
insert into SNACK(s_name, s_no, s_price, s_brand) values('��������', 2, 3300, '������');

-- �÷��� ���� �ȳֱ� -> error not null ������ 
-- ���࿡ null�� ���Ǵ� ��� ������ null�� ������ �÷��� ���� 
-- ���� �Է��߾ ���������� ���� ��
insert into SNACK(s_name , s_price) values('����ī���', 3500); -- null�̾����� �������� �� 

-- (�÷���, �÷���, ..) ���� �ʰ� �÷� ������� �ִ¹��!
insert into SNACK values('3','��Ĩ', 'ũ���', 1900);

select * from snack;
------------------------------------------------------------------------------------------------
-- ���̺� �����
-- �ٽ� ���̺� �����ؼ� �� 5�� ������ �ֱ� 
drop table snack cascade constraint purge;

insert into snack values(1, '����Ĩ', '������', 2200);
insert into SNACK values(2, '��������', '������', 3800);
insert into SNACK values(3, '��Ĩ', '������', 1800);
insert into SNACK values(4, '�����۽�', '�̷α�', 2500);
insert into SNACK values(5, '�ٳ���ű', '���', 2100);

select * from snack;

--���� ������ ������ ������ ���� ������ ������ ��ȣ�� �ڵ����� ���Ǿ����� ��
-- factory pattern!! ���� �ڵ�ȭ
-- MySQL : Autoincrement �ɼ�
-- OrcaleDB : Sequence �ɼ�
-- ��ȣ �ڵ����� ���� ���ִµ� Sequence�� ����� ���̺���� ����
-- (���̺� ����������, Sequence ���� ����.. sequence�� ���� �������
-- ���� : insert �����ص� sequence count�� �ö󰣴�
-- �ѹ� ������ ���� �ٽ� ���� �� ���� 

-- (���̺���� ������)sequence ����
create sequence ��������;

-- ���̺� �� �ڿ� _seq�� �ٿ��ִ� ��ȭ�� ����(���̺��_seq)
create sequence snack_sqe;

-- ��ü���� ������
create sequence ��������
	increment by 1 -- ������ (1�� ����)
	start with 1 -- ���۰�
	minvalue 1 -- �ּҰ�
	maxvalue 999 -- �ִ밪 
	nocylce / cycle -- �ִ밪�� �����ϸ� ���۰����� �ٽ� �ݺ����� ���� ����
	nocache /  cache -- �������� �̸� �������� �޸𸮿��� ������ ���� ���� 
	noorder / order -- ��û ������� ���� �������� ����
	
-- sequence ����
drop sequence ��������;
drop sequence snack_sqe;
-- sequence ��� : ������.nextval
-- ������ �ִ� ������ ��� ������ �Ŀ� �ٽ� ���� ����� �־�Ԥ���
-- ���̺��� �׳� �ΰ� �����͸� ��� ����
truncate table snack;

insert into apr05_snack values(apr05_snack_seq.nextval,'��������','�Ե�',5000);
insert into apr05_snack values(apr05_snack_seq.nextval,'��������','������',5000);
insert into apr05_snack values(apr05_snack_seq.nextval,'������','�Ե�',500);
insert into apr05_snack values(apr05_snack_seq.nextval,'��Ϲ���Ĩ','����',3000);
insert into apr05_snack values(apr05_snack_seq.nextval,'����Ĩ','ũ���',2000);
insert into apr05_snack values(apr05_snack_seq.nextval,'����Ĩ(�̰ǽ����Ѱ�)','ũ���',2000);
insert into apr05_snack values(apr05_snack_seq.nextval,'���ĸ�','���',5000);


insert into SNACK values(snack_sqe.nextval, '����Ĩ', '������', 2200);
insert into SNACK values(snack_sqe.nextval, '��������', '������', 3800);
insert into SNACK values(snack_sqe.nextval, '��Ĩ', '������', 1800);
insert into SNACK values(snack_sqe.nextval, '�����۽�', '�̷α�', 2500);
insert into SNACK values(snack_sqe.nextval, '�ٳ���ű', '���', 2100);
insert into SNACK values(snack_sqe.nextval, '�ٳ���ű(�̰ǽ��н�ų��)', '���', 2100);
insert into SNACK values(snack_sqe.nextval, '���ĸ�', '���', 2500);


select * from apr05_snack;
 -------------------------------------------------------------------------------------------------
 
