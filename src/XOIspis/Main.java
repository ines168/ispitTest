package XOIspis;

public class Main {
    public static void main(String[] args) {
        for(int i = 1; i<=10; i++) {
            for(int j = 1; j<=10; j++) {
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
