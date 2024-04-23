public class Node {
  
  private String str; // object reference
  private Node next; // object reference

  public Node(String str){
    this.str=str;
  }
  
  public Node(String str, Node next){
    this.str =str;
    this.next =next;
  }

  public void setNext(Node next){
    this.next=next;
  }

  public void setString(String str){
    this.str=str;
  }

  public String getString(){
    return this.str;
  }


  public Node getNext(){
    return this.next;
  }




  public static void main(String[] args) {
    //"hello", "world", "!!!"
    Node headNode = new Node("hello",new Node("world",new Node("!!!")));
    System.out.println(headNode);
    Node temp = headNode;
    while (temp != null) {
    System.out.println(temp.getString());
      if("!!!".equals(temp.getString())){
        System.out.println("True");
      }
      temp=temp.getNext();
    }
  }
  
}
