create database GYM
on primary (
name=GYM,
filename='C:\Program Files\Microsoft SQL Server\MSSQL14.MSSQLSERVER\MSSQL\DATA\GYM.mdf',
size =10mb,
filegrowth=5mb,
maxsize=unlimited 
)
log on(
name=GYM_log,
filename='C:\Program Files\Microsoft SQL Server\MSSQL14.MSSQLSERVER\MSSQL\DATA\GYM_log.ldf',
size=5mb,
filegrowth=2mb,
maxsize =unlimited
)
create table coaches (
ID int primary key identity(1,1),
username nvarchar(50),
[password] nvarchar(50),
fname nvarchar(50),
lname nvarchar(50)
)
create table users (
ID int primary key identity(1,1),
username nvarchar(50),
[password] nvarchar(50),
coach_id int references coaches(ID) on update cascade  on delete set null,
fname nvarchar(50),
lname nvarchar(50),
end_of_subscribtion date
)
create table schedule (
[user_id] int references users(ID) on update cascade on delete cascade,
[day] nvarchar(50)
primary key([user_id],[day])
)
select * from users
Alter table users 
add billing int 