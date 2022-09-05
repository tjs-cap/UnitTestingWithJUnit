import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
// make sure that when prompted you import the specific assert tools
// or you can use the * (wildcard) to import ALL, as seen below.
// import static org.junit.jupiter.api.Assertions.*;

class StudentResultsTest {
    // Here I am setting up the instance of student outside the tests
    // so all the tests will use the same instance.
    // You can do this with the Calculator test as well.
    StudentResults student = new StudentResults();

    @Test
    void thirtyNineShouldFail(){
        assertEquals("Fail",student.studentResultsGrade(39));
    }

    @Test
    void fortyNineShouldPass(){
        assertEquals("Pass",student.studentResultsGrade(49));
    }

    // This test checks whether a negative value causes an exception to
    // be thrown. The Lambda expression is used as a form of shorthand used
    // in Java
    // (https://www.oracle.com/technical-resources/articles/java/architect-lambdas-part1.html)

    @Test
    void negativeNumberThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> {
            student.studentResultsGrade(-1);
        });
    }

}