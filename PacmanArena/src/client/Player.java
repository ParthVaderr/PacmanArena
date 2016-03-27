
package client;

/*
 * HOLDS ALL PLAYER DATA/METADATA. THIS CLASS IS WHAT WE COMMUNICATE BETWEEN 
 * SERVER AND CLIENT. THIS INCLUDES ROLE, POINTS, NAME, LIVES, OTHER INFO, ETC. 
 */

public class Player {
    /*
     * Player Data 
     */
    private int id;             /* player id given by the server */
    private String name;        /* 'username' the player gives himself */
    private int points;         /*
                                 * points player earns during this round 
                                 * calculated differently for ghosts and pacman;
                                 * pacman recieves points for eating cheese and 
                                 * ghosts; ghosts recieve points for eating 
                                 * pacman. The values will differ. 
                                 */
    private Character c;        /* Pacman or Ghost */
    
    public Player(int id) {
        this.id = id;
        this.name = "";
        this.points = 0;
        this.c = null;
    }
    
    // sets the id of the player 
    public void setId(int id) {
        this.id = id;
    }
    
    // gets the player's id 
    public int getId() {
        return this.id;
    }
    
    // sets the player's name
    public void setName(String name) {
        this.name = name;
    }
    
    // gets the player's name
    public String getName() {
        return this.name;
    }
    
    // gets the players current point total 
    public int getPoints() {
        return this.points;
    }
    
    // sets the players character 
    public void setCharacter(Character c) {
        this.c = c;
    }
    
    // gets the player's character
    public Character getCharacter() {
        return this.c;
    }
}
