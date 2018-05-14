import org.junit.*;
import org.w3c.dom.html.HTMLTableRowElement;

import static org.junit.Assert.*;

public class HeroTest {
    @Test
  public void Hero_instantiatesCorrectly_true() {
    HeroTest  myHero = new HeroTest();
    assertEquals(true, myHero instanceof HeroTest);
  }

}