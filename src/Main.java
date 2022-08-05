import pro.sky.java.course.homework09.Author;
import pro.sky.java.course.homework09.Book;

public class Main {
    public static void main(String[] args) {

     Author turgenev = new Author("Ivan","Turgenev");
     Author chehov = new Author("Anton","Chehov");
        Book mumu = new Book("Mumu",turgenev, 1854);
        Book hirurgia = new Book("Hirurgia",chehov, 1876);
        hirurgia.setPublicYear(1977);
        System.out.println(mumu);
        System.out.println(hirurgia);
        System.out.println(turgenev);
        System.out.println(chehov);

    }
}