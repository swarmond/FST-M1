-- Activity 1: Creating a table called SALESMAN
CREATE TABLE SALESMAN (salesman_id int PRIMARY KEY, salesman_name varchar(20), salesman_city varchar(30), commission int);
DESCRIBE SALESMAN;

-- Activity 2: Inserting data into the table SALESMAN
INSERT INTO SALESMAN VALUES (5001, 'James Hoog', 'New York', 15);
INSERT INTO SALESMAN VALUES (5002, 'Nail Knite', 'Paris', 13);
INSERT INTO SALESMAN VALUES (5005, 'Pit Alex', 'London', 11);
INSERT INTO SALESMAN VALUES (5006, 'McLyon', 'Paris', 14);
INSERT INTO SALESMAN VALUES (5007, 'Paul Adam', 'Rome', 13);
INSERT INTO SALESMAN VALUES (5003, 'Lauson Hen', 'San Jose', 12);
Select 1 from DUAL;
SELECT * FROM SALESMAN;

-- Activity 3: Display data from Salesman table
-- Show data from the salesman_id and salesman_city columns
Select salesman_id, salesman_city from Salesman;
-- Show data of salesman from Paris
Select * from Salesman where salesman_city = 'Paris';
-- Show salesman_id and commission of Paul Adam
Select salesman_id, commission from Salesman where salesman_name = 'Paul Adam';

-- Activity 4: Modifying the salesman table.
-- Add a new column - grade - to the salesman table. The grade will be integer values.
ALTER TABLE salesman ADD (grade int);
-- Set the value in the grade column for everyone to 100.
UPDATE salesman SET grade = 100;
-- Use SELECT command to display the results.
SELECT * FROM salesman;

-- Activity 5: Updating the data in the salesman table.
-- Update the grade score of salesmen from Rome to 200.
UPDATE salesman SET grade = 200 WHERE salesman_city = 'Rome';
SELECT * FROM salesman;
-- Update the grade score of James Hoog to 300.
UPDATE salesman SET grade = 300 WHERE salesman_name = 'James Hoog';
SELECT * FROM salesman;
-- Update the name McLyon to Pierre.
UPDATE salesman SET salesman_name = 'Pierre' WHERE salesman_name = 'McLyon';
SELECT * FROM salesman;