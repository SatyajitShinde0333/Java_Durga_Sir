import java.util.Scanner;


class Sorting {
    public static void printBubbleArray(int sort[]){
        for(int i=0; i<sort.length; i++){
        System.out.print(sort[i] + " ");

    }
    System.out.println(" ");
}


    public static void main (String[] args){
    int sort[] = {7,8,2,3,1};


    // Bubble Sort
    for(int i=0; i<sort.length-1; i++){
        for(int j=0; j<sort.length-i-1; j++){
            if(sort[j] > sort[j+1]){
                
                //Swapping
                int temp = sort[j];
                sort[j] = sort[j+1];
                sort[j+1]= temp;

            }
        }
    }
    printBubbleArray(sort);


}
}