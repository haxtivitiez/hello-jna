package xyz.un4ckn0wl3z.hellojna;

import com.sun.jna.Native;
import com.sun.jna.win32.StdCallLibrary;

/**
 * Hello world!
 *
 */
public class App {
	 public interface User32 extends StdCallLibrary {
	        User32 INSTANCE = (User32) Native.loadLibrary("user32", User32.class);
	        int MessageBoxA(int hwnd, String text, String caption, int type);
	    }
	 
	    public static void main(String[] args) {
	        User32 user32 = User32.INSTANCE;
	        user32.MessageBoxA(0, "Hello, Win32 API(JNA) World!", "Hello, World!", 0);
	    }
}
