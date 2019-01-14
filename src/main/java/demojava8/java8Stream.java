package demojava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * TODO:stream 实时流
 * @author alonso.chen
 * @date 2019/1/14下午6:39
 */
public class java8Stream {
    /**
     * steam  java流处理。方便快捷
     * proNames.stream() 可以获取到一个单节点的流
     * proNames.parallelStream()可以在多线程的处理程序
     *
     * 1.先拿到一个流
     * 2.对流进行处理。处理的过程中，如果没有终止操作返回的就还是一个流
     * 3.返回处理后的结果。终止操作
     *
     */
    public static void main(String[] args) {
        List<String> proNames = Arrays.asList(new String[]{"a","b","c"});
        //TODO 遍历
        proNames.stream().forEach(name -> System.out.println(name));
        //filter 过滤。处理方法需要返回值为boolean。 但整体是个一个对象
        Stream<String> a = proNames.stream().filter(s -> s.equals("a"));
        //终止操作，得到一个集合 也可以单独获取到此对象
        List<String> collect = a.collect(Collectors.toList());
        //获取单个对象。 字面含义。 找到任何一个 。 注释中为找到第一个
        //此处的Optonal 是java8引入的一个概念，可以避免空指针。
        Optional<String> any = a.findAny();//a.findFirst();
        //判断是否有值
        boolean present = any.isPresent();
        if (present){
            //获取到对象
            String s = any.get();
        }
        // 言归正传。  stream的中间操作有那些
        // map可以对参数转换。把一个对象转换为另一个对象  limit 和 mysql中的limit很相似。就是当前集合的前多少个
        proNames.stream().map(s -> new Person()).limit(1);
        // 跳过当前集合中的第几个
        proNames.stream().skip(1).collect(Collectors.toSet());
        //统计
        proNames.stream().count();
        //去重
        proNames.stream().distinct();
        //TODO;---flatMap用法------------------
        ArrayList<List<String>> lists = new ArrayList<>();
        lists.add(proNames);
        lists.add(proNames);
        //flatMap返回的对象是多个。不像map只可以单对单的转换。这里是把嵌套的list展开处理。相当于合并到同一个list中
        List<String> collect1 = lists.stream().flatMap(strings -> strings.stream()).collect(Collectors.toList());

        /**
         * TODO: stream.可以在对集合操作时，提供有效的方法。可以一定程度上在实现以上代码时。提高代码简洁度
         * TODO: parallelStream 可以多线程并发执行，但是无法有效的保证线程安全。其实parallelStream很少用
         * TODO:以上只是常用的代码。可以对stream有简单的了解，如果想了解更深。我建议大家看书。
         */
    }
}
