package view;

import java.util.Scanner;

import model.userlogin;

public class log {
    static String ac;//账号
    static String pw;//密码
    public static void Log(){
        Scanner sc = new Scanner(System.in);
        userlogin l = new userlogin();
        System.out.println("请输入用户名");
        ac = sc.nextLine();
        System.out.println("请输入密码");
        pw = sc.nextLine();
        sc.close();
        /**System.out.println("输入“1”确定");
        Scanner sc3 = new Scanner(System.in);
        String s = sc3.next();
        sc3.close();
        if(s!="1"){
            System.out.println("请重新输入");
            Log();
        }*/
        
            
           if(l.isuserlogin(ac,pw)){
               System.out.println("登录成功");
               homepage.HomePage();
           }
           else{
                System.out.println("账号或密码错误，请重新登录！");
                Log();
           }
        }
    
        
            
        
   
}