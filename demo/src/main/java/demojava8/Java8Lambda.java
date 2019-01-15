package demojava8;


import java.util.Arrays;
import java.util.List;

/**
 * TODO:讲解lambda常用方式
 * @author alonso.chen
 * @date 2019/1/14下午2:26
 */
public class Java8Lambda {
    //
    public static void main(String[] args) {
        /**
         * TODO: 内部方法直接使用lamada表达式实现
         * 注意：外部可以传递变量，但是变量必须是final修饰，如果不修饰为final 那么内部不允许修改,如果修改则编译失败
         *    因为是默认为final类型的
         */
        lamda1();
        /**
         * TODO: lamda 表达式可以传递方法参数
         */
        List<String> proNames = Arrays.asList(new String[]{"a","b","c"});
        proNames.stream().forEach(string->swithStr(string));

        /**
         * TODO: 在调用对象的方法时，可以直接对象::方法名(参数x，参数y)
         * TODO: new对象 只能使用无参构造   对象::new
         */
        proNames.stream().map(String::toUpperCase).forEach(upStr -> System.out.println(upStr));

    }

    /**
     * 用法1 可以直接使用lamda表达式来实现内部方法调用
     */
    public static void lamda1(){
        //常规写法
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                System.out.println("线程启动");
            }
        };
        runnable.run();
        // lambda写法
        int i = 0;
        Runnable runnable1 = ()-> System.out.println("线程启动lamda"+i);
        runnable1.run();
    }

    public static  String swithStr(String str){
        switch (str){
            case "a":
                return "aaaaaaaa";
            case "b":
                return "bbbbbbb";
            default:
                return "cccccc";
        }
    }

}
