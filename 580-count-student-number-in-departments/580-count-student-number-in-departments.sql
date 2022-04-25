# Write your MySQL query statement below
SELECT dept_name, COUNT(student_id) AS student_number
FROM Department d LEFT JOIN Student USING(dept_id)
GROUP BY dept_name
ORDER BY student_number DESC,dept_name;