package org.champ.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.champ"})
public class Config {
//    @Bean --> used inside @Configuration, if you make object and want Spring to take it as Bean
//    public SpringBoot sb() {
//        SpringBoot sb = new SpringBoot();
//        return sb;
//    }

}
