Jansi Native
============

Description
-----------

Jansi Native implements the JNI libraries used by the 
[Jansi project](http://fusesource.github.io/jansi/). 

[![Apache License, Version 2.0, January 2004](https://img.shields.io/github/license/fusesource/jansi-native.svg?label=License)](http://www.apache.org/licenses/)

* `jansi-native` [Java API](http://fusesource.github.io/jansi/documentation/native-api):
[![Maven Central](https://img.shields.io/maven-central/v/org.fusesource.jansi/jansi-native.svg?label=Maven%20Central)](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22org.fusesource.jansi%22%20AND%20a%3A%22jansi-native%22)
* `jansi-${platform}` builds: [![windows32](https://img.shields.io/maven-central/v/org.fusesource.jansi/jansi-windows32.svg?label=windows32)](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22org.fusesource.jansi%22%20AND%20a%3A%22jansi-windows32%22)
[![windows64](https://img.shields.io/maven-central/v/org.fusesource.jansi/jansi-windows64.svg?label=windows64)](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22org.fusesource.jansi%22%20AND%20a%3A%22jansi-windows64%22)
[![osx](https://img.shields.io/maven-central/v/org.fusesource.jansi/jansi-osx.svg?label=osx)](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22org.fusesource.jansi%22%20AND%20a%3A%22jansi-osx%22)
[![linux32](https://img.shields.io/maven-central/v/org.fusesource.jansi/jansi-linux32.svg?label=linux32)](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22org.fusesource.jansi%22%20AND%20a%3A%22jansi-linux32%22)
[![linux32](https://img.shields.io/maven-central/v/org.fusesource.jansi/jansi-linux64.svg?label=linux64)](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22org.fusesource.jansi%22%20AND%20a%3A%22jansi-linux64%22)
[![freebsd32](https://img.shields.io/maven-central/v/org.fusesource.jansi/jansi-freebsd32.svg?label=freebsd32)](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22org.fusesource.jansi%22%20AND%20a%3A%22jansi-freebsd32%22)
[![freebsd64](https://img.shields.io/maven-central/v/org.fusesource.jansi/jansi-freebsd64.svg?label=freebsd64)](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22org.fusesource.jansi%22%20AND%20a%3A%22jansi-freebsd64%22)


Project Links
-------------

* [Project Home](http://fusesource.github.io/jansi/)

Building on Windows
-------------------

Download and install the free [Microsoft Windows SDK][SDK].  The SDK includes
all the headers, libraries, and build tools needed to compile the JNI library.

Set the `JAVA_HOME` environment variable to the location where your JDK is 
installed.  

Use the "Start>All Programs>Microsoft Windows SDK vX.X>CMD" command window 
and change to the directory that this file is located in and then run the
maven build.

[SDK]: http://www.microsoft.com/downloads/details.aspx?FamilyID=c17ba869-9671-4330-a63e-1fd44e0e2505
