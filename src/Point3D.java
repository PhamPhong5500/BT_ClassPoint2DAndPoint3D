import java.util.Arrays;
public class Point3D extends Point2D{
    private float z;
    public Point3D(){
        super();
        this.z= 0.0f;
    }
    public Point3D(float x, float y,float z) {
        super(x,y);
       this.z=z;
    }
    public float getZ() {
        return z ;
    }
    public void setZ(float z){
        this.z=z;
    }
    public  void setXYZ(float x, float y,float z) {
        this.setX(x);
        this.setY(y);
        this.z=z;
    }

    public float[] getXYZ() {
        float[] xyz = {this.getX(), this.getY(),this.z};
        return xyz;
    }
    @Override
    public String toString() {
        return "X : " + this.getX()
                +"\n Y: " + this.getY()
                +"\n Z: " + this.getZ()
                +"\n XYZ: " + Arrays.toString(this.getXYZ());
    }
}

