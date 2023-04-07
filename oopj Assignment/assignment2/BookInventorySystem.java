import java.util.*;

class Inventory{

    /// total differnt
}

class Book{
   private String title;
   private String author;
   private String publisher;
   private String isbn;
   private int year;
   private int price;
   private int quantity;

   Book(){
    //TO DO
   }

   public void setTitle(String title){
    this.title = title;
   }

   public String getTitle(){
    return title;
   }

   public void setAuthor(String author){
    this.author = author;
   }

   public String getAuthor(){
    return author;
   }

   public void setPublisher(String publisher){
    this.publisher = publisher;
   }

   public String getPublisher(){
    return publisher;
   }


   public void setIsbn(String isbn){
    this.isbn = isbn;
   }

   public String getIsbn(){
    return isbn;
   }

   public void setYear(int year){
    this.year = year;
   }

   public int getYear(){
    return year;
   }

   public void setPrice(int price){
    this.price = price;
   }

   public int getPrice(){
    return price;
   }

   public void setQuantity(int quantity){
    this.quantity = quantity;
   }

   public int getQuantity(){
    return quantity;
   }

   public void increaseQuantity(int increase){
    this.quantity = quantity + increase;
    
   }

   public void decreaseQuantity(int decrease){
    this.quantity = quantity - decrease;
    

   }

  public void getInventoryValue(){
    System.out.println(quantity*price);
   }



    //BooK Details
}



public class BookInventorySystem {
    public static void main(String args[]){

        System.out.println("Welcome Book Inventory System.....!!!!");
        System.out.println("__________________________________________________");
        System.out.println();
        Scanner sc = new Scanner(System.in);
         
        Book book1 = new Book();

        System.out.print("Title  : ");
        book1.setTitle(sc.nextLine());

        System.out.print("Author  : ");
        book1.setAuthor(sc.nextLine());

        System.out.print("Publisher  : ");
        book1.setPublisher(sc.nextLine());

        System.out.print("Isbn  : ");
        book1.setIsbn(sc.nextLine());

        System.out.print("Year  : ");
        book1.setYear(sc.nextInt());

        System.out.print("Price  : ");
        book1.setPrice(sc.nextInt());

        System.out.print("Quantity  : ");
        book1.setQuantity(sc.nextInt());

        System.out.println("__________________________________________________");
        System.out.println();
        System.out.println("The Title  :-> "+book1.getTitle());
        System.out.println("The Author :-> "+book1.getAuthor());
        System.out.println("The Publisher :-> "+book1.getPublisher());
        System.out.println("The Isbn :-> "+book1.getIsbn());
        System.out.println("The Year :-> "+book1.getYear());
        System.out.println("The Price :-> "+book1.getPrice());
        System.out.println("The Quantity :-> "+book1.getQuantity());
        System.out.println();
        System.out.println("__________________________________________________");
        System.out.println();

        System.out.println("Enter the Quantity to increase the book in the inventory ");
        book1.increaseQuantity(sc.nextInt());
        System.out.println("Updated Quantity of increased books in the inventory:-> "+book1.getQuantity());

        System.out.println("Enter the Quantity to decrease the book in the inventory ");
        book1.decreaseQuantity(sc.nextInt());
        System.out.println("Updated Quantity of decreased books in the inventory:-> "+book1.getQuantity());

        book1.getInventoryValue();

    }
    
}
