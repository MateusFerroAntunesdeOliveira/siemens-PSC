CREATE TABLE IF NOT EXISTS dogs (
    id INTEGER NOT NULL PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS cats (
    id INTEGER NOT NULL PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);

INSERT INTO dogs (name) VALUES ('Caramelo');
INSERT INTO dogs (name) VALUES ('Bob');
INSERT INTO dogs (name) VALUES ('Mel');
INSERT INTO cats (name) VALUES ('Grafeno');
INSERT INTO cats (name) VALUES ('Tesla');
INSERT INTO cats (name) VALUES ('Ada');

SELECT DISTINCT name FROM (
    SELECT dogs.name FROM dogs
    UNION
    SELECT cats.name FROM cats
);
