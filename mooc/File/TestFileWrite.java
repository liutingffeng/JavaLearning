package com.File;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class TestFileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WriteFile1();
       System.out.println("===================");
		//writeFile2(); // JDK 7及以上才可以使用
	}

	private static void WriteFile1() {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		try {
			fos = new FileOutputStream("c:/temp/abc.txt");// 节点类
			osw = new OutputStreamWriter(fos, "UTF-8");// 转化类
			bw = new BufferedWriter(osw);// 装饰类
			bw.write("我们是");
			bw.newLine();
			bw.write("Ecnuers.^^");
			bw.newLine();
		} catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}finally {
			try {
				bw.close();// 关闭最后一个类，会将所有的底层流都关闭
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	public static void writeFile2() {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c:/temp/abc.txt")))){
			bw.write("我们是");
			bw.newLine();
			bw.write("Ecnuers.^^");
			bw.newLine();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
