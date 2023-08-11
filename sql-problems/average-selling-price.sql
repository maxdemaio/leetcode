# Write your MySQL query statement below
# We left join the prices on units sold on the product IDs but only where the purchase date
# is in the start/end date range
# with this, we have all the info we need


select x.product_id, round(sum(x.p_cost) / sum(x.units), 2) as average_price from
(SELECT 
  u.product_id, u.purchase_date, u.units, p.price, (u.units * p.price) as p_cost
  FROM UnitsSold u
  LEFT JOIN Prices p ON u.product_id = p.product_id
    AND u.purchase_date BETWEEN p.start_date AND p.end_date
) as x group by product_id;

