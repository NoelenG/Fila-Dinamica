package br.noelen;

import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Unit test for simple App.
 */
public class ClassTest {
    Queue queue;
    private static final String name1 = "Noelen"; //não modifica final e static variaveis comuns para varias istancias
    private static final int age1 = 18;
    private static final String personality1 = "Nice";
    private static final String position1 = "Testing Analist";

    Employee ploy;
    public void setup(){
        ploy = new Employee(name1, age1, personality1, position1);
    }

    public void isEmptyTest(){
        Boolean isEmpty = queue.isEmpty();
        assertTrue("Queue has to be empty ", isEmpty);

    }
    
}
