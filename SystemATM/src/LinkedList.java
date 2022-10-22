class Node 
{
    private Node next,pre;
    private Customer customer;
    public Node (Node next, Node pre, Customer customer){
        this.next = next;
        this.pre = pre;
        this.customer = customer;
    }
    
    public Node(){
        next = null;
        pre = null;
    }
    
    public Node getNext(){
        return next;
    }
    
    public void setNext(Node next){
        this.next = next;
    }
    
    public Node getPre(){
        return pre;
    }
    
    public void setPre(Node pre){
        this.pre = pre;
    }
    
    public Customer getCustomer(){
        return customer;
    }
    
    public void setCustomer (Customer customer){
        this.customer = customer;
    }
}
public class LinkedList {
    Node head,tail;
    public LinkedList(){
        this.head = null;
        this.tail = null;
    }
    
    public void insert (Customer customer){
        Node node = new Node();
        node.setCustomer(customer);
        
        if (head == null||tail == null){
            head = node;
            tail = node;
        }
        else {
            head.setNext(node);
            node.setPre(head);
            head= node;
        }
    }
    
    public Customer getInfo(String cnic){
        Node temp = head;
        while (temp!=null){
            if (cnic.equals(temp.getCustomer().getcnic()))
                return temp.getCustomer();
                temp = temp.getPre();
        }
        return null;
    }
    
    public int size(){
        Node temp = head;
        int size=0;
        while (temp!=null){
            size++;
            temp = temp.getPre();
        }
        return size;
    }
    
    public String alldata(){
        Node temp = head;
        String data ="";
        while (temp!=null){
            data += temp.getCustomer().toString()+"\n";
            temp=temp.getPre();
        }
        return data;
    }
    
    boolean check (String card){
        Node temp = head;
        while (temp!=null){
            if (card.equals(temp.getCustomer().getCard()))
            {
                return true;
            }
            temp = temp.getPre();
        }
        return false;
    }
    
    boolean isExist (String text){
        Node temp = head;
        while (temp!=null){
            if (text.equals(temp.getCustomer().getcnic())){
                return true;
            }temp=temp.getPre();
        }return false;
    }
    
    String cnicInfo(String text){
        Node temp = head;
        while (temp!=null){
            if (text.equals (temp.getCustomer().getcnic())){
                return "\nCNIC              \t\t="+temp.getCustomer().getcnic()
                      +"\nName              \t\t="+temp.getCustomer().getName()
                      +"\nPIN               \t\t="+temp.getCustomer().getPin()
                      +"\nCard#             \t\t="+temp.getCustomer().getCard()
                      +"\nAccount#          \t\t="+temp.getCustomer().getAccountNo()
                      +"\nBalance           \t\t="+temp.getCustomer().getBalance();
            }
            temp=temp.getPre();
        }return"";
    }
    
    String Deposit(String text,double amount){
        Node temp = head;
        while (temp!=null){
            if (text.equals(temp.getCustomer().getcnic())){
                temp.getCustomer().deposit(amount);
                return "";
            }
            temp = temp.getPre();
        } return "";
    }
    
    void Withraw(Customer cuss){
        Node temp = head;
        while(temp!=null){
            if (cuss.getcnic().equals(temp.getCustomer().getcnic())){
                temp.setCustomer(cuss);
                break;
            }
            temp = temp.getPre();
        } 
    }
    
    Customer checkPInCard(String text,String text1){
        Node temp = head;
        while(temp!=null){
            if (text.equals(temp.getCustomer().getPin()+"") && text1.equals(temp.getCustomer().getCard())){
                return temp.getCustomer();
            }
            temp=temp.getPre();
        } return null;
}
}
