package OOPS;
public class Oops1{
    int license_id;
    String name;

    public void eat(){ //Method
        System.out.println(name+" eats");
    }
    public static void main(String[] args) {
        Oops1 dog=new Oops1();
        dog.name="bruno";
        dog.eat(); //Method Calling
    }
}


