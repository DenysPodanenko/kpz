public class Dog extends Animal {
    String breed;
    int countOfLegs;

    Dog(String name, int age, String breed)
    {
        super(name,age);
        this.breed = breed;
        this.age = age;
        countOfLegs = 4;
    }

    public void Protect()
    {
        System.out.println("Dog is protecting");
    }

    @Override
    public void voice()
    {
        System.out.println("Whoof-Whoof");
    }
}
