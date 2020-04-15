### SpringIOC的注解应用

 在之前的项目中，我们都是通过xml文件进行bean或者某些属性的赋值，其实还有另外一种注解的方式，在企业开发中使用的很多，在bean上添加注解，可以快速的将bean注册到ioc容器。

#### 使用注解的方式注册bean到IOC容器中

​	

```java
如果想要将自定义的bean对象添加到IOC容器中，需要在类上添加某些注解
Spring中包含4个主要的组件添加注解：
    @Controller:控制器，推荐给controller层添加此注解
    @Service:业务逻辑，推荐给业务逻辑层添加此注解
    @Repository:仓库管理，推荐给数据访问层添加此注解
    @Component:给不属于以上基层的组件添加此注解
    注意：我们虽然人为的给不同的层添加不同的注解，但是在spring看来，可以在任意层添加任意注解;spring底层是不会给具体的层次验证注解，这样写的目的只是为了提高可读性，最偷懒的方式就是给所有想交由IOC容器管理的bean对象添加component注解
    使用注解需要如下步骤：
    1、添加上述四个注解中的任意一个
    2、添加自动扫描注解的组件，此操作需要依赖context命名空间
    3、添加自动扫描的标签context:component-scan

	注意：当使用注解注册组件和使用配置文件注册组件是一样的，但是要注意：
		1、组件的id默认就是组件的类名首字符小写，如果非要改名字的话，直接在注解中添加即可
		2、组件默认情况下都是单例的,如果需要配置多例模式的话，可以在注解下添加@Scope注解
```

#### 定义扫描包时要包含的类和不要包含的类

 当定义好基础的扫描包后，在某些情况下可能要有选择性的配置是否要注册bean到IOC容器中，此时可以通过如下的方式进行配置。

#### 使用@AutoWired进行自动注入

注意：当使用AutoWired注解的时候，自动装配的时候是根据类型实现的。

 1、如果只找到一个，则直接进行赋值，

 2、如果没有找到，则直接抛出异常，

 3、如果找到多个，那么会按照变量名作为id继续匹配,

 1、匹配上直接进行装配

 2、如果匹配不上则直接报异常
