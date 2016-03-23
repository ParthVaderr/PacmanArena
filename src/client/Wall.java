package client;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;

/*
 * THIS FILE IS THE GAME'S WALL CLASS. THIS IS A COMPONENT OF THE GAME MAZE.
 * Yar Har fiddle dee-dee
 */
public class Wall {

    int x;
    int y;
    int z;
    SimpleApplication sa;

    public Wall(SimpleApplication sa) {
        this.sa = sa;
        initGeometry();
    }

    public void initGeometry() {
        Box b = new Box(1, 1, 1);
        Geometry wall = new Geometry("wall", b);
        wall.setMaterial(initMat());
    }

    public Material initMat() {
        Material mat = new Material(sa.getAssetManager(), "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", ColorRGBA.Blue);
        return mat;
    }
}
