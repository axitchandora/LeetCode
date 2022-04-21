# Write your MySQL query statement below
SELECT sale_date, SUM(sold_num* CASE WHEN fruit='oranges' THEN -1 ELSE 1 END) AS diff
FROM Sales
GROUP BY sale_date;