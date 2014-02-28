package iut.cells;

import iut.abo.Abo;
import iut.twitter.Tweet;



/**
 * Reply to Bonjour.
 *
 */
public class HelloCell implements SmartCell {

    
    public HelloCell() {
    }

    @Override
    public String ask(Tweet question, Abo abo) {
        String asking = question.getText().toUpperCase();
        if(asking.contains("HELLO ") || asking.contains("HELLO,") || asking.contains("HELLO.") || asking.contains("HELLO!") || asking.contains("HELLO !") || asking.contains("HI ") || asking.contains("HI,") || asking.contains("HI.") || asking.contains("HI!") || asking.contains("HI !")){
            if (question.getScreenName() != null) {
                    return "Hi @" + question.getScreenName() + ", I am Abo.";  
            }
            else{
                return "Hi, I am Abo.";
            }
        }
        return null;
    }
    

   

}