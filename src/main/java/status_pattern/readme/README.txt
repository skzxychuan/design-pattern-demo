

状态模式说明：
1. 这个模式和策略模式很像，甚至画出来的类图都是一模一样的
2. 它和策略模式的却别仅仅在于意图上，策略模式强调封装算法，并且算法可以根据需要切换，
    而状态模式强调系统在几种状态之间的切换，切换动作的算法被封装进了状态类里。
3. 本demo假设有3种状态，假定他们的切换顺序是1→3 →2：
    a. 3种状态，都有切换这个动作，那么定义一个接口，把切换这个动作抽出来，让3种不同状态实现这个接口。
    b. 一个系统类，持有一个“当前状态”， 他可以是这三种状态中任意一个的引用。
    c. 我们只管对“当前状态”调用"切换"这个动作，而具体怎么切或者切换到哪个状态，完全由状态自己定(封装起来)