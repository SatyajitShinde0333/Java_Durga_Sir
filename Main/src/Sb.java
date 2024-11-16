import java.util.*;

class Sb {
    public static void main(String[] args){
        StringBuilder name = new StringBuilder("Isha");

        for(int i=0; i < name.length()/2; i++){
            int front = i;
            int back = name.length() - 1 - i;

            char frontchar = name.charAt(front);
            char backchar = name.charAt(back);

            name.setCharAt(back, frontchar);
            name.setCharAt(front, backchar);


        }

        System.out.println(name);





        // // Replace Characters in string index
        // name.setCharAt(3, 'A');
        // System.out.println(name);
        
        // // Track Exacat place of index element
        // System.out.println(name.charAt(0));
        // // Insert Char at any Idx
        // name.insert(1, 'S');
        // System.out.println(name);

        // // Delete any char at Idx
        // name.delete(1, 2);
        // System.out.println(name);

        // // Append add replace any character at end
        // name.append("A");
        // System.out.println(name);






    }





















    // public static void main(String[] args) {  // Corrected this line
    //     StringBuilder name = new StringBuilder("Satyajit");
    //     System.out.println(name);
    //     // charAt
    //     System.out.println(name.charAt(6));

    //     // Set char at Index
    //     name.setCharAt(0, 'I');
    //     System.out.println(name);

    //     //Insert Method 
    //     name.insert(1, 'I');
    //     System.out.println(name);

    //     // Delete
    //     name.delete(1, 2);
    //     System.out.println(name);

    //     // Append Add Char in end of the String
    //     name.append("isha");
    //     System.out.println(name);



    // }
}
