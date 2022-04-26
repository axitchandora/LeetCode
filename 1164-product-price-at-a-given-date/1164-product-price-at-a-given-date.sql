# Write your MySQL query statement below
SELECT DISTINCT p1.product_id, IFNULL(p2.new_price,10) AS price
FROM Products AS p1 LEFT JOIN 
(SELECT *  FROM Products 
 WHERE (product_id,change_date) 
 IN (SELECT product_id,MAX(change_date) FROM products 
     WHERE change_date<="2019-08-16" GROUP BY product_id)) AS p2
 ON p1.product_id=p2.product_id;
