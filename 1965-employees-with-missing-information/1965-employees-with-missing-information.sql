# Write your MySQL query statement below
SELECT employee_id FROM(
    SELECT employee_id FROM Employees 
    WHERE employee_id NOT IN (SELECT employee_id FROM Salaries)    
    UNION    
    SELECT employee_id FROM Salaries 
    WHERE employee_id NOT IN (SELECT employee_id FROM Employees))
AS T
ORDER BY employee_id;