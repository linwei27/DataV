package com.tydic.datav;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.io.File;

import javax.servlet.MultipartConfigElement;


@SpringBootApplication( scanBasePackages = {
        "com.tydic.datav.contorller",
        "com.tydic.datav.service.impl",
        "com.tydic.datav.config"}
)
@MapperScan(basePackages = "com.tydic.datav.dao.mapper")
public class DataVApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DataVApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DataVApplication.class, args);
    }

    @Bean
    public InternalResourceViewResolver setupViewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/view/");
        resolver.setSuffix(".jsp");
        return resolver;

    }

    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //单个文件最大   KB,MB
        factory.setMaxFileSize("500MB");
        // 设置总上传数据总大小
        factory.setMaxRequestSize("2500MB");
//        String location = System.getProperty("user.dir") + "/data/dubbo/cache";
//        File tmpFile = new File(location);
//        if (!tmpFile.exists()) {
//			tmpFile.mkdirs();
//		}
//        factory.setLocation(location);
        factory.setLocation("/data/dubbo/cache");
        return factory.createMultipartConfig();
    }
}
