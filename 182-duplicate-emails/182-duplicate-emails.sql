# Write your MySQL query statement below
SELECT email FROM person
GROUP By email
HAVING COUNT(email)>1;