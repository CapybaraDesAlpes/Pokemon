/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package iut.cells;

import iut.abo.Abo;
import iut.cells.SmartCell;
import iut.twitter.Tweet;

/**
 *
 * @author Daron
 */
public class OwnerCell implements SmartCell {

    public OwnerCell() {
    }

    /**
     *
     * @param question
     * @param abo
     * @return
     */
    

    @Override
    public String ask(Tweet question, Abo abo) {
        
        String asking = question.getText().toUpperCase();
        if(asking.contains("OWNER")){
            
            if( abo.getEleveur() != null)
            {
               String answer = "My owner is @" + abo.getEleveur() + ".";
               return answer;
            }
            else {
                return "I don't have owner.";
            }
        }
        return null;
    }

    
}
