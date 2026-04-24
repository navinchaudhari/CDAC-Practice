import java.util.Scanner;

class Author{
    private String authorName;
    private String email;
    private char gender;

    Author(String authorName, String email, char gender){
        this.authorName = authorName;
        this.email = email;
        this.gender = gender;
    }

    Author(){}

    public String getAuthorname(){
        return this.authorName;
    }
    public String getEmail(){
        return this.email;
    }

    public char getGender(){
        return this.gender;
    }
}

class Book{
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;



    Book(){}
    Book(String name, Author author, double price, int qtyInStock){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;

    }

    public String getName(){
        return this.name;
    }
    public Author getAuthor(){
        return this.author;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQtyInStock(){
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock){
        this.qtyInStock = qtyInStock;
    }


    void printDetails(){
        System.out.println("Book Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + qtyInStock);
        System.out.println("Author Name: " + author.getAuthorname());
        System.out.println("Author Email: " + author.getEmail());
        System.out.println("Author Gender: " + author.getGender());

    }
}

public class Solution {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String authorName = sc.nextLine();
        String email = sc.nextLine();
        char gender = sc.next().charAt(0);

        Author author = new Author(authorName, email, gender);

        String name = sc.nextLine();
        sc.nextLine();
        double price = sc.nextDouble();
        int qtyInStock = sc.nextInt();

        Book book = new Book(name, author, price, qtyInStock);

        book.printDetails();

        int pow =(int) Math.pow(2, 3);


        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
