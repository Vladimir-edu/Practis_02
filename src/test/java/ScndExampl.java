import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(DataProviderRunner.class)
public class ScndExampl {
    @DataProvider
    public static String[] listM() {
        return new String[]{"first method", "second test", "third method"};
    }

    @UseDataProvider("listM")
    @Test
    public void test2(String method) {
        System.out.println("Test "+ method );
    }

}
