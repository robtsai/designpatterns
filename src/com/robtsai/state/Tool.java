package com.robtsai.state;

// could use an interface
// similar to abstract class
// use abstract class if you want to provide common code to other
// classes

// how this looks as abstract class

/*

public abstract class Tool {
    public abstract void mouseDown();
    public abstract void mouseUp();
}

*/

// dont need abstract or public when using interfaces

public interface Tool {
    void mouseDown();
    void mouseUp();
}