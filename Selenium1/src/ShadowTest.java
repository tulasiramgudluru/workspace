
public class ShadowTest {//Nested class

    public String x = "ram";

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(double x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
        }
    }

    public static void main(String... args) {
        ShadowTest st = new ShadowTest();
        ShadowTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23.50);
    }
}