import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class studentTest {

    Student score;
    Student studentWithManyGrades;

    @Before
    public void init(){
        score = new Student(1, "Hernandez A");
        score.addGrade(90);
        studentWithManyGrades = new Student(2, "Ben G");
        studentWithManyGrades.addGrade(90);
        studentWithManyGrades.addGrade(80);
        studentWithManyGrades.addGrade(50);
    }

    @Test
    public void ifUserObjectCanBeCreated(){
        assertEquals("Hernandez A", score.getName());
        assertEquals(1, score.getId());
    }

    @Test
    public void testIfAddGradeWorks(){
        assertSame(90, score.getGrades().get(0));
    }

    @Test
    public void testIfAvgIsCorrect(){
        assertEquals(90, score.getGradeAverage(), 0);
        assertEquals(73.33333333333333, studentWithManyGrades.getGradeAverage(), 0);
    }

}