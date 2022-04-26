# Write your MySQL query statement below
SELECT p.player_id, p.player_name, SUM(p.player_id=Wimbledon)+SUM(p.player_id=Fr_open)+SUM(p.player_id=US_open)+SUM(p.player_id=Au_open) AS grand_slams_count
FROM Players p JOIN Championships c
ON p.player_id=c.Wimbledon or p.player_id=c.Fr_open or p.player_id=c.US_open or p.player_id=c.Au_open
GROUP BY p.player_id