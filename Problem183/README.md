## 183. Customers Who Never Order

[`SQL Schema >`](../assets/Problem183.sql)
 
Suppose that a website contains two tables, the `Customers` table and the `Orders` table. Write a SQL query to find all customers who never order anything.

Table: `Customers`.

<pre>
+----+-------+
| Id | Name  |
+----+-------+
| 1  | Joe   |
| 2  | Henry |
| 3  | Sam   |
| 4  | Max   |
+----+-------+
</pre>

Table: `Orders`.

<pre>
+----+------------+
| Id | CustomerId |
+----+------------+
| 1  | 3          |
| 2  | 1          |
+----+------------+
</pre>

Using the above tables as example, return the following:

<pre>
+-----------+
| Customers |
+-----------+
| Henry     |
| Max       |
+-----------+
</pre>
