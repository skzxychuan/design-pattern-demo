
生成器(建造者)模式demo

什么时候该考虑生成器模式：一般被用来构造组合结构,并要求能控制构造过程。比如ElasticSearch Java API的query构造就大量使用了该模式
生成器模式的优点：
1. 将一个复杂对象的创建过程封装起来
2. 允许对象通过多个步骤来创建，并且可以改变过程(这和只有一个步骤的工厂模式不同)
