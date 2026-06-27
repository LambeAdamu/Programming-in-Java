
public class StringLinkedList {

    private StringNode head;

    public StringLinkedList() {
        head = null;
    }

    public void addToStart(String item) {
        head = new StringNode(item, head);
    }

    public void deleteHeadNode() {
        if (head != null) {
            head = head.getLink();
        }
    }

    public int length() {
        int count = 0;
        StringNode position = head;
        while (position != null) {
            count++;
            position = position.getLink();
        }
        return count;
    }

    public boolean contains(String item) {
        StringNode position = head;
        while (position != null) {
            if (position.getData().equals(item)) {
                return true;
            }
            position = position.getLink();
        }
        return false;
    }

    public void showList() {
        StringNode position = head;
        while (position != null) {
            System.out.println(position.getData());
            position = position.getLink();
        }
    }
}
