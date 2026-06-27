
public class LinkedList<T> {

    private Node<T> head;

    public LinkedList() {
        head = null;
    }

    public void addToStart(T item) {
        head = new Node<T>(item, head);
    }

    public int length() {
        int count = 0;
        Node<T> position = head;
        while (position != null) {
            count++;
            position = position.getLink();
        }
        return count;
    }

    public void showList() {
        Node<T> position = head;
        while (position != null) {
            System.out.println(position.getData());
            position = position.getLink();
        }
    }
}
