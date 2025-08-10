package filehandling;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
class WriteInFile {
	static String st;
	   public static void mains(String[] args) {
		   
	       try (FileWriter writer = new FileWriter("myfile.txt")) {
	          writer.write(" hi this is yeswanth writing");
	       } catch (IOException e) {
	          e.printStackTrace();
	       }
	       
	   }
	}
