
CREATE TABLE authdb.xd_auth_user
(
    auus_uuid binary(16) PRIMARY KEY NOT NULL,
    auus_password varchar(255) NOT NULL,
    auus_username varchar(255) NOT NULL
);

-- ADMIN USER FOR TEST PURPOSES
INSERT INTO authdb.xd_auth_user (
    auus_uuid,
    auus_password,
    auus_username
  ) VALUES (
    0x40854590B34F4E369D68685298EF08ED,
    '$2a$10$tf9d7AMOxVXO5ihacDwP0e6Q23NYLipAnomd.CUObflH4oJen0oe.',
    'admin'
  );