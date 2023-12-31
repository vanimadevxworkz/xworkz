CREATE DATABASE BOOKS;

USE BOOKS;

CREATE TABLE BOOK_INFO(
BOOKID INT PRIMARY KEY,
BOOKNAME VARCHAR(50),
BOOKCOST INT,
PUBLISHER VARCHAR(50),
AUTHOR VARCHAR(30),
YEAR INT
);

INSERT INTO BOOK_INFO VALUES(1,'RAMAYNA',250,'XXX','VALMIKI',2000),
(2,'ROMIYO JULIYET',200,'YYY','VILIUM SHAKESHPERE',2009),
(3,'MAHABHARAT',500,'ZZZ','VEDAVYASHI',2011),
(4,'WINGS OF FIRE',300,'AURN TIWARI','APJ',2010),
(5,'X-WORKZ',250,'XwWORKZ','AOMKVH',2016);


SELECT * FROM BOOK_INFO;

SELECT BOOKID,BOOKNAME,BOOKCOST FROM BOOK_INFO;

SELECT * FROM BOOK_INFO WHERE PUBLISHER='XwWORKZ';

SELECT * FROM BOOK_INFO WHERE AUTHOR LIKE 'SHI';

SELECT *FROM BOOK_INFO WHERE YEAR=2010;

SELECT * FROM BOOK_INFO WHERE AUTHOR LIKE '___%DA';

SELECT *FROM BOOK_INFO WHERE YEAR BETWEEN 2000 AND 2011;

SELECT *FROM BOOK_INFO ORDER BY YEAR DESC;

SELECT *FROM BOOK_INFO ORDER BY YEAR ASC;

SELECT *FROM BOOK_INFO ORDER BY PUBLISHER ='SHI' ASC;

SELECT *FROM BOOK_INFO ORDER BY PUBLISHER  ASC;

SELECT *FROM BOOK_INFO WHERE AUTHOR LIKE '__%R';




