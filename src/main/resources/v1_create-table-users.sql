CREATE TABLE users(
    id text PRIMARY KEY UNIQUE NOT NULL,
    login TEXT NOT NULL UNIQUE,
    password TEXT NOT NULL,
    rola TEXT NOT NULL
);