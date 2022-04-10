package view;

import java.util.Scanner;

public class select {
    register R;
    private String denglu = "1.登录";
    private String zhuce = "2.注册";
    private String boundry = "*********";
    String exit = "3.退出";
    public void Select() {
        System.out.println(boundry);
        System.out.println(denglu);
        System.out.println(zhuce);
        System.out.println(exit);
        System.out.println(boundry);
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    switch(n){
        case 1 :
        log.Log();
        break;
        case 2 :
        R.Regist();
        break;
        case 3 :
        System.exit(0);
        break;
    }
if(n!=1&&n!=2&&n!=3){
    System.out.println("您输入的命令不合规范！请重新输入");
    Select();
}
        
}
}
