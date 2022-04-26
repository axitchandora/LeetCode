# Write your MySQL query statement below
SELECT country_name,(CASE WHEN AVG(weather_state)<=15 THEN "Cold"
WHEN AVG(weather_state)>=25 THEN "Hot" ELSE "Warm" END)AS weather_type 
FROM Countries c INNER JOIN Weather w
ON c.country_id=w.country_id AND SUBSTRING(day,1,7)="2019-11"
GROUP BY c.country_name;
