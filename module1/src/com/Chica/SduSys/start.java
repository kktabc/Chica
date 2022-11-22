package com.Chica.SduSys;

import java.util.ArrayList;
import java.util.Scanner;

public class start {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("-------------welcome to welcome system------------------");
            System.out.println("1.add student");
            System.out.println("2:delete student");
            System.out.println("3:modify");
            System.out.println("4: look up");
            System.out.println("5: exit");
            System.out.println("enter your choice here:");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();

            switch (choose) {
                case "1" -> addStudent(arr);
                case "2" -> deleteStudent(arr);
                case "3" -> updateStudent(arr);
                case "4" -> queryStudent(arr);
                case "5" -> {
                    break loop;
                }

            }
        }
    }

    public static void addStudent(ArrayList<Student> arr){
        Scanner sc = new Scanner(System.in);
        Student s = new Student();


        System.out.println("enter id:");
        String id = sc.next();
        while (checkId(id, arr)){
            System.out.println("id exists, please change your id:");
            id = sc.next();
        }
        s.setId(id);

        System.out.println("enter name:");
        String name = sc.next();
        s.setName(name);

        System.out.println("enter age:");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("enter address:");
        String address = sc.next();
        s.setAddress(address);

        arr.add(s);
        System.out.println("Successfully added!");

    }

    public static void deleteStudent(ArrayList<Student> arr){
        // id 存在就删除，否则提示学生不存在

        Scanner sc = new Scanner(System.in);
        System.out.println("enter id:");
        String id = sc.next();

        int index = getIndex(arr, id);
        if (index == -1){
            System.out.println("student does not exist!");
            return ;
        }
        else{
            arr.remove(index);
            System.out.println("deleted!");
        }


    }

    public static void updateStudent(ArrayList<Student> arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter id:");
        String id = sc.next();
        int index = getIndex(arr, id);
        if (index == -1){
            System.out.println("id does not exist!");
            return;
        }

        Student s = arr.get(index);
        System.out.println("new name:");
        String newname = sc.next();
        s.setName(newname);

        System.out.println("new age:");
        int newage = sc.nextInt();
        s.setAge(newage);

        System.out.println("new address");
        String newAdd = sc.next();
        s.setAddress(newAdd);

        System.out.println("modified successfully!");

    }

    public static void queryStudent(ArrayList<Student> arr){
        // 如果没有学生信息，当前无学生信息，请添加后再查询
        // otherwise print all student info
        if (arr.size() == 0){
            System.out.println("we don't have any student info now. please add before query");
            return;
        }
        System.out.println("id \t name \t age \t address");
        for (int i = 0; i < arr.size(); i++) {
            Student stu = arr.get(i);
            System.out.println(stu.getId() + '\t' + stu.getName() + '\t' + stu.getAge() + '\t' + stu.getAddress());
        }



    }

    public static boolean checkId(String id, ArrayList<Student> arr){
//        for (int i = 0; i < arr.size(); i++) {
//            Student s = arr.get(i);
//            if (id.equals(s.getId())){
//                return true;
//            }
//
//        }
//        return false;
        return getIndex(arr, id)>=0;

    }

    public static int getIndex(ArrayList<Student> arr, String id){
        for (int i = 0; i < arr.size(); i++) {
            Student s = arr.get(i);
            String sid = s.getId();
            if (sid.equals(id)){
                return i;
            }
        }
        return -1;
    }
}

