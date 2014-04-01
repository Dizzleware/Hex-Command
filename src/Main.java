/**
 * Created by Cayle J. Elsey on 3/18/2014.
 */
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

public class Main {



    public void start() {
        //Set up Display
        try {
            Display.setDisplayMode(new DisplayMode(800,600));
            Display.create();
        } catch (LWJGLException e) {
            e.printStackTrace();
            System.exit(-1);
        }


        // init OpenGL
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glLoadIdentity();
        GL11.glOrtho(0, 800, 0, 600, 1, -1);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);

        //create Mouse
        try{
            Mouse.create();
        }catch(LWJGLException e){
            e.printStackTrace();
            System.exit(-1);
        }

        //Create Keyboard
        try{
            Keyboard.create();
        }catch(LWJGLException e){
            e.printStackTrace();
            System.exit(-1);
        }
        //Actual Game Loop
        while (!Display.isCloseRequested()) {
            // Clear the screen and depth buffer
            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);

            // set the color of the quad (R,G,B,A)
            GL11.glColor3f(1.0f, 1.0f, 1.0f);
            Map m = new Map();

            int x = 0;
            while (x < 20) {


                Display.update();
                x++;
            }
        }
        Display.destroy();
        }


    public static void main(String[] argv){
        Main main = new Main();
        main.start();
    }
}