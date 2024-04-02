package generics.interfaces;

public class SchoolManagement {

    /* Task : Okul yönetimi için öğrenci ve öğretmen kayıtlarını
        - oluşturan
        - görüntüleyen
        - güncelleyen
        - silen
        bir program yazınız.

        Her iki sınıf için aynı metotlara ihtiyacımız var (add, delete, ...)
        Implement edip bu metotları
     */

    public static void main(String[] args) {

        Student student = new Student("Tolstoy");
        Student student2 = new Student("Balzac");
        StudentRepo studentRepo = new StudentRepo();
        Teacher teacher = new Teacher("Dostoyevski");
        TeacherRepo teacherRepo = new TeacherRepo();

        studentRepo.add(student);
        studentRepo.add(student2);
        //studentRepo.update(student);
        studentRepo.get(student);

        for (Student w : studentRepo.studentList){
            System.out.println(w.getName());
        }

    }
}
