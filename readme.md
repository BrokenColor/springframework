# SpringFramework learnning
* 基于注解的bean的装配测试
    * 根据类型获取获取bean
    * 根据名字获取获取bean
    * FactoryBean 通过类型获取bean
    * FactoryBean 通过名字获取bean
    * 通过类型获取FactoryBean本身
    * 通过名字获取FactoryBean本身
    * 重写bean初始化和销毁方法三种方式
    * 通过@Component 装配bean
    * 通过@Repository 装配bean
    * 通过@Service 装配bean
    * 通过@Controller 装配bean
* 依赖注入测试
    * 注解依赖注入
    * 接口依赖注入
    * 构造函数依赖注入

## Spring 中的 bean 的作用域
    * singleton : 唯一 bean 实例，Spring 中的 bean 默认都是单例的。
	* prototype : 每次请求都会创建一个新的 bean 实例。
	* request : 每一次HTTP请求都会产生一个新的bean，该bean仅在当前HTTP request内有效。
	* session : 每一次HTTP请求都会产生一个新的 bean，该bean仅在当前 HTTP session 内有效。
	* global-session： 全局session作用域，仅仅在基于portlet的web应用中才有意义，Spring5已经没有了。Portlet是能够生成语义代码(例如：HTML)片段的小型Java Web插件。它们基于portlet容器，可以像servlet一样处理HTTP请求。但是，与 servlet 不同，每个 portlet 都有不同的会话    
## bean生命周期
	* Bean 容器找到配置文件中 Spring Bean 的定义。
	* Bean 容器利用 Java Reflection API 创建一个Bean的实例。
	* 如果涉及到一些属性值 利用 set()方法设置一些属性值。
	* 如果 Bean 实现了 BeanNameAware 接口，调用 setBeanName()方法，传入Bean的名字。
	* 如果 Bean 实现了 BeanClassLoaderAware 接口，调用 setBeanClassLoader()方法，传入 ClassLoader对象的实例。
	* 如果Bean实现了 BeanFactoryAware 接口，调用 setBeanClassLoader()方法，传入 ClassLoade r对象的实例。
	* 与上面的类似，如果实现了其他 *.Aware接口，就调用相应的方法。
	* 如果有和加载这个 Bean 的 Spring 容器相关的 BeanPostProcessor 对象，执行postProcessBeforeInitialization() 方法
	* 如果Bean实现了InitializingBean接口，执行afterPropertiesSet()方法。
	* 如果 Bean 在配置文件中的定义包含 init-method 属性，执行指定的方法。
	* 如果有和加载这个 Bean的 Spring 容器相关的 BeanPostProcessor 对象，执行postProcessAfterInitialization() 方法
	* 当要销毁 Bean 的时候，如果 Bean 实现了 DisposableBean 接口，执行 destroy() 方法。
	* 当要销毁 Bean 的时候，如果 Bean 在配置文件中的定义包含 destroy-method 属性，执行指定的方法。