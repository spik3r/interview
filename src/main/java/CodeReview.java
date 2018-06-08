public class CodeReview {
    public Ball ball;


    public CodeReview() {
        this.ball = new Ball();
    }

    public void doStuffWithBall() {
        this.ball.diameter = 123;
        this.ball.colour = "pink";

    }

    public class Ball {
        public int diameter = 5;
        public String colour = "blue";
    }
}
