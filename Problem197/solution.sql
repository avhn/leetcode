SELECT b.Id FROM Weather a INNER JOIN Weather b
ON a.RecordDate = (b.RecordDate - INTERVAL 1 DAY) AND a.Temperature < b.Temperature;
