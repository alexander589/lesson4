package Phone;

public class Main {

    public static void main(String[] args) {

        AbstractPhone ThomasEdisonPhone = new ThomasEdisonPhone(1879);
        AbstractPhone phone = new Phone(1984);

        User user = new User("dfhfk");

        user.callAnotherUser(102,ThomasEdisonPhone);
        user.callAnotherUser(103, phone);
    }
}
