import java.util.Scanner;

public class UtopianTree {

    public static void main(String[] args) {
        int testCases;
        Scanner in = new Scanner(System.in);
        testCases = in.nextInt();
        if (testCases > 0 && testCases <= 10) {
            for (int i = 0; i < testCases; i++) {
                int cycle = in.nextInt();
                int size = 1;
                boolean isSpring = true;
                while (cycle > 0){
                    if(isSpring){
                        size = size + size;
                    }else{
                        size = size + 1;
                    }
                    isSpring = !isSpring;
                    cycle--;
                }
                System.out.println(size);
            }
        }
    }
}
