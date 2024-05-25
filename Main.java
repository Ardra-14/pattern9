import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = s.nextInt();
        for(int i = rows ; i >= 1 ; i--){
            for (int j = 1 ; j <= ((2 * rows)+1); j++){
                if((i + j <= (2 * i)) || (i + j >= (2 * rows)+2)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i = 1 ; i <= rows ; i++){
            for (int j = 1 ; j <= (((2 * rows)+1)); j++){
                if((i + j <= (2 * i)) || (i + j >= (2 *  rows)+2)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}