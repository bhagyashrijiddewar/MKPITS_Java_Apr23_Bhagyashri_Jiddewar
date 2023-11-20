/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionList;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Dell
 */
public class QuestionDetails {
    private int id;
    private String question;
    private List <String> answer;

    public QuestionDetails() {
    }

    public QuestionDetails(int id, String question, List<String> answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
    }
    
    public void display(){
        System.out.println("id = "+id);
        System.out.println("Question = "+question);
        System.out.println("Answer = ");
        Iterator iterator=answer.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());   
        }
    }
}
