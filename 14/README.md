# TEMPLATE METHOD 模式和 STRATEGY 模式：继承与委托

## TEMPLATE METHOD 模式

- TEMPLATE METHOD 模式使用继承来解决问题，而 STRATEGY 模式使用的则是委托。
- TEMPLATE METHOD 模式展示了面向对象编程中诸多经典重用形式中的一种。其中通用算法被防止在基类中，并且通过继承在不同的具体上下文中实现该通用算法。但是这种技术是有代价的，继承是一种非常强的关系。派生类不可避免地要和它们的基类绑定在一起。

# STRATEGY 模式

- TEMPLATE METHOD 模式和 STRATEGY 模式都可以用来分离高层的算法和底层的具体实现。尽管 TEMPLATE METHOD 模式允许一个通用算法操纵多个可能的具体实现，但是由于 STRATEGY 模式完全遵循 DIP 模式，从而允许每个具体实现都可以被不同的通用算法操纵。