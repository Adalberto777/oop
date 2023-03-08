package seminarThree;

public class Main {
    public static void main(String[] args) {
        Student student01 = new Student ("Albert", "Tlyashev", 4.7f);
        Student student02 = new Student ("Ivan", "Ivanov", 4.3f);
        Student student03 = new Student ("Petr", "Petrov", 4.1f);
        Student student04 = new Student ("Sidor", "Sidorov", 3.7f);
        Student student05 = new Student ("Anton", "Antonov", 4.7f);
        Student student06 = new Student ("Aleksandr", "Michailov", 4.23f);
        Student student07 = new Student ("Gennadiy", "Sviridov", 3.8f);
        Student student08 = new Student ("Voldemar", "Spiridonov", 2.7f);

        StudentGroup groupStudent = new StudentGroup();
        groupStudent.addToGroup(student01);
        groupStudent.addToGroup(student02);
        groupStudent.addToGroup(student03);
        groupStudent.addToGroup(student04);
        groupStudent.addToGroup(student05);
        groupStudent.addToGroup(student06);
        groupStudent.addToGroup(student07);
        groupStudent.addToGroup(student08);

        StudentIterator iterator = new StudentIterator(groupStudent);

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
