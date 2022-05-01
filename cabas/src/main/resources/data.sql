

INSERT INTO area (name, area_no) VALUES ('North', '04');
INSERT INTO area (name, area_no) VALUES ('Center', '03');
INSERT INTO area (name, area_no) VALUES ('South', '08');

INSERT INTO CITY (name, area_id) VALUES ('Haifa', 1);
INSERT INTO CITY (name, area_id) VALUES ('Hadera', 1);
INSERT INTO CITY (name, area_id) VALUES ('Tel Aviv', 2);
INSERT INTO CITY (name, area_id) VALUES ('Holon', 2);
INSERT INTO CITY (name, area_id) VALUES ('Ramat Gan', 2);
INSERT INTO CITY (name, area_id) VALUES ('Bat Yam', 2);
INSERT INTO CITY (name, area_id) VALUES ('Be''er Sheva', 3);
INSERT INTO CITY (name, area_id) VALUES ('Eilat', 3);

INSERT INTO CITIZEN (first_name, last_name, phone, guardian_id ,city_id) VALUES ('Ben', 'Diamand', '052-3669047', 14, 4);
INSERT INTO CITIZEN (first_name, last_name, phone, guardian_id ,city_id) VALUES ('Maayan', 'Diamand', '052-1111111', null, 4);
INSERT INTO CITIZEN (first_name, last_name, phone, guardian_id ,city_id) VALUES ('Ron', 'Yalensky', '054-6595666', null, 3);
INSERT INTO CITIZEN (first_name, last_name, phone, guardian_id ,city_id) VALUES ('Ori', 'Peled', '054-3211232', null, 3);
INSERT INTO CITIZEN (first_name, last_name, phone, guardian_id ,city_id) VALUES ('Yoni', 'Avital', '054-3432323', null, 2);
INSERT INTO CITIZEN (first_name, last_name, phone, guardian_id ,city_id) VALUES ('Dror', 'Bauer', '054-9876677', null, 7);
INSERT INTO CITIZEN (first_name, last_name, phone, guardian_id ,city_id) VALUES ('Itamar', 'Maya', '054-3434554', null, 3);
INSERT INTO CITIZEN (first_name, last_name, phone, guardian_id ,city_id) VALUES ('Ilan', 'Avital', '054-1233211', null, 2);
INSERT INTO CITIZEN (first_name, last_name, phone, guardian_id ,city_id) VALUES ('Harel', 'Man', '054-2233444', null, 7);
INSERT INTO CITIZEN (first_name, last_name, phone, guardian_id ,city_id) VALUES ('Tzila', 'Raanan', '054-3434334', null, 3);
INSERT INTO CITIZEN (first_name, last_name, phone, guardian_id ,city_id) VALUES ('Yaniv', 'Dar', '052-4725333', null, 2);
INSERT INTO CITIZEN (first_name, last_name, phone, guardian_id ,city_id) VALUES ('Harel', 'Noaa', '054-9997744', null, 7);