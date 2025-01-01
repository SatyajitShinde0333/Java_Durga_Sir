

public class RecursionBasic{
    //Print increasing numbers from 1 to n
    public static void incresing(int n){
        if(n==1){
            System.out.print(1 + " ");
            return;
        }
        incresing(n-1);
        System.out.print(n + " ");
    }
    //Print decreasing numbers from n to 1
    public static void recursion(int n){
        if(n == 100) {
            return;
        }
        System.out.print(n + " ");
        recursion(n + 1);
    }
    //Find the factorial of a number
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm = fact(n-1);
        int fn = n*fact(n-1);
        return fn;
    }
    //Find the sum of first n natural numbers
    public static int nNaturalNum(int n){
        if(n==1){
            return 1;
        }
        int snm1 = nNaturalNum(n-1);
        int sn = n + nNaturalNum(n-1);
        return sn;
    }

    //Find the nth fibonacci number
    public static int fibbo(int n ){
        if(n == 0 || n == 1){
            return n;

    
        }

        int nm1 = fibbo(n-1);
        int nm2 = fibbo(n-2);
        int fn = nm1 + nm2;
        return fn;
    }

    //Given array if Sorted or not
    public static boolean isSorted(int[] arr, int si){
        if(si == arr.length-1){
            return true;
        }
        if(arr[si] > arr[si+1]){
            return false;
        }
        
        return isSorted(arr, si+1);
    }
    // Find First Occurence of a number in an array
    public static int firstOccurence(int[] arr, int i, int key){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, i+1,key);
    }
    
    // tilling Problem
    public static int tilingProblem(int n){
        //base case 
        if(n==0 || n==1){
            return 1;
        }
        // // vertical 
        // int fnm1 = tillingProblem(n-1);
        // // horizontal
        // int fmn2 = tillingProblem(n-2);
        // int totalways = fnm1 + fmn2;
        // return totalways;
        return (tilingProblem(n-1) + tilingProblem(n-2));
        
    }
    // remove duplicates from a string
    public static void removeDuplicate(String str, int idx, StringBuilder newstr, boolean map[] ){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            removeDuplicate(str, idx+1, newstr, map);
        }else{
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx+1, newstr.append(currChar), map);
        }
    }

    // Friends pairing problem
    public static int freindsPairing(int n){
        if(n==1 || n==2){
            return n;
        }


        // // choice single
        // int fnm1 = freindsPairing(n-1);
        // // choice pair
        // int fnm2 = freindsPairing(n-2)*(n-1);
        // int totalways = fnm1 + fnm2;
        // return totalways;

        return freindsPairing(n-1) + freindsPairing(n-2)*(n-1);
    }

    //binary String problem
    public static void binaryStrProb(int n, int lastpla, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        binaryStrProb(n-1, 0, str + "0");
        if(lastpla == 0){
            binaryStrProb(n-1, 1, str + "1");
        }
    }
    public static void main(String[]args){
      
       binaryStrProb(3, 0,"");
    }
    
    
}