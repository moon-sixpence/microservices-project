# Spring web MVC 视图技术

IOC/DI  -> bean 生命周期



## Bean 生命周期
实例化 -> Bean Class -> Bean Object


初始化前  BeanPostProcessor#postProcessBeforeInitialization
初始化 init() InitializingBean#afterPropertiesSet()
初始化后 BeanPostProcessor#postProcessAfterInitialization


销毁
DisposableBean#destroy()




## [Thymeleaf](www.thymeleaf.org)
* 性能一般

渲染上下文（Model）
 * Spring Web MVC 
     * 接口类型
        * ModelMap
        * Model
        * ModelAndView
     * 注解类型
        * @ModelAttrtibute
EL表达式
* 字符 
* 逻辑表达式
    * if else
* 迭代表达式
    * for each /while     
* 反射
    * JAVA reflection
    * Cglib
    
学习技巧： thymeleaf -> thymeleafProperties    

Thymeleaf  `ViewResolver`

 *  通过模板名称解析模板资源
 *  读取资源，并且渲染内容HTMl
 *  HTML内容输出到 Response

源码路径：

- org.thymeleaf.TemplateEngine#process(java.lang.String, org.thymeleaf.context.IContext,Javal.io,writer)

- org.thymeleaf.engine.TemplateManager#parseAndProcess

  ​	

## 模板缓存
   默认 cache =true 

## 模板寻址

Prefix + view-name + suffix

ClassPathResource 

TemplateData

## SpringMVC 模板渲染逻辑   

Spring  MVC 核心总控制器： DispatcherServlet
    * DispatcherServlet#doDispatch --> 拦截请求
    * Controller -> 执行业务
    * DispatcherServlet#resolveViewName 视图解析
    * DispatcherServlet#render --> 视图渲染
    
Locale

ServletRequest#getLocale  

LocaleContextHolder  

MessageSource
    
    

JSP 九大变量  = servlet
​    scope :
​        PageContext
​             关注与当前页面
​        request     
​            关注当前请求    
​        session
​            关注当前会话
​        servletContext
​            当前当前应用
​    内置变量
​        out  (ServletResponse#getWritter)  
​        exception (Throwable)
​        config (ServletConfig)
​        page  
​        response
​    

* Thymeleaf 内置变量
    *  上下文模型
        *   strings
        *   numbers
    
V: 
  * 视图对象
       SpringMVC View
       ​     forward:
       ​     redirect:
       Struts:ForwardAction
       ​       redirectAction
  * 视图处理对象
JSP 
* 性能最好

Spring 不想走j2ee



## JSP

- InternalResourceViewResolver
- JstlView

```xml
<bean id="viewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver">
    <property name="viewClass" value="org.springframework.web.servlet.view.JstlView"/>
    <property name="prefix" value="/WEB-INF/jsp/"/>
    <property name="suffix" value=".jsp"/>
</bean>
```



