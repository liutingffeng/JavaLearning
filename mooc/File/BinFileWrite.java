package com.File;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class BinFileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeFile();
	    System.out.println("done.");
	}

	private static void writeFile() {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		  DataOutputStream dos = null;
		  BufferedOutputStream bos = null;
			try {
				fos = new FileOutputStream("c:/temp/def.dat"); // 节点类
				bos = new BufferedOutputStream(fos); // 装饰类
				dos = new DataOutputStream(bos); // 装饰类		
				
				dos.writeUTF("a");
				dos.writeInt(20);
				dos.writeInt(180);
				dos.writeUTF("b");
			} catch (Exception ex) {
				ex.printStackTrace();
			} finally {
				try {
					dos.close(); // 关闭最后一个类，会将所有的底层流都关闭
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}


