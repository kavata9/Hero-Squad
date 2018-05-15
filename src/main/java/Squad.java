import java.util.List;
import java.util.ArrayList;

public class Squad {
    private String mName;
    private static List<Squad> squads = new ArrayList<Squad>();

    public Squad(String name) {
        mName = name;
        squads.add(this);
    }

    public String getName() {
        return mName;
    }
    public static List<Squad> all(){
        return squads;
    }

}