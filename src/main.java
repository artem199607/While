public class main {
    public static void main(String[] args) {
        int i = 1;
        int a = 101;
        while(i<a) {
            if (i % 7 == 0) {
                if (i % 5 == 0) System.out.println("ABBA");
                else System.out.println('B');
            } else if (i % 5 == 0) System.out.println("A");
            else System.out.println(i);
            i++;
        }

    }
}