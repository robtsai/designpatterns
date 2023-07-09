# Template Method Pattern

We could use Polymorphism and the Strategy Pattern

In this pattern, we delegate logic to the Task
interface.

![template_poly.png](img%2Ftemplate_poly.png)


Or use inheritance.

Extend a base class.
Introduce an abstract method, and call it directly.


![template_pattern.png](img%2Ftemplate_pattern.png)


We could give default implementation to
"abstract" class and override where
necessary.  (Hooks pattern)