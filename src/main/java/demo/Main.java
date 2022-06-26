package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){

        // Below way to use xml file as configuration
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ApplicationContext context;
        context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Doctor staff = context.getBean(Doctor.class);
        staff.assist();
        staff.setQualification("FCPS");
        System.out.println(staff);


        // For singleton, we get everytime same bean/object
        // For prototype every time we get a new object
        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        System.out.println(doctor);
        //context.close(); to destroy the bean
    }
}
