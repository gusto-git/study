--  ��ľ� ����������

-- ȫ����� �������� ȫ�浿(1)�� ��ϰ� 100��
-- ȫ����� �������� ��浿(2)�� ��ϰ� 80��
-- �ѽ����� �������� ȫ�浿(3)�� ��ϰ� 150��
-- ������� ������� �ֱ浿(4)�� ��ϰ� 130��
drop table apr11_store cascade constraint purge;
drop sequence apr11_store_seq cascade constraint purge;

create table apr11_franchise (
	f_no number(3) primary key, 	-- �Ĵ��ȣ
	f_name varchar2(10 char) not null,
	f_location varchar2(10 char) not null,
	f_ceo number(3) not null, 		--����Թ�ȣ
	f_seat number(3) not null
);

create sequence apr11_franchise_seq;

insert into apr11_franchise values(apr11_franchise_seq.nextval,'ȫ�����','����','1',100);
insert into apr11_franchise values(apr11_franchise_seq.nextval,'ȫ�����','����','2',80);
insert into apr11_franchise values(apr11_franchise_seq.nextval,'�ѽ�����','����','3',150);
insert into apr11_franchise values(apr11_franchise_seq.nextval,'�������','���','4',130);

select * from apr11_franchise;
-- ������� varchar2�� �ƴ� number�� �� ������ ���� ���̺��� ���´�.
--------------------------------------------------------------------------------------------------
-- ȫ�浿, 1990-03-01�ϻ�, ����
-- ��浿, 1992-02-01�ϻ�, ����
-- ȫ�浿, 1991-12-12�ϻ�, ����
-- �ֱ浿, 1989-09-09�ϻ�, ����

drop table apr11_ceo cascade constraint purge;
drop sequence apr11_ceo_seq cascade constraint purge;

create table apr11_ceo (
	c_no number(3) primary key, -- ����� ��ȣ�� ��ġ�ϰ� ����������
	c_name varchar2(10 char) not null,
	c_birthday date not null,
	c_gender char(2 char) not null
);
create sequence apr11_ceo_seq;

insert into apr11_ceo values(apr11_ceo_seq.nextval,'ȫ�浿',to_date('1990-03-01', 'YYYY-MM-DD'),'����');
insert into apr11_ceo values(apr11_ceo_seq.nextval,'��浿',to_date('1992-02-01', 'YYYY-MM-DD'),'����');
insert into apr11_ceo values(apr11_ceo_seq.nextval,'ȫ�浿',to_date('1991-12-12', 'YYYY-MM-DD'),'����');
insert into apr11_ceo values(apr11_ceo_seq.nextval,'�ֱ浿',to_date('1989-09-09', 'YYYY-MM-DD'),'����');

select * from apr11_ceo;

-- ����� �޴� 5�� �����Է�
-- ¥���, 5000��, ȫ����� ������(100��)
-- �Ҵ߹�, 12000��, �ѽ����� ������(150��)
drop table apr11_menu cascade constraint purge;
drop sequence apr11_menu_seq 

create table apr11_menu (
	m_no number(2) primary key,
	m_name varchar2(10 char) not null,
	m_price number(5) not null,
	m_f_no number(3) not null
);

create sequence apr11_menu_seq;

insert into apr11_menu values(apr11_menu_seq.nextval,'¥���', 5000, 1);
insert into apr11_menu values(apr11_menu_seq.nextval,'¥���', 5500, 1);
insert into apr11_menu values(apr11_menu_seq.nextval,'������', 7000, 1);
insert into apr11_menu values(apr11_menu_seq.nextval,'���꽽', 20000, 1);
insert into apr11_menu values(apr11_menu_seq.nextval,'�ຸ��', 15000, 1);
insert into apr11_menu values(apr11_menu_seq.nextval,'¥���', 6000, 2);
insert into apr11_menu values(apr11_menu_seq.nextval,'«�͹�', 8000, 2);
insert into apr11_menu values(apr11_menu_seq.nextval,'����«��', 10000, 2);
insert into apr11_menu values(apr11_menu_seq.nextval,'������ä', 16000, 2);
insert into apr11_menu values(apr11_menu_seq.nextval,'�Ｑ¥��', 13000, 2);
insert into apr11_menu values(apr11_menu_seq.nextval,'�Ҵ߹�', 18000, 3);
insert into apr11_menu values(apr11_menu_seq.nextval,'�����', 6000, 3);
insert into apr11_menu values(apr11_menu_seq.nextval,'����', 10000, 3);
insert into apr11_menu values(apr11_menu_seq.nextval,'�����', 4000, 3);
insert into apr11_menu values(apr11_menu_seq.nextval,'�ع�������', 16000, 3);
insert into apr11_menu values(apr11_menu_seq.nextval,'���', 10000, 4);
insert into apr11_menu values(apr11_menu_seq.nextval,'��ġ��', 12000, 4);
insert into apr11_menu values(apr11_menu_seq.nextval,'��¡���', 15000, 4);
insert into apr11_menu values(apr11_menu_seq.nextval,'��ġ', 9000, 4);
insert into apr11_menu values(apr11_menu_seq.nextval,'��������', 12000, 4);

select * from apr11_menu;

----------------------------------------------------------------------------------------------------------------------
-- �¼��� ���� ���� �Ĵ� ��ϴ� ����� ��ü����
select *
	from apr11_ceo
	where c_no = (
		select f_ceo 
		from apr11_franchise
		where f_seat = (
			select max(f_seat) 
			from apr11_franchise
		)
	);
	
-- ���������� �޴� ��ü�� �̸�, ����
-- �� ���� �������� -> ������ ���ٸ� �޴��� ������ ���� ���� 
-- order by �÷���(asc/desc), �÷���(asc/desc)
select m_name, m_price from apr11_menu order by m_price asc, m_name desc;
-- ��ü ����Ե� �̸�, ���� ��ȸ
select c_name, c_birthday from apr11_ceo;
-- ���������� �Ĵ� �
select count(*) from apr11_franchise;
-- ���������� �޴� ��ü ��հ�
select avg(m_price) from apr11_menu;
-------------------------------------------------------------------------------------------------------------------------
-- ���� ��� �޴��� �̸�, ����
select m_name, m_price 
	from apr11_menu 
	where m_price =(
		select max(m_price)
		from apr11_menu
	);

select m_name, m_price 
	from APR11_MENU
	where m_price = (
		select max(m_price)
		from apr11_menu
	);
	
-- �ֿ����� ������� �̸�, ����
select c_name, c_birthday
	from apr11_ceo
	where c_birthday =(
		select min(c_birthday)
		from apr11_ceo
	);

-- �¼��� ���� ���� �Ĵ��� �̸�, ������, �¼���
select f_name, f_location, f_seat
	from apr11_franchise
	where f_seat in (
		select min(f_seat)
		from apr11_franchise
	); -- ���� �¼����� ���� �� �������� in�� �� �� ��Ȯ�ϴ�.

--ȫ����� �������� ��ϴ� ����� �̸�, ����
select c_name, c_birthday
	from apr11_ceo
	where c_no in (
		select f_ceo
			from apr11_franchise
			where f_name = 'ȫ�����' and f_location = '����'
	); -- �� ������� ���Ը� �ΰ� ��� �� �־ = �ƴ� in�� ����Ѵ�. 


-- '¥��'�� �� ������ ��𰡸� ���� �� �ֳ���? (¥���� �� ������ �Ĵ� �Ĵ��̸�, ������)

select f_name, f_location
	from apr11_franchise
	where f_no in (
		select m_f_no 
			from apr11_menu
			where m_name like '%¥��%'
	);
	
-- �ֿ��� ������� ���� �޴��̸�, ����
select m_f_no, m_name, m_price
	from apr11_menu
	where m_f_no in (
		select f_no
		from apr11_franchise
		where f_ceo in (
			select c_no
			from apr11_ceo
			where c_birthday = (
				select max(c_birthday) 
				from apr11_ceo
		)
	)
); -- in�� ���� ���(���� ������ �� ���?), in���� ��� ù��°�� ���´� ��찡 �־ ������ ���� ��
-----------------------------------------------------------------------------------------------------------------------	
select * from apr11_franchise, apr11_ceo; -- ��� ���ɼ��� �� ���Ĺ��� 
-- �̷������� ��ġ�� ���̺��� �������鼭 ��� ����� ���� �� ������ ������
-- ���ǽ��� ����ؼ� ��¥ �´� �����͸� ������ �;� ��!
select * from apr11_franchise, apr11_ceo where f_ceo = c_no;	
	
-- ��ü �Ĵ� �̸�, ������, ������̸�, ����� ����
select f_name, f_location, c_name, c_birthday 
	from apr11_franchise, apr11_ceo where f_ceo = c_no;
	
-- ��ü �޴���, ����, �Ĵ��̸�, ������
select m_name, m_price, f_name, f_location from apr11_menu, apr11_franchise where m_f_no = f_no;

-- �¼����� 100�� �̻��� �Ĵ��� �޴���, ����, �Ĵ��̸�, ������, �¼���
select m_name, m_price, f_name, f_location, f_seat 
	from apr11_menu, apr11_franchise 
	where m_f_no = f_no and f_seat >= 100;

-- �Ը� ���� ū  �Ĵ��� �޴���, ����, �Ĵ��̸� ,������, �¼���
select m_name, m_price, f_name, f_location, f_seat
	from apr11_menu, apr11_franchise
	where m_f_no = f_no and f_seat = (
		select max(f_seat)
		from apr11_franchise
	);

-- �ֿ����� ����Գ� ��ü �޴���, ����, �Ĵ��̸�, ������, ������̸�, ������ �޴��� �����ټ� > �Ĵ��̸� �����ټ�
select m_name, m_price, f_name, f_location, c_name, c_birthday
	from apr11_franchise, apr11_ceo, apr11_menu
	where c_no = f_ceo and m_f_no = f_no 
	and c_birthday = (
		select min(c_birthday)
		from apr11_ceo 
	)
	order by m_name , f_name ;

------------------------------------------------------------------------------------------
-- �޴��� 1000�� �̻� �ִٰ� ����
-- �޴� ������ ������ ������ �������� �����ְ� ����
-- ��� �ؾ��ұ�?
-- �޴����̺� m_no�� ����(Primary key)
-- Sequence�� ó��
-- sequence�� insert �����ص� counting�� ��
-- �޴������� ���� �� ���� ����
-- -> m_no�� ��Ȯ�ϰ� 1,2,3,4 ... ,10000�� �ƴ�
-------------------------------------------------------------------------------------------
-- �����ʵ�(Rownum) ****************** �ſ�ſ� �߿���
-- 		select �� ������ �ڵ����� �ο���
--		* �ʹ� �Բ� ����� �Ұ���!
--      order by���� ���� �ο� -> ���ϴ� 	
--		������ 1������ ��ȸ �ؾ��մϴ�.

--	�޴� �̸��� ������ ������ �����ؼ� �޴��� ��ü ���� ��ȸ 
-- select rownum, *from apr11_menu order by m_name asc; error!
select rownum, m_no, m_name, m_price, m_f_no from apr11_menu order by m_name asc;

-- order by �ϱ� ���� rownum�� ���� �����Ǿ
-- sequence�� ���� m_no�� ��κ� ���� ���´�.

-- �޴� �̸��� ������ ������ �����ؼ� menu���̺� rownum 1~3���� ��ü ������ ��ȸ
select rownum, m_no, m_name, m_price, m_f_no 
	from apr11_menu 
	where rownum >= 1 and rownum <= 3
	order by m_name asc;
	
-- �츮�� �ǵ��� �� : �̸������� ������ �� �� �ڿ� ��ȣ��(rownum)�� �ο��ϱ� ����
select rownum, m_no, m_name, m_price 
	from(
		select m_no, m_name, m_price, m_f_no
		from apr11_menu order by m_name 			
		)
		where rownum >= 1 and rownum <= 3; 

-- rownum 3�� ~ 11�� 
select rownum, m_no, m_name, m_price 
	from(
		select m_no, m_name, m_price,
		from apr11_menu order by m_name 			
		)
		where rownum >= 3 and rownum <= 11; -- erorr! : ������ 1������ ��ȸ�ؾ� �Ѵ�. 

-- ���� �ٱ����� select �ϳ� �� �����ָ� ��
-- select���� rownum ������ ����鼭 rownum�� ���ڸ� �ο��ϰ� ȿ���� �Ҿ� ������ *�� ����� �� �ְ� �ȴ�.

select * 
	from(
		select rownum rn, m_no, m_name, m_price
		from(
			select m_no, m_name, m_price
			from apr11_menu order by m_name
		)
	)
where rn >= 3 and rn <= 11;

-- ~�浿 �̶�� �̸��� ���� ����Գ� �޴���, ����, �Ĵ��, ������, ������̸���
-- ���� �������� > �޴��� ������ �� ���� ��
-- 3��° 8��° ���� ��ȸ 

SELECT *
FROM (
    SELECT ROWNUM rn, m_name, m_price, f_name, f_location, c_name
    FROM (
        SELECT m_name, m_price, f_name, f_location, c_name
        FROM APR11_FRANCHISE f, APR11_MENU m, APR11_CEO c
        WHERE c.c_no = f.f_ceo AND m.m_f_no = f.f_no AND c.c_name LIKE '%�浿'
        ORDER BY m_price DESC, m_name
    )
)
WHERE rn BETWEEN 3 AND 8;

	

select *
	from(
		select rownum rn, m_name, m_price, f_name, f_location, c_name
		from(
			select m_name, m_price, f_name, f_location, c_name
				from apr11_franchise, apr11_ceo, apr11_menu 
				where c_no = f_ceo and m_f_no = f_no 
				and c_name like '%�浿'
				order by m_price desc , m_name asc
		)
	)
where rn between 3 and 8;
	
-- �达 ���� ���� ����Գ� �޴���, ����, ����� �̸�, ����� ����
-- ���� �������� ���� -> 2~3��° �ڷ� ����
select *
	from(
		select rownum rn, m_name, m_price, c_name, c_gender
		from(
			select m_name, m_price, c_name, c_gender
					from apr11_ceo, apr11_menu, apr11_franchise
					where m_f_no = f_no and c_no = f_ceo
					and c_name like '��%'
					order by m_price asc
				)
			)
			where rn between 2 and 3; 
	
--------------------------------------------------------------------------------------------------------------------------	
-- join
-- �ϳ��� ��ɹ��� ���� ���� ���̺� ����� �����͸� �ѹ��� ��ȸ �� �� �ִ� ���
-- ��ġ �ϳ��� ���̺��� ��ó�� ������ 

			
create table tb1(name varchar2 (10 char), age number(3));	
create table tb2(name varchar2 (10 char), age number(3));	

insert into tb1 values('��浿', 30);
insert into tb1 values('�ڱ浿', 35);
insert into tb1 values('�ֱ浿', 40);
insert into tb1 values('���浿', 40);

insert into tb2 values('��浿', 30);
insert into tb2 values('���浿', 50);
insert into tb2 values('�̱浿', 55);

select * from tb1;
select * from tb2;

-------------------------------------------------------------------------------------------------------------------
-- cross join : ������ ���Ǿ��� �� ���̺� ���� ������ ��� ����� ��ȸ(��� ����� ��)
-- ��ǻ� �Ⱦ���.
select * from tb1, tb2;
select * from tb1 cross join tb2;

-- inner join : ���ǿ� �ش��ϴ� ���� ����
select * from tb1 inner join tb2 on tb1.name = tb2.name;
select * from tb1 A, tb2 B where A.name = B.name; -- EQUI ����(��������)
-- EQUI ���� : JOIN ~ USING(���δ�� �÷���) : ���δ�� �÷����� 1���� ��� �������� �״�� ���
select * from tb1 join tb2 using (name); 
-- �ڿ�����(Natural join) : ������ ���� ���ʿ� ���� �̸��� ���� ������ �÷��� ��ȸ
select * from tb1 natural join tb2; 

-- outer join : ���� ���̺��� �����Ͱ� ��� ��ȸ(��������)�ǰ�,
--				��� ���̺� �����Ͱ� �ִ� ��� �ش� �÷��� ���� �������� ����
-- (+) �� �̿��� outer join : null�� ��µǴ� ���̺��� �÷�(+) ��ȣ �߰�

-- left outer join : ���� ���̺� ���� ���� �� ������ ���̺��� ���ǿ� ���� �ʾƵ� ����
--  (���ǿ� ���� ������ null�� �Ų�)
-- * left�� right���� �� ���� ��(���� ���̺��� �������� �д�)

select * from tb1 left outer join tb2 on tb1.name = tb2.name;
select * from tb1, tb2 where tb1.name = tb2.name(+);

-- right outer join : ������ ���̺� ���� ���� �� ���� ���̺��� ���ǿ� ���� �ʾƵ� ����
-- (���ǿ� ���� ������ null�� �Ų�)
select * from tb1 right outer join tb2 on tb1.name = tb2.name;
select * from tb1,tb2 where tb1.name(+) = tb2.name;

-- full outer join : ���� ���̺� ���� ������, �ٸ��� ���̺��� ���ǿ� ���� �ʾƵ� ����
select * from tb1 full outer join tb2 on tb1.name = tb2.name;

-- self join ** �򰥸�
-- �ϳ��� ���̺� �ȿ� �ִ� �÷����� �����ϴ� ������ �ʿ��Ѱ��
-- �ܾ� �� �״�� ������ JOIN�Ѵٴ� ��

-- �� ����Ʈ�� ȸ���� 5���� �ְ� �����ڰ� 2�� �ִ�
-- ȸ���� �̸��� ���� ȸ��1 ~ ȸ��5 , ������ �̸��� ������1 ~ ������ 2
-- ȸ���� ID���� ���� MEMBER1~MEBER2 , ������ ID MANAGER1 ~ MANAGER2
-- ȸ��1 ~ ȸ�� 3���� ������ 1�� ����, �������� ������ 2�� ����

create table apr11_member(
	m_id varchar2(10 char) primary key,
	m_name varchar2(10 char) not null,
	m_manager varchar2(10 char) -- �����ڵ��� ������ ���� ������ �������� x
);

insert into apr11_member values('member1', 'ȸ��1', 'manager1');
insert into apr11_member values('member2', 'ȸ��2', 'manager1');
insert into apr11_member values('member3', 'ȸ��3', 'manager1');
insert into apr11_member values('member4', 'ȸ��4', 'manager2');
insert into apr11_member values('member5', 'ȸ��5', 'manager2');

insert into apr11_member values('manager1', '������1', null);
insert into apr11_member values('manager2', '������2', null);

select * from apr11_member;

-- �� �����ڰ� � ȸ���� �����ϴ��� �˰� ����
-- ������ id, ������ �̸�, ȸ�� id
select * from apr11_member A join apr11_member B on A.m_id = B.m_id;

select A.m_id, A.m_name, B.m_id -- ���� ���̺������� ���������� �ϱ� ���� ���̺� ���� ��Ī�� �־ ����
		from apr11_member A join apr11_member B
		on A.m_id = B.m_manager; 
		-- ���� ID�� ������ ������ ���� ������ �����ؼ�
		-- �����ϴ� ȸ�� ID���� ������ �� �ֵ��� 






