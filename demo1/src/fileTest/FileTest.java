package fileTest;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {
	public static void main(String[] args) {
		File f1 = new File("D:/Tools");
		System.out.println("f1 absolute path is " + f1.getAbsolutePath());
		File f2 = new File("lk.txt");
		System.out.println("f2 absolute path is " + f2.getAbsolutePath());
		File f3 = new File(f1, "lk.txt");
		System.out.println("f3 absolute path is " + f3.getAbsolutePath());
		System.out.println("f3 file find: " + f3.exists());
		System.out.println("f3 file: " + f3);
		System.out.println("f3 file is DIR: " + f3.isDirectory());
		System.out.println("f3 file is FILE: " + f3.isFile());
		System.out.println("f3 file length is " + f3.length());
		long lastTime = f3.lastModified();
		Date time = new Date(lastTime);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		String format = simpleDateFormat.format(time);
		System.out.println("f3 file last modified time is " + format);
		f3.renameTo(new File(f1,"liukai.txt"));

	}
}
