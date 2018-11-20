public class Cachlot extends Animal {
    int size;
    Cachlot(String name, int age, int size)
    {
        super(name,age);
        this.size = size;
    }

    @Override
    public void voice()
    {
        System.out.println("Ooup-Ooup");
    }
}
