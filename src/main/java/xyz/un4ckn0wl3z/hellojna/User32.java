package xyz.un4ckn0wl3z.hellojna;

import com.sun.jna.win32.StdCallLibrary;

public interface User32 extends StdCallLibrary {
	
//	int WINAPI MessageBox(
//			  _In_opt_ HWND    hWnd,
//			  _In_opt_ LPCTSTR lpText,
//			  _In_opt_ LPCTSTR lpCaption,
//			  _In_     UINT    uType
//			);
	
	
	public int MessageBoxW(int hwnd, String text, String caption, int type);
	
	

}
