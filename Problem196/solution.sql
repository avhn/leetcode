DELETE b
FROM Person a INNER JOIN Person b
ON a.Id < b.Id AND a.Email = b.Email;
