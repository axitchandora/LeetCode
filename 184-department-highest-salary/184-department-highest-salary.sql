# Write your MySQL query statement below
SELECT d.name AS Department, e.name AS Employee, e.salary AS Salary
FROM Employee e LEFT JOIN Department d
ON d.id=e.departmentId
WHERE (e.departmentId, e.salary) in 
(SELECT e2.departmentId, MAX(e2.salary) FROM Employee e2 GROUP By e2.departmentId);
