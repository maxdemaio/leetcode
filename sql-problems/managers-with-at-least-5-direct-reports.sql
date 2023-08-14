SELECT e1.name FROM employee AS e1

RIGHT JOIN 

(
  SELECT *, COUNT(e.managerId) AS value_count
    FROM employee e
    GROUP BY managerId
    HAVING value_count >= 5
) 
e2 on e2.managerID = e1.id 
WHERE e1.name is not null;

