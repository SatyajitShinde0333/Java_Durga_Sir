import java.util.*;

class Recursion {

    public static void printFibb(int a, int b, int n){
        if(n == 0){
            return;

        }
        int c = a + b;
        System.out.println(c);
        printFibb(b, c, n-1);

    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); 
        int n = sc.nextInt();
        System.out.println("Fibbonachi Series is :");
        System.out.println(a);
        System.out.println(b);
       
        printFibb(a, b, n-2);
    }
}
// // Factorial of n number
// public static int calcfact(int n) {
// if (n == 1 || n == 0) {
// return 1;
// }
// int factori = calcfact(n - 1);
// int fact = n * factori;

// return fact;

// }

// public static void main(String[] args) {
// int n = 5;
// int ans = calcfact(n);
// System.out.println(ans);

// }
// }
// // Sum of First n natural number
// public static void sumNumb(int i, int n, int sum ){
// if(i == n){ //Base case
// sum += i;
// System.out.println(sum);
// return;
// }

// sum += i;
// sumNumb(i+1, n, sum);

// }

// public static void main(String[]args){

// sumNumb(1, 6, 0);
// }}
// public static void printNumber(int n){
// if (n == 0) {
// return;
// }
// System.out.println(n);
// printNumber(n-2);

// }

// public static void main (String[]args){
// int n = 20;
// printNumber(n);

// }
// }

// public static void printNumb(int n){
// if (n == 6){
// return;
// }
// System.out.println(n);
// printNumb(n + 1);

// }
// public static void main(String[] args){
// int n = 1;
// printNumb(n);
// }
// }