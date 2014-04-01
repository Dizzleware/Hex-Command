/**
 * Created by Cayle J. Elsey on 3/20/2014.
 */
import org.lwjgl.opengl.GL11;


import java.util.LinkedList;
public class Map {

    LinkedList<Row> Rows;
    private int xOrigin, yOrigin;
    private int height, width;
    public int sideLength;
    public Map() {
        height = 600;
        width = 800;
        sideLength = 20;

        xOrigin = 0;
        yOrigin = 0;
    }

    public void emptyTessalation(){
        GL11.glColor3f(1, 1, 1);


    }

    public void drawRow(int xOff, Row row){
        int counter = 0;
        int yPos = row.yPos;
        int x = (xOrigin + xOff) + (sideLength);
        while(x >= (xOrigin + xOff) +  (sideLength) && x <= (xOrigin + width) - sideLength)
        {
            GL11.glColor3f(1f, 1f, 1f);
            counter++;
            row.drawRow();
            x = x + (sideLength * 2);
        }

    }



    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getxOrigin() {
        return xOrigin;
    }

    public int getyOrigin() {
        return yOrigin;
    }

    public void setxOrigin(int xOrigin) {
        this.xOrigin = xOrigin;
    }

    public void setyOrigin(int yOrigin) {
        this.yOrigin = yOrigin;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}