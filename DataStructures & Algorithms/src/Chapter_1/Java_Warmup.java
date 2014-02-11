
package Chapter_1;
import java.io.*;
import java.util.Scanner;

public class Java_Warmup {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner stdin = new Scanner(System.in);
        //For easy typing C:\Users\home\Desktop\cuddles.jpg
        System.out.println("Enter in the file path: ");
        String filepath = stdin.nextLine();
        
        File f = new File(filepath); 
        long FISlength = (long) f.length();
        //FileInputStream fileInputStream = new FileInputStream(f);
        FileInputStream fis = null;
        int[] content = new int[FISlength];
        
        
        System.out.println(FISlength);
        
        for (int i = 0; i <FISlength; i++) {
            fis = new FileInputStream(f);
            content = fis.read();
            //fis.read(i);
            System.out.println(fis.read(content[i]));
            //System.out.println(fileInputStream.read(i));;
        }

        
        
    }// end of the main method


}
