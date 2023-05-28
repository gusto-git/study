-- apr14_air table
-- �ǿ���, �����Ҹ�, �̼�����, �ʹ̼�����, ����, ���մ��ȯ����

drop table apr14_air cascade constraint purge;
drop sequence apr14_air_seq;

create table apr14_air (
	aa_no number(5) primary key,
	aa_MSRDT date not null,
	aa_MSRRGN_NM varchar2(3 char) not null,
	aa_MSRSTE_NM varchar2(5 char) not null,
	aa_PM10 number(3) not null,
	aa_PM25 number(3) not null,
	aa_O3 number(4,3) not null,
	aa_IDEX_NM varchar2(10 char)not null
);
-- sequence 
create sequence apr14_air_seq;

-- insert
insert into apr14_air values(apr14_air_seq.nextval, sysdate, '���ɱ�', '�߱�', 9, 6, 0.024, '����');

-- select
select * from apr14_air;

-- truncate
truncate table apr14_air;

-- �ð��� ����

select * from apr14_air order by aa_MSRDT ;






