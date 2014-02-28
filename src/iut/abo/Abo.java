package iut.abo;

import iut.cells.HelloCell;
import iut.cells.OwnerCell;
import iut.cells.SmartCell;
import iut.twitter.Tweet;


/**
 * Reply to all.
 */
public class Abo{
    
    private String eleveur;
    

    
    
    public Abo (String eleveur){
       this.eleveur = eleveur;
    }

    public String getEleveur() {
        return eleveur;
    }

    public void setEleveur(String eleveur) {
        this.eleveur = eleveur;
    }
    
    final SmartCell[] smartCells = new SmartCell[] {
		new HelloCell(),
		new OwnerCell()
	};
    
    public String ask(Tweet question) throws CloneNotSupportedException {
        
        String answer = "";
        Abo abo = new Abo(this.eleveur); 
            for(SmartCell cell:smartCells) {
                
                if (cell.ask(question, abo) != null)
                    answer = answer + cell.ask(question, abo) + " ";
              
            }
       if ("".equals(answer)){
           answer = "I don't understand your question.";
       }
       else{
           answer = answer.substring(0, answer.length()-1);
       }
       
       return answer;
    }

}
