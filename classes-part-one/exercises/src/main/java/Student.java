public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.
        public void setStudent(String name, Integer studentId, Integer numberOfCredits, Double gpa){
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }
        public void setName(String name){
                this.name = name;
        }
        public void setStudentId(Integer id){
                this.studentId = id;
        }
        public void setGPA(Double num){
                this.gpa = num;
        }

        public void setNumberOfCredits(Integer credit){
                this.numberOfCredits = credit;
        }

        public String getName(){
                return name;
        }
        public Integer getStudentId(){
                return studentId;
        }
        public Integer getNumberOfCredits(){
                return numberOfCredits;
        }
        public Double getGPA(){
                return gpa;
        }
}
