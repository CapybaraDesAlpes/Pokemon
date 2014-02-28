package iut.cells;

import iut.abo.Abo;
import iut.twitter.Tweet;
import org.junit.Test;
import static org.junit.Assert.*;

public class HelloCellTest {
    
    Abo pokeBot;
    
    
    @Test
    public void testAskHelloFromFollower() throws CloneNotSupportedException {
        
        pokeBot = new Abo(null);
        assertEquals("Hi @Tristan, I am Abo.", pokeBot.ask(new Tweet("Tristan", "Hi, how are you ?")));

    }
    
    @Test
    public void testAskHelloFromNoOne() throws CloneNotSupportedException {
        
        pokeBot = new Abo(null);
        assertEquals("Hi, I am Abo.", pokeBot.ask(new Tweet("Hi, how are you ?")));

    }
    
}
