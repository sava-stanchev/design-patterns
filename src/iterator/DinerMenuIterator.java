package iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    public MenuItem next() {
        return items[position++];
    }

    public void remove() {
        throw new UnsupportedOperationException(
                "You shouldn't be trying to remove menu items.");
    }
}