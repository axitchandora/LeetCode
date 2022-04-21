# Write your MySQL query statement below
SELECT sale_date, SUM(sold_num*IF(fruit='oranges',-1,1))AS diff
FROM Sales
GROUP BY sale_date;