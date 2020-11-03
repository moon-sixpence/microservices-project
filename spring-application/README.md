## SpringApplication

WebApplicationType.NONE
WebApplicationType.REACTIVE
WebApplicationType.WEB --

`SpringApplication`
驱动Spring应用上下文的引导类


## SpringBoot 事件 源于 Spring事件
springBoot事件都是 `ApplicationEvent`


1.ApplicationStartingEvent
   *  SimpleApplicationEventMulticaster
2.ApplicationEnvironmentPreparedEvent

3.ApplicationPreparedEvent

4.ContextRefreshedEvent

5.ServletWebServerInitializedEvent

6.ApplicationStartedEvent

7.ApplicationReadyEvent

8.ContextClosedEvent

9.ApplicationFailedEvent(特殊情况)


Log4j
logBack
JavaLogging
Slf4j

`SpringApplication` 利用
* Spring 应用上下文（`ApplicationContext`）生命周期控制 注解驱动
* Spring 事件/监听(`ApplicationEventMulticaster`) 机制加载或初始化组件