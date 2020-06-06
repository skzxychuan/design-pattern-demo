# 目录

|模式名|目录名|使用场景|常见样例|
|-----|-----|-----|-----|
|生成器(建造者)模式|builder_pattern|需要构造复杂的组合结构对象时,并且要求能控制构造过程|ES API的各种queryBuiler|
|策略模式|strategy_pattern|需要封装不同的算法并随时切换的时候，特别是发现自己开始写大量的if else的时候|随处可见|
|状态模式|status_pattern|系统有几种典型状态,并需要在状态之间切换的时候||
|模板模式|template_pattern|当你发现自己在写一些相似度很高的解决一个问题的步骤(算法)时，可以考虑使用此模式|Spring中的各种Template, Arrays.sort()静态方法与Comparable接口的组合等等|
|观察者模式|observer_pattern|当你(观察者)需要监控(订阅)某个对象(主题)的状态变化，并希望在状态变化的时候能得到通知时。|GUI编程中的事件响应以及JAVA自带的观察者模式等等|
