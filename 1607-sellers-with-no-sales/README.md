<h2><a href="https://leetcode.com/problems/sellers-with-no-sales/">1607. Sellers With No Sales</a></h2><h3>Easy</h3><hr><div class="sql-schema-wrapper__3VBi"><a class="sql-schema-link__3cEg">SQL Schema<svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__1Md2"><path fill-rule="evenodd" d="M10 6L8.59 7.41 13.17 12l-4.58 4.59L10 18l6-6z"></path></svg></a></div><div><p>Table: <code>Customer</code></p>

<pre>+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| customer_id   | int     |
| customer_name | varchar |
+---------------+---------+
customer_id is the primary key for this table.
Each row of this table contains the information of each customer in the WebStore.
</pre>

<p>&nbsp;</p>

<p>Table: <code>Orders</code></p>

<pre>+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| order_id      | int     |
| sale_date     | date    |
| order_cost    | int     |
| customer_id   | int     |
| seller_id     | int     |
+---------------+---------+
order_id is the primary key for this table.
Each row of this table contains all orders made in the webstore.
sale_date is the date when the transaction was made between the customer (customer_id) and the seller (seller_id).
</pre>

<p>&nbsp;</p>

<p>Table: <code>Seller</code></p>

<pre>+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| seller_id     | int     |
| seller_name   | varchar |
+---------------+---------+
seller_id is the primary key for this table.
Each row of this table contains the information of each seller.
</pre>

<p>&nbsp;</p>

<p>Write an SQL query to report the names of all sellers who did not make any sales in <code>2020</code>.</p>

<p>Return the result table ordered by <code>seller_name</code> in <strong>ascending order</strong>.</p>

<p>The query result format is in the following example.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> 
Customer table:
+--------------+---------------+
| customer_id  | customer_name |
+--------------+---------------+
| 101          | Alice         |
| 102          | Bob           |
| 103          | Charlie       |
+--------------+---------------+
Orders table:
+-------------+------------+--------------+-------------+-------------+
| order_id    | sale_date  | order_cost   | customer_id | seller_id   |
+-------------+------------+--------------+-------------+-------------+
| 1           | 2020-03-01 | 1500         | 101         | 1           |
| 2           | 2020-05-25 | 2400         | 102         | 2           |
| 3           | 2019-05-25 | 800          | 101         | 3           |
| 4           | 2020-09-13 | 1000         | 103         | 2           |
| 5           | 2019-02-11 | 700          | 101         | 2           |
+-------------+------------+--------------+-------------+-------------+
Seller table:
+-------------+-------------+
| seller_id   | seller_name |
+-------------+-------------+
| 1           | Daniel      |
| 2           | Elizabeth   |
| 3           | Frank       |
+-------------+-------------+
<strong>Output:</strong> 
+-------------+
| seller_name |
+-------------+
| Frank       |
+-------------+
<strong>Explanation:</strong> 
Daniel made 1 sale in March 2020.
Elizabeth made 2 sales in 2020 and 1 sale in 2019.
Frank made 1 sale in 2019 but no sales in 2020.
</pre>
</div>