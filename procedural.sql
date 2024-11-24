SELECT 
    CustomerID, 
    OrderAmount, 
    CASE 
        WHEN OrderAmount > 1000 THEN 'High-Value Customer'
        WHEN OrderAmount BETWEEN 500 AND 1000 THEN 'Medium-Value Customer'
        ELSE 'Low-Value Customer'
    END AS CustomerCategory
FROM Orders;