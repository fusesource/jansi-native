![Jansi][logo]
===========
[logo]: http://jansi.fusesource.org/images/project-logo.png "Jansi"

## [Jansi Native 1.7][1_7], released 2017-05-xx

a8cc48a Add a copy() method on SMALL_RECT for ease of use
e2f6efb Fix copyrights
36a03b7 Fix build when openpty is in libutilext development iteration
915a7c6 Fix wrong conditions and constants
5beb0c2 Ignore idea files
8a83cbb Fix number of control chars in the Termios structure
84b9ce1 Update some plugins versions
674f287 Add oss snapshot repo
41c2f00 Make sure to include winsize and termios structures
9685c51 Turn on stack protection, fixes [#7](https://github.com/fusesource/jansi-native/issues/7)
a1710c7 Make sure the build work on MVS2017
7a0a951 Pass the platform to the hawtjni plugin
d3a5c4a Upgrade internal jansi version on windows
7b45d34 Merge pull request #6 from Aaron1011/remove-ttyslot
5f76e86 Fix ttyname method which is unusable (SEGV crash), fixes [#8](https://github.com/fusesource/jansi-native/issues/8)
f825e18 Fix home in readme, fixes [#4](https://github.com/fusesource/jansi-native/issues/4)
216892e Remove unused use of 'ttyslot'

## [Jansi Native 1.6][1_6], released 2016-04-27

6160f07 More packaging refactoring.
24250c0 make sure native libs get packaged.
4a95522 Lets try to use different artifact ids for the different platform builds to workaround problems with mvn needing all classified artifacts to be part of the same build for SNAPSHOT deployments.
f66eb6b Bump the hawtjni version.
a18e87f Switch to sonatype mvn repo
1cb12b1 Update hawtjni version used.
6436a76 Tweaks needed to get the latest changes compiling on linux.
ece5c44 Fixing function name.  No W since there are no (wide) chars in the arg list.
7859ee9 Make constants conditional.
ff3543d Update parent pom version.
a597537 Add ScrollConsoleScreenBuffer to Kernel32
144f13d Improve JNI arg passing for Kernel32 library
ae71626 Fix some javadoc warnings
fbaa6fa Add FilleConsoleOutputAttributeW native method for windows
a7c99e8 Add needed functions for stty support
aebb7f4 Upgrade hawtjni version to fix [Missing barriers in cache initialization](https://github.com/fusesource/hawtjni/issues/7)

## [Jansi Native 1.5][1_5], released 2013-03-25

d5e1606 Add windows nmake Makefile
01cfbdd Add .rc file to the msbuild project
803ae7f Add the public repo
7dbe4f5 Switch to new release of hawtjni that allows us to force the use of msbuild on windows.
d891301 Modify owner
9b30bc1 Add .rc file
5392bef Ensure we have standard file attributes

## [Jansi Native 1.4][1_4], released 2012-02-15

d2c93b8 Generating msvcrt.lib at build time (from msvcrt.def)
46e933f - Added License header (ASL 2.0 like everything else) - Added readme.txt to the windows directory with info of how .lib files were created
5b092a8 - Added support for isatty - Fixed values and conditions for STDIN_FILENO, STDOUT_FILENO, STDERR_FILENO - Bumped version to 1.8 to stay in sync with jansi - Cleaned a few warnings at C compile time - Link against the system msvcrt.dll (so no need for VC redistributables)

## [Jansi Native 1.3][1_3], released 2011-09-21

44eb7aa Adding support for PeekConsoleInputW, FlushConsoleInputBuffer so that CTRL-C can be handled by jline. Discarding mouse events on readConsoleInput.
b72fb73 Using PointerMath when copying INPUT_RECORD.
e649485 Updated support for reading multiple INPUT_RECORD through ReadConsoleW (may need to check pointer arithmetic).  Added support for GetNumberOfConsoleInputEvents and WriteConsol

## [Jansi Native 1.2][1_2], released 2011-06-19

892c45e Adding support for reading keyboard events through ReadConsoleInputW Win32 call. Does not handle non keyboard events (they are discarded).
658d8bc Upgrade the hawtjni version being used.

## [Jansi Native 1.1][1_1], released 2010-11-04

14cf4c9 Update to use fusesource parent pom and pickup new hawtjni release.
e29d0fa adding SetConsoleTitle method to support setting the window title on Windows
71a95c0 updating to next hawtjni snapshot version to pick up Win SKD 7.1 fix
29fb658 allow hawtjni version to be configurable
6ced024 adding build doco for windows

## [Jansi Native 1.0][1_0], released 2010-07-14

* Initial release
* Native bits extracted out of the core jansi library

