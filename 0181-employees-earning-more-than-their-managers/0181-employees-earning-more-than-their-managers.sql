# Write your MySQL query statement below
select e.name as 'Employee' from Employee e join employee m on e.managerId=m.Id where e.salary>m.salary;