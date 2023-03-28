public class Main {
    public static void main(String[] args) {
    Shark shark1 = new Shark("lolo",10);
    Shark shark2 = new Shark("mimi",110);
    Shark shark3 = new Shark("sh",90);
    Shark shark4 = new Shark("dori",45);
    Shark shark5 = new Shark("yolo",100);
    Shark[]sharks={shark1,shark2,shark3,shark4,shark5};
    Duck duck1 = new Duck("donald",67);
    Duck duck2 = new Duck("charlie",10);
    Duck duck3 = new Duck("kiki",45);
    Duck duck4 = new Duck("mary",78);
    Duck duck5 = new Duck("shawny",90);
    Duck[]ducks={duck1,duck2,duck3,duck4,duck5};
    Turtle turtle1 = new Turtle("gigi",10);
    Turtle turtle2 = new Turtle("bibi",11);
    Turtle turtle3 = new Turtle("io",39);
    Turtle turtle4 = new Turtle("soul",99);
    Turtle turtle5 = new Turtle("sannu=y",14);
    Turtle[]turtles={turtle1,turtle2,turtle3,turtle4,turtle5};
    Oceanarium ocean = new Oceanarium(sharks,turtles,ducks);
    Animal[][]animals={turtles,ducks,sharks};
        for (int i = 0; i < animals.length; i++) {
            for (int j = 0; j < animals[i].length; j++) {
                if(animals[i][j].getClass()==Turtle.class){
                Turtle one = (Turtle)animals[i][j];
                one.swimMeters();
                } else if (animals[i][j].getClass()==Shark.class) {
                    Shark one = (Shark)animals[i][j];
                    one.swimMeters();
                } else if (animals[i][j].getClass()==Duck.class) {
                   Duck one = (Duck)animals[i][j];
                   one.swimMeters();
                }
            }
        }
        shark5.swimMeters();
        duck2.swimMeters();




    }
}