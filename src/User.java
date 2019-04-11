public class User {


    public User(UserBuilder userBuilder) {
    }




    public static class UserBuilder {


    String name;
    String emailAddress;
    int age;
    String address;
    String city;
    String zipCode;




    public UserBuilder(String name) {
        this.name = name;

    }

    public UserBuilder emailAddress(String emailAddress) {

        this.emailAddress = emailAddress;
        return this;
    }

    public UserBuilder age(int age) {

        this.age= age;
        return this;
    }

    public UserBuilder address(String address) {

        this.address = address;
        return this;
    }

    public UserBuilder city(String city) {

        this.city = city;
        return this;
    }

    public UserBuilder zipcode(String zipCode) {

        this.zipCode = zipCode;
        return this;
    }


    public User build() {

        return new User(this);
    }




    }

    public User(String angelica, String s, int i, String s1, String s2, String s3) {
    }
}
