### Spring笔记

#### 什么是ioc
IoC is also known as dependency injection (DI).（Ioc以DI被熟知。）
It is a process whereby objects define their dependencies (that is, the other objects they work with)
（是一种靠对象明确依赖的过程）
only through constructor arguments, arguments to a factory method,
只靠构造参数，工厂方法的参数，或者是实例化对象的属性
or properties that are set on the object instance after it is constructed
or returned from a factory method. （或工厂方法返回的值）
The container then injects those dependencies when it creates the bean.
当容器创建bean的时候，注入这些依赖
This process is fundamentally（基本上） the inverse（翻转） (hence（因此） the name,Inversion of Control) of
the bean itself controlling the instantiation （bean自身控制 实例化）
or location of its dependencies by using direct construction of classes （通过直接使用依赖的字节码文件的构造 - 这就是反射）
or a mechanism（原理） such as the Service Locator pattern.就像服务定位器的原理一样


谁控制谁：ioc容器控制bean的生成
控制什么：控制需要的对象和需要依赖的对象
什么是反转：在没有IOC容器之前我们都是在对象中主动去创建依赖的对象，这是正转的，而有了IOC之后，依赖的对象直接由IOC容器创建后注入到对象中，由主动创建变成了被动接受，这是反转
哪些方面被反转：依赖的对象

很多人把IOC和DI说成一个东西，笼统来说的话是没有问题的，但是本质上还是有所区别的,希望大家能够严谨一点；
IOC和DI是从不同的角度描述的同一件事，IOC是从容器的角度描述，而DI是从应用程序的角度来描述；
也可以这样说，IOC是设计思想，而DI是具体的实现方式


