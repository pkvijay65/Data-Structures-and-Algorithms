CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
SET N = N - 1;
  RETURN (
      # Write your MySQL query statement below.
      # SELECT DISTINCT salary from Employee order by salary desc limit 1 offset N
      
      select DISTINCT salary from Employee as e1 where N = (select count(DISTINCT salary) from Employee as e2 where e2.salary > e1.salary )
  );
END