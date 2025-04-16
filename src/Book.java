public class Book extends LibraryMedia{
    private String author;
    private int numberOfPages;

    public Book (String title, String author, int numberOfPages, int publicationYear ){
        super(title, publicationYear);
        this.author = author;
        this.numberOfPages = numberOfPages;

    }

    @Override

    public void super.displayInformation(){
        System.out.println("Author: " + author);
        System.out.println("Number of pages: " + numberOfPages);

    }

    public void checkNumberOfPages(){
        if(numberOfPages > 500){
            System.out.println("It is a long book" + numberOfPages + " pages");
        } else {
            System.out.println("It is na standard length of book" + numberOfPages + " pages");
        }
    }
















}
