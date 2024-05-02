/* Write a program that will grade multiple-choice test. Assume there are 
eight students and ten questions, and the answers are stored in a two
dimensional array. Each row records a student’s answers to the questions, 
as shown in the following array.
The key is stored in a one-dimensional array:
 */

import java.util.Scanner;

public class lab3rev1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the no of students:");
        int sn = s.nextInt();
        System.out.println("enter the no of questions: ");
        int nq = s.nextInt();
        int[][] stu = new int[sn][nq];
        for (int i=0;i<sn;i++){
            for(int j=0;j<nq;j++){
                System.out.println("enter the answer entered by "+(i+1)+" for the question "+(j+1));
                stu[i][j]=s.nextInt();
            }
        }
        int[] key = new int[nq];
        for(int i=0;i<nq;i++){
            System.out.println("enter the answer for the question "+(i+1));
            key[i]=s.nextInt();
        }
        int[] marks = new int[sn];
        for(int i=0;i<sn;i++){
            for(int j=0;j<nq;j++){
                if(stu[i][j]==key[j]){
                    marks[i]=marks[i]+1;
                }
            }
        }
        System.out.println("Marks obtained by each student:");
        for (int i = 0; i < sn; i++) {
             System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

    }
   
}
