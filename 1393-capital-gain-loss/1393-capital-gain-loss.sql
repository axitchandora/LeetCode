# Write your MySQL query statement below
SELECT stock_name, (SellingPrice - BuyingPrice)AS capital_gain_loss 
FROM(SELECT s1.stock_name, s1.SellingPrice, s2.BuyingPrice 
FROM(SELECT stock_name,SUM(price) AS SellingPrice
    FROM Stocks WHERE operation='Sell'
    GROUP BY stock_name, operation) AS s1
    INNER JOIN 
    (SELECT stock_name,SUM(price) AS BuyingPrice
    FROM Stocks WHERE operation='Buy'
    GROUP BY stock_name, operation) AS s2
    ON s1.stock_name=s2.stock_name
) AS T;