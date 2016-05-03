# MOS overview
Modules Oriented microService Framework   
Power by Spring Boot

# MOS平台项目工程清单 
    核心项目
* mos-build  
项目群构建控制
* mos-parent  
maven parent project for mos framework project groups.
* mos-models  
mos项目群内部顶组沟通模型
* mos-core  
mos核心框架
* mos-autoconfig  
mos的spring-boot-autoconfig自动配置项目
* mos-starter  
  mos核心框架starter  

    模块：User  
* mos-user  
User功能组件，基于mybatis  
* mos-user-autoconfig  
User的自动配置项目  
* mos-user-ui  
User的ui项目  
* mos-user-starter  
User的spring boot starter项目  

    应用项目
* mos-example  
mos的示例应用项目,一个命令行应用  
* boot-mybatis1  
包含User组件，JDBC,Web,admin-web的示例应用
