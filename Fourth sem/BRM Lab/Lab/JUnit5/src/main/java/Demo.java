import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Demo {

   @BeforeAll
   static void before_all(){
      System.out.println("Execute once before all test methods in this class");

   }
   @BeforeEach
   void before_each(){
      System.out.println("Execute before each test methods in this class");
   }
   @Test
   void test_method1(){
      System.out.println("test Method 1 executed");
   }
   @DisplayName(
           "TestMethod2 with condition"
   )
   @Test
   void test_method2(){
      System.out.println("test Method 2 executed");
   }
   @Test
   @Disabled(
           "Implementation Pending"
   )
   void test_Method3(){
      System.out.println("Test Method 3 executed");
   }
   @AfterEach
   void aftereach(){
      System.out.println("Executed after each test method in this class");
   }
   @AfterAll
   static void afterall(){
      System.out.println("Executed once after all test methods in this class");
   }
}
