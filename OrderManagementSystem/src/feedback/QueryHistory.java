/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feedback;

import MainUserInterface.*;
import java.util.ArrayList;

/**
 *
 * @author pranavkapse
 */
public class QueryHistory {
    
    private ArrayList<Queries> feedback;
    
    public QueryHistory(){
        this.feedback = new ArrayList<Queries>();
    }

    public ArrayList<Queries> getHistory() {
        return feedback;
    }

    public void setHistory(ArrayList<Queries> history) {
        this.feedback = history;
    }
    
    public Queries addNewVitals(){
        
        Queries newVitals = new Queries();
        feedback.add(newVitals);
        return newVitals;
    }  
}
