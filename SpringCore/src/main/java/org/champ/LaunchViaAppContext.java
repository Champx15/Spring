package org.champ;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LaunchViaAppContext {
    public static void main(String[] args)
    {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        Telusko t =container.getBean(Telusko.class);
        Boolean status = t.buyTheCourse(234);
        if(status) System.out.println("Enrolled successfully");
        else System.out.println("Didn't enrolled");

    }
}