public class OverridingFn {
    public static class Student {
        private String name;
        private int rollno;
        private String branch;
        private int batch;

        public Student(String name, int rollno, String branch, int batch) {
            this.name = name;
            this.rollno = rollno;
            this.branch = branch;
            this.batch = batch;
        }
        public String toString() {
            return "(Name : \'"+ name + "\', roll number: " + rollno + ", branch: \'" + branch + "\', batch: " + batch + ")";
        }
    }
    public static void main(String[] args) {
        Student std = new Student("Hemang", 1231, "CSE",2024);
        System.out.println(std.toString());
    }
}
