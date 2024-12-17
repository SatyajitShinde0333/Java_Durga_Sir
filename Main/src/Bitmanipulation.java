import java.util.*;

class Bitmanipulation{


        //Clear Ith Bit
    public static int clearIthBit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
        //Set ith Bit
    public static int setIthBit(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    //  //Get ith Bit
    
    // public static int getithBit(int n, int i){
    //     int bitmask = 1<<i;
    //     if((n & bitmask)==0){
    //         return 0;
    //     }else{
    //         return 1;
    //     }
    // }
    
    //Update
    public static int update(int n, int i, int newBit) {
        // if( newBit == 0){
        //     return clearIthBit(n, i);
        // }else{
        //     return setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int bitmask = newBit << i;
        return n|bitmask;
    }
    public static void main(String[] args){
        System.out.println(update(10, 2, 0));
    }
    }
    // public static void oddEven(int n){
    //     int bitmask = 1;
    //     if((n & bitmask )== 1){
    //         System.out.println("Number is ODD");
    //     }else{
    //         System.out.println("Number is EVEn ");
    //     }
    // }
    
    // public static void main(String[]args){
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Enter a Number :");
    //     int n = sc.nextInt();
    //     oddEven(n);
        


    // }




    //                 //AND OR XOR One's oprerator shifts
//     public static void main(String[] args) {
//         System.out.println(5^6);
// }




