public class Backtracking{

    public static void changeArr(int arr[], int i, int val){
        //base case
        if(i == arr.length){
            printarr(arr);
            return;
        }

        //recursive case
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i]=arr[i]-2;
    }

    public static void printarr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        } System.out.println(" ");
    }


    public static void findSub(String str, int i, String ans){
        //base case
        if (i==str.length()){
            if(ans.length() == 0){
                System.out.println("Null");
            }else{
                 System.out.println(ans);

            }
           
            return;
        }
        //recursion for yes
        findSub(str, i+1, ans+str.charAt(i));
        //recursion for no
        findSub(str, i+1, ans);
    }
    public static void main(String[] args){
        String str = "abc";
        int arr[] = new int[5];
        findSub(str, 0, "");

    }
}