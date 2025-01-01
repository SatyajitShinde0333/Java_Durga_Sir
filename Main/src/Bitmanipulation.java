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
            //Clear i th Bits any ith bits 
    public static int clearLastIth(int n, int i){
        int bitmask= (-1)<<i; //also use ~(0)
        return n & bitmask;
    }
    // in Range cleaar Bit 
    public static int clearRangeinBit(int n, int i, int j){
        int  a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitmask = a | b;

        return n & bitmask;
    }

    // number is 2 power is not yes 
    public static boolean checkPower(int n){
        return (n & (n-1)) == 0;
    }
    // Count Set number in Bit
    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){
                count++;
            }
            n = n >> 1;
        }return count;
    }
    // Fast Expoenetial
    public static int fastExpo(int n, int a){
        int ans = 1;
        while(n>0){
            if((n & 1) != 0){
                ans = ans * a;
                }
                a = a * a;
                n = n >> 1;
                }
                return ans;
        }


    public static void main(String[] args){
        System.out.println(fastExpo(3, 5));
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




