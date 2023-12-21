--Problem URL : https://www.hackerrank.com/challenges/name-of-employees/problem
select name from Employee order by name asc;

--Problem URL : https://www.hackerrank.com/challenges/salary-of-employees/problem
select name from Employee where salary > 2000 and months < 10 order by employee_id;

--Problem URL : https://www.hackerrank.com/challenges/revising-aggregations-the-count-function/problem
select count(name) from city where population > 100000;

--Problem URL : https://www.hackerrank.com/challenges/revising-aggregations-sum/problem
select sum(population) from city where district = 'California';

--Problem URL : https://www.hackerrank.com/challenges/revising-aggregations-the-average-function/problem
select avg(population) from city where district = 'California';

--Problem URL : https://www.hackerrank.com/challenges/average-population/problem
select round(avg(population)) from city;

--Problem URL : https://www.hackerrank.com/challenges/japan-population/problem
select sum(population) from city where COUNTRYCODE = 'JPN';

--Problem URL : https://www.hackerrank.com/challenges/population-density-difference/problem
select (max(population)-min(population)) Difference from city;

--Problem URL : https://www.hackerrank.com/challenges/the-blunder/problem
select ceil(avg(salary) - avg(replace(salary, '0', ''))) from employees;

--Problem URL : https://www.hackerrank.com/challenges/earnings-of-employees/problem
select months*salary, count(*) from employee group by months*salary order by months*salary desc limit 1;
