    public class Crow extends Bird implements Flyable, Huntable, MakesSounds {

        public Bird(double weight) {
            super(weight);
        }

        public void eat(int n) {
            System.out.println(this + " сьела " + n + " кг корма в день");
        }
    }

