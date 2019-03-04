# Yildiz-Engine module-database-pool-c3p0.

This is the official repository of the Database Connection Pool C3P0 Module, part of the Yildiz-Engine project.
The C3P0 pool module is a component meant to provide database connection using C3P0 as implementation.

## Features

* C3P0 pooling support.
* ...

## Requirements

To build this module, you will need the latest java JDK and Maven.

## Coding Style and other information

Project website:
https://engine.yildiz-games.be

Issue tracker:
https://yildiz.atlassian.net

Wiki:
https://yildiz.atlassian.net/wiki

Quality report:
https://sonarcloud.io/dashboard/index/be.yildiz-games:module-database-pool-c3p0

## License

All source code files are licensed under the permissive MIT license
(http://opensource.org/licenses/MIT) unless marked differently in a particular folder/file.

## Build instructions

Go to your root directory, where you POM file is located.

Then invoke maven

	mvn clean install

This will compile the source code, then run the unit tests, and finally build a jar file.

## Usage

In your maven project, add the dependency

```xml
<dependency>
    <groupId>be.yildiz-games</groupId>
    <artifactId>module-database-pool-c3p0</artifactId>
    <version>LATEST</version>
</dependency>
```
Replace LATEST with the version number to use.

## Contact
Owner of this repository: Grégory Van den Borre