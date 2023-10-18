import java.util.Scanner;

abstract class Book {
    private String title;
    private String author;
    private int yearOfPublication;

    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public abstract void showInformation();

    public void read() {
        System.out.println("Reading the book");
    }
}

class Audiobook extends Book {
    private int duration;

    public Audiobook(String title, String author, int yearOfPublication, int duration) {
        super(title, author, yearOfPublication);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void showInformation() {
        System.out.println("Audiobook: " + getTitle() + " (" + getAuthor() + "), Year of Publication: " + getYearOfPublication() + ", Duration: " + duration + " minutes");
    }

    @Override
    public void read() {
        System.out.println("Listening to the audiobook");
    }
}

class Movie extends Book {
    private String director;

    public Movie(String title, String author, int yearOfPublication, String director) {
        super(title, author, yearOfPublication);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void showInformation() {
        System.out.println("Movie: " + getTitle() + " (" + getAuthor() + "), Year of Publication: " + getYearOfPublication() + ", Director: " + director);
    }

    @Override
    public void read() {
        System.out.println("Watching the movie");
    }
}

class Musical extends Book {
    private String composer;

    public Musical(String title, String author, int yearOfPublication, String composer) {
        super(title, author, yearOfPublication);
        this.composer = composer;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    @Override
    public void showInformation() {
        System.out.println("Musical: " + getTitle() + " (" + getAuthor() + "), Year of Publication: " + getYearOfPublication() + ", Composer: " + composer);
    }
}

public class Main {
    public static void main(String[] args) {
        Audiobook audiobook = new Audiobook("Book1", "Author1", 2020, 180);
        Movie movie = new Movie("Movie1", "Director1", 2015, "Director2");
        Musical musical = new Musical("Musical1", "Author2", 2018, "Composer1");

        audiobook.read();
        movie.read();
        musical.read();

        audiobook.showInformation();
        movie.showInformation();
        musical.showInformation();
    }
}
