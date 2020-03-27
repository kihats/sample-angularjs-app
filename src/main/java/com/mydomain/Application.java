package com.mydomain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author David
 * @date 024, 24-Mar-20 12:41 *
 * To God be the Glory
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Controller
    public static class Contr {
        @GetMapping("/welcome")
        public String welcome() {
            return "welcome";
        }

        @GetMapping("/templates/dashboard.html")
        public String dashboard() {
            return "dashboard";
        }
    }
}
