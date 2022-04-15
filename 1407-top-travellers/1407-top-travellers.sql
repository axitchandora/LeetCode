# Write your MySQL query statement below
SELECT name, IFNULL(SUM(distance),0) AS travelled_distance
FROM Users u LEFT JOIN Rides r
ON u.id=r.user_id
GROUP BY name
ORDER BY travelled_distance DESC,name;