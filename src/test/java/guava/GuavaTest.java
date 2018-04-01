package guava;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shangxuefeng @date 2018/3/5
 */
public class GuavaTest {
    @Test
    public void testImmutableMap(){
        List<String> list = Lists.newArrayList("1", "2", "4", "12", "18", "24", "42");

        ImmutableMap<Integer, String> maps = Maps.uniqueIndex(list, Integer::valueOf);

        maps.keySet().forEach(System.out::println);

        Map<String, String> map = new HashMap<String, String>();

    }
}
