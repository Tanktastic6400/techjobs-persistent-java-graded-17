--Part 1
SELECT COLUMN_NAME, DATA_TYPE FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA = 'techjobs' AND TABLE_NAME = 'job';
--Part 2
SELECT name From employer WHERE location = "St. Louis City";
--Part 3
Drop Table job;
--Part 4

SELECT *
FROM skill
LEFT JOIN job_skills ON skill.id = job_skills.skills_id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;


--SELECT * FROM skill
--(LEFT|INNER) JOIN job_skills ON (skill.id = job_skills.skills_id|job_skills.skills_id = skill.id) (WHERE job_skills.jobs_id IS NOT NULL) ORDER BY name ASC;