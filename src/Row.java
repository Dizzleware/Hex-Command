import java.util.LinkedList;

/**
 * Created by Cayle J. Elsey on 3/22/2014.
 */
public class Row {
    //Variables
    LinkedList<Tile> Tiles;
    int top, bottom;
    int rowNumber;
    int sideLength;
    int yPos;

    //Methods
    public Tile searchRow(int x){
        int counter = 0;

        while(Tiles.size() >= counter){
            int tX = Tiles.get(counter).position.x;
            if(x <= tX && (x + (2 * sideLength)) <= tX  ){
                return Tiles.get(counter);
            }
            counter++;
        }
        return new Tile();
    }

    public void drawRow(){
        for(int i = 0; i <= Tiles.size(); i++){
            Tiles.get(i).drawHex();
        }
    }
    //Constructors
    public Row(int num, int s, int YPOS) {
        rowNumber = num;
        sideLength = s;
        top = rowNumber * 2 * sideLength;
        bottom = top - (2 * sideLength);
        yPos = YPOS;
    }
}
