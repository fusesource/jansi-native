![Jansi][logo]
===========
[logo]: http://jansi.fusesource.org/images/project-logo.png "Jansi"


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

