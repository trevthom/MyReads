import java.util.ArrayList;

public class BookList {
  private Book book;
  ArrayList<Book> library;

  public BookList(){
    library = new ArrayList<Book>();
  }

  public void addBook(Book book){
    library.add(book);
  }
  
  public void setBook(Book book){
    this.book = book;
  }
  
  public Book getBook(){
    return this.book;
  }
}