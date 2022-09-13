package lesson9;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Data {

    public static List<Student> getStudentsList() {

        Course course1 = new Course("Робототехника");
        Course course2 = new Course("Искуственный интеллект");
        Course course3 = new Course("Микросервисы");
        Course course4 = new Course("Информационная безопасность");
        Course course5 = new Course("Автоматизация тестирования на Java");
        Course course6 = new Course("Тестирование backend на Java");
        Course course7 = new Course("Тестирование высоконагруженных приложений");
        Course course8 = new Course("Базы данных ");
        Course course9 = new Course("Linux. Сборка ядра");
        Course course10 = new Course("API. Swagger");
        Course course11 = new Course("Основы бизнес-аналитики");
        Course course12 = new Course("Git. Базовый курс");

        Student student1 = new Student("Петров Саша", Arrays.asList(course1, course3, course5));
        Student student2 = new Student("Иванова Маша", Arrays.asList(course1, course2, course3));
        Student student3 = new Student("Шышкин Костя", Arrays.asList(course1, course7, course11));
        Student student4 = new Student("Власова Вероника", Arrays.asList(course2, course4, course8, course1, course3, course5));
        Student student5 = new Student("Лемеш Дмитрий", Arrays.asList(course3, course7, course9));
        Student student6 = new Student("Антонов Роман", Arrays.asList(course1, course3, course5, course9));
        Student student7 = new Student("Бочаров Иван", Arrays.asList(course2, course6, course7, course5, course9));
        Student student8 = new Student("Степанова Рита", Arrays.asList(course3, course2, course4));
        Student student9 = new Student("Никаноров Матвей", Arrays.asList(course4, course8, course5));
        Student student10 = new Student("Ким Наташа", Arrays.asList(course5, course1, course9));
        Student student11 = new Student("Иванова Света", Arrays.asList(course6, course9, course5));
        Student student12 = new Student("Комлев Андрей", Arrays.asList(course7, course6, course5));
        Student student13 = new Student("Степанов Саша", Arrays.asList(course8, course1, course5));
        Student student14 = new Student("Антропов Егор", Arrays.asList(course9, course2, course5));
        Student student15 = new Student("Михайлова Юля", Arrays.asList(course10, course3, course1));
        Student student16 = new Student("Печенкин Вася", Arrays.asList(course11, course9, course2));
        Student student17 = new Student("Кефиров Илья", Arrays.asList(course12, course8, course3));
        Student student18 = new Student("Игнашев Олег", Arrays.asList(course11, course7, course4));
        Student student19 = new Student("Ахметшин Ильяс", Arrays.asList(course10, course6, course5));
        Student student20 = new Student("Насонов Артем", Arrays.asList(course9, course5, course3));
        Student student21 = new Student("Петрова Оля", Arrays.asList(course8, course6, course5));
        Student student22 = new Student("Узкий Артем", Arrays.asList(course7, course2, course11));
        Student student23 = new Student("Ли Чен", Arrays.asList(course6, course1, course5));
        Student student24 = new Student("Хван Костя", Arrays.asList(course5, course11, course12));
        Student student25 = new Student("Войнов Акмал", Arrays.asList(course4, course12, course5));
        Student student26 = new Student("Горный Петя", Arrays.asList(course3, course9, course5));
        Student student27 = new Student("Савельева Даша", Arrays.asList(course2, course6, course3));
        Student student28 = new Student("Строгий Петр", Arrays.asList(course1, course9, course5));


        return Arrays.asList(student1, student2, student3, student4, student5, student6, student7,
                student8, student9, student10, student11, student12, student13, student14,
                student15, student16, student17, student18, student19, student20, student21,
                student22, student23, student24, student25, student26, student27, student28);
    }

    public static Course getRandomCourse() {
        Random random = new Random();
        List<Course> courses = getListCourses();
        return courses.get(random.nextInt(courses.size()));
    }

    private static List<Course> getListCourses() {
        return Arrays.asList(new Course("Робототехника"),
                new Course("Искуственный интеллект"),
                new Course("Микросервисы"),
                new Course("Информационная безопасность"),
                new Course("Автоматизация тестирования на Java"),
                new Course("Тестирование backend на Java"),
                new Course("Тестирование высоконагруженных приложений"),
                new Course("Базы данных"),
                new Course("Linux. Сборка ядра"),
                new Course("API. Swagger"),
                new Course("Основы бизнес-аналитики"),
                new Course("Git. Базовый курс"));
    }
}
