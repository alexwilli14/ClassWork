public class Test {
    public static void main(String[] args) {
        int u = 3;
        int v = 5;
        u += v;
        v += u;
        u -= v;
        v -= u;
        System.out.println (u + ", " + v);
    }
}
