public abstract class Animal {
    private String name;

    private int rasstoyanie;

    public Animal(){}
    public Animal(String name, int rasstoyanie) {
        this.name = name;
        this.rasstoyanie = rasstoyanie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRasstoyanie() {
        return rasstoyanie;
    }

    public void setRasstoyanie(int rasstoyanie) {
        this.rasstoyanie = rasstoyanie;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\''+ "rasstoyanie="+rasstoyanie+
                '}'+ "\n";
    }
}
