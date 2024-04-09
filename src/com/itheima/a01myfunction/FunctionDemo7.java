package com.itheima.a01myfunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class FunctionDemo7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "蔡坤坤,24","叶咸,23","刘不甜,22","吴签,24","谷嘉,30","肖梁梁,27");

        Student[] result = list.stream()
                .map(Student::new)
                .toArray(Student[]::new);
        System.out.println(Arrays.toString(result));
    }
}
