
public class PhoneBook {

    private String name;
    private String phone;
    private String email;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public PhoneBook(String name, String phone, String email) {
        this.name = name;

        this.phone = phone;
        this.email = email;

    }

    void disply() {
        System.out.println("NAME : " + (name));
        System.out.println("PHONE : " + (phone));
        System.out.println("EMAIL : " + (email) + " rakib@gmail ");
    }
}

 class MyClass {

    public static void main(String[] args) {
        PhoneBook obj = new PhoneBook("rakib", "symsung", "rakib@gmail.com");
        obj.disply();
    }

}
