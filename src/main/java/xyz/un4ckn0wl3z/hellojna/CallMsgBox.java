package xyz.un4ckn0wl3z.hellojna;

import com.sun.jna.Native;
import com.sun.jna.win32.W32APIOptions;

public class CallMsgBox {
	static User32 user32 = (User32) Native.loadLibrary("user32",User32.class,W32APIOptions.UNICODE_OPTIONS);

	public static void main(String[] args){
		
		user32.MessageBoxW(0, "Hello, Win32 API(JNA) World!", "Hello, World!", 0);
	}
	
}
