package Lesson1;

import Lesson1.obstacleCourse.Course;
import Lesson1.obstacleCourse.Cross;
import Lesson1.obstacleCourse.Fight;
import Lesson1.obstacleCourse.Swimming;
import Lesson1.team.Team;
import Lesson1.team.TeamMember;

public class Lesson1 {

    public static void main(String[] args) {
        Team dreamTeam = new Team("Dreamteam",
                new TeamMember("Olya", 7),
                new TeamMember("Dima", 6),
                new TeamMember("Kirill", 5),
                new TeamMember("Andrey" ,4));

        Course course = new Course(new Cross(5), new Swimming(5), new Fight(6));
        course.doIt(dreamTeam);

    }
}
