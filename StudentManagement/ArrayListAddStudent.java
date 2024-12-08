package StudentManagement;
import java.util.ArrayList;
import java.util.Objects;

public class ArrayListAddStudent {
    public void addStudent(ArrayList<Student> students, Student objectData) {
        try {
            // Validate the student object
            validateStudent(students, objectData);
            // If all validations pass, add the student to the list
            students.add(objectData);
            System.out.println("Student added successfully: " + objectData);
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
    private void validateStudent(ArrayList<Student> students, Student student) {
        if (student == null) {
            throw new NullPointerException("Student object cannot be null.");
        }
        if (student.getFullName() == null || student.getFullName().isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank.");
        }
        if (student.getMark() < 0 || student.getMark() > 10) {
            throw new IllegalArgumentException("Score must be between 0 and 10.");
        }
        if (student.getId() == null || student.getId().isBlank()) {
            throw new IllegalArgumentException("ID cannot be blank.");
        }
        // Check for duplicate ID
        for (Student existingStudent : students) {
            if (Objects.equals(existingStudent.getId(), student.getId())) {
                throw new IllegalArgumentException("Error: A student with ID " + student.getId() + " already exists.");
            }
        }
    }
}