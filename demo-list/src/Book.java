import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Book {

    private int price;
    private String name;
    private String author;

    public Book(String name, String author, int price){
        this.name= name;
        this.author=author;
        this.price=price;
    }

    public String getName(){
        return this.name;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getPrice(){
        return this.price;
    }
     public String toString(){
         return "Book name is " +this.name
                 +" , author is " +this.author
                 +" , price  is " +this.price;
     }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        } else if(!(obj instanceof Book)){
            return false;
        }
        Book temp = (Book) obj;
        return Objects.equals(this.name, temp.getName()) 
            && Objects.equals(this.author, temp.getAuthor()) 
            && Objects.equals(this.price, temp.getPrice());
    }

    public int hashCode(){
        return Objects.hash(this.author,this.price,this.name);
    }

    public static void main(String[] args) {
        Book[] books = new Book[2];
        books[0]= new Book("HAHA", "Test", 10);
        books[1]= new Book("HOHO", "Test2", 20);
        //System.out.println(books[0].toString());
        String name =books[0].getAuthor();
        //System.out.println(name);

        //ArrayList
        ArrayList<Book> books2 = new ArrayList<>();
        books2.add(new Book("HAHA", "Test", 10));
        books2.add(new Book("HOHO", "Test2", 20));
        books2.add(new Book("HEHE", "Test3", 30));
        //System.out.println(books2.size());
        books2.add(new Book("HiHi", "Test4", 40));
        //System.out.println(books2.size());
        //System.out.println();

        //contains() -> equals(), hashcode()
        //System.out.println(books2.contains(new Book("HAHA", "Test", 10)));
        //System.out.println(books2.contains(new Book("HOHO", "Test", 10)));
        //Book test = books2.get(1);
        //System.out.println(test.hashCode());

        //remove()
        books2.remove(new Book("HOHO", "Test2", 20));
        //System.out.println(books2);
        //System.out.println(books2.size());
        //books2.clear();
        //System.out.println(books2.toString());

        //set()
        books2.set(0, new Book("SET", "Test", 10));       
        //System.out.println(books2.toString());

        //books2.clear();
        //System.out.println(books2.isEmpty());

        //ArrayList<Book> books3 = new ArrayList<>(List.of(new Book("test","test",10),new Book("test2","test2",20)));
        ArrayList<Book> books3 = new ArrayList<>(List.of(new Book("test", "test",10), new Book("test2", "test2",20)));
        List<Book> books4 = List.of(new Book("test", "test",10), new Book("test2", "test2", 20));
        System.out.println(books3.size());
        System.out.println(books4.size());

        books3.add(new Book("test", "test",10));
        //books4.add(new Book("test", "test",10));

        for(Book b:books4){
            System.out.println(b.getPrice()+" "+b.getAuthor());
        }

    }
}
