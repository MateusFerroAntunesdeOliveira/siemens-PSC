CREATE TABLE Students (
    ID INTEGER,
    Name TEXT,
    Value INTEGER
);

INSERT INTO Students (ID, Name, Value) VALUES
(1, 'Julia', 81),
(2, 'Carol', 68),
(3, 'Maria', 99),
(4, 'Andreia', 78),
(5, 'Jaqueline', 63),
(6, 'Marcela', 88);

CREATE TABLE Notes (
    Grade INTEGER,
    Min_Value INTEGER,
    Max_Value INTEGER
);

INSERT INTO Notes (Grade, Min_Value, Max_Value) VALUES
(1, 0, 9),
(2, 10, 19),
(3, 20, 29),
(4, 30, 39),
(5, 40, 49),
(6, 50, 59),
(7, 60, 69),
(8, 70, 79),
(9, 80, 89),
(10, 90, 100);

-- Query
SELECT
    CASE WHEN Notes.Grade >= 8 THEN Students.Name ELSE 'NULL' END AS Name,
    Notes.Grade,
    Students.Value
FROM Students
JOIN Notes ON Students.Value BETWEEN Notes.Min_Value AND Notes.Max_Value
ORDER BY
    -- Sort by Grade in descending order
    Notes.Grade DESC,
    -- If the score is between 8 and 10, sort by name
    CASE WHEN Notes.Grade BETWEEN 8 AND 10 THEN Students.Name END;
