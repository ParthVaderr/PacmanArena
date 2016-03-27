
package server;

import com.jme3.math.ColorRGBA;
import java.util.LinkedList;
import java.util.Random;


public class PlayField {

    public LinkedList<FieldData> data;

    // -------------------------------------------------------------------------
    public PlayField() {
        data = new LinkedList<FieldData>();
    }

    // -------------------------------------------------------------------------
    public boolean addElement(int id) {
        //check to see if the server has the max number of players 
        if(data.size() == 1) {
            return false;
        }
        
        FieldData newData = new FieldData();
        data.addLast(newData);
        
        return (true);
    }
}
