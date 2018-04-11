import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by alexander on 2018-02-21.
 */
public class Game {

    private List<Player> online;


    Login login = new Login();

    public Game() {
        online = new ArrayList<Player>();
    }
    public List<Player> getOnlinePlayers() {
        return this.online;
    }

    public void addOnlinePlayer(Player p) {
        online.add(p);
    }

    public void removeOnlinePlayer(Player p) {
        online.remove(p);
    }

    public boolean playerTryLogin(String username, String password) {
        if (login.tryLogin(login.getRs(), username, password)) {
            ResultSet rs = login.getRs();
            try {
                online.add(new Player(rs.getString("username"), rs.getString("displayname"),
                        rs.getString("password"), new Cord(rs.getInt("lastseenx"), rs.getInt("lastseeny"))));
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return true;
        } else {
            return false;
        }
    }


}
