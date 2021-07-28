import java.util.Scanner;

public class User {
    Scanner scanner = new Scanner(System.in);
    Validate validate = new Validate();
    private long id;
    private String username;
    private String email;
    private String password;

    public User() {
    }

    public User(long id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void input() {
        System.out.println("Vui lòng nhập vào mã id");
        id = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Vui lòng nhập vào tên Username");
        username = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Vui lòng nhập vào email");
        email = validate.validateEmail(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Vui lòng nhập vào password");
        password = validate.validatePassword(scanner.nextLine());
    }

    @Override
    public String toString() {

        return id + " - " + username + " - " + email + " - " + password;
    }

}