import java.util.*;

class Arrays{
    public static int trappingRain(int height[]){
        // leftmax Boundry
        int leftmax [] = new int[height.length];
        leftmax[0] = height[0];
        for(int i = 1; i<height.length; i++){
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        // rightmax Boundry

        int rightmax[] = new int[height.length];
        rightmax[height.length -1 ] = height[height.length-1];
        for(int i=height.length - 2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }
        // loop
        int trappedWater = 0;
        for(int i=0; i<height.length; i++){
            // Water level
            int waterlevel = Math.min(leftmax[i], rightmax[i]);

            // trapped water

            trappedWater += waterlevel - height[i];
        }
        return trappedWater;
    }
    
    public static void main(String[]args){
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappingRain(height));
    }}
    // public static void kadanesAlgo(int number[]){

    //     int currsum = 0;
    //     int maxsum = Integer.MIN_VALUE;

    //     for(int i=0; i<number.length; i++){
    //         currsum = currsum + number[i];
    //         if(currsum < 0){
    //             currsum = 0;
    //         }
    //         maxsum = Math.max(currsum, maxsum);
            
    //     }
    //     System.out.println(maxsum);

    // }
    // public static void main(String[]args){
    //     int number[] = {-2, -3, 4, -1, -2, 1, 5, -3};
    
    //     kadanesAlgo(number);
    // }
    // }
//     public static void maxSumArr(int number[]){
//         int currsum = 0;
//         int maxsum = Integer.MIN_VALUE;

//         for(int i=0; i<number.length; i++){
//             int start = i;
            
//             for(int j=i; j<number.length; j++){
//                 int end = j;
//                 currsum = 0;
//                 for(int k=start; k<=end; k++){
//                     currsum += number[k];
//                 }System.out.println(currsum);
//                 if(maxsum < currsum){
//                     maxsum = currsum;

                    
//                 }
//             }
//         }System.out.println("max sum of Array"+ maxsum);
//     }
//     public static void main(String[]args){
//         int number [] = {2, 4, 6, 8, 10};
//         maxSumArr(number);
//     }
// }
   
   // public static void printSubArr(int number[]){
    //     for(int i=0; i<number.length; i++){
    //         int start = i;
    //         for(int j=i; j<number.length; j++){
    //             int end = j;

    //             for(int k=start; k<=end; k++){
    //                 System.out.print(number[k] + " ");
    //             }
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String[]args){
    //     int number[] = {2, 4, 6, 8, 10};
    //     printSubArr(number);
    // }}
   
   
    // public static void pairsArr(int number[]){
    //     int start = 0, end = number.length-1;
    //     for(int i=0; i<number.length; i++){
    //         int current = number[i];
    //         for(int j=i+1; j<number.length; j++){
    //             System.out.print("(" + current + "," + number[j] + ")" );
    //         } System.out.println();
    //     } 
        
    // }
    
    

//     public static int reverseArr(int number[]){
//         int start = 0, end = number.length-1;

//         for(int i=0; i<number.length; i++){
//             int temp = number[end];
//             number[end] = number[start];
//             number[start] = temp;
//         }return 1; 
//     }
    
//     public static void main(String[]args){
//         int number[] = {2, 4, 6, 8, 10};
//         System.out.println(reverseArr(number));
//     }

// }



    // public static int findlarge(int arr[]){
    //     int largest = Integer.MIN_VALUE;
    //     for(int i=0; i<arr.length; i++){
    //         if(largest<arr[i]){
    //             largest = arr[i];
    //         }
    //     }return largest;
    // }
    // public static void main(String[]args){
    //     int arr[] = {1, 2, 3, 4, 5, 66, 7};

    //     System.out.println(findlarge(arr));
    // }}




//     public static int linSearch(int n[], int luc_no){
//         for( int i = 0; i < n.length; i++){
//             if (luc_no == n[i]){
//                 return i;   
//             }
//         } return 1;
//     }
    
//     public static void main(String[] args){
//         int n[] = {1, 34, 4, 14, 28, 87, 77};
//         int luc_no = 28; 
//         System.out.println("Lucky Number 28 found At Idx:"+ linSearch(n, luc_no));
//     } 
// }




    // public static void main(String[]args){
    //     String satyajit[] = new String[1000];
    //     Scanner sc = new Scanner(System.in);
    //     satyajit[0] = sc.nextLine();
    //     System.out.println("Satyajit & "+ satyajit[0]);
    // }}

     
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

    //     //take array form user and search element in array
    // public static void main(String[] args){

    //     Scanner sc = new Scanner(System.in);
    //     int size = sc.nextInt();

    //     int arrays[] = new int[size];

    //     //input
    //     for(int i=0; i<size; i++){
    //         arrays[i] = sc.nextInt();
    //     }
    //     //searching element
    //     int x = sc.nextInt(); 
    //     for(int i=0; i<size; i++) // Size cha jagevr (arrays.length) for searching lng



    //     {
    //         if(x == arrays[i]){
    //             System.out.println("Found At Idx: " + i);
    //         }
    //     }
    


        
    //     //User input array

    //     Scanner sc = new Scanner(System.in);
    //     int size = sc.nextInt();

    //     int numbers[] = new int[size];
    //     //input
    //     for(int i=0; i<size; i++){
    //         numbers[i] = sc.nextInt();
    //     }
    //     //output
    //     for(int i=0; i<size; i++){
    //         System.out.println(numbers[i]);
    //     }
    // }




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


    // }
//}