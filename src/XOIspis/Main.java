package XOIspis;

public class Main {
    public static void main(String[] args) {
        iscrtaj(10, 10);
    }
    public static void iscrtaj(int x, int y) {
        for(int i = 1; i<=x; i++) {
            for(int j = 1; j<=y; j++) {
                if(i%2==0) {
                    System.out.print("o");
                } else {
                    System.out.print("x");
                }
            }
            System.out.print("\n");
        }
    }
}
