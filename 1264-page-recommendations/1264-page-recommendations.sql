# Write your MySQL query statement below
SELECT DISTINCT page_id AS recommended_page FROM Likes
WHERE user_id IN (SELECT user1_id FROM Friendship WHERE user2_id=1
                 UNION
                 SELECT user2_id  FROM Friendship WHERE user1_id=1)
                AND page_id  NOT IN
                (SELECT page_id  FROM Likes WHERE user_id=1
                ) ;