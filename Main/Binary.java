import java.util.*;

class Binary{
    public static void reverseArr(int n[]){
        int start = 0, end = n.length - 1;

        while(start < end){
            int temp = n[end];
            n[end] = n[start];
            n[start] = temp;

            start++;
            end--;

        }
        
    }
    public static void main(String[]args){
        int n [] = {2, 4, 6, 8, 10, 12};
        reverseArr(n);
        for(int i=0; i<n.length; i++){
            System.out.print(n[i] + " ");
        }
        System.out.println();
    
    }
}


    //     public static int searchBinary(int n[], int key){
//         int start = 0, end = n.length-1;
        
//         while(start <= end){
//             int mid = (start + end)/2;

//             if(n[mid] == key){
//                 return mid;
//             }
//             if(n[mid] < key){
//                 start = mid+1;

//             }
//             else{
//                 end = mid - 1;
//             }

//         }return -1;
        
//     }
//     public static void main(String[]args){
//         int n [] = {2, 4, 6, 8, 10, 12};
//         int key = 2;
         
//         System.out.println(searchBinary(n,key));
    
//     }
// }