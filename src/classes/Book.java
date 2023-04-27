package classes;

public class Book {
    private  String name;
    private int publicationYear;
    private String autor;
    public Book(String name, int publicationYear, String autor) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.autor = autor;
    }
    public String getName() {
        return this.name;
    }
    public int getPublicationYear (){
        return this.publicationYear;
    }
    public String getAutor() {
        return this.autor;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}