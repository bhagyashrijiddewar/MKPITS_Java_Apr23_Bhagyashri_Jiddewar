/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author Dell
 */
public class QuestionDetails {
    private int id;
    private String question;
    private Map<String,String> answer;

    public QuestionDetails() {
    }

    public QuestionDetails(int id, String question, Map<String, String> answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
    }
    public void display(){
        
        System.out.println("id = "+id);
        System.out.println("Question = "+question);
        System.out.println("Answer = ");
        Set <Entry<String,String>> set=answer.entrySet();
       Iterator<Entry<String,String>> iterator= set.iterator();
       while(iterator.hasNext()){
           Entry<String,String> entry=iterator.next();
           System.out.println("-  "+entry.getKey()+"Posted By : "+entry.getValue());
       }
    }
}
