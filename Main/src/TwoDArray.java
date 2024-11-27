import java.util.*;

class TwoDArray {
    public static boolean findKey(int twoDArr[][], int key) {
        for (int i = 0; i < twoDArr.length; i++) {
            for (int j = 0; j < twoDArr[0].length; j++) {
                if (twoDArr[i][j] == key) {
                    System.out.println("Found key at position: (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found.");
        return false;
    }

    public static void main(String[] args) {
        int twoDArr[][] = new int[4][4];
        int n = twoDArr.length, m = twoDArr[0].length;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                twoDArr[i][j] = sc.nextInt();
            }
        }

        // Print the 2D array
        System.out.println("The 2D array is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(twoDArr[i][j] + " ");
            }
            System.out.println();
        }

        // Find key

        findKey(twoDArr, 0);
    }
}


class TwoDArray{
    public static boolean findKey(int twoDArr[][], int key){
        
        for(int i=0; i<twoDArr.length; i++){
            for(int j=0; j<twoDArr[0].length; j++){
                if(twoDArr[i][j] == key){
                    System.out.println("Found key");
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[]args){
        int twoDArr[][] = new int[4][4];
        int n = twoDArr.length , m = twoDArr[0].length;
        
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                twoDArr[i][j] = sc.nextInt();
            }
        }
        //print
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(twoDArr[i][j] + " ");
            }System.out.println("");
        }
    }}