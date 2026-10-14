interface father {
        public void land();
}

interface mother {
        public void gold();
}

class child implements father, mother {
        public void car() {
                System.out.println("car");
        }

        public void land() {
                System.out.println("land");
        } 
        public void gold() {
                System.out.println("gold");
        }
}

public class Multiple_inheritance {
        public static void main(String[] args) {
                child obj = new child ();
                obj.land();
                obj.gold();
                obj.car();
        }
}