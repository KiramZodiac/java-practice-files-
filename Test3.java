class Animal {
    public void AnimalSound() {
        System.out.println("This is the animal sound");
    }
}

class Dog extends Animal {
    public void AnimalSound() {
        System.out.println("This is the dog sound");
    }
}

class Cat extends Animal {
    public void AnimalSound() {
        System.out.println("This is a meow cat sound");
    }
}

public class Test3 {
    public static void main(String[] args) {
        Animal objAnimal = new Animal();
        Animal objCat = new Cat();
        Animal objDog = new Dog();

        objAnimal.AnimalSound();
        objCat.AnimalSound();
        objDog.AnimalSound();
    }
}
