package pro.sky.java.course.homework09;

import java.util.Objects;

public class Book {


    String bookName;
    Author author;
    int publicYear;


    public Book(String bookName, Author author, int publicYear) {
        this.bookName = bookName;
        this.author = author;
        this.publicYear = publicYear;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPublicYear() {
        return publicYear;
    }

    public void setPublicYear(int publicYear) {
        this.publicYear = publicYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author=" + author.getAuthorName() + " " + author.getAuthorFullName() +
                ", publicYear=" + publicYear +
                '}';
    }
}

