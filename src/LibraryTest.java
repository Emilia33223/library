import static java.lang.System.out;

public class LibraryTest {



    public static void main(String[] args) {

        Book book1 = new Book("The Witcher"
                , 1990,
                320);
        Movie movie1 = new Movie("The Green Mile", "Andrzej Sapkowski", 1999, 189);


        LibraryMedia[]mediaArray = new LibraryMedia[2];
        mediaArray[0] = book1;
        mediaArray[1] = movie1;
        System.out.println("===== INFORMATION ABOUT ALL MEDIA =====");
        for (LibraryMedia media : mediaArray) {

            media.displayInformation();
            out.println("----------------");
        }
// Demonstrating borrowing and returning operations
        out.println("\n===== BORROWING AND RETURNING OPERATIONS == == = ");
                book1.borrow();
        book1.borrow();
        book1.returnMedia();

        out.println("\n===== TYPE-SPECIFIC METHODS =====");
        book1.checkNumberOfPages();
        movie1.checkDuration();

System.out.println("\n===== TYPE CASTING =====");
        for (LibraryMedia media : mediaArray) {
            if (media instanceof Book) {

                Book b = (Book) media;
                b.checkNumberOfPages();

            } else if (media instanceof Movie) {

                ((Movie) media).checkDuration();
            }
        }
    }


}
