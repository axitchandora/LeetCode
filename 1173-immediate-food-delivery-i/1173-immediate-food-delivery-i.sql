# Write your MySQL query statement below
SELECT ROUND (COUNT(*)*100/(SELECT COUNT(*)FROM Delivery),2) AS immediate_percentage
FROM Delivery
WHERE order_date=customer_pref_delivery_date;