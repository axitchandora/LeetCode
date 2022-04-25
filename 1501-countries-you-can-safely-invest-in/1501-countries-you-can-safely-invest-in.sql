# Write your MySQL query statement below
SELECT c.name AS country FROM Person p 
JOIN Country c
ON SUBSTRING(p.phone_number,1,3)=c.country_code
JOIN Calls ca ON p.id=ca.caller_id OR p.id=ca.callee_id
GROUP BY c.name
HAVING AVG(duration) > (SELECT AVG(duration) FROM calls);