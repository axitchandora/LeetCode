# Write your MySQL query statement below
SELECT p.product_id, ROUND( SUM(units*price )/ SUM(units),2) AS average_price 
FROM Prices p JOIN UnitsSold u
ON p.product_id=u.product_id
AND purchase_date<=end_date AND purchase_date>=start_date 
GROUP BY p.product_id;
