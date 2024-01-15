package ss7_abstractClass_interface.thuc_hanh.ClassAnimal_InterfaceEdible.InterfaceEdible;

import ss7_abstractClass_interface.thuc_hanh.ClassAnimal_InterfaceEdible.ClassAnimal.Animal;
import ss7_abstractClass_interface.thuc_hanh.ClassAnimal_InterfaceEdible.ClassAnimal.Chicken;
import ss7_abstractClass_interface.thuc_hanh.ClassAnimal_InterfaceEdible.ClassAnimal.Tiger;
import ss7_abstractClass_interface.thuc_hanh.ClassAnimal_InterfaceEdible.ClassFruit.Apple;
import ss7_abstractClass_interface.thuc_hanh.ClassAnimal_InterfaceEdible.ClassFruit.Fruit;
import ss7_abstractClass_interface.thuc_hanh.ClassAnimal_InterfaceEdible.ClassFruit.Orange;
import ss7_abstractClass_interface.thuc_hanh.ClassAnimal_InterfaceEdible.InterfaceEdible.Edible;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howeat());
            }
        }
        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Apple();
        fruit[1] = new Orange();
        for (Fruit fruit1 : fruit) {
            System.out.println(fruit1.howeat());
        }
    }
}