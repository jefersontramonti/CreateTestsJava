import org.example.entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinancingTests {

    //Deve criar o objeto com os dados corretos quando os dados forem válidos
    @Test
    public void constructorShouldCreateObjectWhenValidDate() {

        Financing f = new Financing(100000.0, 2000.0, 80);

        Assertions.assertEquals(100000.0, f.getTotalAmount());
        Assertions.assertEquals(2000.0, f.getIncome());
        Assertions.assertEquals(80, f.getMonths());
    }

    //Deve lançar IllegalArgumentException quando os dados não forem válidos
    @Test
    public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidDate(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f = new Financing(100000.0, 2000.0, 20);
        });
    }
}
