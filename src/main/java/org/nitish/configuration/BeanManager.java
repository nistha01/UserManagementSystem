package org.nitish.configuration;

import org.nitish.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class BeanManager {

    @Bean
    public ArrayList<User> beanArrayList(){
        return new ArrayList<>();
    }

}
