package com.IO;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���path����һ
				Path path = FileSystems.getDefault().getPath("C:/temp", "abc.txt");
				System.out.println(path.getNameCount());
				
				// ���path����������File��toPath()�������Path����
				File file = new File("C:/temp/abc.txt");
				Path path2 = file.toPath();
				System.out.println(path.compareTo(path2));
				
				// ���path������
				Path path3 = Paths.get("C:/temp", "abc.txt");
				System.out.println(path3.toString());
				
				// �ϲ�����path
				Path path4 = Paths.get("c:/temp");
				System.out.println(path4.resolve("abc.txt"));
				
				if (Files.isReadable(path)) {
					System.out.println("it is readable");
				} else {
					System.out.println("it is not readable");
				}
				
	}

}
