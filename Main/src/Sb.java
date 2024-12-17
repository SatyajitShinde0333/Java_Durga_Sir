import java.util.*;

class Sb {

    public static String compress(String str){
        String newStr = "";
        
        for(int i = 0; i < str.length(); i++){
            Integer count = 1;
            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count > 1){
                newStr += count.toString();
            }
            
            }
            return newStr;
    }


    
    public static void main(String[] args) {
        String str = "aaabbcccddddd";
        System.out.println(compress(str));
    }
}
//     //Upper case first letter of sentance
//     public static String toUpperCase(String str){
//         StringBuilder sb = new StringBuilder("");
//         char ch = Character.toUpperCase(str.charAt(0));
//         sb.append(ch);
//         for(int i=1;i<str.length();i++){
//             if(str.charAt(i) == ' ' && i<str.length()-1){
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));
//             }else{
//                 sb.append(str.charAt(i));
//             }
//     }return sb.toString();
// }
//     public static void main(String[] args){
//         String str = "hello, i am satyajit and im from pune";
//         System.out.println(toUpperCase(str));

//     }
// }
    //     //Append
    // public static void main(String[] args) {
    //     StringBuilder sb = new StringBuilder("");

    //     for(char ch='a'; ch<='z';ch++){
    //         sb.append(ch);
    //     }
    //     System.out.println(sb);

    // }


    // public static void main(String[] args){
    //     StringBuilder name = new StringBuilder("Isha");

    //     for(int i=0; i < name.length()/2; i++){
    //         int front = i;
    //         int back = name.length() - 1 - i;

    //         char frontchar = name.charAt(front);
    //         char backchar = name.charAt(back);

    //         name.setCharAt(back, frontchar);
    //         name.setCharAt(front, backchar);


    //     }

    //     System.out.println(name);





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






    // }





















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

