package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration //디스패처 서블릿이  설정될때 ServeltConfig 또는 RootConfig를 설정할때 읽어들인다.
@EnableWebMvc  //스프링 MVC 설정할때 사용하는 어노테이션이다.
@ComponentScan("com.config")
public class WebConfig extends WebMvcConfigurerAdapter {

	//ViewResolver를 설정하지 않는다면 BeanNameViewResolver를 디폴트로 사용한다.
	@Bean
	public ViewResolver viewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setExposeContextBeansAsAttributes(true);
		return resolver;
	}
	
	//리소스를 디스패처서블릿이 처리하지 않고 디폴트 서블릿으로 넘기는 코드이다. WebMvcConfigurerAdapter
	//클래스에서 메소드 오버라이등을 하여 사용한다.
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}
