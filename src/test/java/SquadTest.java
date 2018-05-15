import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {

  @Test
  public void Squad_instantiatesCorrectly_true() {
    Squad testSquad = new Squad("Avangers");
    assertEquals(true, testSquad instanceof Squad);
  }
  @Test
  public void getName_squadInstantiatesWithName_Home() {
    Squad testSquad = new Squad("Avengers");
    assertEquals("Avengers", testSquad.getName());
  }
  @Test
  public void all_returnsAllInstancesOfSquad_true() {
    Squad firstSquad = new Squad("Avengers");
    Squad secondSquad = new Squad("Powerpuff");
    assertEquals(true, Squad.all().contains(firstSquad));
    assertEquals(true, Squad.all().contains(secondSquad));
  }
}