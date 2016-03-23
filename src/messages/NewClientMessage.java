package messages;

import com.jme3.network.AbstractMessage;
import com.jme3.network.serializing.Serializable;
import java.util.LinkedList;
import server.FieldData;
import server.GameCubeMaze;

@Serializable
public class NewClientMessage extends AbstractMessage {

    public int ID;
    public GameCubeMaze maze;

    // -------------------------------------------------------------------------
    public NewClientMessage() {
    }

    // -------------------------------------------------------------------------
    public NewClientMessage(int ID, GameCubeMaze maze) {
        super();
        this.ID = ID;
        this.maze = maze;
    }
}
