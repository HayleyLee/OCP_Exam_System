package com.OCP_Practice_Exam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {"com.OCP_Practice_Exam.*"})
@MapperScan("com.OCP_Practice_Exam.*")
public class OcpPracticeExamApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(OcpPracticeExamApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(OcpPracticeExamApplication.class, args);
    }

}
