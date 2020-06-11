CREATE TABLE IF NOT EXISTS EMPLOYEE(ID NUMBER NOT NULL,PARENTID NUMBER,NAME VARCHAR2(100) NOT NULL,COLOR VARCHAR2(100) NOT NULL);

ALTER TABLE EMPLOYEE
ADD FOREIGN KEY (PARENTID) REFERENCES EMPLOYEE(ID);


insert into EMPLOYEE values(0,null,'ceo','red');
insert into EMPLOYEE values(1,0,'Warrior','red');
insert into EMPLOYEE values(2,0,'Wizard','green');
insert into EMPLOYEE values(3,0,'Priest','white');
insert into EMPLOYEE values(4,0,'Rogue','yellow');
insert into EMPLOYEE values(5,1,'Fighter','blue');
insert into EMPLOYEE values(6,1,'Paladin','lightblue');
insert into EMPLOYEE values(7,1,'Ranger','lightgreen');
insert into EMPLOYEE values(8,2,'Mage','grey');
insert into EMPLOYEE values(9,2,'Specialist wizard','lightgrey');
insert into EMPLOYEE values(10,3,'Cleric','red');
insert into EMPLOYEE values(11,3,'Druid','green');
insert into EMPLOYEE values(12,3,'Priest of specific mythos','white');
insert into EMPLOYEE values(13,4,'Thief','yellow');
insert into EMPLOYEE values(14,4,'Bard','blue');
insert into EMPLOYEE values(15,13,'Assassin','lightblue');