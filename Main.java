import StudentManagement.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayListAddStudent st = new ArrayListAddStudent();
        System.out.println("****** Add Student ********");
        st.addStudent(students, new Student("BH002","Nguyen Thanh Trieu", 8.0));

        st.addStudent(students, new Student("BH001","Nguyen Thanh Toan", 7.5));

        st.addStudent(students, new Student("BH003","Nguyen Thanh Toan", 6.0));
        System.out.println("********* List data of students **********");
        for (Student s : students){
            System.out.println("ID = " + s.id +" , fullName = " + s.fullName + " , mark = " + s.mark + " , rank = " + s.rank);
        }

        System.out.println("********************** Edit Student ****************************");
        ArrayListEditStudent edit = new ArrayListEditStudent();
        edit.editStudent(students, 6, new Student("BH005", "Teo", 4));
        System.out.println("********* List data of students after updated **********");
        for (Student s : students){
            System.out.println("ID = " + s.id +" , fullName = " + s.fullName + " , mark = " + s.mark + " , rank = " + s.rank);
        }
        System.out.println("********* Edit Student By Id **********");
        edit.editStudentById(students, "BH009", new Student("BH009", "Ty", 10));
        System.out.println("********* List data of students after updated by ID **********");
        for (Student s : students){
            System.out.println("ID = " + s.id +" , fullName = " + s.fullName + " , mark = " + s.mark + " , rank = " + s.rank);
        }
        System.out.println("********************* Remove Student ***************************");
        ArrayListRemoveStudent removeSt = new ArrayListRemoveStudent();
        removeSt.removeStudentById(students, "BH009");
        System.out.println("********* List data of students after removed by ID **********");
        for (Student s : students){
            System.out.println("ID = " + s.id +" , fullName = " + s.fullName + " , mark = " + s.mark + " , rank = " + s.rank);
        }
        System.out.println("********************* Binary Search Student By Id ***************************");
        ArrayListSearchStudent searchSt = new ArrayListSearchStudent();
        String numberId = "BH001";
        int findSt = searchSt.binarySearch(students, numberId);
        if(findSt == -1){
            System.out.println("Can not found id = " + numberId);
        } else {
            System.out.println("found id = " + numberId);
        }

        System.out.println("************** Sort Student by ID ***************");
        Collections.sort(students, Student.IdStudentComparator);
        System.out.println("********* After sort *************");
        for (Student str : students){
            System.out.println(str);
        }
        System.out.println("************** Sort Student by Full name ***************");
        Collections.sort(students, Student.FullNameStduComparator);
        System.out.println("********* After sort *************");
        for (Student str : students){
            System.out.println(str);
        }
        System.out.println("************** Sort Student by mark ***************");
        Collections.sort(students, Student.MarkStduComparator);
        System.out.println("********* After sort *************");
        for (Student str : students){
            System.out.println(str);
        }
//                System.out.println("*************** Binary Search Student by ID ***************");
//                int studentId = 1001; // Example ID
//                int index = binarySearchStudentById(students, studentId);
//                String searchResult = (index != -1)
//                        ? "Found Student: " + students.get(index)
//                        : "ID not found: " + studentId;
//                System.out.println(searchResult);
//
//                // Sorting and Printing
//                sortAndPrintStudents(students, "ID");
//                sortAndPrintStudents(students, "Full Name");
//                sortAndPrintStudents(students, "Mark");
//            }
//
//            private static int binarySearchStudentById(List<Student> students, int id) {
//                // Implement binary search logic
//                return students.stream()
//                        .filter(student -> Student.getId() == id)
//                        .findFirst()
//                        .map(students::indexOf)
//                        .orElse(-1);
//            }
//
//            private static void sortAndPrintStudents(List<Student> students, String criterion) {
//                if (students.isEmpty()) {
//                    System.out.println("No students to sort.");
//                    return;
//                }
//
//                switch (criterion) {
//                    case "ID":
//                        System.out.println("Sorting by ID...");
//                        students.sort(Student.IdStudentComparator);
//                        break;
//                    case "Full Name":
//                        System.out.println("Sorting by Full Name...");
//                        students.sort(Student.FullNameStduComparator);
//                        break;
//                    case "Mark":
//                        System.out.println("Sorting by Mark...");
//                        students.sort(Student.MarkStduComparator);
//                        break;
//                    default:
//                        System.out.println("Unknown sorting criterion: " + criterion);
//                        return;
//                }
//                System.out.println("Students After Sort: " + students);

    }
}