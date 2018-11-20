import java.util.Vector;

public class Veterinarian extends Human {
    Veterinarian(String name) {
        super(name);
    }

    public void inspectAnimal(Animal animal)
    {
        System.out.println("Inspectation animal");
    }

    public void setTherapy() {
        System.out.println("Therapy was seted");
    }

    public void doTherapy(Vector<String> reestr, String changeLog)
    {
        IclinicMethods.doTherapy();
        IclinicMethods.reestrChange(reestr, changeLog);
    }
}
