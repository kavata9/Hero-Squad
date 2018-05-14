import org.junit.*;
import org.w3c.dom.html.HTMLTableRowElement;

import static org.junit.Assert.*;

public class HeroTest {
    @Test
  public void Hero_instantiatesCorrectly_true() {
    Hero  myHero = new Hero("Thor");
    assertEquals(true, myHero instanceof Hero);
  }
  @Test
  public void Hero_instantiatesWithDescription_String() {
    Hero myHero = new Hero("Thor");
    assertEquals("Thor", myHero.getDescription());
  }

}