import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;


class Sorting {
    
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);

        }
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0; i<count.length; i++) {
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }System.out.println(" ");
    }

    public static void main(String[]args){
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};

        countingSort(arr);
        printArr(arr);
    }}





//     public static void insertionSort(int arr[]){
//         for(int i=1; i<arr.length; i++){
//             int curr = arr[i];
//             int prev = i-1;
//                 //finiding position for insertion
//             while(prev >= 0 && arr[prev] > curr){
//                 arr[prev+1] = arr[prev];
//                 prev--;
//             }
//             System.out.println(arr[i]);
//             System.out.println(arr[prev+1]);
//                 //insert elements
//             arr[prev+1] = curr;
//         }
//     }
//     public static void printArr(Integer arr[]){


        
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }System.out.println();
//     }   // Inbuilt Sorting Using Array.sort and Collections
//     public static void main(String[]args){
//         Integer arr [] = {23, 1, 10, 5, 2};
//         Arrays.sort(arr, Collections.reverseOrder());
        
//         printArr(arr);
//     }
// }


//     public static void selectionSort(int arr[]){
//         for(int i=0; i<arr.length-1; i++){
//             int minpos = i;
//             for(int j=i+1; j<=arr.length-1; j++){
//                 if(arr[minpos] > arr[j]){
//                     minpos = j; 
//                 }

//             }
//             int temp = arr[minpos];
//             arr[minpos] = arr[i];
//             arr[i] = temp; 

//         }
//     }
//     public static void printArr(int arr[]){

        
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }System.out.println();
//     }
    
//     public static void main(String[] args){
//         int arr [] = {5, 4, 1, 3, 2};
        
//         selectionSort(arr);
//         printArr(arr)
//     }
// }



//     public static void bubbleSort(int arr[]){
//         for(int i=0; i<arr.length-1; i++){
//             for(int j=0; j<=arr.length-2; j++){
//                 //swap
//                 if(arr[j] > arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;

//                 }
//             }
//         }
       
//     }

//     public static void printarr(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+ " ");
//         }System.out.println();
//     }


//     public static void main(String[]args){
//         int arr[] = {7, 3, 2, 6, 4, 5, 1};

//         bubbleSort(arr);
//         printarr(arr);
//     }
// }


//     public static void printBubbleArray(int sort[]){
//         for(int i=0; i<sort.length; i++){
//         System.out.print(sort[i] + " ");

//     }
//     System.out.println(" ");
// }


//     public static void main (String[] args){
//     int sort[] = {7,8,2,3,1};


//     // Bubble Sort
//     for(int i=0; i<sort.length-1; i++){
//         for(int j=0; j<sort.length-i-1; j++){
//             if(sort[j] > sort[j+1]){
                
//                 //Swapping
//                 int temp = sort[j];
//                 sort[j] = sort[j+1];
//                 sort[j+1]= temp;

//             }
//         }
//     }
//     printBubbleArray(sort);


// }
// }