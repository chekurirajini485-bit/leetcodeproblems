/* Write your PL/SQL query statement below */
SELECT E1.NAME AS EMPLOYEE
FROM EMPLOYEE E1
JOIN EMPLOYEE E2 ON E1.MANAGERID=E2.ID
 WHERE E1.SALARY>E2.SALARY;
-- SELECT e1.name AS Employee
-- FROM Employee e1
-- JOIN Employee e2 ON e1.managerId = e2.id
-- WHERE e1.salary > e2.salary;