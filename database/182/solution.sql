SELECT DISTINCT a.Email Email
FROM Person a INNER JOIN Person b
ON a.Email = b.Email AND a.Id != b.Id;
