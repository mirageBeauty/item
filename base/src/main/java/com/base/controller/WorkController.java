package com.base.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("work")
public class WorkController {
    public static void main(String[] args) {


    }

    public Map<String, List<String>> allotOfAverage(List<String> users, List<String> tasks) {
        Map<String, List<String>> allot = new ConcurrentHashMap<String, List<String>>(); //保存分配的信息
        if (users != null && users.size() > 0 && tasks != null && tasks.size() > 0) {
            for (int i = 0; i < tasks.size(); i++) {
                int j = i % users.size();
                if (allot.containsKey(users.get(j))) {
                    List<String> list = allot.get(users.get(j));
                    list.add(tasks.get(i));
                    allot.put(users.get(j), list);
                } else {
                    List<String> list = new ArrayList<String>();
                    list.add(tasks.get(i));
                    allot.put(users.get(j), list);
                }
            }
        }
        return allot;

    }
}
