package view;

import java.util.Scanner;

import model.CollectionMethod;

public class Collection {
    
    public static void collection() {
        CollectionMethod C = new CollectionMethod();
        System.out.println("1.查看收藏");
        System.out.println("2.删除收藏");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        switch(n){
            case 1 :
            C.checkcollection();
            break;
            case 2 :
            C.deletecollection();
            break;
           
        }
    }
}
