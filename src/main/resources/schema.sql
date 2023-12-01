DROP TABLE IF EXISTS FILMS;
CREATE TABLE FILMS
(
    film_id    INT AUTO_INCREMENT PRIMARY KEY,
    episode_id INT,
    title VARCHAR(100),
    release_date DATE
)