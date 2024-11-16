import java.util.*;

class Arrays{

     
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int size = sc.nextInt();

    //     int arrayFormUser[] = new int [size];
    //     for(int i=0; i<size; i++){
    //         arrayFormUser[i] = sc.nextInt();
    //     } 
    //     for(int i=0; i<size; i++){
    //         System.out.println(arrayFormUser[i]);
    //     }

    // }

        //take array form user and search element in array
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arrays[] = new int[size];

        //input
        for(int i=0; i<size; i++){
            arrays[i] = sc.nextInt();
        }
        //searching element
        int x = sc.nextInt(); 
        for(int i=0; i<size; i++) // Size cha jagevr (arrays.length) for searching lng



        {
            if(x == arrays[i]){
                System.out.println("Found At Idx: " + i);
            }
        }
    


        
        //User input array

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];
        //input
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        //output
        for(int i=0; i<size; i++){
            System.out.println(numbers[i]);
        }
    }




// // defining a array 2nd method 
//         int marks[] = {99, 98, 93};
//         for(int i=0; i<3; i++){
//             System.out.println(marks[i]);
//         }
        


            // defing array 1 st method
        // int[] rollout = new int[5];
        // rollout[0] = 50;
        // rollout[1] = 26;
        // rollout[2] = 30;
        // rollout[3] = 32;
        // rollout[4] = 54;
        // // System.out.println(rollout[0]);
        // for(int i=0; i<5; i++){
        //     System.out.println(rollout[i]);
        // }


    }
//}