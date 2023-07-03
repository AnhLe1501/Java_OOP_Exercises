package Exercise13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManagementSystem {
    private List<Employee> employees;

    public EmployeeManagementSystem() {
        employees = new ArrayList<>();
    }

    // Add new employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void searchEmployeeByID (int id) {
        List<Employee> ketQua = employees.stream()
                    .filter(o -> o.getID() == id)
                    .collect(Collectors.toList());
        if (!ketQua.isEmpty()) {
            ketQua.forEach(Employee::showInfo);
        } else {
            System.out.println("Không tìm thấy nhân viên có id: " + id );
        }
    }

    // Update employee information based on ID
    public void updateEmployee(int ID, Employee updatedEmployee) {
        for (Employee employee : employees) {
            if (employee.getID() == ID) {
                employee.setFullName(updatedEmployee.getFullName());
                employee.setBirthDay(updatedEmployee.getBirthDay());
                employee.setPhone(updatedEmployee.getPhone());
                employee.setEmail(updatedEmployee.getEmail());
                if (employee instanceof Experience) {
                    Experience exp = (Experience) employee;
                    Experience updatedExp = (Experience) updatedEmployee;
                    exp.setExpInYear(updatedExp.getExpInYear());
                    exp.setProSkill(updatedExp.getProSkill());
                } else if (employee instanceof Fresher) {
                    Fresher fresher = (Fresher) employee;
                    Fresher updatedFresher = (Fresher) updatedEmployee;
                    fresher.setGraduationDate(updatedFresher.getGraduationDate());
                    fresher.setGraduationRank(updatedFresher.getGraduationRank());
                    fresher.setEducation(updatedFresher.getEducation());
                } else if (employee instanceof Intern) {
                    Intern intern = (Intern) employee;
                    Intern updatedIntern = (Intern) updatedEmployee;
                    intern.setMajors(updatedIntern.getMajors());
                    intern.setSemester(updatedIntern.getSemester());
                    intern.setUniversityName(updatedIntern.getUniversityName());
                }
                break;
            }
        }
    }

    // Delete employee based on ID
    public void deleteEmployee(int ID) {
        employees.removeIf(employee -> employee.getID() == ID);
    }

    // Get all employees of a specific type
    public List<Employee> getAllEmployeesByType(int employeeType) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getEmployeeType() == employeeType) {
                result.add(employee);
            }
        }
        return result;
    }
}

