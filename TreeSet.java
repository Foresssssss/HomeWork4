package HW4;

public class TreeSet<E extends Comparable<E>> {
    private BinarySearchTree<E> tree;

    public TreeSet() {
        tree = new BinarySearchTree<>();
    }

    public boolean add(E element) {
        if (contains(element)) {
            return false;
        }
        tree.insert(element);
        return true;
    }

    public boolean remove(E element) {
        if (!contains(element)) {
            return false;
        }
        tree.remove(element);
        return true;
    }

    public boolean contains(E element) {
        return tree.contains(element);
    }
}