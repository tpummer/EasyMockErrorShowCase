import com.sun.net.httpserver.HttpExchange;
import org.easymock.EasyMockSupport;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ShowCaseTest {

    private static EasyMockSupport easyMockSupport = new EasyMockSupport();
    private final HttpExchange httpExchangeMock = easyMockSupport.createMock(HttpExchange.class);

    @AfterMethod(alwaysRun = true)
    public void afterTest() {
        easyMockSupport.verifyAll();
        easyMockSupport.resetAll();
    }

    @Test()
    public void nothing() {
        easyMockSupport.replayAll();
    }

}
