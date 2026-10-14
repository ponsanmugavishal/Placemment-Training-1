public class Method_overloading {
    // method overloading by changing number of parameters
    public int multi(int a, int b) {
        return a * b;
    }

    // method overloading by changing number of parameters
    public int multi(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        Method_overloading obj = new Method_overloading();
        int result1 = obj.multi(1, 2);
        System.out.println(result1);
        int result2 = obj.multi(1, 2, 3);
        System.out.println(result2);
    }
}