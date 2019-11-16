package com.File;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class BinFileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readFile();
	}

	private static void readFile() {
		// TODO Auto-generated method stub
		//try-resource 语句，自动关闭资源
				try (DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("c:/temp/def.dat")))) {
					String a, b;
				    int c, d;
				    a=dis.readUTF();
				    c=dis.readInt();
				    d=dis.readInt();
				    b=dis.readUTF();
				    System.out.println("a: "+a);
				    System.out.println("c: "+c);
				    System.out.println("d: "+d);
				    System.out.println("b: "+b);
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
	}

}
