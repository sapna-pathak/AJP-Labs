import java.util.*;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
  
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
  
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}


public class AJPlab3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an animal to create : ");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        int choice = sc.nextInt();

        Animal animal;
        if (choice==1) {
            animal = new Dog();
        } else if (choice==2) {
            animal = new Cat();
        } else {
            System.out.println("Defaulting to Animal.");
            animal = new Animal();
        }

        animal.makeSound();
    }
}