INSERT INTO spring_security.USER_PROFILE(type) VALUES ('USER');
  
INSERT INTO spring_security.USER_PROFILE(type) VALUES ('ADMIN');
  
INSERT INTO spring_security.USER_PROFILE(type) VALUES ('DBA');

INSERT INTO spring_security.APP_USER(sso_id, password, first_name, last_name, email) VALUES ('sam','$2a$10$4eqIF5s/ewJwHK1p8lqlFOEm2QIA0S8g6./Lok.pQxqcxaBZYChRm', 'Sam','Smith','samy@xyz.com');

INSERT INTO spring_security.APP_USER_USER_PROFILE (user_id, user_profile_id) SELECT user.id, profile.id FROM spring_security.APP_USER user, spring_security.USER_PROFILE profile where user.sso_id='sam' and profile.type='ADMIN';
