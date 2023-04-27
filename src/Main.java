import classes.Autor;
import classes.Book;

public class Main {
    public static void main(String[] args) {
        Autor oneAutor = new Autor("Василий", "Иванович", "Пупкин");
        System.out.println("oneAutor.firstName = " + oneAutor.getFirstName());
        System.out.println("oneAutor.midlName = " + oneAutor.getMidlName());
        System.out.println("oneAutor.lastName = " + oneAutor.getLastName());
        System.out.println(oneAutor.getFirstName() + " " + oneAutor.getMidlName() + " "  + oneAutor.getLastName());

        Autor tooAutor = new Autor("Иван", "Васильевич", "Кошкин");
        System.out.println("tooAutor.firstName = " + tooAutor.getFirstName());
        System.out.println("tooAutor.midlName = " + tooAutor.getMidlName());
        System.out.println("tooAutor.lastName = " + tooAutor.getLastName());
        System.out.println(tooAutor.getFirstName() + " " + tooAutor.getMidlName() + " "  + tooAutor.getLastName());

        Book cat = new Book("Cat", 2021, "Василий Иванович Пупкин");
        System.out.println("cat.name = " + cat.getName());
        System.out.println("cat.publicationYear = " + cat.getPublicationYear());
        System.out.println("cat.autor = " + cat.getAutor());
        cat.setPublicationYear(2022);
        System.out.println("cat.publicationYear = " + cat.getPublicationYear());

        Book dog = new Book("Dog", 2021, "Иван Васильевич Кошкин");
        System.out.println("dog.name = " + dog.getName());
        System.out.println("dog.publicationYear = " + dog.getPublicationYear());
        System.out.println("dog.autor = " + dog.getAutor());
        cat.setPublicationYear(2022);
        System.out.println("dog.publicationYear = " + dog.getPublicationYear());
    }
}
