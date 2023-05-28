
create table may23_member(
	m_id varchar2(10 char) primary key,
	m_pw varchar2(10 char) not null,
	m_name varchar2(10 char) not null,
	m_phone varchar2(13 char) not null,
	m_birthday date not null,
	m_photo varchar2(200 char) not null
);

select * from MAY23_MEMBER;

truncate table may23_member;

drop table may23_member cascade constraint purge;

insert into MAY23_MEMBER values(?, ?, ?, ?, ?, ?);

insert into MAY23_MEMBER values('lhsgh', '1', 'hong', '010-1111-1111', to_date('20230523', 'YYYYMMDD'), '1.jpg'  );
insert into MAY23_MEMBER values(?, ?, ?, ?, to_date(?, 'YYYYMMDD'), ?);

update MAY23_MEMBER set m_pw = '1234', m_name = 'fdsa', m_phone ='123', m_birthday = to_date('20220509', 'YYYYMMDD'), m_photo = 's.jpg'
where m_id = 'yt8662';

update MAY23_MEMBER set m_pw = ?, m_name = ?, m_phone = ?, m_birthday = to_date(?, 'YYYYMMDD'), m_photo = ?
where m_id = ?;

----------------------------------------------------------------------------------------------------------------------------------------

create table may23_board(
	b_no number(3) primary key,
	b_writer varchar2(10 char) not null,
	b_when date not null,
	b_text varchar2(200 char) not null,
	constraint fk_board1 foreign key(b_writer)
		references may23_member(m_id)
		on delete cascade
);
create sequence may23_board_seq;

select * from MAY23_board;

insert into MAY23_board values(may23_board_seq.nextval, 'yt8662', sysdate, '하하하하');
insert into MAY23_board values(may23_board_seq.nextval, 'yt8662', sysdate, '호호호호');
insert into MAY23_board values(may23_board_seq.nextval, 'yt8662', sysdate, '히히히히');



select count(*) from may23_board, MAY23_MEMBER
where b_writer = m_id and b_text like '%게시판%';

select count(*) from may23_board, MAY23_MEMBER
where b_writer = m_id and b_text like '%?%';

select * 
	from may23_board, may23_member
	where b_writer = m_id and b_text like '%%'
	order by b_when desc

select rownum as rn, b_no, b_writer, b_when, b_text, m_photo
	from(
		select * 
			from may23_board, may23_member
			where b_writer = m_id and b_text like '%%'
			order by b_when desc
	)
	
select *
	from(
		select rownum as rn, b_no, b_writer, b_when, b_text, m_photo
		from(
			select * 
				from may23_board, may23_member
				where b_writer = m_id and b_text like '%%'
				order by b_when desc
		)
	)
where rn >= 2 and rn <= 3

