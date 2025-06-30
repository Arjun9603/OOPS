package Inheritance;

class Animal {
    void eat() {
        System.out.println(" eats");
    }
}

class Dog extends Animal {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.print("Dog");
        d.eat(); // Output: Dog eats
    }
}







