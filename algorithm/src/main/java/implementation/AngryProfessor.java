import java.util.Scanner;
public class AngryProfessor {

    public static void main(String[] args) {
        int testCases;
        int noOfStudents;
        int requiredStudents;
        Scanner in = new Scanner(System.in);
        testCases  = in.nextInt();
        if(testCases >0 && testCases <= 10) {
            String[] results = new String[testCases];
            for (int i = 0; i < testCases; i++) {
                int studentCount = 0;
                noOfStudents = in.nextInt();
                requiredStudents = in.nextInt();
                while (noOfStudents > 0) {
                    int time = in.nextInt();
                    if(time <= 0){
                        studentCount++;
                    }
                    noOfStudents--;
                }
                if (studentCount >= requiredStudents){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }
        }
    }
}
