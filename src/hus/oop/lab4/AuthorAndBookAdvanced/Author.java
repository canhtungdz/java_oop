package hus.oop.lab4.AuthorAndBookAdvanced;

public class Author {
    private String name;
    private String email;
    private char gender = 'm';
    public Author() {
    }
    public Author(String name, String email, char gender) {
        this.email = email;
        this.gender = gender;
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    public String getName() {
        return name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
    }


}