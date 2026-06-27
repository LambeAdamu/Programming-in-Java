
public class StringNode {

    private String data;
    private StringNode link;

    public StringNode(String newData, StringNode linkValue) {
        data = newData;
        link = linkValue;
    }

    public void setData(String newData) {
        data = newData;
    }

    public void setLink(StringNode newLink) {
        link = newLink;
    }

    public String getData() {
        return data;
    }

    public StringNode getLink() {
        return link;
    }
}
