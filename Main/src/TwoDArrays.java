import java.util.*;

class TwoDArrays{


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Rows:");
        int row = sc.nextInt();

        System.out.println("Enter number of Coloumns:");
        int col = sc.nextInt();

        
        int findX [][] = new int[row][col];
        System.out.println("Entr Elements of Rows & Cols:");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                findX[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Enter X Element to Findout:");
        int x = sc.nextInt();
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){

                if(findX[i][j] == x){
                    System.out.println("X is Found At(" + i + ", " + j + ")");
                }
            }
        }






      // 2D array for print matrix
    // public static void main(String[]args){
    //     Scanner sc = new Scanner(System.in);
        
    //     int row = sc.nextInt();
        
    //     int col = sc.nextInt();

    //     int twoD[][] = new int [row][col];

    //     //input rows
    //     for(int i=0; i<row; i++) {
    //         //input coloumns
    //             for(int j=0; j<col; j++) {                  
    //                 twoD[i][j] = sc.nextInt();
    //             }
                
    //     }

    //     // output rows
    //     for(int i=0; i<row; i++){
    //         //output coloumns
    //         for(int j=0; j<col; j++){
    //             System.out.print(twoD[i][j] + " ");

    //         }
    //         System.out.println();
    //     }

    }
}   