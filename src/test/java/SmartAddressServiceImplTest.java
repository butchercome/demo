import com.cjw.demo.address.SmartAddressServiceImpl;
import com.cjw.demo.util.JsonUtils;
import org.junit.Test;

/**
 * Created by Javen on 2017/5/3.
 */

public class SmartAddressServiceImplTest {
    SmartAddressServiceImpl smartAddressService=new SmartAddressServiceImpl();
    @Test
    public void testSmartAddressDevice(){
        System.out.println(JsonUtils.toJson(smartAddressService.getAddressDividing("池家文15112362168深圳市软件产业基地")));
    }
}
