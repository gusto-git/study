-- � �Ĵ��� ���� ���α׷� (����������)
drop table apr13_restaurant cascade constraint purge;
drop sequence apr13_restaurant_seq;

-- Ư�� �Ĵ翡 ���� ���̺� (apr13_restaurant)
-- �Ĵ� ����, �Ĵ� ����, �¼� ��
create table apr13_restaurant(
	r_location varchar2(10 char) primary key,
	r_owner varchar2(10 char) not null,
	r_seat number(3) not null
);

create sequence apr13_restaurant_seq;

-- Ȯ�ο� insert 2��
-- select * Ȯ��
insert into APR13_RESTAURANT values('����', 'ȫ�浿', 100);
insert into APR13_RESTAURANT values('����', '��浿', 80);
SELECT * FROM APR13_RESTAURANT;

-- ���� ���̺�(apr13_reservation)
-- �������̸�, ����ð�, ������ ��ȭ��ȣ, ��������
drop table apr13_reservation cascade constraint purge;
drop sequence apr13_reservation_seq;

create table apr13_reservation (
	r_no number(3)primary key,
	r_name varchar(10 char) not null,
	r_time date not null,
	r_phone varchar(20 char) not null,
	r_location varchar(10 char)not null
);

create sequence apr13_reservation_seq;

-- Ȯ�ο� insert 2��
-- select * Ȯ��

insert into apr13_reservation values(apr13_reservation_seq.nextval,
	'�ֱ浿', to_date('2023-04-14 14:00', 'YYYY-MM-DD HH24:MI'),
	'010-1111-222', '����');
	
insert into apr13_reservation values(apr13_reservation_seq.nextval,
	'�ֱ浿', to_date('2023-04-14 14:00', 'YYYY-MM-DD HH24:MI'),
	'010-1111-222', '����');

SELECT * FROM APR13_reservation;
SELECT * FROM APR13_RESTAURANT;
-- Ȯ�ο� insert 2��
-- select * Ȯ��
insert into APR13_RESTAURANT values('����', 'ȫ�浿', 100);
insert into APR13_RESTAURANT values('����', '��浿', 80);
SELECT * FROM APR13_RESTAURANT;

-- ���� ���̺�(apr13_reservation)
-- �������̸�, ����ð�, ������ ��ȭ��ȣ, ��������
drop table apr13_reservation cascade constraint purge;
drop sequence apr13_reservation_seq;

create table apr13_reservation (
	r_no number(3)primary key,
	r_name varchar(10 char) not null,
	r_time date not null,
	r_phone varchar(20 char) not null,
	r_location varchar(10 char)not null
);

create sequence apr13_reservation_seq;

-- Ȯ�ο� insert 2��
-- select * Ȯ��

insert into apr13_reservation values(apr13_reservation_seq.nextval,
	'�ֱ浿', to_date('2023-04-14 14:00', 'YYYY-MM-DD HH24:MI'),
	'010-1111-222', '����');
	
insert into apr13_reservation values(apr13_reservation_seq.nextval,
	'�ֱ浿', to_date('2023-04-14 14:00', 'YYYY-MM-DD HH24:MI'),
	'010-1111-222', '����');

SELECT * FROM APR13_reservation;

-- �����ȣ �������� ����
select * from apr13_reservation order by r_no;
