SELECT * FROM app_user
JOIN study_set
ON app_user.user_id = study_set.owner_id 
WHERE study_set.owner_id = 5;