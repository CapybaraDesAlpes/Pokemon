package iut.abo;

import iut.twitter.Tweet;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;

/**
* Integration tests checking the PokeBot
* behavior. We just test some cases to make sure that the
* PokeBot is using smartcell properly.
*/
public class AboTest {
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
    
    @Test
    public void testNoQuestion() throws CloneNotSupportedException {
        pokeBot = new Abo("CaptainObvious");
        assertEquals("I don't understand your question.", pokeBot.ask(new Tweet("This is not a question")));

    }
    
    
}