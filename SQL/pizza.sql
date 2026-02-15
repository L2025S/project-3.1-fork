CREATE TABLE pizza
(
    id      SERIAL PRIMARY KEY,
    name    VARCHAR(255) NOT NULL,
    topping VARCHAR(255) NOT NULL,
    cheese  VARCHAR(255) NOT NULL,
    price   INT          NOT NULL CHECK (price >= 0)
);
