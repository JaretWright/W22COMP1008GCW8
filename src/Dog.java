public class Dog extends Pet{
    private boolean hypoallergenic;

    /**
     * Constructor that ensures the pet has a name
     *
     * @param name
     */
    public Dog(String name, boolean hypoallergenic) {
        super(name);
        this.hypoallergenic = hypoallergenic;
    }

    @Override
    public String speak() {
        return "woof woof";
    }
}
