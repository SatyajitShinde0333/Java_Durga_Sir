import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");

        //outer loop
//        for (int i=1; i<=n; i++){
//            //Inner lop for print space
//            for (int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            //inner loop for print star
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();


//        for (int i=r; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//

//        for (int i = 1; i <= r; i++) {
//            for (int j = 1; j < c; j++) {
//                if (i == 1 || j == 1 || i == r || j == c) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("*");

//        for (int i = 1; i <= r; i++){
//            for (int j = 1; j < c; j++){
//                System.out.print("*");
//            }
//            System.out.println("*");
//        }
        }

    }
}
