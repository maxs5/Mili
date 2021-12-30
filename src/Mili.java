public class Mili {
    public static void Mili(String[] args) {
        int a = 10;
        int b = 20;

        int x = (a + b) / (a * b);
        double y = (double) (a + b) / (a * b);

        System.out.println("int x: " + x);
        System.out.println("double y: " + y);
    }
}