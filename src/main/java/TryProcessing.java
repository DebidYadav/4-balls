import processing.core.PApplet;

public class TryProcessing extends PApplet {

    static int x = 0;
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
        drawCircle(x,y*((float)1/5));
        drawCircle(x,y*((float)2/5));
        drawCircle(x,y*((float)3/5));
        drawCircle(x,y*((float)4/5));
    }

    void drawCircle(float xCoordinate, float yCoordinate){
        ellipse(xCoordinate,yCoordinate,25,25);
        x++;
    }

}
