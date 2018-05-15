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
//   @Test
//   public void find_returnsSquadWithSameId_secondSquad() {
//     // Squad.clear();
//     Squad firstSquad = new Squad("Avengers");
//     Squad secondSquad = new Squad("Powerpuff");
//     assertEquals(Squad.find(secondSquad.getId()), secondSquad);
//   }
  @Test
public void getSquad_initiallyReturnsEmptyList_ArrayList() {
  Squad testSquad = new Squad("Avengers");
  assertEquals(0, testSquad.getHeros().size());
}
@Test
public void addHero_addsHeroToList_true() {
  Squad testSquad = new Squad("Avengers");
  Hero testHero = new Hero("Thor");
  testSquad.addHero(testHero);
  assertTrue(testSquad.getHeros().contains(testHero));
}
}