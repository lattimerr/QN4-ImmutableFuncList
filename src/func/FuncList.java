package func;

import java.util.NoSuchElementException;

public final class FuncList {

    private final Element head;

    // Constructor for empty list
    public FuncList() {
        this.head = null;
    }

    // Private constructor used internally
    private FuncList(Element head) {
        this.head = head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int head() {
        if (isEmpty())
            throw new NoSuchElementException("head of empty list");
        return head.getItem();
    }

    public FuncList tail() {
        if (isEmpty())
            throw new NoSuchElementException("tail of empty list");
        return new FuncList(head.getNext());
    }

    public FuncList cons(int x) {
        return new FuncList(new Element(x, head));
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        return "[" + buildString(head) + "]";
    }

    private String buildString(Element e) {
        if (e.getNext() == null)
            return String.valueOf(e.getItem());
        return e.getItem() + ", " + buildString(e.getNext());
    }
}