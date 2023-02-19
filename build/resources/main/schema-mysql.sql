USE `artgallery-db`;

create table if not exists paintings (
                                       id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
                                       painting_id VARCHAR(36),
    title VARCHAR(100),
    year INTEGER
);
