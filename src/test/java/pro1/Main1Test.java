package pro1;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import pro1.apiDataModel.ActionsList;

public class Main1Test
{
    @Test
    void test01()
    {

        // TODO 1.2: Oprav test DONE
        assertEquals(
                62,
                Main1.emptyActionsCount("KIKM",2024)
        );
    }

}