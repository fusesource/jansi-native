Using the Windows msvcrt.dll
============================

See message thread for history:
   http://groups.google.com/group/jansi-dev/browse_thread/thread/e7867408d43660e1

Benefits
--------
No need for the VS redistributables.

crtdll.c
--------

A minimal entry point (_DllMainCRTStartup)
The "official" _DllMainCRTStartup is way more complicated (and has more dependencies),
but most of it is not needed if the thing is small, and plain C
(so no exceptions and other fancy C++ stuff)

msvcrt.lib
----------
The msvcrt.lib files (32/64 bit) are generated from the Win7 msvcrt.dll.
   - dumpbin.exe /exports msvcrt.dll > msvcrt.dump
   - created msvcrt.def from msvcrt.dump (just removed a bunch of extra info)
   - lib /machine:X32 /def:msvcrt.def /out:msvcrt.lib
     (or /machine:X64, of course)

vs2010.vcxproj
--------------
     - Sources: added crt_my/crtdll.c
     - Linker - General: added crt_my/$(Platform) as Additional Library Directory
     - Linker - Input: Ignore All Default Libraries (/NODEFAULTLIB)
     - Linker - Input: removed user32.lib; ... ;odbccp32.lib,
       and added msvcrt.lib;RunTmChk.lib instead
       (RunTmChk.lib is in the VS lib folder, and needed for security_check_cookie)
