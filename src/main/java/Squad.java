import java.util.List;
import java.util.ArrayList;

public class Squad {
    private String mName;
    private static List<Squad> squads = new ArrayList<Squad>();
    private int mId;
    private List<Hero> mHeros;

    public Squad(String name) {
        mName = name;
        squads.add(this);
        mId = squads.size();
        mHeros = new ArrayList<Hero>();
    }

    public String getName() {
        return mName;
    }
    public static List<Squad> all(){
        return squads;
    }
    // public static Squad find(int id) {
    //     return squads.get(id - 1);
    //   }
      public List<Hero> getHeros() {
          return mHeros;
      }
      public void addHero(Hero hero) {
        mHeros.add(hero);
      }

}