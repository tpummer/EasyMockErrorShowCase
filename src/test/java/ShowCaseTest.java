import org.easymock.EasyMock;
import org.testng.annotations.Test;

public class ShowCaseTest {

    @Test()
    public void nothing() {
        EasyMock.mock(com.sun.net.httpserver.HttpExchange.class);
    }

}
