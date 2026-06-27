
public class Node<T> {

    private T data;
    private Node<T> link;

    public Node(T newData, Node<T> linkValue) {
        data = newData;
        link = linkValue;
    }

    public void setData(T newData) {
        data = newData;
    }

    public void setLink(Node<T> newLink) {
        link = newLink;
    }

    public T getData() {
        return data;
    }

    public Node<T> getLink() {
        return link;
    }
}
