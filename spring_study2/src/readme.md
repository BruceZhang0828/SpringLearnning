### Spring之IOC学习

#### 细节点

1.ApplicationContext就是IOC容器的接口,可以通过此对象获取容器中创建的对象

2.对象在Spring容器创建完成的时候就已经创建完成,不是需要用的时候创建

3.对象在IOC容器中存储的时候都是单例的,如果需要多例需要修改属性

4.创建对象给属性赋值的时候是通过setter方法实现的

5.对象属性是由setter/getter方法决定的,而不是定义的成员属性

#### 为Bean注入复杂类型

#### 利用工厂模式创建bean对象

在之前的案例中，所有bean对象的创建都是通过反射得到对应的bean实例，其实在spring中还包含另外一种创建bean实例的方式，就是通过工厂模式进行对象的创建

 在利用工厂模式创建bean实例的时候有两种方式，分别是静态工厂和实例工厂。

 静态工厂：工厂本身不需要创建对象，但是可以通过静态方法调用，对象=工厂类.静态工厂方法名（）；

 实例工厂：工厂本身需要创建对象，工厂类 工厂对象=new 工厂类；工厂对象.get对象名（）；

#### 继承FactoryBean来创建对象

 FactoryBean是Spring规定的一个接口，当前接口的实现类，Spring都会将其作为一个工厂，但是在ioc容器启动的时候不会创建实例，只有在使用的时候才会创建对象

#### bean对象的初始化和销毁方法

 在创建对象的时候，我们可以根据需要调用初始化和销毁的方法
 如果bean是单例，容器在启动的时候会创建好，关闭的时候会销毁创建的bean
 如果bean是多礼，获取的时候创建对象，销毁的时候不会有任何的调用

#### bean对象的初始化和销毁方法

spring中包含一个BeanPostProcessor的接口，可以在bean的初始化方法的前后调用该方法，如果配置了初始化方法的前置和后置处理器，无论是否包含初始化方法，都会进行调用

#### spring创建第三方bean对象

例如数据连接池



