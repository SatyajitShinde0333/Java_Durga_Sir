import java.util.*;

class Bitmanipulation{
    public static void main(String[] args){
        int n = 3;
        int pos = 2;
        int bitmask = n<<pos;

        if((bitmask & n) == 0){
            System.out.println("Bit is zero");
        }else {
            System.out.println("Bit is one");
        }
    }
}