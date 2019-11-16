package com.IO;

import java.io.File;
import java.io.IOException;

public class FileAttributeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//����Ŀ¼
		File d = new File("C:/temp");
		
		if( !d.isDirectory()) {
			d.mkdirs();
		}
		
		System.out.println("is a Directory?"+d.isDirectory());
		
		//�����ļ�
		File f = new File("C:/temp/abc.txt");
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//����ļ��������
		System.out.println(f.isFile());
		System.out.println(f.getName());
		System.out.println(f.getParent());
		System.out.println(f.getPath());
		System.out.println(f.length());
		System.out.println(f.lastModified());
		
		//����dĿ¼�µ�����Ŀ¼��Ϣ����������Ŀ¼�µ��ļ�
		System.out.println("==========");
		File[] fs = d.listFiles();
		for(File file:fs) {
			System.out.println(file.getPath());
		}
		
		//f.delete();
		//d.delete();
		
	}

}
