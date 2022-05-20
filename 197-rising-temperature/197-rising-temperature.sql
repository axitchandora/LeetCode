# Write your MySQL query statement below
SELECT w1.id AS Id FROM
weather w1 JOIN weather w2 
WHERE DATEDIFF(w1.recordDate, w2.recordDate) = 1
AND w1.temperature > w2.temperature;