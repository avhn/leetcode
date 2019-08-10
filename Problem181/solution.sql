SELECT a.Name
FROM Employee a INNER JOIN Employee b ON a.ManagerId = b.Id
WHERE a.Salary > b.Salary;
