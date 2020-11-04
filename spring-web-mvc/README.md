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

## 模板缓存
   默认 cache =true 
   
## SpringMVC 模板渲染逻辑   

Spring  MVC 核心总控制器： DispatcherServlet
   
JSP 九大变量  = servlet
    scope :
        PageContext
             关注与当前页面
        request     
            关注当前请求    
        session
            关注当前会话
        servletContext
            当前当前应用
    内置变量
        out  (ServletResponse#getWritter)  
        exception (Throwable)
        config (ServletConfig)
        page  
        response
    
* Thymeleaf 内置变量
    *  上下文模型
        *   strings
        *   numbers
    
V: 
  * 视图对象
       SpringMVC View
            forward:
            redirect:
       Struts:ForwardAction
              redirectAction
  * 视图处理对象
JSP 
* 性能最好


Spring 不想走j2ee
