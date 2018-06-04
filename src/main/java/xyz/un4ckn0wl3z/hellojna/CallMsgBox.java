package xyz.un4ckn0wl3z.hellojna;

import com.sun.jna.Native;

public class CallMsgBox {
	static User32 user32 = (User32) Native.loadLibrary("user32",User32.class);

	public static void main(String[] args){
		
		user32.MessageBoxA(0, "Hello, Win32 API(JNA) World!", "Hello, World!", 0);
	}
	
}
