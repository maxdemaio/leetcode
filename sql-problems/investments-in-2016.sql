# MySQL
SELECT ROUND(SUM(tiv_2016), 2) AS tiv_2016
FROM Insurance
# get only tiv_2015 duplicates
WHERE tiv_2015 IN (
  SELECT tiv_2015
  FROM Insurance
  GROUP BY tiv_2015
  HAVING COUNT(*) > 1
)
# unique lat/lon values
AND (lat, lon) IN (
  SELECT lat, lon
  FROM Insurance
  GROUP BY lat, lon
  HAVING COUNT(*) = 1
)

# Manpreet
select round(sum(tiv_2016),2)  as tiv_2016
from insurance
where pid in (
  # unique location pid
  select pid
  from insurance
  where pid not in (
    select distinct i1.pid
    from insurance i1, insurance i2
    where i1.lat = i2.lat and i1.lon = i2.lon and i1.pid != i2.pid
  )
  # and non unique tiv_2015
  intersect
  select i1.pid
  from insurance i1, insurance i2
  where i1.pid != i2.pid and i1.tiv_2015 = i2.tiv_2015
)
