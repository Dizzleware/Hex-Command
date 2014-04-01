import org.lwjgl.opengl.GL11;

import java.util.LinkedList;

/**
 * Created by Cayle J. Elsey on 3/20/2014.
 */
public class Tile {

    public enum TYPE{
        EMPTY,
        LAND,
        WATER;
    }
    //Variables
    int maxSlots;
    int x, y, s;
    LinkedList <Resource> resources = new LinkedList<Resource>();
    LinkedList <Structure> structures = new LinkedList<Structure>();
    LinkedList <Unit> units = new LinkedList<Unit>();
    Point2I position = new Point2I();
    TYPE t;
    float R, G, B;
    //Methods
    public void drawHex() {
        int s2 = s / 2;
        int x = position.x;
        int y = position.y;

        GL11.glColor3f(R, G, B);
        GL11.glBegin(GL11.GL_POLYGON);
        GL11.glVertex2i(x, y - s);
        GL11.glVertex2i(x - s, y - s2);
        GL11.glVertex2i(x - s, y + s2);
        GL11.glVertex2i(x, y + s);
        GL11.glVertex2i(x + s, y + s2);
        GL11.glVertex2i(x + s, y - s2);
        GL11.glEnd();
    }

    //Constructors
    public Tile(){
        R = 0;
        G = 0;
        B = 0;
    }

    public Tile(int X, int Y, int S, TYPE T){
        t = T;
        position.x = X;
        position.y = Y;
        s = S;
    }
}
