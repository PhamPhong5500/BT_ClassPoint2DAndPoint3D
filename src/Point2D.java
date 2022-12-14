import java.util.Arrays;
public class Point2D {
   private float x;
    private float y;

    public Point2D(){
        this.x=0.0f;
        this.y=0.0f;
    }
     public Point2D(float x, float y) {
        this.x=x;
        this.y=y;
     }
     public float getX() {
        return this.x ;
     }
     public void setX(float x){
        this.x=x;
     }
     public float getY() {
        return this.y ;
     }
     public void setY(float y) {
        this.y = y;
     }
     public  void setXY(float x, float y) {
        this.x=x;
        this.y=y;
     }
     public float[] getXY() {
        float[] xy = {this.x , this.y};
        return xy;
     }

     public String toString() {
        return "x : " + this.getX()
                +"\n Y: " + this.getY()
                +"\n XY: " + Arrays.toString(this.getXY());
     }
}
