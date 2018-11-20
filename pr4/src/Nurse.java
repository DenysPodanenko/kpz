import java.util.Vector;

public class Nurse extends Human{
    Nurse(String name)
    {
        super(name);
    }

    public void doTherapy(Vector<String> reestr, String changeLog)
    {
        IclinicMethods.doTherapy();
        IclinicMethods.reestrChange(reestr, changeLog);
    }
}
