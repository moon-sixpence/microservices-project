package com.lq.microservicesproject;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

//
@SpringBootApplication
public class MicroservicesProjectApplication {

	public static void main(String[] args) {
		// 1. 第一种写法
		// SpringApplication.run(MicroservicesProjectApplication.class, args);

		// 2. 第二种写法
		ConfigurableApplicationContext context = new SpringApplicationBuilder(MicroservicesProjectApplication.class)
				// 单元测试 PORT = RANDOM
				.properties("server.port=0")
				.web(WebApplicationType.NONE)
				.run(args);




		//
	}


	/**
	 *
	 * @Target(ElementType.TYPE)
	 * @Retention(RetentionPolicy.RUNTIME)
	 * @Documented
	 * @Inherited
	 * @SpringBootConfiguration
	 * @EnableAutoConfiguration // 激活自动装配
	 * @ComponentScan(excludeFilters = { // spring framework 3.1
	 * @Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
	 * 	@Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) })
	 * public @interface SpringBootApplication {
	 *
	 *
	 * }
	 *
	 * @EnabelWebMVC
	 * @EnableTransactionManagement
	 * @EnableAspectAutoProxy
	 * @EnableAsync
	 *
	 * @SpringBootConfiguration 等价于 @Configuration
	 *
	 *
	 *
	 * @Component 的派生性
	 *
	 * @Component  -> @ComponentScan
	 *
	 * 		@Service
	 * 		@Repository
	 * 		@Controller
	 * 		@Configuration
	 		@RestContorller
	 *
	 *
	 *  github
	 *
	 *  Meta-Annotation
	 *
	 *

	 *  Dubbo  `@Service`  -> 2.5.7  new AnnotationTypeFilter(Service.class)
	 *
	 *
	 *
	 *
	 *
	 *	Spring 模式注解
	 *
	 *
	 *
	 */

}
