import java.util.*;

class Bitmanipulation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Operation = sc.nextInt();
//UPDATION
        int n = 5;
        int pos = 2;

        int bitmask = 1<<pos;
// SET
        if(Operation == 1){
            int updatenum = bitmask | n;
            System.out.println(updatenum);
        }else{
            int notbitmask = ~(bitmask);
            int updatednum = notbitmask & n;
            System.out.println(updatednum);


        }
        
        
        
        
        // // CLEAR
        // int n =5;
        // int pos = 2;
        // int bitmask = 1<<pos;

        // int notbit = ~(bitmask);
        // int finalnum = notbit & n;
        // System.out.println(finalnum);


        // // SET bit manipulation
        // int n = 4;
        // int pos = 1;
        // int bitmask = 1<<pos;

        // int newsetnum = bitmask | n;
        // System.out.println(newsetnum);
      
        // // GET in Bit Manipulation
        // int n = 3;
        // int pos = 1;
        // int bitmask = 1<<pos;

        // if((bitmask & n) == 0){
        //     System.out.println("Bit is zero");
        // }else {
        //     System.out.println("Bit is one");
        // }
    }
}