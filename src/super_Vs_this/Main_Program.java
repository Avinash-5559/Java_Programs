package super_Vs_this;

//------------------------------ PARENT CLASS ------------------------------

class Animal {

    String name = "Animal";

    void Sound() {

        System.out.println("Animal makes sound");
    }

    Animal() {

        System.out.println("Some animal can be human's friend");
    }
}

//------------------------------ CHILD CLASS ------------------------------

class Dog extends Animal {

    String name = "Dog";

    void printNames() {
        System.out.println(super.name);                         // print parent class (Animal) variable name
        System.out.println(this.name);                          // print child/current class (Dog) variable name

    }

    void Sound() {
        System.out.println("Dog Barks");
    }

    void makeSound() {
        super.Sound();                                          // call parent class (Animal) method
        this.Sound();                                           // call child/current class (Dog) method
    }

    Dog() {
        super();                                                // call parent class (Animal) constructor
        System.out.println("Dog are human's best friend");

    }
}

//------------------------------ MAIN CLASS ------------------------------

public class Main_Program {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.printNames();
        d.makeSound();
    }
}

/*
    OUTPUT :

            Some animal can be human's friend                  - Call parent class (Animal) constructor
            Dog are human's best friend                        - Call child class (Dog) constructor
            Animal                                             - Access parent class (Animal) variable
            Dog                                                - Access child class (Dog) variable
            Animal makes sound                                 - Call parent class (Animal) method
            Dog Barks                                          - Call child class (Dog) method

*/