dnl ---------------------------------------------------------------------------
dnl  Copyright (C) 2009-2017 the original author(s).
dnl  
dnl  Licensed under the Apache License, Version 2.0 (the "License");
dnl  you may not use this file except in compliance with the License.
dnl  You may obtain a copy of the License at
dnl  
dnl     http://www.apache.org/licenses/LICENSE-2.0
dnl  
dnl  Unless required by applicable law or agreed to in writing, software
dnl  distributed under the License is distributed on an "AS IS" BASIS,
dnl  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
dnl  See the License for the specific language governing permissions and
dnl  limitations under the License.
dnl ---------------------------------------------------------------------------

AC_DEFUN([CUSTOM_M4_SETUP],
[
  AC_CHECK_LIB([c], [isatty],[AC_DEFINE([HAVE_ISATTY], [1], [Define to 1 if you have the isatty function.])])
  AC_CHECK_LIB([c], [ttyname],[AC_DEFINE([HAVE_TTYNAME], [1], [Define to 1 if you have the ttyname function.])])
  AC_CHECK_LIB([c], [tcgetattr],[AC_DEFINE([HAVE_TCGETATTR], [1], [Define to 1 if you have the tcgetattr function.])])
  AC_CHECK_LIB([c], [tcsetattr],[AC_DEFINE([HAVE_TCSETATTR], [1], [Define to 1 if you have the tcsetattr function.])])
  AC_CHECK_LIB([c], [ioctl],[AC_DEFINE([HAVE_IOCTL], [1], [Define to 1 if you have the ioctl function.])])
  AC_SEARCH_LIBS([openpty], [util], [AC_DEFINE([HAVE_OPENPTY], [1], [Define to 1 if you have the openpty function.])])
  AC_CHECK_HEADER([pty.h], [AC_DEFINE([HAVE_PTY_H], 1, [Header pty.h])])
  AC_CHECK_HEADER([term.h], [AC_DEFINE([HAVE_JANSI_TERM_H], 1, [Header term.h])])
  AC_CHECK_HEADER([termios.h], [AC_DEFINE([HAVE_TERMIOS_H], 1, [Header termios.h])])
  AC_CHECK_HEADER([sys/ioctl.h], [AC_DEFINE([HAVE_IOCTL_H], 1, [Header sys/ioctl.h])])
  AC_CHECK_HEADER([libutil.h], [AC_DEFINE([HAVE_JANSI_LIBUTIL_H], [1], [Header libutil.h])])
  AC_CHECK_HEADER([util.h], [AC_DEFINE([HAVE_JANSI_UTIL_H], [1], [Header util.h])])

  ssp_cc=yes
  if test "X$CC" != "X"; then
    AC_MSG_CHECKING([whether ${CC} accepts -fstack-protector])
    ssp_old_cflags="$CFLAGS"
    CFLAGS="$CFLAGS -fstack-protector"
    AC_COMPILE_IFELSE([AC_LANG_PROGRAM([[]], [[]])], [], [], [ssp_cc=no])
    AC_MSG_RESULT([$ssp_cc])
    if test "X$ssp_cc" = "Xno"; then
      CFLAGS="$ssp_old_cflags"
    else
      AC_DEFINE([ENABLE_SSP_CC], 1, [Define if SSP C support is enabled.])
    fi
  fi
])