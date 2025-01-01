public class DividenConqure {
    public static void printarr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int arr[], int lo, int hi){
        if(lo == hi){
            return;
        }
        int mid = (lo + hi) / 2;
        mergeSort(arr, lo, mid);
        mergeSort(arr, mid+1, hi);
        merge(arr, lo, mid, hi);
    }
    public static void merge(int arr[], int lo, int mid, int hi){
        int n = mid - lo + 1;
        int m = hi - mid;
        int left[] = new int[n];
        int right[] = new int[m];
        for(int i = 0; i < n; i++){
            left[i] = arr[lo + i];
        }
        for(int i = 0; i < m; i++){
            right[i] = arr[mid + 1 + i];
        }
        int i = 0;
        int j = 0;
        int k = lo;
        while(i < n && j < m){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < n){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < m){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
    public static void quickSort(int arr[], int lo, int hi){
        if(lo > hi){
            return;
        }
        int pivot = arr[hi];
        int pi = partition(arr, pivot, lo, hi);
        quickSort(arr, lo, pi-1);
        quickSort(arr, pi+1, hi);
    }
    public static int partition(int arr[], int pivot, int lo, int hi){
        int i = lo;
        int j = lo;
        while(i <= hi){
            if(arr[i] > pivot){
                i++;
            }else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }
        return j-1;


    }


    /// Search rotated Sorted Array
    // public static int search(int arr[], int tar, int si, int ei){

    //     //base case
    //     if(si > ei){
    //         return -1;
    //     }
        
    //     //mid calculation
    //     int mid = (si + (ei - si)) / 2;
           
        
    //     // mid found on target

    //     if(arr[mid] == tar){
    //         return mid;
    //     }

    //     // Mid on L1
    //     if(arr[si]<= arr[mid]){
    //         // Target on L1
    //         if(arr[si]<= tar && tar <= arr[mid]){
    //             return search(arr, tar, si, mid-1);
    //         }else{
    //             return search(arr, tar, mid+1, ei);
    //         }  
            
    //     }
    //     // Target on L2
    //     else{
    //         //case c
    //         if(arr[mid] <= tar && tar <= arr[ei]){
    //             return search(arr, tar, mid+1, ei);
    //         }
    //         //case d
    //         else{
    //             return search(arr, tar, si, mid-1);
    //         }
    //     }        



    // }

    public static void search(int arr[], int tar){

         for(int i = 0; i < arr.length; i++){
              if(arr[i] == tar){
                tar = i;
                System.out.println(tar);
              }
         }
    }
    public static void main(String[] args){
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
       
        // // mergeSort(arr, 0, arr.length-1);
        // quickSort(arr, 0, arr.length-1);
        // printarr(arr);

        // int target = 7;
        search(arr, 2);

    }
}