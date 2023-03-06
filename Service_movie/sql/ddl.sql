drop table Item;
create table Item(
    id int primary key,
    name varchar UNIQUE
);

drop table Movie;
create table Movie(
    id int,
    name varchar,
    rating float,
    total numeric(10, 1),
    genre varchar,
    releaseDate date,
    director varchar,
    actor varchar,
    info varchar,
    foreign key (id, name) REFERENCES Item(id, name)
);

drop table Reserve;
create table Reserve(
    id int,
    name varchar,
    time date,
    theater varchar,
    type varchar,
    price int,
    totalSeat int,
    leftSeat int,
    seatHorizontal varchar,
    seatVertical varchar,
    headcount int,
    foreign key (id, name) REFERENCES Item(id, name)
)