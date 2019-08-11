## 197. Rising Temperature

[`SQL Schema >`](../../assets/197.sql)

Given a `Weather` table, write a SQL query to find all dates' Ids with higher temperature compared to its previous (yesterday's) dates.
<pre>
+---------+------------------+------------------+
| Id(INT) | RecordDate(DATE) | Temperature(INT) |
+---------+------------------+------------------+
|       1 |       2015-01-01 |               10 |
|       2 |       2015-01-02 |               25 |
|       3 |       2015-01-03 |               20 |
|       4 |       2015-01-04 |               30 |
+---------+------------------+------------------+
</pre>

For example, return the following Ids for the above Weather table:
<pre>
+----+
| Id |
+----+
|  2 |
|  4 |
+----+
</pre>
