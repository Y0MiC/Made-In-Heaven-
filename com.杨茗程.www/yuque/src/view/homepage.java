package view;

import java.util.Scanner;

public class homepage {
    public static void HomePage() {
        System.out.println("1.我的收藏");
        System.out.println("2.新建知识库");
        System.out.println("3.个人知识库");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        switch(n){
            case 1 :
            Collection.CheckCollection();
            break;
            case 2 :
            newbase.NewBase();
            break;
            case 3 :
            base.CheckBase();
            break;
        }
    }
}
