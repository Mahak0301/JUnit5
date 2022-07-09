import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class Mahak {
    @Nested
    class InnerClass {
        @BeforeEach
        void before_each() {
            System.out.println("Execute before each test methods in this class");
        }

        @Test
        void test_method1() {
            System.out.println("test Method 1 executed");
        }

        @AfterEach
        void aftereach() {
            System.out.println("Executed after each test method in this class");
        }

        @Nested
        class InnermostClass {
            @BeforeEach
            void before_each() {
                System.out.println("Execute before each test methods in this Innermostclass");
            }

            @Test
            void test_method2() {
                System.out.println("test Method 2 executed Innermost Class");
            }

            @AfterEach
            void aftereach() {
                System.out.println("Executed after each test method in this Innermost class");
            }
        }
    }
}
