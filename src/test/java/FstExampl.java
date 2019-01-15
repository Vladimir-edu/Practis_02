import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FstExampl {
    @Parameters
    public static Object[] data() {
        return new Object[]{"first method", "second test", "third method"};
    }

    @Parameterized.Parameter
    public String method;

    @Test
    public void test1() {
        System.out.println("Test "+ method );
    }
}
