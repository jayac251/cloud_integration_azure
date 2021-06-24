/**
 * 
 */
package io.sunnyelectrical.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author jayac
 *
 */
@Configuration
public class SpringFoxConfig {                                    
    @Bean
    
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()
          .apis(RequestHandlerSelectors.basePackage("io.sunnyelectrical.api")) 
          .paths(PathSelectors.any())                          
          .build();                                           
    }
}