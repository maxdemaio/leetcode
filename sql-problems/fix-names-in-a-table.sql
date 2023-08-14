select user_id, concat(upper(substring(name,1,1)),
        lower(substring(name, 2, length(name)-1))) as name from users where name is not null;

