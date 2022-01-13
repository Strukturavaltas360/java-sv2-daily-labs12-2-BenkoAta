package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapperTest {
    @Test
    void readFromFileTest() {
        Mapper mapper = new Mapper("src/test/resources/day04/beosztas.txt");
        assertEquals(329, mapper.getSubjectMaps().size());
        SubjectMap last = mapper.getSubjectMaps().get(328);
        assertEquals("Szarvas Szamanta", last.getTeacher());
    }

    @Test
    void getWeeklyLessonsCount() {
        Mapper mapper = new Mapper("src/test/resources/day04/beosztas.txt");
        assertEquals(18, mapper.getWeeklyLessonsCount("Szarvas Szamanta"));
    }
}