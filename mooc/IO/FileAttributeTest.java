package com.IO;

import java.io.File;
import java.io.IOException;

public class FileAttributeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//创建目录
		File d = new File("C:/temp");
		
		if( !d.isDirectory()) {
			d.mkdirs();
		}
		
		System.out.println("is a Directory?"+d.isDirectory());
		
		//创建文件
		File f = new File("C:/temp/abc.txt");
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//输出文件相关属性
		System.out.println(f.isFile());
		System.out.println(f.getName());
		System.out.println(f.getParent());
		System.out.println(f.getPath());
		System.out.println(f.length());
		System.out.println(f.lastModified());
		
		//遍历d目录下的所有目录信息，不包括子目录下的文件
		System.out.println("==========");
		File[] fs = d.listFiles();
		for(File file:fs) {
			System.out.println(file.getPath());
		}
		
		//f.delete();
		//d.delete();
		
	}

}
