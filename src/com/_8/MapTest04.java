package com._8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest04 {
    public static void main(String[] args) {
        // 1.����HashMap,�����Ϊkey,������Ϊvalue
        Map<Integer, String> map = new HashMap<Integer, String>();

        // 2.ʹ��put�������Ԫ��
        map.put(1, "������");
        map.put(2, "������");
        map.put(3, "����");
        map.put(4, "���ʦ̫");

        // 3.ʹ��keySet+��ǿfor����map�е�Ԫ��,����ӡ
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            String value = map.get(key);
            System.out.println(key + " -- " + value);
        }

        // 4.ʹ��put���map�����в���һ������Ϊ5����Ϊ���������Ϣ
        map.put(5, "������");

        // 5.ʹ��remove�Ƴ���map�еı��Ϊ1����Ϣ
        map.remove(1);

        // 6.ʹ��put��map�����б��Ϊ2��������Ϣ�޸�Ϊ"����"
        map.put(2, "����");
        System.out.println(map);
    }
}
