package Exercise13;

import java.util.Scanner;

public class Experience extends Employee {
    private int expInYear;
    private String proSkill;

    public Experience(int ID, String fullName, String birthDay, String phone, String email, int expInYear, String proSkill) {
        super(ID, fullName, birthDay, phone, email, 0);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }
    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }
    public String getProSkill() {
        return proSkill;
    }
    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    public void showInfo() {
        System.out.println("Experience Employee Info:");
        System.out.println("ID: " + getID());
        System.out.println("Full Name: " + getFullName());
        System.out.println("Birth Day: " + getBirthDay());
        System.out.println("Phone: " + getPhone());
        System.out.println("Email: " + getEmail());
        System.out.println("Experience in Year: " + expInYear);
        System.out.println("Professional Skill: " + proSkill);
    }
    public void updateInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new years of experience: ");
        int expInYear = scanner.nextInt();
        System.out.println("Enter new professional skill: ");
        String proSkill = scanner.next();
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }
}

