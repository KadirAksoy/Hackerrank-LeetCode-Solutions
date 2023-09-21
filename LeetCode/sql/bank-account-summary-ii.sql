# Write your MySQL query statement below


select users.name, sum(transactions.amount)  as balance from users join transactions on
transactions.account = users.account
group by users.name
having balance > 10000
