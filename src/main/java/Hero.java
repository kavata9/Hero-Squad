import java.util.*;

public class Hero {
    private String mDescription;
    private static List<Hero> heros = new ArrayList<Hero>();
  
    public Hero(String description) {
      mDescription = description;
      heros.add(this); 
    }

    public static List<Hero> all(){
      return heros;
    }
  
    public String getDescription() {
      return mDescription;
    }
  }