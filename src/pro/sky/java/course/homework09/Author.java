package pro.sky.java.course.homework09;

import java.util.Objects;

public class Author {
    private String authorName;
    private String authorFullName;

    public Author(String authorName, String authorFullName) {
        this.authorName = authorName;
        this.authorFullName = authorFullName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorFullName() {
        return authorFullName;
    }

    public void setAuthorFullName(String authorFullName) {
        this.authorFullName = authorFullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorName, author.authorName) && Objects.equals(authorFullName, author.authorFullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorFullName);
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorFullName='" + authorFullName + '\'' +
                '}';
    }
}


