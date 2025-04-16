public class Movie extends LibraryMedia{
    private String director;
    private int duration;

    public Movie(String title, String director, int publicationYear, int duration){
        super(title, publicationYear);
        this.director = director;
        this.duration = duration;
    }

    @Override


    public void super.displayInformation(){
        System.out.println("Director: " + director);
        System.out.println("Duration: " + duration);


    }

    public void checkDuration(){
        if (duration > 120){
            System.out.println("It's a long movie " + duration + " minutes");

        }
        else {
            System.out.println("It's na standard length of movie " + duration + " minutes");
        }
    }












}
