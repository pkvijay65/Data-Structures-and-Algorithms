# Write your MySQL query statement below
SELECT firstName, lastName, city, state
from person left join Address on person.personID = Address.personID;