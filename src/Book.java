import java.util.Scanner;
public class Book {
    private String bookName;
    private int yearOfPublishing;
    private long isbn;
    private int numberOfAuthors;
    private Author[] arrayOfAuthors;

    public Book(String bookName, int yearOfPublishing,
                long isbn, int numberOfAuthors, Author[] arrayOfAuthors) {
        this.bookName = bookName;
        this.yearOfPublishing = yearOfPublishing;
        this.isbn = isbn;
        this.numberOfAuthors = numberOfAuthors;
        this.arrayOfAuthors = arrayOfAuthors;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book name: ");
        String bookName = scanner.nextLine();
        System.out.println("Enter year of publishing: ");
        int yearOfPublishing = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter ISBN: ");
        long isbn = Long.parseLong(scanner.nextLine());
        System.out.println("Enter number of authors: ");
        int numberOfAuthorsInBook = Integer.parseInt(scanner.nextLine());
        Author[] authors = new Author[numberOfAuthorsInBook];
        for (int i = 0; i < authors.length; i++) {
            System.out.println("Enter author name: ");
            String authorName = scanner.nextLine();
            System.out.println("Enter author genre: ");
            String genre = scanner.nextLine();
            System.out.println("Enter number of books published by author: ");
            int numberOfBooksPublished = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter if author is an expert: (true / false)");
            boolean expert = scanner.nextBoolean();
            authors[i] = new Author(authorName, genre, numberOfBooksPublished, expert);
        }
        Book book = new Book(bookName, yearOfPublishing, isbn,
                numberOfAuthorsInBook, authors);
        System.out.println(book);
        scanner.close();
    }

    public int getNumberOfAuthors() {
        return numberOfAuthors;
    }

    public void setNumberOfAuthors(int numberOfAuthors) {
        this.numberOfAuthors = numberOfAuthors;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public Author[] getArrayOfAuthors() {
        return arrayOfAuthors;
    }

    public void setArrayOfAuthors(Author[] arrayOfAuthors) {
        this.arrayOfAuthors = arrayOfAuthors;
    }

    private String getAuthorNamesAsString() {
        StringBuilder result = new StringBuilder();
        for(Author author : arrayOfAuthors) {

        }
        return result.toString();
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %d, %s", getBookName(),
                getYearOfPublishing(), getIsbn(), getAuthorNamesAsString());
    }
}













