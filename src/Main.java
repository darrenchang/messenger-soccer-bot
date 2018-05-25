public class Main {

    public static void main(String[] args) {
        DarrenBennett footballCourt = new DarrenBennett(54,141,402,510);
        footballCourt.settings();

        try {
            for (int i=0; i<50; i++) {
                System.out.println(i);
                Thread.sleep(275);
                if (i % 10 == 0) {
                    footballCourt.clickUi("ball.png", .60f, 0, 50);
                    Thread.sleep(300);
                } else {
                    footballCourt.clickUi("ball.png", .60f, 0, 55);
                    Thread.sleep(260);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
            e.printStackTrace();
        }
    }
}
