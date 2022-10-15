package com.epam.rd.autocode.decorator;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Decorators extends AbstractList {
    static List<String> myList;
    static List<String> listTemp;
    List<String> list;

    public Decorators(List<String> sourceList) {
        myList = sourceList;
    }

    public static List<String> evenIndexElementsSubList(List<String> sourceList) {

        return new Decorators(sourceList);
    }

        public String get(int index){
            listRecomposition();
            return list.get(index);

        }

        public int size() {
        listRecomposition();
            return list.size();
        }

        public void listRecomposition() {
            list = new ArrayList<>();
            listTemp = myList;
            for (int i = 0; i < listTemp.size(); i++){
                if (i % 2 == 0){
                    list.add(listTemp.get(i));
                }
            }
        }
    }

