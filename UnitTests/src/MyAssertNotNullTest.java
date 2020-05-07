import static org.junit.Assert.*;
import org.junit.Test;
 
public class MyAssertNotNullTest {
 
    public String getValue(){
        return "abc";
    }
     
    @Test
    public void test(){
        MyAssertNotNullTest mannt = new MyAssertNotNullTest();
        assertNotNull(mannt.getValue());
    }
}