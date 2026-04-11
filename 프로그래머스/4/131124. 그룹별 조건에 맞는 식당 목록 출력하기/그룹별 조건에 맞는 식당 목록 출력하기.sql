-- 코드를 입력하세요
SELECT MP.MEMBER_NAME, RR.REVIEW_TEXT, DATE_FORMAT(RR.REVIEW_DATE, '%Y-%m-%d') AS REVIEW_DATE
FROM MEMBER_PROFILE MP
JOIN REST_REVIEW RR ON MP.MEMBER_ID = RR.MEMBER_ID
WHERE MP.MEMBER_ID IN (
                      SELECT MEMBER_ID
                      FROM (
                            SELECT MEMBER_ID, DENSE_RANK() OVER (ORDER BY COUNT(*) DESC) AS RNK
                            FROM REST_REVIEW
                            GROUP BY MEMBER_ID
                           ) AS RANK_REVIEW
                      WHERE RNK = 1
                      )
ORDER BY RR.REVIEW_DATE ASC, RR.REVIEW_TEXT ASC;