/**
 * Created by alexander on 2018-02-14.
 */
public class Player {
    private String username;
    private String displayname;
    private String password;
    private Cord position;

    public Player(String username, String displayname, String password, Cord position) {
        this.username = username;
        this.displayname = displayname;
        this.password = password;
        this.position = position;
    }
    public void move(Cord newpost) {
        this.position = newpost;
    }

    public Cord getPosition() {
        return this.position;
    }

    public String getDisplayname() {
        return this.displayname;
    }



}
