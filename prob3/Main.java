package prob3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Marketing> marketingList = new ArrayList<>();

        marketingList.add(new Marketing("Alice", "Product1", 1500));
        marketingList.add(new Marketing("Bob", "Product2", 900));
        marketingList.add(new Marketing("Charlie", "Product3", 1200));
        marketingList.add(new Marketing("David", "Product4", 1100));

        marketingList.remove(new Marketing("Bob", "Product2", 900));

        System.out.println("Size of the list: " + marketingList.size());

        System.out.println("Marketing list contents: " + marketingList);

        Collections.sort(marketingList, new Comparator<Marketing>() {
            @Override
            public int compare(Marketing m1, Marketing m2) {
                return Double.compare(m1.getSalesAmount(), m2.getSalesAmount());
            }
        });

        System.out.println("Sorted by sales amount: " + marketingList);

        List<Marketing> moreThan1000List = listMoreThan1000(marketingList);
        Collections.sort(moreThan1000List, new Comparator<Marketing>() {
            @Override
            public int compare(Marketing m1, Marketing m2) {
                return m1.getEmployeeName().compareTo(m2.getEmployeeName());
            }
        });

        System.out.println("Employees with more than $1000 sales sorted by name: " + moreThan1000List);
    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        List<Marketing> result = new ArrayList<>();
        for (Marketing marketing : list) {
            if (marketing.getSalesAmount() > 1000) {
                result.add(marketing);
            }
        }
        return result;
    }
}