package java_IO;

import java.io.FileOutputStream;

public class J_FileOutputStream {

	public static void main(String[] args) {
		
		try{
			
            FileOutputStream fout=new FileOutputStream("E:\\JavaIO\\testout.txt");    
//            fout.write(56);    
//            fout.close();    
//            System.out.println("success...");    
            
            
            String s="Welcome to Asus ROG.";    
            byte b[]=s.getBytes();//converting string into byte array    
            fout.write(b);    
            fout.close();   
            System.out.println("success..."); 
            
        }
		catch(Exception e){System.out.println(e);
		} 
		
	}

}
