package com.example.sseeventsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SseEventsDemoApplication {


    //https://github.com/eugenp/tutorials/blob/6dccef292ce4ae3d919ca15715975ff30e885a8a/spring-reactive-modules/spring-reactive-2/src/main/java/com/baeldung/reactive/serversentevents/consumer/controller/ClientController.java
    public static void main(String[] args) {
        SpringApplication.run(SseEventsDemoApplication.class, args);
    }

/*    @Bean
    public SecurityWebFilterChain sseConsumerSpringSecurityFilterChain(ServerHttpSecurity http) {
        http.authorizeExchange(auth -> auth
                        .anyExchange().permitAll()
                )
                .csrf(ServerHttpSecurity.CsrfSpec::disable);
        return http.build();
    }*/

}
