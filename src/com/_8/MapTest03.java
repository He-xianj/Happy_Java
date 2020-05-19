//package com._8;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//public class MapTest03 {
//    public static void main(String[] args) {
//        // 2.创建HashMapkey保存汽车对象,value是汽车价格
//        HashMap<Car1, Integer> hm = new HashMap<>();
//
//        // 3.添加汽车到HashMap中
//        Car1 c1 = new Car1("长安奔奔", "黄色");
//        Car1 c3 = new Car1("奇瑞QQ", "黑色");
//        Car1 c2 = new Car1("铃木奥拓", "白色");
//
//        hm.put(c1, 10000);
//        hm.put(c2, 20000);
//        hm.put(c3, 30000);
//
//        // 4.使用keySet方式遍历Map
//        Set<Car1> keySet = hm.keySet();
//        for (Car1 c : keySet) {
//            // 根据key获取value
////            Integer value = hm.get(c);
////            System.out.println(c.getName() + "," + c.getPrice() + " - " + value);
////        }
//
//        System.out.println("-------------");
//
//        // 5.使用entrySet方式遍历Map
//        Set<Map.Entry<Car1, Integer>> entrySet = hm.entrySet();
//        for (Map.Entry<Car1, Integer> entry : entrySet) {
//            Car1 key = entry.getKey();
////            Integer value = entry.getValue();
////            System.out.println(key.getName() + "," + key.getPrice() + " - " + value);
////        }
//    }
//}
