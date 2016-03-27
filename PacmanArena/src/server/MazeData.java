package server;

/**
 *
 * @author Ben Camp
 */

import com.jme3.network.serializing.Serializable;

// -------------------------------------------------------------------------
@Serializable

public class MazeData {
    GameCubeMaze m;
    public MazeData(GameCubeMaze m){
        this.m = m;
    }
}
