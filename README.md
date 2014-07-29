porter
======

Port your thoughts for internal use only


Start Up
========

The main class for the project is PorterApp.java
Following properties are required to be set
    porter.environment : (default:local) local/prod/test
    porter.db : (default:oracle) oracle/mysql
    porter.db.url : URL of the database
    porter.db.username : self explanatory
    porter.db.password : self explanatory
Can be passed as -D option during the startup

Important tips for setup
========================

ojdbc jars are not available on the shared server.
To setup those, we need to install the jar locally after the download.
mvn install:install-file -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=<version> -Dpackaging=jar -DgeneratePom=true -Dfile=ojdbc6.jar