package Exercise13;

public class Validation {
    public static boolean isValidBirthDay(String birthDay) {
        String pattern = "^\\d{4}-\\d{2}-\\d{2}$";
        return birthDay.matches(pattern);
    }

    // Validate email format
    public static boolean isValidEmail(String email) {
        String pattern = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        return email.matches(pattern);
    }

    // Validate name format (accepts letters and spaces only)
    public static boolean isValidName(String name) {
        String pattern = "^[A-Za-z ]+$";
        return name.matches(pattern);
    }

    // Validate phone number (10 to 15 digits)
    public static boolean isValidPhone(String phone) {
        String pattern = "^\\d{10,15}$";
        return phone.matches(pattern);
    }
}
