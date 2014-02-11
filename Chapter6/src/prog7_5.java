// Tyler Coatsworth 11/22/2013

public class prog7_5 {
    public static void main(String[] args) {
        
       int firstPos = (int)(Math.random()*10) + 1;
        int secondPos= (int)(Math.random()*10) + 1;
        
        double[][] a = new double[firstPos][secondPos];
        double[][] b = new double[firstPos][secondPos];
        
                for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int)(Math.random()*10) + 1;
                
            }
            
        }
                        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = (int)(Math.random()*10) + 1;
                
            }
            
        }
        
        double[][]c = addMatrix(a,b);
        printArray(a);
        System.out.println("                         +");
        printArray(b);
        System.out.println("                         =");
        printArray(c);
        
        
        
        
    } // end of the main method
    public static double[][] addMatrix(double[][] a, double[][] b){
    
    double[][]c = new double[a.length][a[0].length];

   for(int i = 0; i < a.length; i++)
  {
  for(int j = 0; j < a[i].length;j++)
  {
     c[i][j] = a[i][j] + b[i][j]; 
  } // end of inner for
  
    } // end of outer for

    return c;
        
    }
        public static void printArray(double[][] numbers){
    
        for (int r = 0; r < numbers.length; r++) {
            for (int c = 0; c < numbers[r].length; c++) {
                
                System.out.printf("%7.2f   ", numbers[r][c]);
                
            } // end of inner for loop
            System.out.println("");
        } // end of outer for loop
        
    
    }
}
