
package Basics;


public class LoopsAndStatistics {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,7,9,11,13};
        System.out.println("FOR LOOP: ");
        for (int i = nums.length-1; i >= 0; i--) {
            System.out.println(nums[i]);
        }
        System.out.println("WHILE LOOP: ");
        int i = 0;
        while(i<nums.length){
            System.out.println(nums[i++]);
        }
        System.out.println("FIND THE AVERAGE: ");
        int sum = 0;
        for(int j=0; j < nums.length; j++){
            sum+=nums[j];
        }
        double AVG = (double) sum/nums.length;
        System.out.println(AVG);
        
        System.out.println("CALCULATE THE MEDIAN: "); 
        /*median is the middle value of all the values in sorted order If ther is no middle
         value, then add the two items in the middle and average them.*/
        
        if(nums.length%2==1){
            //length is odd
            int m = (nums.length-1)/2;
            System.out.println("The median is: " + nums[m]);
        }
        else{
            //length is even
            int m = nums.length/2;
            int n = m-1;
            System.out.println("The median is: " + (nums[m]+nums[n])/2.0);
        }
        
        
        
    }// end of the main method
}
