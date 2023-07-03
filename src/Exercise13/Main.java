package Exercise13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) throws PhoneException, FullNameException, EmailException, BirthDayException {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("========= MENU =========");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Tìm kiếm nhân viên");
            System.out.println("3. Xoá nhân viên theo ID");
            System.out.println("4. Thoát chương trình");
            System.out.println("========================");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Chọn loại nhân viên:");
                    System.out.println("a. Experience");
                    System.out.println("b. Fresher");
                    System.out.println("c. Intern");
                    System.out.print("Nhập lựa chọn của bạn: ");
                    String employeeType = scanner.nextLine();

                    Employee employee;
                    switch (employeeType) {
                        case "a":
                            // Add an Experience employee
                            employee = createExperienceEmployee(scanner);
                            ems.addEmployee(employee);
                            break;
                        case "b":
                            // Add a Fresher employee
                            employee = createFresherEmployee(scanner);
                            ems.addEmployee(employee);
                            break;
                        case "c":
                            // Add an Intern employee
                            employee = createInternEmployee(scanner);
                            ems.addEmployee(employee);
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ.");
                    }
                    break;
                case 2:
                    System.out.print("Nhập ID của nhân viên cần tìm: ");
                    int searchId = scanner.nextInt();
                    ems.searchEmployeeByID(searchId);
                    break;

                case 3:
                    System.out.print("Nhập ID nhân viên cần xoá: ");
                    int employeeIdToDelete = scanner.nextInt();
                    ems.deleteEmployee(employeeIdToDelete);
                    break;
                case 4:
                    System.out.println("Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 4);

        scanner.close();
    }
    private static Experience createExperienceEmployee(Scanner scanner) throws BirthDayException, PhoneException, EmailException, FullNameException {
        System.out.print("Nhập ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập Họ và tên: ");
        String fullName = scanner.nextLine();
        if (!Employee.isValidName(fullName)) {
            throw new FullNameException("Họ và tên không hợp lệ.");
        }

        System.out.print("Nhập Ngày sinh (yyyy-MM-dd): ");
        String birthDateString = scanner.nextLine();
        Date birthDate;
        try {
            birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(birthDateString);
            if (!Employee.isValidBirthDate(birthDate)) {
                throw new BirthDayException("Ngày sinh không hợp lệ.");
            }
        } catch (ParseException e) {
            throw new BirthDayException("Định dạng ngày sinh không hợp lệ.");
        }

        System.out.print("Nhập Số điện thoại: ");
        String phone = scanner.nextLine();
        if (!Employee.isValidPhone(phone)) {
            throw new PhoneException("Số điện thoại không hợp lệ.");
        }

        System.out.print("Nhập Email: ");
        String email = scanner.nextLine();
        if (!Employee.isValidEmail(email)) {
            throw new EmailException("Email không hợp lệ.");
        }

        System.out.print("Nhập Số năm kinh nghiệm: ");
        int expInYear = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập Kỹ năng chuyên môn: ");
        String proSkill = scanner.nextLine();

        return new Experience(id, fullName, birthDateString, phone, email, expInYear, proSkill);
    }

    private static Fresher createFresherEmployee(Scanner scanner) throws FullNameException, BirthDayException, PhoneException, EmailException {
        System.out.print("Nhập ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập Họ và tên: ");
        String fullName = scanner.nextLine();
        if (!Employee.isValidName(fullName)) {
            throw new FullNameException("Họ và tên không hợp lệ.");
        }

        System.out.print("Nhập Ngày sinh (yyyy-MM-dd): ");
        String birthDateString = scanner.nextLine();
        Date birthDate;
        try {
            birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(birthDateString);
            if (!Employee.isValidBirthDate(birthDate)) {
                throw new BirthDayException("Ngày sinh không hợp lệ.");
            }
        } catch (ParseException | BirthDayException e) {
            throw new BirthDayException("Định dạng ngày sinh không hợp lệ.");
        }

        System.out.print("Nhập Số điện thoại: ");
        String phone = scanner.nextLine();
        if (!Employee.isValidPhone(phone)) {
            throw new PhoneException("Số điện thoại không hợp lệ.");
        }

        System.out.print("Nhập Email: ");
        String email = scanner.nextLine();
        if (!Employee.isValidEmail(email)) {
            throw new EmailException("Email không hợp lệ.");
        }

        System.out.print("Nhập Thời gian tốt nghiệp (yyyy-MM-dd): ");
        String graduationDate = scanner.nextLine();

        System.out.print("Nhập Xếp loại tốt nghiệp: ");
        String graduationRank = scanner.nextLine();

        System.out.print("Nhập Trường tốt nghiệp: ");
        String education = scanner.nextLine();

        return new Fresher(id, fullName, birthDateString, phone, email, graduationDate, graduationRank, education);
    }

    private static Intern createInternEmployee(Scanner scanner) throws FullNameException, BirthDayException, PhoneException, EmailException {
        System.out.print("Nhập ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập Họ và tên: ");
        String fullName = scanner.nextLine();
        if (!Employee.isValidName(fullName)) {
            throw new FullNameException("Họ và tên không hợp lệ.");
        }

        System.out.print("Nhập Ngày sinh (yyyy-MM-dd): ");
        String birthDateString = scanner.nextLine();
        Date birthDate;
        try {
            birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(birthDateString);
            if (!Employee.isValidBirthDate(birthDate)) {
                throw new BirthDayException("Ngày sinh không hợp lệ.");
            }
        } catch (ParseException | BirthDayException e) {
            throw new BirthDayException("Định dạng ngày sinh không hợp lệ.");
        }

        System.out.print("Nhập Số điện thoại: ");
        String phone = scanner.nextLine();
        if (!Employee.isValidPhone(phone)) {
            throw new PhoneException("Số điện thoại không hợp lệ.");
        }

        System.out.print("Nhập Email: ");
        String email = scanner.nextLine();
        if (!Employee.isValidEmail(email)) {
            throw new EmailException("Email không hợp lệ.");
        }

        System.out.print("Nhập Chuyên ngành đang học: ");
        String majors = scanner.nextLine();

        System.out.print("Nhập Học kì đang học: ");
        String semester = scanner.nextLine();

        System.out.print("Nhập Tên trường đang học: ");
        String universityName = scanner.nextLine();

        return new Intern(id, fullName, birthDateString, phone, email, majors, semester, universityName);
    }
}
