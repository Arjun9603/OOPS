package Constructor;

class Students{
    int id;
    int age;

    Students(int id, int age){
        this.id=id;
        this.age=age;
        System.out.println("Parameterized Constructor");
    }

    Students(){
        System.out.println("Default Constructor");
    }
}


public class ConstructorDemo {
    public static void main(String[] args) {
        Students obj=new Students(); //Default Constructor is called if no parameters are passed.
        Students obj2=new Students(5,19); // Parameterized Constructor is executed at this time.
        
    }
    
}

//Constructors can be made based on number of arguments.
