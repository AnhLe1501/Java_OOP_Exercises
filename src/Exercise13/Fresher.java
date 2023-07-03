package Exercise13;

import java.util.Scanner;

public class Fresher extends Employee {
    private String graduationDate;
    private String graduationRank;
    private String education;

    public Fresher(int ID, String fullName, String birthDay, String phone, String email, String graduationDate, String graduationRank, String education) {
        super(ID, fullName, birthDay, phone, email, 1);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public String getGraduationDate() {
        return graduationDate;
    }
    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }
    public String getGraduationRank() {
        return graduationRank;
    }
    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }
    public void setEducation(String education) {
        this.education = education;
    }
    public void showInfo() {
        System.out.println("Fresher Employee Info:");
        System.out.println("ID: " + getID());
        System.out.println("Full Name: " + getFullName());
        System.out.println("Birth Day: " + getBirthDay());
        System.out.println("Phone: " + getPhone());
        System.out.println("Email: " + getEmail());
        System.out.println("Graduation Date: " + graduationDate);
        System.out.println("Graduation Rank: " + graduationRank);
        System.out.println("Education: " + education);
    }
}

