# Using DATE_FORMAT
SELECT DISTINCT user_id,MAX(time_stamp) AS last_stamp FROM Logins
WHERE DATE_FORMAT(time_stamp,"%Y")=2020
GROUP BY user_id;