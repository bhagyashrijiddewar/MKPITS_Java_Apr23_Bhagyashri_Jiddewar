/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedetails;

import employee.EmployeeClass;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

/**
 *
 * @author Dell
 */
public class EmployeeDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Resource resource=new ClassPathResource("applicationContext.xml");
            BeanFactory factory=new XmlBeanFactory(resource);  
          EmployeeClass employee=(EmployeeClass)factory.getBean("emp");
          employee.display();
     
        // TODO code application logic here
    }
    
}
