# Strategy Pattern

![strategy.png](img%2Fstrategy.png)

We have a context class that maintains
reference to Strategy object.

Then we have concrete implementations of
the Strategy.

Similar to the State pattern.

In state pattern - we have a single state
that determines logic.

![state.png](..%2Fstate%2Fimg%2Fstate.png)

You could also make the ImageStore take
additional parameters like a 
Compressor.

This means Compressor is not a private field in
ImageStore.

Rather when calling store method, 
we pass in a new JpegCompressor()
or new PngCopressor()
