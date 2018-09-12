package fileTest;

import java.io.File;

public class FileTest1 {
	public static void main(String[] args) {
		File file = new File("D:/liukai/liukai.txt");
		System.out.println("all file(String): " + file.list());
		System.out.println("all file(File): " + file.listFiles());
		System.out.println("this file dir(String): " + file.getParent());
		System.out.println("this file dir(File): " + file.getParentFile());
		
	}
}
