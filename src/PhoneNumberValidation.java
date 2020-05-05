import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        String numberPhone = sc.nextLine();
        final String PHONE_REGEX = "^[(]\\d{2}[)][-][(]\\d{10}[)]$";
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(numberPhone);
        System.out.println(matcher.matches());
    }
}
