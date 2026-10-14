interface grandpa {
    public void land();
}

class father implements grandpa {
    public void house() {
        System.out.println("fathers house");
    }

    public void land() {
        System.out.println("Grandpa land");
        System.out.println("corn");
    }
}

class uncle implements grandpa {
    public void house() {
        System.out.println("uncles house");
    }

    public void land() {
        System.out.println("Grandpa land");
        System.out.println("rice");
    }
}

class son extends father{
    public void car() {
        System.out.println("My car");
    }
}

class cousin extends uncle{
    public void car() {
        System.out.println("cousin car");
    }
}

public class Hybrid_inheritance {
    public static void main(String[] args) {
        son obj =  new son();
        obj.land();
        obj.house();
        obj.car();

        grandpa obj1 = new son();
        obj1.land();

        cousin obj2 = new cousin();
        obj2.land();
        obj2.house();
        obj2.car();

        grandpa obj3 = new cousin();
        obj3.land();
    }
}