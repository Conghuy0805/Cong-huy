package ss7_abstractClass_interface.thuc_hanh.ClassAnimal_InterfaceEdible.ClassAnimal;

import ss7_abstractClass_interface.thuc_hanh.ClassAnimal_InterfaceEdible.InterfaceEdible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howeat() {
        return "could be fried";
    }
}
