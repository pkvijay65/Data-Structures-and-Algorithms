# Write your MySQL query statement below

# SELECT max(salary) as SecondHighestSalary
# from Employee
# where salary < (SELECT max(salary) from Employee)

SELECT IFNULL((select distinct salary from Employee order by salary desc limit 1 offset 1), NULL) as SecondHighestSalary