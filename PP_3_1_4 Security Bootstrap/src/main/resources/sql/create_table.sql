CREATE TABLE IF NOT EXISTS users
(
    `id`
    BIGINT
    NOT
    NULL
    AUTO_INCREMENT,
    `name`
    VARCHAR
(
    45
) NOT NULL,
    `surname` VARCHAR
(
    45
) NOT NULL,
    `age` INT NOT NULL,
    `email` VARCHAR
(
    45
) NOT NULL,
    `login` VARCHAR
(
    45
) NOT NULL,
    `password` VARCHAR
(
    100
) NOT NULL,
    PRIMARY KEY
(
    `id`
),
    UNIQUE INDEX `login_UNIQUE`
(
    `login` ASC
) VISIBLE);

CREATE TABLE IF NOT EXISTS roles
(
    id
    bigint
    auto_increment,
    role
    varchar
(
    25
) not null,
    primary key
(
    id
)
    );

create table users_roles
(
    user_id bigint not null,
    role_id bigint null,
    constraint users_roles_pk
        unique (role_id, user_id),
    constraint users_roles_roles_id_fk
        foreign key (role_id) references roles (id),
    constraint users_roles_users_id_fk
        foreign key (user_id) references users (id)
);
