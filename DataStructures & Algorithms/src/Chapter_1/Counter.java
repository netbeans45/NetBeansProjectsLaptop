
package Chapter_1;

public class Counter {
    //public static void main(String[] args) {
        protected int count;
        public Counter(int count){
        this.count = count;
        }
        public Counter(){
        
        }
        public void incrementCount(){
        count++;
        }
        public void decrementCOunt(){
        count--;   
        } 
        public int getCount(){
        return count;
        }
        
    }// end of the main method
    

