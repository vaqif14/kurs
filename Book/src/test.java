public class test {
    public static void main(String[] args) {
        int orig = 42;
        test x = new test();
        int y = x.go(orig);
        System.out.println(y);
    }

     int go(int arg) {
        arg = arg * 2;
        return arg;
    }
}
