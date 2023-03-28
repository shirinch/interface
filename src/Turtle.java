public class Turtle extends Animal implements Swim{
    public Turtle() {
    }

    public Turtle(String name, int rasstoyanie) {
        super(name,rasstoyanie);
    }

    @Override
    public void swimAble() {

    }

    @Override
    public void swimMeters() {
        System.out.println("расстояние заплыва черепахи "+ getRasstoyanie());
    }

}
