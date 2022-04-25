# Write your MySQL query statement below
SELECT e.employee_id,team_size 
FROM Employee e LEFT JOIN (
SELECT team_id, COUNT(team_id) AS team_size
FROM Employee
GROUP BY team_id) AS teams
ON e.team_id=teams.team_id;