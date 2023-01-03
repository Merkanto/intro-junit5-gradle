package merkanto.introjunit5gradle.mekranto;

import org.junit.jupiter.api.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before - I am only called Once!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In BeforeEach...");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        System.out.println(greeting.helloWorld("Miro"));
    }

    @Test
    void helloWorld2() {
        System.out.println(greeting.helloWorld("Gogi"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In AfterEach...");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("After - I am only called Once!");
    }
}