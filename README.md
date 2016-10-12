## crawlr

[![Build Status](https://travis-ci.org/fabiano/crawlr.svg?branch=master)](https://travis-ci.org/fabiano/crawlr)
[![Dependencies Status](https://jarkeeper.com/fabiano/crawlr/status.svg)](https://jarkeeper.com/fabiano/crawlr)

Simple crawler to extract product data from Americanas, Casas Bahia, Extra, Magazine Luiza, Ponto Frio, and Submarino websites.

### Playing

Use the command `lein try <url>` to play with the crawler. You should pass a category page as argument: `lein try http://www.americanas.com.br/linha/351258/games/jogos-xbox-one`.

### Running the application

#### Dependencies

Postgres 9.5.

#### Create the database

`psql -U postgres -c "create role crawlr with createdb login password 'crawlr'"`

`psql -U postgres -c "create database crawlr owner crawlr encoding = 'UTF-8'"`

`lein migrate-up`

#### Start the worker

Just type `lein worker pages.examples.txt`.
