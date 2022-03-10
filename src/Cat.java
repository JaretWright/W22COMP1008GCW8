public class Cat extends Pet
{
    /**
     * Constructor that ensures the pet has a name
     *
     * @param name
     */
    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "meow";
    }
}
