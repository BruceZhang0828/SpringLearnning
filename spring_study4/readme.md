### Spring的AOP的认识

AOP：Aspect Oriented Programming 面向切面编程

OOP：Object Oriented Programming 面向对象编程

 面向切面编程：基于OOP基础之上新的编程思想，OOP面向的主要对象是类，而AOP面向的主要对象是切面，在处理日志、安全管理、事务管理等方面有非常重要的作用。AOP是Spring中重要的核心点，虽然IOC容器没有依赖AOP，但是AOP提供了非常强大的功能，用来对IOC做补充。通俗点说的话就是在程序运行期间，将**某段代码动态切入**到**指定方法**的**指定位置**进行运行的这种编程方式。

#### 1、AOP的概念

##### 为什么要引入AOP?