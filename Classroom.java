package WILDER;

public class Classroom {
        public static void main(String[] args) {
        Wilder jeanClaude = new Wilder("Jean-Claude", true);
        Wilder henri = new Wilder("Henri", false);
        Wilder marie = new Wilder("Marie", true);
        Wilder pierre = new Wilder("Pierre", false);

        System.out.println(jeanClaude.whoAmI());
        System.out.println(henri.whoAmI());
        System.out.println(marie.whoAmI());
        System.out.println(pierre.whoAmI());
    }
}
