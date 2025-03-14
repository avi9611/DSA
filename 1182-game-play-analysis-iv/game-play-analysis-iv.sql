# Write your MySQL query statement below
SELECT ROUND(COUNT(DISTINCT A1.player_id) / COUNT(DISTINCT A.player_id),2) AS fraction
FROM Activity A
LEFT JOIN Activity A1
ON A.player_id = A1.player_id
AND A1.event_date = DATE_ADD(A.event_date, INTERVAL 1 DAY)
WHERE A.event_date = (SELECT MIN(event_date) FROM Activity A2 WHERE A2.player_id = A.player_id);