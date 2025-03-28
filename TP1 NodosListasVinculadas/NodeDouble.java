package ProgramacionIII.tp1;

public class NodeDouble<T> {
    private T info;
    private NodeDouble<T> next;
    private NodeDouble<T> back;

    public NodeDouble() {
        this.info = null;
        this.next = null;
        this.back = null;
    }

    public NodeDouble(T info, NodeDouble<T> next, NodeDouble<T> back){
        this.setInfo(info);
        this.setNext(next);
        this.setBack(back);
    }

    public NodeDouble<T> getNext() {
        return next;
    }

    public void setNext(NodeDouble<T> next) {
        this.next = next;
    }

    public NodeDouble<T> getBack() {
        return back;
    }
    public void setBack(NodeDouble<T> back) {
        this.back = back;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
}
