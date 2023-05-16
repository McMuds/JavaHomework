public class Book {
    private String genre;
    private String author;
    private String title;

    public Book(String genre, String author, String title){
        this.author = author;
        this.genre = genre;
        this.title = title;
    }

    public String getName(){
        return this.title;
    }

    public String getGenre(){
        return this.genre;
    }

    public String getAuthor(){
        return this.author;
    }
}
