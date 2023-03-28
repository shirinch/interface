import java.util.Arrays;

public class Oceanarium {
    private Shark[]sharks;
    private Turtle[]turtles;
    private Duck[]ducks;
    public Oceanarium(){}

    public Oceanarium(Shark[] sharks, Turtle[] turtles, Duck[] ducks) {
        this.sharks = sharks;
        this.turtles = turtles;
        this.ducks = ducks;
    }

    public Shark[] getSharks() {
        return sharks;
    }

    public void setSharks(Shark[] sharks) {
        this.sharks = sharks;
    }

    public Turtle[] getTurtles() {
        return turtles;
    }

    public void setTurtles(Turtle[] turtles) {
        this.turtles = turtles;
    }

    public Duck[] getDucks() {
        return ducks;
    }

    public void setDucks(Duck[] ducks) {
        this.ducks = ducks;
    }

    @Override
    public String toString() {
        return "Oceanarium{" +
                "sharks=" + Arrays.toString(sharks) +
                ", turtles=" + Arrays.toString(turtles) +
                ", ducks=" + Arrays.toString(ducks) +
                '}';
    }
}
