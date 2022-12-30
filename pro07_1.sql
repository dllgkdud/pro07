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
drop table users;

insert into notice values('admin','1234','관리자','admin@naver.com','경기도 고양시 일산동구 장항동 771',now());