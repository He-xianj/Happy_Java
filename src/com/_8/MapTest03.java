//package com._8;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//public class MapTest03 {
//    public static void main(String[] args) {
//        // 2.����HashMapkey������������,value�������۸�
//        HashMap<Car1, Integer> hm = new HashMap<>();
//
//        // 3.���������HashMap��
//        Car1 c1 = new Car1("��������", "��ɫ");
//        Car1 c3 = new Car1("����QQ", "��ɫ");
//        Car1 c2 = new Car1("��ľ����", "��ɫ");
//
//        hm.put(c1, 10000);
//        hm.put(c2, 20000);
//        hm.put(c3, 30000);
//
//        // 4.ʹ��keySet��ʽ����Map
//        Set<Car1> keySet = hm.keySet();
//        for (Car1 c : keySet) {
//            // ����key��ȡvalue
////            Integer value = hm.get(c);
////            System.out.println(c.getName() + "," + c.getPrice() + " - " + value);
////        }
//
//        System.out.println("-------------");
//
//        // 5.ʹ��entrySet��ʽ����Map
//        Set<Map.Entry<Car1, Integer>> entrySet = hm.entrySet();
//        for (Map.Entry<Car1, Integer> entry : entrySet) {
//            Car1 key = entry.getKey();
////            Integer value = entry.getValue();
////            System.out.println(key.getName() + "," + key.getPrice() + " - " + value);
////        }
//    }
//}
