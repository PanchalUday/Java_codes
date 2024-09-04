package java_IO;

import java.io.*;
import java.util.Scanner;

public class File_CreateWriteReadDelete {

	public static void main(String[] args) {
		
		
		File myFile = new File("E:\\JavaIO\\testfile.txt");
		
//		Creating File
		
        try {
            myFile.createNewFile();
            System.out.println("File created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
		
//		Writing to a file
		
		try {
            FileWriter fileWriter = new FileWriter("E:\\JavaIO\\testfile.txt");
            fileWriter.write("you are learnig the java Programming \nKeep Going!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
//		Reading a File
		
		try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
		
		
//		Deleting a File
		
//        if(myFile.delete()){
//            System.out.println("I have deleted: " + myFile.getName());
//        }
//        else{
//            System.out.println("Some problem occurred while deleting the file");
//        }

	}

}
