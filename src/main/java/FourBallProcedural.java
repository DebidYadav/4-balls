import processing.core.PApplet;

public class FourBallProcedural extends PApplet {

    private static final int HEIGHT = 500;
    private static final int WIDTH = 500;
    private static final float placementOfBallOne = ((float) 1 / 5);
    private static final float placementOfBallTwo = ((float) 2 / 5);
    private static final float placementOfBallThree = ((float) 3 / 5);
    private static final float placementOfBallFour = ((float) 4 / 5);
    private static final int shapeWidth = 25;
    private static final int shapeHeight = 25;
    private int circleOneCoordinate = 0;
    private int circleTwoCoordinate = 0;
    private int circleThreeCoordinate = 0;
    private int circleFourCoordinate = 0;


    public static void main(String[] args){
        PApplet.main("FourBallProcedural", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {
        drawCircleOne(circleOneCoordinate, getyCoordinate(placementOfBallOne));
        drawCircleTwo(circleTwoCoordinate, getyCoordinate(placementOfBallTwo));
        drawCircleThree(circleThreeCoordinate, getyCoordinate(placementOfBallThree));
        drawCircleFour(circleFourCoordinate, getyCoordinate(placementOfBallFour));
    }

    private float getyCoordinate(float placementOfBallOne) {
        return HEIGHT * placementOfBallOne;
    }

    void drawCircleOne(float xCoordinate, float yCoordinate){
        ellipse(xCoordinate,yCoordinate, shapeWidth, shapeHeight);
        circleOneCoordinate++;
    }

    void drawCircleTwo(float xCoordinate, float yCoordinate){
        ellipse(xCoordinate,yCoordinate, shapeWidth, shapeHeight);
        circleTwoCoordinate+=2;
    }

    void drawCircleThree(float xCoordinate, float yCoordinate){
        ellipse(xCoordinate,yCoordinate, shapeWidth, shapeHeight);
        circleThreeCoordinate+=3;
    }

    void drawCircleFour(float xCoordinate, float yCoordinate){
        ellipse(xCoordinate,yCoordinate, shapeWidth, shapeHeight);
        circleFourCoordinate+=4;
    }

}
