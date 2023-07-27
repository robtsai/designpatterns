package com.robtsai.composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component {
    private List<Component> components = new ArrayList<>();

    // use Object not Shape class
    public void add(Component component) {
        components.add(component);
    }

    // this implementation of render is ugly - composite pattern fixes it

    /*
    public void render() {
        for (var object : objects)
            if (object instanceof Shape)
                ((Shape)object).render();
            else
                ((Group)object).render();
    }
    */

    @Override
    public void render() {
        for (var component : components)
            component.render();
    }

    @Override
    public void move() {
        for (var component : components)
            component.move();
    }


}
