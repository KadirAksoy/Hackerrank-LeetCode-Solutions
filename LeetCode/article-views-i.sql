# Write your MySQL query statement below

select Distinct viewer_id as id from Views where author_id = viewer_id
order by id asc