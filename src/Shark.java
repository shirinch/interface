public class Shark extends Animal implements Swim {

    public Shark() {
    }

    public Shark(String name, int rasstoyanie) {
        super(name, rasstoyanie);
    }

    @Override
    public void swimAble() {
    }

    @Override
    public void swimMeters() {
        System.out.println("расстояние заплыва акулы "+getRasstoyanie());
    }
}
