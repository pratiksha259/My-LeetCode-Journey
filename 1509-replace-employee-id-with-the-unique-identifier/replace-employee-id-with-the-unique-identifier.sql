# Write your MySQL query statement below
SELECT e.unique_id, em.name FROM Employees em
LEFT JOIN EmployeeUNI e
ON e.id=em.id OR e.unique_id is null;