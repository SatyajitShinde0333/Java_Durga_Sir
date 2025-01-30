class Superkey {
    public static void main(String[] args) {

        Men satya = new Men();
        
       
    }   
}


class Human {
    Human(){
        System.out.println("Human class constructor");  
    }
}

class Men extends Human {
    Men(){
        super();
        System.out.println("All mens Are walking");
    }
}