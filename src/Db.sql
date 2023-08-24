CREATE TABLE questions(
    id INT NOT NULL AUTO_INCREMENT,
    question VARCHAR(100) NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO questions(id, question)
    VALUES(1, 'Сколько ног у собаки?',
    2, 'В каком году началась вторая мировая война?',
    3, 'Кто основатель компании Microsoft?');

CREATE TABLE answers_right(
    id INT NOT NULL AUTO_INCREMENT,
    answer_right INT NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO answers_right(id, answer_right)
VALUES (1, 3,
        2, 3,
        3, 1);

CREATE TABLE answers_incorrect(
        id INT NOT NULL AUTO_INCREMENT,
        answer_incorrect INT NOT NULL,
        PRIMARY KEY(id)
);

INSERT INTO answers_incorrect(id, answer_incorrect)
VALUES (1, 1,
        2, 2,
        3, 1,
        4, 2,
        4, 2,
        5, 3);
