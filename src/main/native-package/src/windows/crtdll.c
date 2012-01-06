#if defined(_WIN32) || defined(_WIN64)
#include <windows.h>

void __cdecl __security_init_cookie(void);

BOOL WINAPI _DllMainCRTStartup(HANDLE hDllHandle, DWORD dwReason, LPVOID lpreserved)
{
	if (dwReason == DLL_PROCESS_ATTACH)
		__security_init_cookie();

	return TRUE;
}

#endif /* defined(_WIN32) || defined(_WIN64) */
