INSERT INTO post(id, content) VALUES (1, 'Hej med dig')
INSERT INTO post(id, content) VALUES (2, 'Hej med dig')
INSERT INTO post(id, content) VALUES (3, 'Hej med dig')

INSERT INTO comment(id, content, fk_post_id) VALUES (1, 'Comment 1', 1)
INSERT INTO comment(id, content, fk_post_id) VALUES (2, 'Comment 2 i 1', 1)
INSERT INTO comment(id, content, fk_post_id) VALUES (3, 'Comment 3', 2)