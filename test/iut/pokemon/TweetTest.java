package iut.pokemon;

import iut.twitter.Tweet;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TweetTest {
    @Test
    public void testCreateTweet() {
        Tweet tweet = new Tweet("nedseb", "coucou !");
        assertEquals("nedseb", tweet.getScreenName());
        assertEquals("coucou !", tweet.getText());

        Tweet tweet2 = new Tweet("coucou !");
        assertEquals(null, tweet2.getScreenName());
        assertEquals("coucou !", tweet2.getText());

    }

}