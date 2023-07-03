package Exercise13;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public abstract class Employee {
    private int ID;
    private String fullName;
    private String birthDay;
    private String phone;
    private String email;
    private int employeeType;
    private int employeeCount;
    private List<Certificate> certificates;
    public abstract void showInfo();
    public Employee(int ID, String fullName, String birthDay, String phone, String email, int employeeType) {
        this.ID = ID;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.employeeType = employeeType;
        this.employeeCount = 0;
        this.certificates = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }
    public void addCertificate(Certificate certificate) {
        certificates.add(certificate);
    }
    public static boolean isValidName(String fullName) {
        // Kiểm tra độ dài tên (có ít nhất một ký tự và không vượt quá 100 ký tự)
        return fullName != null && !fullName.isEmpty() && fullName.length() <= 100;
    }

    // Kiểm tra tính hợp lệ của ngày sinh
    public static boolean isValidBirthDate(Date birthDate) {
        // Kiểm tra ngày sinh không được lớn hơn ngày hiện tại
        Date currentDate = new Date();
        return birthDate != null && birthDate.before(currentDate);
    }

    // Kiểm tra tính hợp lệ của số điện thoại
    public static boolean isValidPhone(String phone) {
        // Kiểm tra độ dài số điện thoại (ít nhất 10 ký tự và không vượt quá 15 ký tự)
        // Các yêu cầu khác tùy thuộc vào quy định số điện thoại trong nước hoặc quốc tế
        return phone != null && phone.matches("^[0-9]{10,15}$");
    }

    // Kiểm tra tính hợp lệ của địa chỉ email
    public static boolean isValidEmail(String email) {
        // Kiểm tra định dạng email
        // Đây là một kiểm tra đơn giản, bạn có thể sử dụng các biểu thức chính quy phức tạp hơn
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,}$");
    }
}
