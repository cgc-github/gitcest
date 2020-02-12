/*
package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        // 存入对象
        List<Person> list = pushObject();
        list.forEach(p ->
            System.out.println("p = " + p)
        );

        //去除重复对象
        //遍历list集合
        removeObjectByIterator(list);
//        ArrayList<Person> list1 = new ArrayList<Person>();
//        for (int i = 0; i <list.size() ; i++) {
//            if(!list1.contains(list.get(i))){
//                list1.add(list.get(i));
//            }
//        }
//        for (Person person : list1) {
//            System.out.println("person = " + person);
//        }
    }

    private static void removeObjectByIterator(List<Person> list) {
        Iterator<Person> iterator = list.iterator();

        while(iterator.hasNext()){
            Person p = iterator.next();
            //
            int count = 0;
            for (int i = 0; i <list.size() ; i++) {
                if(p.equals(list.get(i))){
                    count++;
                }
            }
            if(count>1){
                iterator.remove();
            }
        }
        for (Person person : list) {
            System.out.println("person = " + person);
        }
    }

    private static List<Person> pushObject() {
        ArrayList<Person> list = new ArrayList<Person>();
        for (int i = 0; i < 10; i++) {
            Person person = new Person();
            if (i < 3) {
                person.setName("张三");
                person.setAge(20);
                person.setSex("男");
                list.add(person);
            } else if (i >= 3 && i < 7) {
                person.setName("李四");
                person.setAge(21);
                person.setSex("男");
                list.add(person);
            } else {
                person.setName("小红");
                person.setAge(22);
                person.setSex("女");
                list.add(person);
            }
        }
*/
/*        for (Person p : list) {
            System.out.println(p);
        }*//*


        return list;
    }
}
*/
