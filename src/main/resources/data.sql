INSERT INTO years (id_year, creation_year) values (default, 2022),
(default, 1972),
(default, 1993);

INSERT INTO genres (id_genre, genre_name) values (default, 'thriller'),
(default, 'action_film'),
(default, 'superheroes'),
(default, 'drama'),
(default, 'crime');

INSERT INTO movies (id_movie, title, description, running_time, year_id) VALUES (default, 'The Batman', 'In his second year of fighting crime, Batman explores the corruption that plagues Gotham City and how it may tie to his own family, in addition to coming into conflict with a serial killer known as the Riddler.', 175, 1),
(default, 'The Godfather', 'Epic tale of a 1940s New York Mafia family and their struggle to protect their empire from rival families as the leadership switches from the father (Marlon Brando) to his youngest son (Al Pacino).', 175, 2),
(default, 'Schindlers List', 'Oskar Schindler is a German businessman in Poland who sees an opportunity to make money from the Nazis rise to power.', 195, 3);

INSERT INTO genres_movies (movie_id, genre_id) VALUES (1, 1),
(1, 2),
(1, 3),
(1, 4),
(2, 4),
(2, 5),
(3, 5);