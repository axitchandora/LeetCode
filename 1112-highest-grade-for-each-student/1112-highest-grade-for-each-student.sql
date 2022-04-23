# Write your MySQL query statement below
SELECT student_id, MIN(course_id) AS course_id,grade FROM Enrollments
WHERE (student_id,grade) IN
(SELECT DISTINCT student_id, max(grade) 
 FROM Enrollments GROUP BY student_id)
GROUP BY student_id
ORDER BY student_id;