public class LibraryMedia {
    protected String title;
    protected int publicationYear;
    protected boolean available;


    public LibraryMedia( String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
        this.available = true;

    }

    public void borrow(){
        if (available){
            available = false;
            System.out.println( title + "has been borrowed");
        } else {
            System.out.println( title + "has already been borrowed");
        }
    }

    public void returnMedia(){
        if (available){
            available = false;
            System.out.println( title + "has been returned");

        }
        else {
            System.out.println( title + "has not been returned");
        }


        public void displayInformation(){

            String status = available ? "Avaliable" : "Borrowed";
            System.out.println("Title: " + title);
            System.out.println("Publication Year: " + publicationYear);

            }



        }


    }







