/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionanswerbyusingmap;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;
import question.QuestionDetails;


/**
 *
 * @author Dell
 */
public class QuestionAnswerByUsingMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Resource resource=new ClassPathResource("applicationContext.xml");  
          BeanFactory factory=new XmlBeanFactory(resource);  
         QuestionDetails questionDeatils=(QuestionDetails)factory.getBean("que");
         questionDeatils.display();
        // TODO code application logic here
    }
    
}
