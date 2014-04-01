import com.sun.webkit.event.WCMouseWheelEvent;
import org.lwjgl.input.Mouse;

import java.util.LinkedList;

/**
 * Created by Cayle J. Elsey on 3/31/2014.
 */
public class MenuItem {
   LinkedList<Point2I> vertices = new LinkedList<Point2I>();
   //Assuming Rect Shaped menu item for simplicity
    int xOrigin, yOrigin;
    String label;
    int length, height;
    boolean wasClicked;
   //Methods
   void processEvents() {
       if (Mouse.isButtonDown(1)) {
           if (Mouse.getX() <= xOrigin + length && Mouse.getX() >= xOrigin) {
               if (Mouse.getY() <= yOrigin + height && Mouse.getY() >= yOrigin) {
                   doAction();
               }
           }
       }
   }
   void doAction(){
       //Extend this class based on the component use
   }

   void drawItem(){

   }


}
