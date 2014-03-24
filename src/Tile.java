import org.lwjgl.opengl.GL11;

import java.util.LinkedList;

/**
 * Created by Cayle J. Elsey on 3/20/2014.
 */
public class Tile {
    //Variables
    int maxSlots;
    LinkedList <Resource> resources = new LinkedList<Resource>();
    LinkedList <Structure> structures = new LinkedList<Structure>();
    LinkedList <Unit> units = new LinkedList<Unit>();
    Point2I position = new Point2I();

    //Methods
    private void drawHex(int x, int y, int s) {
        int s2 = s / 2;

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

    }
}
