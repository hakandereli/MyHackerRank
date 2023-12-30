-- problem url:https://www.hackerrank.com/challenges/african-cities/problem
SELECT City.Name
FROM City, Country
WHERE City.CountryCode = Country.Code AND Country.Continent  = 'Africa';

-- problem url:hackerrank.com/challenges/average-population-of-each-continent/problem
select Country.Continent , FLOOR(AVG(City.Population))
FROM City, Country
WHERE City.CountryCode = Country.Code
GROUP BY Country.Continent;
