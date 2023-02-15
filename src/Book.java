

public class Book {

    String name;
    Author author = new Author();
    double price;
    int quantity = 0;

    public Book(){

    }

    public Book(String name, double price, Author author){
        this.name = name;
        this.price = price;

    }

    public Book(String name, Author author,double price, int quantity ){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    public Author getAuthor(Author author){
        return author;
    }

    public double getPrice(double price){
        return price;
    }
    public void setPrice(double price){
    }
    public int getQuantity(int quantity){
        return quantity;
    }
    public void setQuantity(int quantity){

    }
    public String toString(){
        return "Book[name = "+ this.name +",Author[name = "+ author.name+",email = "
                + author.email + ", gender = " +author.gender + ", price = "
                + price +",quantity = "+ quantity ;
    }
}
