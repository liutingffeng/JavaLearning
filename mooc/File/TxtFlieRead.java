package com.File;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class TxtFlieRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//readFile1();
		System.out.println("===================");
		readFile2(); //JDK 7及以上才可以使用
	}

	private static void readFile1() {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			fis = new FileInputStream("c:/temp/abc.txt"); // 节点类
			isr = new InputStreamReader(fis, "UTF-8"); // 转化类
			//isr = new InputStreamReader(fis);
			br = new BufferedReader(isr); // 装饰类
			// br = new BufferedReader(new InputStreamReader(new
			// FileInputStream("c:/temp/abc.txt")))
			String line;
			while ((line = br.readLine() )!= null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				br.close(); // 关闭最后一个类，会将所有的底层流都关闭
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	
	public static void readFile2() {
		String line;
		//try-resource 语句，自动关闭资源
		try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("c:/temp/abc.txt")))) {
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
