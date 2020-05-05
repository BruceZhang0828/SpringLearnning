### 1、Spring JdbcTemplate

 在spring中为了更加方便的操作JDBC，在JDBC的基础之上定义了一个抽象层，此设计的目的是为不同类型的JDBC操作提供模板方法，每个模板方法都能控制整个过程，并允许覆盖过程中的特定任务，通过这种方式，可以尽可能保留灵活性，将数据库存取的工作量讲到最低。

### 2 声明式事务

编程式事务：在代码中直接加入处理事务的逻辑，可能需要在代码中显式调用beginTransaction()、commit()、rollback()等事务管理相关的方法

声明式事务：在方法的外部添加注解或者直接在配置文件中定义，将事务管理代码从业务方法中分离出来，以声明的方式来实现事务管理。spring的AOP恰好可以完成此功能：事务管理代码的固定模式作为一种横切关注点，通过AOP方法模块化，进而实现声明式事务。

#### 声明式事务的简单配置

Spring从不同的事务管理API中抽象出了一整套事务管理机制，让事务管理代码从特定的事务技术中独立出来。开发人员通过配置的方式进行事务管理，而不必了解其底层是如何实现的。

 Spring的核心事务管理抽象是PlatformTransactionManager。它为事务管理封装了一组独立于技术的方法。无论使用Spring的哪种事务管理策略(编程式或声明式)，事务管理器都是必须的。

事务管理器可以以普通的bean的形式声明在Spring IOC容器中



##### 事务配置的属性

isolation：设置事务的隔离级别

 propagation：事务的传播行为

 noRollbackFor：那些异常事务可以不回滚

 noRollbackForClassName：填写的参数是全类名

 rollbackFor：哪些异常事务需要回滚

 rollbackForClassName：填写的参数是全类名

 readOnly：设置事务是否为只读事务

 timeout：事务超出指定执行时长后自动终止并回滚,单位是秒

##### timeout:

 timeout = 3 : 3秒如果没有正常执行完成则抛出异常

```java
org.springframework.transaction.TransactionTimedOutException: Transaction timed out: deadline was Tue May 05 16:49:34 CST 2020
```

##### 设置事务只读 :

​	如果你一次执行单条查询语句，则没有必要启用事务支持，数据库默认支持SQL执行期间的读一致性；

​	如果你一次执行多条查询语句，例如统计查询，报表查询，在这种场景下，多条查询SQL必须保证整体的读一致性，否则，在前条SQL查询之后，后条SQL查询之前，数据被其他用户改变，则该次整体的统计查询将会出现读数据不一致的状态，此时，应该启用事务支持。

 	对于只读查询，可以指定事务类型为readonly，即只读事务。由于只读事务不存在数据的修改，因此数据库将会为只读事务提供一些优化手段。

​	'ready-only'设置为true的时候,执行update语句,直接抛出错误:

```java
java.sql.SQLException: Connection is read-only. Queries leading to data modification are not allowed
```

##### 设置哪些异常不回滚:

```java
noRollbackFor = {ArithmeticException.class,NullPointerException.class}

noRollbackForClassName = {"java.lang.ArithmeticException"}
```

##### 设置哪些异常回滚:

```java
rollbackFor = {FileNotFoundException.class}
```

##### 设置隔离级别:



##### 事务的传播特性:

**事务的传播特性**指的是当一个事务方法被另一个事务方法调用时，这个事务方法应该如何进行？

spring的事务传播特性一共有7种:

required + required :  如果设置的传播特性是Required，那么所有的事务都会统一成一个事务，一旦发生错误，所有的数据都要进行回滚。

required + required _new :   

