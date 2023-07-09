import processing.core.PApplet;

public class FourBallOops extends PApplet {

    private static final int HEIGHT = 500;
    private static final int WIDTH = 500;
    private static final float PLACEMENT_OF_BALL_ONE = ((float) 1 / 5);
    private static final float PLACEMENT_OF_BALL_TWO = ((float) 2 / 5);
    private static final float PLACEMENT_OF_BALL_THREE = ((float) 3 / 5);
    private static final float PLACEMENT_OF_BALL_FOUR = ((float) 4 / 5);
    private static final int SHAPE_WIDTH = 25;
    private static final int SHAPE_HEIGHT = 25;
    public static final int xCoordinate = 0;
    public static final int speedOfBallOne = 1;
    public static final int speedOfBallTwo = 2;
    public static final int speedOfBallThree = 3;
    public static final int speedOfBallFour = 4;

    private Ball ballOne;
    private Ball ballTwo;
    private Ball ballThree;
    private Ball ballFour;

    public static void main(String[] args) {
        PApplet.main("FourBallOops", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();

        float ballOneY = getHeightByPlacement(PLACEMENT_OF_BALL_ONE);
        float ballTwoY = getHeightByPlacement(PLACEMENT_OF_BALL_TWO);
        float ballThreeY = getHeightByPlacement(PLACEMENT_OF_BALL_THREE);
        float ballFourY = getHeightByPlacement(PLACEMENT_OF_BALL_FOUR);

        ballOne = new Ball(xCoordinate, ballOneY, SHAPE_WIDTH, SHAPE_HEIGHT, speedOfBallOne);
        ballTwo = new Ball(xCoordinate, ballTwoY, SHAPE_WIDTH, SHAPE_HEIGHT, speedOfBallTwo);
        ballThree = new Ball(xCoordinate, ballThreeY, SHAPE_WIDTH, SHAPE_HEIGHT, speedOfBallThree);
        ballFour = new Ball(xCoordinate, ballFourY, SHAPE_WIDTH, SHAPE_HEIGHT, speedOfBallFour);
    }

    @Override
    public void draw() {
        ballOne.drawCircle();
        ballTwo.drawCircle();
        ballThree.drawCircle();
        ballFour.drawCircle();
    }

    private float getHeightByPlacement(float placement) {
        return HEIGHT * placement;
    }

    private class Ball {
        private float xAxis;
        private float yAxis;
        private int width;
        private int height;
        private int speed;

        public Ball(float xAxis, float yAxis, int width, int height, int speed) {
            this.xAxis = xAxis;
            this.yAxis = yAxis;
            this.width = width;
            this.height = height;
            this.speed = speed;
        }

        public void drawCircle() {
            ellipse(xAxis, yAxis, width, height);
            xAxis += speed;
        }
    }
}