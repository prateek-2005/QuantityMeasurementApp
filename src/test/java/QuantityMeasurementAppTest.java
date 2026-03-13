import com.quantitymeasurement.domain.LengthUnit;
import com.quantitymeasurement.domain.WeightUnit;
import com.quantitymeasurement.service.QuantityService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuantityMeasurementAppTest {

    QuantityService service = new QuantityService();

    @Test
    void testLengthAddition() {

        double result = service.add(
                1.0, LengthUnit.FEET,
                2.0, LengthUnit.INCH,
                LengthUnit.INCH);

        assertEquals(14.0, result);
    }

    @Test
    void testWeightAddition() {

        double result = service.add(
                1.0, WeightUnit.KILOGRAM,
                500.0, WeightUnit.GRAM,
                WeightUnit.GRAM);

        assertEquals(1500.0, result);
    }
}