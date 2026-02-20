package func;

public final class Element {
    private final int item;
    private final Element next;

    public Element(int item, Element next) {
        this.item = item;
        this.next = next;
    }

    public int getItem() {
        return item;
    }

    public Element getNext() {
        return next;
    }
}