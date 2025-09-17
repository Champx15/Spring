package org.champ;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
public class LaunchViaBeanF {
    public static void main(String[] args) {

    DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
    XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
    reader.loadBeanDefinitions(new ClassPathResource("config.xml"));
    Telusko t = beanFactory.getBean(Telusko.class);
    Boolean status = t.buyTheCourse(234);
    if (status) System.out.println("Enrolled successfully");
    else System.out.println("Didn't enrolled");
    }


}
