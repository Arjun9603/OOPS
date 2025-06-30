package Inheritance;
// 1.Single Level Inheritance
//2 .MultiLevel Inheritance.
class A{
    void showA(){
        System.out.println("A class method");
    }
}

class B extends  A{
    void showB(){
        System.out.println("B class Method");
    }
}

class D extends B{
    void showC(){
        System.out.println("C class Method");
    }
}

class E extends A{


    public static void main(String[] args) {
        A obj=new A();
        obj.showA(); //Only A class method will be called by object of class A
        System.out.println("-----------------------");
        B obj1=new B();
        obj1.showA(); // Method of both child and parent class is called by object of child/subclass object.
        obj1.showB();
        System.out.println("-----------------------");

        D obj2=new D();
        obj2.showA();
        obj2.showB();
        obj2.showC(); // MultiLevel Inheritance.
        System.out.println("----------------------");

        E obj5=new E(); // obj5 only access A class methods.
        obj5.showA();
        
    } //Multiple Inheritance is not available in JAVA due to ambiguity error.
    //Hybrid Inheritance i also absent due to the combination of Multiple and Hierarchial Inheritance.
}

