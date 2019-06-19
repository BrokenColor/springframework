# spring的扩展机制
    一个是容器初始化流程，
    一个是Bean的创建流程。
##  容器的初始化
1. 刷新容器前准备
2. 加载BeanDefinition
3. 配置容器特性
4. 执行BeanPostProcessor
5. 初始化消息源
6. 初始化自定义事件广播器
7. 初始化其他特殊bean
8. 注册监听器
9. 初始化非延迟加载bean
10. 完成刷新，发送完成事件
##  bean生命周期
1. 获取创建bean的策略 默认Cglib
2. 创建bean
3. 填充bean属性
4. 处理Aware接口
5. BeanPostProcessor前置处理
6. afterPropertiesSet(InitializingBean)/init-method
8. BeanPostProcessor后置处理
9. 使用bean
10. destroy(DisposableBean)/destory-method
