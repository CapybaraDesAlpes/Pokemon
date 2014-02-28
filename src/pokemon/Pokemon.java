/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pokemon;

import iut.abo.Abo;
import iut.twitter.Tweet;

/**
 *
 * @author Daron
 */
public class Pokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Abo abo = new Abo ("CaptainObvious");
        Tweet tweet = new Tweet("Tristan", "Hello there !");
        
        System.out.println(abo.ask(tweet));
    }
    
}
