--Problem URL : https://www.hackerrank.com/challenges/name-of-employees/problem
select name from Employee order by name asc;


--Problem URL : https://www.hackerrank.com/challenges/salary-of-employees/problem
select name from Employee where salary > 2000 and months < 10 order by employee_id;

--Problem URL : https://www.hackerrank.com/challenges/revising-aggregations-the-count-function/problem
select count(name) from city where population > 100000;