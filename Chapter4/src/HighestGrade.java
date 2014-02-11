import javax.swing.*;

public class HighestGrade {
    public static void main(String[] args) {
        
        String numberStudents = JOptionPane.showInputDialog("Enter the number of students: ");
        int numStudentsInteger = Integer.parseInt(numberStudents);

        String student1 = JOptionPane.showInputDialog("Enter a student name: ");
        double score1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the student's score: "));

        for (int i = 1; i < numStudentsInteger ; i++) {
           String student = JOptionPane.showInputDialog("Enter a student name:");
           double score = Integer.parseInt(JOptionPane.showInputDialog("Enter the student's score: "));

           if (score > score1) {
               student1 = student;
               score1 = score;
           }
        }
        System.out.println(student1 + "'s score is " + score1);
    } // end of the main method
}
