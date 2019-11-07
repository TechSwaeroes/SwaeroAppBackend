DROP TABLE IF EXISTS swearotbl;
create table swearotbl(
   id int primary key,
   full_name varchar(255) not null,
   father_name varchar(255) not null,
   school_studied varchar(255) not null,
   year_of_joining_swr integer not null,
   qualifation varchar(255) not null,
   workplace varchar(255) not null,
   designation varchar(255) not null,
   blood_group varchar(255) not null,
   marital_status varchar(255) not null
);