package org.tcat.ueditor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Lin on 2017/1/23.
 */
@SpringBootApplication
public class WebApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(WebApplication.class);
        app.run(args);
    }

}
