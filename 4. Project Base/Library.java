// You have to implement a library using Java Class Library
// Methods: addBook, issueBook, returnBook, showAvailableBooks
// Properties: Array to store the available books,
// Array to store the issued books
import java.util.*;
class Books{
    Scanner sc = new Scanner(System.in);
    public static String[] arr=new String[100];
    public static int a=-1;
    public String b="";
    public String r="";
    int x=-1;
    public void addBook(){
        System.out.println("Enter the Book Name you want to add");
        arr[++a]=sc.nextLine();
    }
    public void issueBook(){
        if(a==-1)
            System.out.println("No books are available for issuing...");
        else{
            System.out.println("Enter the name of the book you want to issue");
            b=sc.nextLine();
            for(int j=0;j<=a;j++) {
                if (arr[j].equals(b)) {
                    System.out.println("Your book " + b + " is available for issue...\nThank you for issuing the book.");
                    x = 1;
                    while (j != a) {
                        arr[j] = arr[++j];
                    }
                    arr[a] = null;
                    a--;
                }
            }
            if(x==-1)
                System.out.println("Your book is not available in the Library.");
        }
    }
    public void showAvailableBooks(){
        System.out.println("You can borrow any of the following books :");
        for(int j=0;j<=a;j++)
            System.out.println((j+1)+"."+" "+arr[j]);
    }
    public void returnBook(){
        System.out.println("Enter the book name that you want to return :");
        r= sc.nextLine();
        arr[++a]=r;
    }
}

public class Library {
    public static void main(String[] args) {
        Books bk = new Books();
        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Natural Number to Continue...");
        ch = sc.nextInt();
        while (ch!=0) {
            System.out.println("Enter 1 for Adding a Book\nEnter 2 for Issuing a Book\nEnter 3 for Showing the available Books\nEnter 4 for Returning a Book\nEnter 0 to Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    bk.addBook();
                    break;
                case 2:
                    bk.issueBook();
                    break;
                case 3: {
                    System.out.println("Total number of available books are : "+(Books.a+1));
                    bk.showAvailableBooks();
                    break;
                }
                case 4:
                    bk.returnBook();
                    break;
                case 0: break;
                default:
                    System.out.println("Wrong choice...");
                    break;
            }
        }
        System.out.println("Thank You for visiting...Visit again...");
    }
}
