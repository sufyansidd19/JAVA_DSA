package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }

    public static void main(String[] args) {
        LL first=new LL();
//        LL second=new LL();
        first.insertLast(1);
        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(3);
        first.insertLast(3);
        first.display();
        first.duplicates();
        first.display();

    }

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public void insert(int val , int index){
        if(index==0){
            insertFirst(val);
        }
        if (index==size){
            insertLast(val);
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }
    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null) {
            tail=null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if(size<=1){
            deleteFirst();
        }
        Node secondLast=get(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        size--;
        return val;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public void duplicates(){
        Node node=head;

        while(node.next!=null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
            tail=node;
            tail.next=null;
        }



    private class Node{

        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next)
        {
            this.value=value;
            this.next=next;
        }
    }
    public void insertRec(int val , int index) {
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val , int index , Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index--, node.next);
        return node;
    }
    }


