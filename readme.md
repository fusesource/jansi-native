Jansi Native
============

Description
-----------

Jansi Native implements the JNI Libraries used by the 
[Jansi project](http://jansi.fusesource.org/). 

Project Links
-------------

* [Project Home](http://jansi.fusesource.org/)

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