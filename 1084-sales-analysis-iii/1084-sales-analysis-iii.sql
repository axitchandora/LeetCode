# Write your MySQL query statement below
SELECT p.product_id, p.product_name
FROM Product p
WHERE product_id NOT IN(
    SELECT product_id FROM sales
    WHERE sale_date <'2019-01-01' OR sale_date >'2019-03-31'
) AND product_id IN(SELECT product_id FROM sales);
