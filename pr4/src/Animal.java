public abstract class Animal {
    String name;
    int age;
    Animal(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }

    public abstract void voice();
}
