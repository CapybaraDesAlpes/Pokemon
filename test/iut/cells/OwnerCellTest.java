package iut.cells;

import iut.abo.Abo;
import iut.twitter.Tweet;
import org.junit.Test;
import static org.junit.Assert.*;

public class OwnerCellTest {
    
    Abo pokeBot;

    
    @Test
    public void testAskNoOwner() throws CloneNotSupportedException {
        
        pokeBot = new Abo(null);
        assertEquals("I don't have owner.", pokeBot.ask(new Tweet("Do you have an owner ?")));

    }
    
    @Test
    public void testASkOwner() throws CloneNotSupportedException {
        pokeBot = new Abo("CaptainObvious");
        assertEquals("My owner is @CaptainObvious.", pokeBot.ask(new Tweet("Do you have an owner ?")));

    }
    
}
