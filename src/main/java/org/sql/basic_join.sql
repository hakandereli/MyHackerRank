-- problem url:https://www.hackerrank.com/challenges/african-cities/problem
SELECT City.Name
FROM City, Country
WHERE City.CountryCode = Country.Code AND Country.Continent  = 'Africa';