package java_IO;

import java.io.FileInputStream;
import java.io.IOException;

public class J_FileInputStream {

	public static void main(String[] args) throws IOException {
		
//		System.out.println("simple message");  
//		System.err.println("error message");  
//		
//		int i=System.in.read();//returns ASCII code of 1st character  
//		System.out.println((char)i);//will print the character
//		System.out.println(i);
		
		try{    
            FileInputStream fin=new FileInputStream("E:\\JavaIO\\testout.txt");    
//            int i=fin.read();  
//            System.out.print((char)i);    
               
            int i=0;    
            while((i=fin.read())!=-1){    
             System.out.print((char)i);    
            }    
  
            fin.close();    
          }
		catch(Exception e){System.out.println(e);
		}    
			
	}

}
