public class Duck extends Animal implements Swim {
    public Duck() {
    }

    public Duck(String name, int rasstoyanie) {
        super(name, rasstoyanie);
    }

    @Override
    public void swimAble() {

    }

    @Override
    public void swimMeters() {
        System.out.println("расстояние заплыва утки "+getRasstoyanie());
    }
}
