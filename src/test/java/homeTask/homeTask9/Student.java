package homeTask.homeTask9;

/**
 * Created by siava on 02.11.2016.
 */

    public class Student extends Human {
        private String university;
        private int course;

        public Student(String university, int course) {
            this.university = university;
            this.course = course;
        }

        public Student() {
        }

        public String getUniversity() {
            return university;
        }

        public void setUniversity(String university) {
            System.out.println("New university has ben set");
            this.university = university;
        }

        public int getCourse() {
            return course;
        }

        public void setCourse(int course) {
            this.course = course;
        }



        public String getInfoStudent() {


/*
            return String.format("name: %s, surname: %s, age %d, university: %s, course: %d, gender: %s",
                    name, surname, age, university, course, gender
                    );
*/

            return name + " " + surname + " " + " " + age + " " + getUniversity() + getCourse() + " " + gender;

        }




    }