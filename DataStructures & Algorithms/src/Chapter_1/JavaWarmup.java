//Tyler Coatsworth
package Chapter_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner; 

public class JavaWarmup {
 
	public static void main(String[] args) throws IOException {
  
            //Example: C:/Users/home/Desktop/image.jpg
            Scanner stdin = new Scanner(System.in);
               System.out.println("Enter in the file path: ");
                 String filepath = stdin.nextLine();
                  File file = new File(filepath);
                
                    FileInputStream fis = new FileInputStream(file);
 
			System.out.println("Total file size to read (in bytes) : "+ fis.available());
                            System.out.printf("Byte#:\tByte");
                            System.out.println("");
			
			for(int i=0; i<=file.length();i++) {
				
                                System.out.print(i+":");
				System.out.printf("%s", "\t"+fis.read());
                                System.out.println("");
			}
 
		
		}
	}
