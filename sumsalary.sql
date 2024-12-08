Q2 : write SQL query for getting the total amount of the month for seller ,
 seller has id,name , 
product has id, seller id, cost,order has seller id and product id

SQL query to calculate the total monthly amount for each seller.


SELECT 
    s.seller_id,
    s.name AS seller_name,
    SUM(p.cost) AS total_monthly_amount
FROM 
    seller s
JOIN 
    product p ON s.seller_id = p.seller_id
JOIN 
    orders o ON p.product_id = o.product_id
WHERE 
    EXTRACT(MONTH FROM o.order_date) = EXTRACT(MONTH FROM CURRENT_DATE)
    AND EXTRACT(YEAR FROM o.order_date) = EXTRACT(YEAR FROM CURRENT_DATE)
GROUP BY 
    s.seller_id, s.name;
