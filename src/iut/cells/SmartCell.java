package iut.cells;


import iut.abo.Abo;
import iut.twitter.Tweet;

public interface SmartCell {
    /**
     * Ask a question... get an answer!
     *
     * @param question
     * @return the answer when the Cell can reply to the question
     *         or null.
     */
    String ask(Tweet question, Abo abo);
}
