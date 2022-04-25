package composite;

import composite.composite.Menu;
import composite.composite.MenuComponent;
import composite.composite.MenuItem;
import composite.iterator.CompositeIterator;

import java.util.Iterator;

public class Waitress {
    Menu allMenus;

    public Waitress(Menu allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
        Iterator<MenuComponent> iterator = allMenus.createDescendantIterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }

    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.createDescendantIterator();

        System.out.println("\nVEGETARIAN MENU\n----");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            if (menuComponent instanceof MenuItem) {
                if (((MenuItem) menuComponent).isVegetarian()) {
                    menuComponent.print();
                }
            }
        }
    }
}
