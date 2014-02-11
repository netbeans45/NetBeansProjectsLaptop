
public class ArraySortDemo {
    public static void main(String[] args) {
        int[] grades = {92,70,88,98,77,99,100};
    
    printArray(grades);
    
        for (int i = 0; i < grades.length; i++) {
            int low = grades[i];
            int lowIndex = i;
            for (int j = i; j < grades.length; j++) {
                if(low > grades[j]){
                low = grades[j];
                lowIndex = j;
                } // end of if
                
            } // end of inner for loop
            
            grades[lowIndex] = grades[i];
           grades[i] = low;
        } // end of outer for loop
    
    printArray(grades);
    
} // end of main method
  public static void printArray(int[] someArray){
      for (int i = 0; i < someArray.length; i++) {
          System.out.printf("%-3d", someArray[i]);
          
      }
  
      System.out.println("");
  }
    
} 