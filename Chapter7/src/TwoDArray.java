
public class TwoDArray {
    public static void main(String[] args) {
        
        int[][] nums = new int [3][4];
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int)(Math.random()*10) + 1;
                
            }
            
        }
        
        nums[1][3] = 99;
        
        printArray(nums);
        
        
        changeNum(nums[1][3]);
        
        System.out.println("result is: " + nums[1][3]);
        
        System.out.println("nums [2][3] is: " + nums[2][3]);
        
        int[][] nums2 = nums;
        
        nums2[0][0] = 77;
        
        printArray(nums); // ARRAYS CAN ONLY BE PASSED BY REFERENCE!!!!!!!!!!!!!!!!!!!!!!
        
        int num1 = 25;
        System.out.println("num 1 is: " + num1);
        
        int num2 = num1;
        num2 = 55;
        
        System.out.println("num1 is: " + num1);
        
        
    } //end of main method
    
    public static void printArray(int[][] numbers){
    
        for (int r = 0; r < numbers.length; r++) {
            for (int c = 0; c < numbers[r].length; c++) {
                
                System.out.printf("%5d", numbers[r][c]);
                
            } // end of inner for loop
            System.out.println("");
        } // end of outer for loop
        
        numbers[2][3] = 255;
    
    } // end of printArray method
     public static int changeNum(int x){
        
            x+=10;
            
            System.out.println("x is: " + x);
            
            return x;
        }
}
