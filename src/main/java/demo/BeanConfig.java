/***
 *  Java configuration class for beans
 */

package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.print.Doc;

@Configuration
@ComponentScan(basePackages = "demo")
public class BeanConfig {

    // Defining a bean manually
//    Instead of using component annotation inside the class we can declare it here
//    @Bean
//    public Doctor doctor()
//    {
//        return new Doctor();
//    }

}
