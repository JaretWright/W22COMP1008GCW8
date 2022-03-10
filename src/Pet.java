public abstract class Pet {
    private String name;

    /**
     * Constructor that ensures the pet has a name
     * @param name
     */
    public Pet(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().length()>=2)
            this.name = name;
        else
            throw new IllegalArgumentException("name must be 2 or more characters");
    }

    public abstract String speak();
}
