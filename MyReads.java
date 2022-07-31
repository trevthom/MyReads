import java.util.Scanner;

public class MyReads{

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookList bookList = new BookList();
        int selection = 0;
        

        while(selection != 3){
            System.out.println("\n1 Add Book");
            System.out.println("2 View Book List");
            System.out.println("3 Exit");
            System.out.print("Enter selection: ");
            selection = scanner.nextInt();
            scanner.nextLine();

            if(selection != 1 && 
            selection != 2 &&
            selection != 3){
                System.out.println("Incorrect option entered.");
            }
            
            if (selection == 1){
                System.out.print("\nEnter book title: ");
                String title = scanner.nextLine();
                System.out.print("Enter book author: ");
                String author = scanner.nextLine();

                Book book = new Book(title, author);
                bookList.addBook(book);
            }
            
            if (selection == 2){
                System.out.println();
                for (Book book : bookList.library){
                    System.out.print(book.getTitle() + " - " + book.getAuthor() + "\n");
                }
            }
            
            if (selection == 3){
                break;
            }
        }

    }

}