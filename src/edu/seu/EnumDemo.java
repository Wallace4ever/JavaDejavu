package edu.seu;

public class EnumDemo {
    public void work(){
        System.out.println("Days of week:");
        for (DaysOfTheWeek day:DaysOfTheWeek.values()){//这是一种for-each循环，在不适用索引值的情况下遍历数组或集合。for(类型变量:数组或集合)
            System.out.println(" "+day);
        }
        System.out.println();
    }
}

enum DaysOfTheWeek{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;

    @Override
    public String toString() {
        String s= super.toString();
        return s.substring(0,1)+s.substring(1).toLowerCase();
    }
}