package implementation;

public class AngryProfessor {

    public static void main(String[] args) {
        int testCases = 2;
        int noOfStudents = 4;
        int requiredStudents = 2;
        int times[] = {-2, 2, -1,0};
        int count = 0;






        for(int time : times){
            if(time < 0 || time == 0){
                count++;
            }
        }
        if(count >= requiredStudents){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
