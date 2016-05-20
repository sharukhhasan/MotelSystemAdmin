# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table day (
  day_date                  timestamp not null,
  number_of_rooms           integer,
  revenue_amount            float,
  supply_orders             integer,
  constraint pk_day primary key (day_date))
;

create table email_activation (
  id                        bigserial not null,
  email                     varchar(255),
  token                     varchar(255),
  used                      boolean,
  constraint pk_email_activation primary key (id))
;

create table guests (
  id                        bigserial not null,
  first_name                varchar(255),
  last_name                 varchar(255),
  gender                    varchar(255),
  plate_number              varchar(255),
  birthdate                 timestamp,
  constraint pk_guests primary key (id))
;

create table month (
  month_value               varchar(255) not null,
  monthly_revenue           float,
  monthly_rooms             integer,
  monthly_supply_orders     integer,
  monthly_revenue_difference float,
  constraint pk_month primary key (month_value))
;

create table password_resets (
  id                        bigserial not null,
  email                     varchar(255),
  token                     varchar(255),
  used                      boolean,
  constraint pk_password_resets primary key (id))
;

create table supplies (
  id                        bigserial not null,
  supply_name              varchar(255),
  supply_quantity          integer,
  supply_price             float,
  supply_restock            boolean,
  constraint pk_supplies primary key (id))
;

create table users (
  id                        bigserial not null,
  email                     varchar(255),
  first_name                varchar(255),
  last_name                 varchar(255),
  gender                    varchar(255),
  role                      varchar(255),
  birth_date                timestamp,
  password                  varchar(255),
  activated                 boolean,
  confirm_role              boolean,
  constraint pk_users primary key (id))
;

create table week (
  week_date                 timestamp not null,
  weekly_of_revenue         float,
  weekly_rooms              integer,
  weekly_supply_orders      integer,
  weekly_revenue_difference float,
  constraint pk_week primary key (week_date))
;

# --- !Downs

drop table if exists email_activation cascade;

drop table if exists guests cascade;

drop table if exists month cascade;

drop table if exists password_resets cascade;

drop table if exists supplies cascade;

drop table if exists users cascade;

drop table if exists day cascade;

drop table if exists week cascade;

