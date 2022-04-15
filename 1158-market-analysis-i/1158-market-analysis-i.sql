# Write your MySQL query statement below
SELECT U.user_id AS buyer_id, U.join_date, IFNULL(USERS_ORDERED_IN_2019.orders_in_2019, 0) AS orders_in_2019 FROM Users U
LEFT JOIN (SELECT U.user_id AS user_id, COUNT(O.item_id) AS orders_in_2019 FROM Users U
LEFT JOIN Orders O ON O.buyer_id = U.user_id
WHERE YEAR(O.order_date) = 2019
GROUP BY U.user_id) AS USERS_ORDERED_IN_2019
ON U.user_id = USERS_ORDERED_IN_2019.user_id;