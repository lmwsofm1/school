package org.example.school.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebMvcConfig  implements WebMvcConfigurer {

    @Override
    public  void  addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**") //允许所有路径跨域
                .allowedOriginPatterns("*")//允许所有来源跨域
                .allowedHeaders("GET", "HEAD", "POST", "PUT", "DELETE", "OPTIONS")//允许跨域qingq
                .allowCredentials(true)
                .maxAge(3600)
                .allowedHeaders("*");
    }
<<<<<<< HEAD




=======
>>>>>>> 5792175 (1)
}
