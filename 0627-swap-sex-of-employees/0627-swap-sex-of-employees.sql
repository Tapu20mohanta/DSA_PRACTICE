# Write your MySQL query statement below
update Salary set sex=char(ascii(sex)^ascii('f')^ascii('m'));