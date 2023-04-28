package classes;

public class Book {
    private  Autor autorBook;
    private int publicationYear; 
    private String name;
    public Book(Autor autorBook, int publicationYear, String name) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.autorBook = autorBook;
    }
    public String getName() {
        return this.name;
    }
    public int getPublicationYear (){
        return this.publicationYear;
    }
    public Autor getAutorBook() {
        return this.autorBook;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}