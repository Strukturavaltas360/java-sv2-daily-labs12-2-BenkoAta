package day04;

public class SubjectMap {
    private String teacher;
    private String title;
    private String schoolClass;
    private int lessonsPerWeek;

    public SubjectMap(String teacher, String title, String schoolClass, int lessonsPerWeek) {
        this.teacher = teacher;
        this.title = title;
        this.schoolClass = schoolClass;
        this.lessonsPerWeek = lessonsPerWeek;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getTitle() {
        return title;
    }

    public String getSchoolClass() {
        return schoolClass;
    }

    public int getLessonsPerWeek() {
        return lessonsPerWeek;
    }
}
