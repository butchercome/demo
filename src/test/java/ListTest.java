import com.fasterxml.jackson.databind.ObjectReader;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Javen on 2016/12/10.
 */
public class ListTest {
    @Test
    public void testList(){
        List<String> list=new ArrayList<String>();
        list.add("1231");
        System.out.println(list);
    }
    @Test
    public void testObjectRead(){
        String name="{\"name\":\"zhangsan\",\"value\":\"24\"}";
        try {
            Map<String,Object> map;
//            map = new ObjectReader().readValue(name,Map.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
