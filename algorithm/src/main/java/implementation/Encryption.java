import java.util.Scanner;

/**
 * Created by rajesh on 11/21/2015.
 */
public class Encryption {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        text = text.replaceAll("\\s", "");
        int floor = (int) Math.floor(Math.sqrt(text.length()));
        int ceil = (int) Math.ceil(Math.sqrt(text.length()));
        int size[] = getMinArea(text.length(), floor, ceil);
        int row = size[0];
        int col = size[1];
        String test = "";
        if (row == col){
            row--;
        }
        for (int i = 0; i <= row; i++) {
            int index = i;
            while (index < text.length()) {
                test += text.charAt(index);
                index += col;
            }
            test += " ";
        }
        System.out.println(test);

    }


    private static int[] getMinArea(int length, int floor, int ceil) {
        int size[] = new int[2];
        int i = 1;
        boolean cont = false;
        while ((floor * ceil) >= length) {
            if (i % 2 != 0) {
                ceil--;
            }else {
                floor--;
            }
            i++;
            cont = true;
        }
        if(cont) {
            i--;
            if (i % 2 != 0) {
                ceil++;
            } else {
                floor++;
            }
        }
        size[0] = floor;
        size[1] = ceil;
        return size;
    }
}
