public interface User {
    Salary TakeSalary(Teacher teacher);
    Grades TakeGrades(Student student);

    void TakeMoney();
}