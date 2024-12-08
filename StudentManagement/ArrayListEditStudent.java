package StudentManagement;
import java.util.ArrayList;
import java.util.Objects;

public class ArrayListEditStudent {
    public void editStudent(ArrayList<Student> students, int position, Student object) {
        try {
            // Validate the student object
            validateStudent(object);

            // Check if the position is valid
            if (position < 0 || position >= students.size()) {
                throw new IndexOutOfBoundsException("Invalid position: " + position);
            }
            // Edit the student at the specified position
            students.set(position, object);
            System.out.println("Student at position " + position + " updated successfully: " + object);
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
    public void editStudentById(ArrayList<Student> students, String id, Student data) {
        try {
            // Validate the student data
            validateStudent(data);
            boolean found = false;
            for (int i = 0; i < students.size(); i++) {
                if (Objects.equals(students.get(i).getId(), id)) {
                    students.set(i, data);
                    found = true;
                    System.out.println("Student with ID " + id + " updated successfully: " + data);
                    break;
                }
            }
            if (!found) {
                System.out.println("Error: Student with ID " + id + " not found.");
            }
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
    private void validateStudent(Student student) {
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
    }
}