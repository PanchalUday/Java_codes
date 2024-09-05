package java_IO;

import java.io.*;

public class J_BufferInputStream {

	public static void main(String[] args) {
		
		try{    
		    FileInputStream fin=new FileInputStream("E:\\JavaIO\\testout1.txt");    
		    BufferedInputStream bin=new BufferedInputStream(fin);    
		    int i;    
		    while((i=bin.read())!=-1){    
		     System.out.print((char)i);    
		    }    
		    bin.close();    
		    fin.close();    
		  }catch(Exception e){System.out.println(e);}  

	}

}
