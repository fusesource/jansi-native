![Jansi][logo] Native
===========
[logo]: http://fusesource.github.io/jansi/images/project-logo.png "Jansi"

## [Jansi Native 1.8][1_8], released 2018-02-02
[1_8]: https://repo.maven.apache.org/maven2/org/fusesource/jansi/jansi-native/1.8

* [`e0bd25d`](https://github.com/fusesource/hawtjni/commit/e0bd25db8c7bd2b59332a06fb8deb0fd92d60fc0) Upgrade to hawtjni 1.16
* [`52d4840`](https://github.com/fusesource/hawtjni/commit/52d4840b2e7a65ef973c4542cedb42d118dba983) Improve isatty() Windows implementation with Cygwin/Mingw pseudo terminals, fixes [#11](https://github.com/fusesource/jansi-native/issues/11)
* [`6728bc6`](https://github.com/fusesource/hawtjni/commit/6728bc6b8e472cc3b50a007f61203764a9c2429f) Fix indentation
* [`e266e32`](https://github.com/fusesource/hawtjni/commit/e266e327fb4d7aa8230c18d96f7233591ee7ae30) Add support for other console events
* [`f2686cf`](https://github.com/fusesource/hawtjni/commit/f2686cf240fafec88d454ddda118ef27c301ec47) Add a way to read console input with a timeout
* [`e1a6d4f`](https://github.com/fusesource/hawtjni/commit/e1a6d4f3909a0f6e39e5792968597f6a0c1fd777) Update hawtjni maven plugin artifactId
* [`844f627`](https://github.com/fusesource/hawtjni/commit/844f627a692ee44a20ac887d32cd33f7cf5304f9) improved javadoc
* [`5560ba7`](https://github.com/fusesource/hawtjni/commit/5560ba70e9de14ecb6071c7de9d8f146400c975d) use latest hawtjni-runtime to get documented annotations in javadoc
* [`da27164`](https://github.com/fusesource/hawtjni/commit/da27164da4a4a16d66947068643df342f120897c) reworked building section
* [`9461d6b`](https://github.com/fusesource/hawtjni/commit/9461d6b6ddc090f652823b5bc7ecd5bbcc015032) improved intro
* [`ddcc121`](https://github.com/fusesource/hawtjni/commit/ddcc121d8012f1a702d3eff86fc1afb38fea269a) fixed m-javadoc-p configuration
* [`0c0dccf`](https://github.com/fusesource/hawtjni/commit/0c0dccff5e711a7adff10d0dd31b5e3a8568f543) added icons for artifacts in Maven Central
* [`e77fbcf`](https://github.com/fusesource/hawtjni/commit/e77fbcfad9b4249d4f18c71c8af6c500d33837a7) updated pom to match migration to GitHub

## [Jansi Native 1.7][1_7], released 2017-05-04
[1_7]: https://repo.maven.apache.org/maven2/org/fusesource/jansi/jansi-native/1.7

* [`177381b`](https://github.com/fusesource/hawtjni/commit/177381b1f2af52a7491b91f59bd6076ba3b6ce64) Upgrade to hawtjni 1.15
* [`be608f1`](https://github.com/fusesource/hawtjni/commit/be608f140068f67dcaf1b203b8503a66299e2ad5) Update changelog
* [`a8cc48a`](https://github.com/fusesource/hawtjni/commit/a8cc48ad81b792b0df1208e7c4baac5525a8bcc8) Add a copy() method on SMALL_RECT for ease of use
* [`29b9213`](https://github.com/fusesource/hawtjni/commit/29b92130dbb43b6ba11afee544cb7ab2a81201b1) Fix changelog
* [`e2f6efb`](https://github.com/fusesource/hawtjni/commit/e2f6efbdadcb95889ecb110c14eb491a8365efaf) Fix copyrights
* [`36a03b7`](https://github.com/fusesource/hawtjni/commit/36a03b70607110c4c208f8a4f9fac29e394d5c86) Fix build when openpty is in libutil
* [`915a7c6`](https://github.com/fusesource/hawtjni/commit/915a7c6dcaf987290c3def2f811a4ff861f1b362) Fix wrong conditions and constants
* [`5beb0c2`](https://github.com/fusesource/hawtjni/commit/5beb0c29c5effa80891e6b9b3509674abd25c572) Ignore idea files
* [`8a83cbb`](https://github.com/fusesource/hawtjni/commit/8a83cbbb88e76e44cb6b279777ff417c02e28a53) Fix number of control chars in the Termios structure
* [`84b9ce1`](https://github.com/fusesource/hawtjni/commit/84b9ce1f091420622a8b172f42255d7f73eb85e9) Update some plugins versions
* [`674f287`](https://github.com/fusesource/hawtjni/commit/674f2871a6e9e9f5a47f59a57e415958a6ed5990) Add oss snapshot repo
* [`41c2f00`](https://github.com/fusesource/hawtjni/commit/41c2f00d4857f292a4bdd80c57ed5aeac3320d2d) Make sure to include winsize and termios structures
* [`9685c51`](https://github.com/fusesource/hawtjni/commit/9685c516d43eda1de4c0bc3d1e44d48cc160133b) Turn on stack protection, fixes [#7](https://github.com/fusesource/jansi-native/issues/7)
* [`a1710c7`](https://github.com/fusesource/hawtjni/commit/a1710c785d5033588f0ed0e6f262959a5b1dd479) Make sure the build work on MVS2017
* [`7a0a951`](https://github.com/fusesource/hawtjni/commit/7a0a951fe58dfb3b36803aa3f5a66db9662d2164) Pass the platform to the hawtjni plugin
* [`d3a5c4a`](https://github.com/fusesource/hawtjni/commit/d3a5c4a2d1f36f18e5a62f061c7944d56a9abaee) Upgrade internal jansi version on windows
* [`7b45d34`](https://github.com/fusesource/hawtjni/commit/7b45d3462ff7a1b20bd1b0f281c9e23277b852e4) Merge pull request [#6](https://github.com/fusesource/jansi-native/issues/6) from Aaron1011/remove-ttyslot
* [`5f76e86`](https://github.com/fusesource/hawtjni/commit/5f76e86c28c80eb8b03e1713e9eb0ea3099b965d) Fix ttyname method which is unusable (SEGV crash), fixes [#8](https://github.com/fusesource/jansi-native/issues/8)
* [`f825e18`](https://github.com/fusesource/hawtjni/commit/f825e1812c09924860d3f5f713340d5c81a8b685) Fix home in readme, fixes [#4](https://github.com/fusesource/jansi-native/issues/4)
* [`216892e`](https://github.com/fusesource/hawtjni/commit/216892efe74cea133993c5afabc154b576357412) Remove unused use of 'ttyslot'

## [Jansi Native 1.6][1_6], released 2016-04-27
[1_6]: https://repo.maven.apache.org/maven2/org/fusesource/jansi/jansi-native/1.6

* [`6160f07`](https://github.com/fusesource/hawtjni/commit/6160f07a0f47aaaf4bcb34d8f04e4534ade8aa2b) More packaging refactoring.
* [`24250c0`](https://github.com/fusesource/hawtjni/commit/24250c0d99262b7e1e965402c474365754132eea) make sure native libs get packaged.
* [`4a95522`](https://github.com/fusesource/hawtjni/commit/4a955226e2e3025738bf11f35f99b2dfb94fbe0c) Lets try to use different artifact ids for the different platform builds to workaround problems with mvn needing all classified artifacts to be part of the same build for SNAPSHOT deployments.
* [`f66eb6b`](https://github.com/fusesource/hawtjni/commit/f66eb6bea90e5d1b3640abf0f3e18280f7ed705a) Bump the hawtjni version.
* [`a18e87f`](https://github.com/fusesource/hawtjni/commit/a18e87f8959e0db56dbe575455f5143e54e47ada) Switch to sonatype mvn repo
* [`1cb12b1`](https://github.com/fusesource/hawtjni/commit/1cb12b167949aa1f545d20d7d522b49abb4c41c8) Update hawtjni version used.
* [`6436a76`](https://github.com/fusesource/hawtjni/commit/6436a76ba22e3ae207a0b37e43e9a4f739682880) Tweaks needed to get the latest changes compiling on linux.
* [`ece5c44`](https://github.com/fusesource/hawtjni/commit/ece5c44b48d4998735384d9fa57727ba8884d660) Fixing function name.  No W since there are no (wide) chars in the arg list.
* [`7859ee9`](https://github.com/fusesource/hawtjni/commit/7859ee9b4af8eb44a3f446af2e1d95dcfb02de15) Make constants conditional.
* [`ff3543d`](https://github.com/fusesource/hawtjni/commit/ff3543ddcc90b368650ce256b875076c338f4d0a) Update parent pom version.
* [`a597537`](https://github.com/fusesource/hawtjni/commit/a5975374d7050ebad9d0bad8b05777a8a5900bb5) Add ScrollConsoleScreenBuffer to Kernel32
* [`144f13d`](https://github.com/fusesource/hawtjni/commit/144f13dba2e627fb1212b2b3d546ccdfa41fe482) Improve JNI arg passing for Kernel32 library
* [`ae71626`](https://github.com/fusesource/hawtjni/commit/ae716267fcb8955e63ebfbce8e637bd27c0f4514) Fix some javadoc warnings
* [`fbaa6fa`](https://github.com/fusesource/hawtjni/commit/fbaa6fa650db39baa402796f4ee29143ed88b0d7) Add FilleConsoleOutputAttributeW native method for windows
* [`a7c99e8`](https://github.com/fusesource/hawtjni/commit/a7c99e80fb64723221ec081352840d5b2362b473) Add needed functions for stty support
* [`aebb7f4`](https://github.com/fusesource/hawtjni/commit/aebb7f4b37719722375f00e33c1926720c3e8406) Upgrade hawtjni version to fix [Missing barriers in cache initialization](https://github.com/fusesource/hawtjni/issues/7)

## [Jansi Native 1.5][1_5], released 2013-03-25
[1_5]: https://repo.maven.apache.org/maven2/org/fusesource/jansi/jansi-native/1.5

* [`d5e1606`](https://github.com/fusesource/hawtjni/commit/d5e1606ab05db5092010ab3e54d9cb079f212ded) Add windows nmake Makefile
* [`01cfbdd`](https://github.com/fusesource/hawtjni/commit/01cfbdd0095f981b24224df70bf9c9c1aa790a2a) Add .rc file to the msbuild project
* [`803ae7f`](https://github.com/fusesource/hawtjni/commit/803ae7f9d3663c477ed13ef6843ecfe1d0faac0b) Add the public repo
* [`7dbe4f5`](https://github.com/fusesource/hawtjni/commit/7dbe4f50b3fa9384d4d131d76d05b2adc6cdad1e) Switch to new release of hawtjni that allows us to force the use of msbuild on windows.
* [`d891301`](https://github.com/fusesource/hawtjni/commit/d8913015ee92284ee42356ad5c1553eefae7145b) Modify owner
* [`9b30bc1`](https://github.com/fusesource/hawtjni/commit/9b30bc1d4579dfc5842640358d6e31a857422665) Add .rc file
* [`5392bef`](https://github.com/fusesource/hawtjni/commit/5392bef3ce52616dd359236d74f21eac04d6aa3b) Ensure we have standard file attributes

## [Jansi Native 1.4][1_4], released 2012-02-15
[1_4]: https://repo.maven.apache.org/maven2/org/fusesource/jansi/jansi-native/1.4

* [`981fb32`](https://github.com/fusesource/hawtjni/commit/981fb328b6821579e0860140fa646aa429397a4d) Merge pull request [#2](https://github.com/fusesource/jansi-native/issues/2) from mihnita/master
* [`d2c93b8`](https://github.com/fusesource/hawtjni/commit/d2c93b856ca94ba5154b0f7c90ec87deebcd6ce6) Generating msvcrt.lib at build time (from msvcrt.def)
* [`46e933f`](https://github.com/fusesource/hawtjni/commit/46e933fa3addad25d69f94e1dda8bf28e8b67ee2) - Added License header (ASL 2.0 like everything else) - Added readme.txt to the windows directory with info of how .lib files were created
* [`5b092a8`](https://github.com/fusesource/hawtjni/commit/5b092a85860ba4ad453a0f5eec2335b780e684ce) - Added support for isatty - Fixed values and conditions for STDIN_FILENO, STDOUT_FILENO, STDERR_FILENO - Bumped version to 1.8 to stay in sync with jansi - Cleaned a few warnings at C compile time - Link against the system msvcrt.dll (so no need for VC redistributables)

## [Jansi Native 1.3][1_3], released 2011-09-21
[1_3]: https://repo.maven.apache.org/maven2/org/fusesource/jansi/jansi-native/1.3

* [`7626ec6`](https://github.com/fusesource/hawtjni/commit/7626ec6283f3bd7c1ddd214906989d974aa17cf6) use released hawtjni.
* [`29b8037`](https://github.com/fusesource/hawtjni/commit/29b80375b669849328a5ba3a445008b01d09b3c0) Update hawtjni version.
* [`61dbf94`](https://github.com/fusesource/hawtjni/commit/61dbf94b12ed5eb597f2b5a916e7d0366480cbc6) Merge pull request [#1](https://github.com/fusesource/jansi-native/issues/1) from huynhjl/jansi-unicode-pull-request
* [`44eb7aa`](https://github.com/fusesource/hawtjni/commit/44eb7aa2f968818d5d3d1f89089b7bfc1c4350ad) Adding support for PeekConsoleInputW, FlushConsoleInputBuffer so that CTRL-C can be handled by jline. Discarding mouse events on readConsoleInput.
* [`b72fb73`](https://github.com/fusesource/hawtjni/commit/b72fb73e1ae1eb1bc375873143b31466348a25e5) Using PointerMath when copying INPUT_RECORD.
* [`e649485`](https://github.com/fusesource/hawtjni/commit/e6494857ed59dbfbb8c1918b39a9e99b1b201f00) Updated support for reading multiple INPUT_RECORD through ReadConsoleW (may need to check pointer arithmetic).  Added support for GetNumberOfConsoleInputEvents and WriteConsoleW.

## [Jansi Native 1.2][1_2], released 2011-06-19
[1_2]: https://repo.maven.apache.org/maven2/org/fusesource/jansi/jansi-native/1.2

* `892c45e` Adding support for reading keyboard events through ReadConsoleInputW Win32 call. Does not handle non keyboard events (they are discarded).
* `658d8bc` Upgrade the hawtjni version being used.

## [Jansi Native 1.1][1_1], released 2010-11-04
[1_1]: https://repo.maven.apache.org/maven2/org/fusesource/jansi/jansi-native/1.1

* `14cf4c9` Update to use fusesource parent pom and pickup new hawtjni release.
* `e29d0fa` adding SetConsoleTitle method to support setting the window title on Windows
* `71a95c0` updating to next hawtjni snapshot version to pick up Win SKD 7.1 fix
* `29fb658` allow hawtjni version to be configurable
* `6ced024` adding build doco for windows

## Jansi Native 1.0, released 2010-07-14

* Initial release
* Native bits extracted out of the core jansi library
