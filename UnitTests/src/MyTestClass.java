
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyTestClass {
     
    List<String> testList;
     
    @Before
    public void initialize() {
        testList = new ArrayList<String>();
    }
     
    @Test
    public void myTestMethod() {
        /**
         * Use Assert methods to call your methods to be tested.
         * A simple test to check whether the given list is empty or not. 
         */
       org.junit.Assert.assertTrue( testList.isEmpty() );
    }
 }