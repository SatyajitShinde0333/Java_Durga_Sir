
import java.util.*;
class Functions{
    public static int sum(int a, int b){
        return a+b;

    }
    public static float sum(float a, float b){
        return a+b;

    }

    public static void main (String[]args){
        // System.out.println(sum(2, 5));
        System.out.println(sum(2.5f, 5));
    }

}
    // public static int printSum(int x, int y){
    //     return x+y;

    // }
    // public static int printSum(int x, int y, int z){
    //     return x+y+z;

    // }
    // public static void main(String[]args){
    //     System.out.println(printSum(1,2,3));
    //     }}
    // public static int printFactorial(int n){
    //     int fact = 1;
    //     for(int i = 1; i <= n; i++){
    //         fact = fact * i;
    //     }
    //     return fact;
    // }
    // public static int bicoe(int n , int r){
    //     int fact_n = printFactorial(n);
    //     int fact_r = printFactorial(r);
    //     int fact_nmr = printFactorial(n-r);

    //     int bicoe = fact_n / fact_r * fact_nmr;

    //     return bicoe;
    // }
    // public static void main(String[]args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     // int r = sc.nextInt();
    //    System.out.println(bicoe(n, r));
    // }
    // }
//     public static void printSwap(int a, int b){
//         int temp = a;
//         a = b;
//         b = temp;
        
        
    

//     }
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         printSwap(a, b);
//         System.out.println(a);
//         System.out.println(b);
 
//     }
// }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Input the first number: ");
//         int num1 = scanner.nextInt();

//         System.out.print("Input the second number: ");
//         int num2 = scanner.nextInt();

//         System.out.print("Input the third number: ");
//         int num3 = scanner.nextInt();

//         int smallest = findSmallestNumber(num1, num2, num3);

//         System.out.println("The smallest number is: " + smallest);
//     }

//     public static int findSmallestNumber(int a, int b, int c) {
//         int smallest = a;

//         if (b < smallest) {
//             smallest = b;
//         }

//         if (c < smallest) {
//             smallest = c;
//         }

//         return smallest;
//     }
// }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         int smallest = satyajit(a, b, c);
//         System.out.print(smallest);
//     }

//     public static int satyajit(int a, int b, int c) {
//         int smallest = a;

//         if (b < smallest) {
//             smallest = b;
//         }
//         if (c < smallest) {
//             smallest = c;
//         }
//         return smallest;
//     }
// }



    // public static void oddYaEven(int n){
        
    //     if(n % 2 == 0){
    //         System.out.println("Even");
    //     }
    //     else{
    //         System.out.println("ODD");
    //     }
    
    // return;
    // }

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     oddYaEven(n);
    // }


    // }       
    // public static void calSumOdd(int n){
    //     int sum = 0;
    //     for(int i = 1; i <=n; i++) {
    //         if(i % 2 != 0) {
    //             sum += i;
    //         }
    //     }
    //     System.out.println("Sum OF Odd n Numbers :" + n + "is :" + sum);
    // }

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     calSumOdd(n);
    // }






    // public static int calAvg(int a, int b, int c){
    //     int sum = a + b + c;
    //     return sum / 3;
    // }

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc. nextInt();
    //     int c = sc.nextInt();
        
    //     System.out.println("Average is : " + calAvg(a, b, c));
    // }



    // // Factorial using function
    // public static void calcuFactorial(int n){
    //     int factorial = 1; 
    //     for(int i=n; i>=1; i--){
    //         factorial = factorial * i;
    //     }
    //     System.out.println(factorial);
    //     return;
    // }



    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     calcuFactorial(n);

    // }
   
    //     //Multiplication two numbers using Function
    // public static int calculateMul(int a, int b){
    //     return a * b;// we also direct declear without variable
       

    // }
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
        
        
    //     System.out.print("Multiplication of two Numbers: " + calculateMul(a, b));
    // }
    



    // sum of two numbers
    // public static int calculateSum(int a, int b){
    //     int sum = a + b;
    //     return sum;
    // }
    
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     int sum = calculateSum(a, b);
    //     System.out.println("Sum of two Numbers :" + sum);

    // }
//}