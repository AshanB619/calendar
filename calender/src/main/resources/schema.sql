CREATE TABLE IF NOT EXISTS Content (
    id INTEGER AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    desc TEXT,
    status VARCHAR(20) NOT NULL,
    date_created TIMESTAMP NOT NULL,
    url VARCHAR(255),
    PRIMARY KEY (id)
    );

INSERT INTO Content(title,desc,status,date_created)
VALUES ('hello ashan','hi nuwandi','IDEA',CURRENT_TIMESTAMP());