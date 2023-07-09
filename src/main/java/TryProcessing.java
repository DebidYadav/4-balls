import processing.core.PApplet;

public class TryProcessing extends PApplet {

    private int circleOneCoordinate = 0;
    private int circleTwoCoordinate = 0;
    private int circleThreeCoordinate = 0;
    private int circleFourCoordinate = 0;
    static  int y =500;


    public static void main(String[] args){
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(500,500);
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {
        drawCircleOne(circleOneCoordinate,y*((float)1/5));
        drawCircleTwo(circleTwoCoordinate,y*((float)2/5));
        drawCircleThree(circleThreeCoordinate,y*((float)3/5));
        drawCircleFour(circleFourCoordinate,y*((float)4/5));
    }

    void drawCircleOne(float xCoordinate, float yCoordinate){
        ellipse(xCoordinate,yCoordinate,25,25);
        circleOneCoordinate++;
    }

    void drawCircleTwo(float xCoordinate, float yCoordinate){
        ellipse(xCoordinate,yCoordinate,25,25);
        circleTwoCoordinate+=2;
    }

    void drawCircleThree(float xCoordinate, float yCoordinate){
        ellipse(xCoordinate,yCoordinate,25,25);
        circleThreeCoordinate+=3;
    }

    void drawCircleFour(float xCoordinate, float yCoordinate){
        ellipse(xCoordinate,yCoordinate,25,25);
        circleFourCoordinate+=4;
    }

}
