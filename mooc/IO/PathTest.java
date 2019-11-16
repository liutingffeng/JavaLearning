package com.IO;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//获得path方法一
				Path path = FileSystems.getDefault().getPath("C:/temp", "abc.txt");
				System.out.println(path.getNameCount());
				
				// 获得path方法二，用File的toPath()方法获得Path对象
				File file = new File("C:/temp/abc.txt");
				Path path2 = file.toPath();
				System.out.println(path.compareTo(path2));
				
				// 获得path方法三
				Path path3 = Paths.get("C:/temp", "abc.txt");
				System.out.println(path3.toString());
				
				// 合并两个path
				Path path4 = Paths.get("c:/temp");
				System.out.println(path4.resolve("abc.txt"));
				
				if (Files.isReadable(path)) {
					System.out.println("it is readable");
				} else {
					System.out.println("it is not readable");
				}
				
	}

}
