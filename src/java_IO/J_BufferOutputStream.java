package java_IO;

import java.io.*;

public class J_BufferOutputStream {

	public static void main(String[] args) throws Exception {

		FileOutputStream fout = new FileOutputStream("E:\\JavaIO\\testout1.txt");    
	    BufferedOutputStream bout = new BufferedOutputStream(fout);    
	    String s="Welcome to Uday's ROG.";    
	    byte b[]=s.getBytes();    
	    bout.write(b);    
	    bout.flush();    
	    bout.close();    
	    fout.close();    
	    System.out.println("success");  

	}

}
