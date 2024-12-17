import java.util.*;

class Strings{

    // Compare to String Function

    public static void main(String[]args){
        String fruits [] ={"apple", "banana", "mango"};

        String largest = fruits[0];

        for(int i=0; i<fruits.length; i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }System.out.println(largest);
    }}

//     // Find Shortest Path Distance
//     public static float findShortestPath(String path){
//         int x=0, y=0;
//         for(int i=0; i<path.length();i++){
//             char dir = path.charAt(i);
//             if(dir == 'S'){
//                 y--;
//             }else if(dir == 'N'){
//                 y++;
//             }else if(dir == 'W'){
//                 x--;
//             }else{
//                 x++;
//             }
//         }
//         int x2 = x*x;
//         int y2 = y*y;

//         return (float)Math.sqrt(x2 + y2);
//     }
//     public static void main(String[]args){
//         String path  = "WNEENNN";

//         System.out.println(findShortestPath(path));
//     }

// }

        // palindrome
//     public static String printPalindrome(String palindrome) {
//         String reverse = ""; // Initialize as an empty string
//         for (int i = palindrome.length() - 1; i >= 0; i--) { // Loop from end to start
//             reverse += palindrome.charAt(i); // Build the reversed string
//         }

//         // Check if the original string is equal to the reversed string
//         if (reverse.equals(palindrome)) {
//             System.out.println("String is Palindrome");
//         } else {
//             System.out.println("String is not Palindrome");
//         }

//         return reverse; // Return the reversed string (if needed)
//     }

//     public static void main(String[] args) {
//         Scanner str = new Scanner(System.in);
//         System.out.println("Enter a string:");
//         String palindrome = str.nextLine(); // Read input from user

//         printPalindrome(palindrome); // Call the method to check palindrome
//     }
// }


        //     //Substrings
        // String sen = "I am a Warrior";
        // String sub = sen.substring(6, sub.length());
        // System.out.println(sub);


        //Compare Method
        // String name = "Isha";
        // String name2 = "Isha";

        // if(name.compareTo(name2) == 0){
        //     System.out.println("Strings Are Equal");

        // }else{
        //     System.out.println("Strings are not Eqaul");
        // }





        //     //charAt

        // Scanner sc = new Scanner(System.in);
        // String Name = sc.nextLine();
        // String Surname = sc.nextLine();
        // String Fullname = Name + " " + Surname;

        // System.out.println(Fullname.length());

        // for (int i=0; i<Fullname.length(); i++) {
        //     System.out.println(Fullname.charAt(i));
        // }

        //   // concatenation
        // Scanner sc = new Scanner(System.in);
        // String city = sc.nextLine();
        // String district = sc.nextLine();

        // String state = city + " " + district;
        // System.out.println(state);
        
        
        
        // //String Decleartion with i/p o/p
        // Scanner sc = new Scanner(System.in);
        // String Heros = sc.nextLine();
        // System.out.println(Heros);
//     }
// }
