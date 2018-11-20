import java.util.Vector;

public class RegisterMan extends Human {
    RegisterMan(String name)
    {
        super(name);
    }

    public void addAnimal(Animal animal, Vector<Animal> journal)
    {
        journal.addElement(animal);
    }

    public void deleteAnimal(Animal animal, Vector<Animal> journal)
    {
        journal.remove(journal.indexOf(animal));
    }
}
