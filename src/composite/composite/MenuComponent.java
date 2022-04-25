package composite.composite;

import java.util.Iterator;

public interface MenuComponent {
    // 菜单组件名
    String getName();

    // 菜单组件描述
    String getDescription();

    // 创建菜单子组件迭代器
    Iterator<MenuComponent> createChildIterator();

    // 创建菜单后代组件迭代器
    Iterator<MenuComponent> createDescendantIterator();

    // 输出当前菜单组件信息
    void print();
}
