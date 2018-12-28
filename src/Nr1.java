public class Nr1 {


    public static void main(String[] args) {

        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Yeeeete");
            }
        }
        ).run();

    }
}
