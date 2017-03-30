package org.thetangram.triangle;

import static org.springframework.boot.SpringApplication.run;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableZuulProxy
@ComponentScan(basePackages = {"net.acesinc"})
public class TriangleApplication {
    public static void main(String...args) {
		run(TriangleApplication.class, args);
	}
    
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }    
}
