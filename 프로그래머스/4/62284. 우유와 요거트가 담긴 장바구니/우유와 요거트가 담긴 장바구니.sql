-- 코드를 입력하세요
SELECT DISTINCT CP1.CART_ID
FROM CART_PRODUCTS CP1
WHERE CP1.NAME = 'Milk'
AND EXISTS (
                SELECT 1
                FROM CART_PRODUCTS CP2
                WHERE CP1.CART_ID = CP2.CART_ID
                AND CP2.NAME = 'Yogurt'
            );
