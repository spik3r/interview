import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CodeReview {
    private static final Logger LOG = LoggerFactory.getLogger(CodeReview.class);
    public Integer MAX_ENTITIES = 100;
    public String APP_TITLE = "Printing " + MAX_ENTITIES + " Entities";
    public Ball b;

    private Integer getMAX_ENTITIES() {
        return MAX_ENTITIES;
    }

    public CodeReview() {
        this.b = new Ball();
    }

    public void doStuffWithBall() {
        this.b.d = 123;
        this.b.c = "pink";

    }

    public class Ball {
        public int d = 5;
        public String c = "blue";

        public void playWithBall() {
            System.out.println("Playing with ball");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private void print100Entities() {
        String output= APP_TITLE + ": ";
        for (int i=1; i<=500; i++) {
            output = output + ", ";
            output = output + i;
        }
        System.out.println(output);
    }
}
