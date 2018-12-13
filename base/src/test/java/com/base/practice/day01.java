package com.base.practice;

import com.base.pojo.Students;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RunWith(value = SpringJUnit4ClassRunner.class)
public class day01 {


    @Test
    public void test01() {


    }

    @Test
    public void test02() {
        Students z1 = new Students("sgabc", 12);
        Students z2 = new Students("dgrgr", 13);
        Students z3 = new Students("dghsetr", 18);
        Students z4 = new Students("hgaerg", 17);

        List<Students> studentsList = new ArrayList<>();
        studentsList.add(z1);
        studentsList.add(z2);
        studentsList.add(z3);
        studentsList.add(z4);

        Collections.sort(studentsList);
        for (Students students : studentsList) {
            System.out.println(students);
        }
    }

    @Test
    public void test03() {
        int count = 10000;
        Integer a = 2000;
        Integer b = 300;
        Integer c = 150;
        Integer d = 800;
        List<Integer> m = new ArrayList<>();
        m.add(a);
        m.add(b);
        m.add(c);
        m.add(d);
        Collections.sort(m);
        double avg = count / m.size();
        if (m.get(0) >= avg) {
            double i = count / m.size();
            double a1 = i;
            double a2 = i;
            double a3 = i;
            double a4 = i;
            System.out.println(a1 + "*" + a2 + "*" + a3 + "*" + a4);
        }

        if (m.get(0) < avg) {
            Integer tmp = count - m.get(0) * m.size(); //剩余需要分配数据
            double am3 = tmp / (m.size() - 1);
            double avg2 = Math.ceil(am3);//平均需要分配数据
            double a1 = m.get(0);
            double a2 = avg2;
            double a3 = avg2;
            double a4 = avg2;
            System.out.println(a1 + "*" + a2 + "*" + a3 + "*" + a4);

            if (m.get(0+1)<avg2){
                Integer count2 = count-m.get(0)*m.size()-m.get(0+1)*m.size()-(0+1);
            }
        }


    }


}
