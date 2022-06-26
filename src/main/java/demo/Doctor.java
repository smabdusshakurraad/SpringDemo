package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(scopeName = "prototype") // Scope name = Bean type Default is Singleton
public class Doctor implements Staff, BeanNameAware /*BeanNameAware for using bean life cycle */{

    private String qualification;

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void assist() {
        System.out.println("Doctor is Assisting");
    }

// Bean life cycle 7 steps
    @Override
    public void setBeanName(String s) { // this is for before creating the bean
        System.out.println("Set Bean name method is callled");
    }

    @PostConstruct
    public void postContruct() //After  calling the bean constructor
    {
        System.out.println("Post construct");
    }

    @PreDestroy
    public void preDestroy()
    {
        System.out.println("Pre Destroy");
    }
}
