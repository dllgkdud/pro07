create database government;
use government;
commit;


create table sample(
	id varchar(10),
    pw varchar(50),
    regdate datetime default now()
);
select * from sample;

insert into sample value('lhy', '1234', now());
insert into sample value('kim', '1111', now());
insert into sample value('lee', '2222', now());
insert into sample value('park', '3333', now());
insert into sample value('choi', '4444', now());
drop table sample;


create table notice(
	no int auto_increment primary key,
    title varchar(100),
    content varchar(2000),
    dept varchar(100),
    regdate datetime default now(),
    hits int default 0
);
select * from notice;
alter table notice modify column hits int default 0;

insert into notice(title,content,dept,regdate) values('2022년 기록관리기준표 변경사항 고시','2022년도 외교부 기록관리기준표 신설 및 변경사항을 붙임과 같이 알립니다.','외교사료팀',now());
update notice set hits=hit+1 where no=1;
drop table notice cascade;


create table users(
	no int auto_increment primary key,
    id varchar(50),
    pw varchar(2000),
    name varchar(100),
    email varchar(200),
    address varchar(1000),
    regdate datetime default now()
);
select * from users;
select * from users where id='admin'and pw='$2a$10$SSlNTZjvaaQG8VL1PYUXt.iDJ3Qd9g7nJz0ICkR1sxH.aDlRy3H3m';
update users set pw='$2a$10$SSlNTZjvaaQG8VL1PYUXt.iDJ3Qd9g7nJz0ICkR1sxH.aDlRy3H3m' where id='admin';
delete from users where id='test';
set sql_safe_updates=0;
drop table users cascade;
commit;
insert into users(id, pw, name, email, address, regdate) values('admin','$2a$10$SSlNTZjvaaQG8VL1PYUXt.iDJ3Qd9g7nJz0ICkR1sxH.aDlRy3H3m','관리자','admin@naver.com','경기도 고양시 일산동구 장항동 771', now());


create table qna (
	no int auto_increment primary key,
	title varchar(100),
    content varchar(2000),
    dept varchar(100),
    hits int default 0,
    regdate datetime default now(),
    grp int,
    step int default 0,
    indent int default 0
);
select * from qna;
select * from qna order by grp asc, indent asc, no asc;
drop table qna cascade;
select ifnull(max(grp),1) from qna;
update qna set grp=2 where no=4;
delete from qna where no=8;

insert into qna(title, content, dept, regdate, grp, step, indent) values('테스트3', '테스트3의 내용입니다.', '이하영', now(), (select ifnull(max(grp)+1, 1) from qna q), 0, 1);
insert into qna(title, content, dept, regdate, grp, step, indent) values('답변 테스트3', '답변 테스트3의 내용입니다.', '외교사료팀', now(), (select ifnull(max(grp), 1) from qna q), 1, 1);

create table data (
	uuid varchar(100) not null,
    uploadpath varchar(1000),
    filename varchar(300),
    filetype varchar(3) default "O",
    bno int
);
select * from data;