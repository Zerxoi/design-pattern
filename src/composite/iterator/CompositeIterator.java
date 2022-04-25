package composite.iterator;

import composite.composite.MenuComponent;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class CompositeIterator implements Iterator<MenuComponent> {
    Deque<Iterator<MenuComponent>> stack = new LinkedList<>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    public MenuComponent next() {
        if (hasNext()) {
            Iterator<MenuComponent> iterator = stack.peek();
            assert iterator != null;
            MenuComponent component = iterator.next();
            stack.push(component.createChildIterator());
            return component;
        } else {
            return null;
        }
    }

    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        } else {
            Iterator<MenuComponent> iterator = stack.peek();
            if (iterator.hasNext()) {
                return true;
            }
            stack.pop();
            return hasNext();
        }
    }
}


