package gradecalculator;

import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int total= 0;
        char finalGrade;
        System.out.print("How many subjects do you have: ");
        int n= input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the grade(over 100) for subject "+i+": ");
            int grade= input.nextInt();
            if(grade < 0 || grade > 100){
                System.out.println("Please enter a valid grade.");
                i--;
            }
            else{
                total+= grade;
            }
        }
        double average= ((double)total)/n;
        if(average >= 90){
            finalGrade= 'A';
        }
        else if(average >= 80){
            finalGrade= 'B';
        }
        else if(average >= 70){
            finalGrade= 'C';
        }
        else if(average >= 60){
            finalGrade= 'D';
        }
        else{
            finalGrade= 'F';
        }
        
        System.out.println("Your total grades are: "+total+", the final average is: "+String.format("%,.2f", average)+", and your final grade is: "+finalGrade);
    }
    
}
