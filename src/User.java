public class User {

    enum Gender {Male, Female};
    String name;
    String emailAddress;
    int age;
    String address;
    String city;
    String zipCode;
    Gender gender;

    public User(String name, String emailAddress, int age, String address, String city, String zipCode, Gender gender) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.age = age;
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
        this.gender = gender;
    }
}
