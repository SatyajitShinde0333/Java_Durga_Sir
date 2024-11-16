
import java.util.*;
class Functions{

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);

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




    public static void oddYaEven(int n){
        
        if(n % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("ODD");
        }
    
    return;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        oddYaEven(n);
    }


    }       
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