with RankedSalaries as (
    select 
        e.id, e.name as Employee, e.salary, e.departmentId, d.name as Department,
        dense_rank() over (partition by e.departmentId order by e.salary desc) as salary_rank
        from Employee e
        join Department d on e.departmentId = d.id
)
select Department, Employee, salary as Salary
from RankedSalaries
where salary_rank <= 3;