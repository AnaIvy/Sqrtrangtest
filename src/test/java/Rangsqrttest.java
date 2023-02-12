import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SqrtService;

public class Rangsqrttest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/parametr.csv")
    public void SqrtService(int min, int max) {
        SqrtService service = new SqrtService();
        int expected = 10;
        int actual = service.RangSqrt(min, max);
        Assertions.assertEquals(expected, actual);
    }
}
