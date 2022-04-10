package view;

import java.util.Scanner;
public class register{
    private  static String username;
    private static String password;
    public static String GetUsername() {
        return username;
    }
    public static String GetPassword() {
        return password;
    }
    public  void Regist()throws RegisterException  {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名");
         
         username = sc.nextLine();
        
        checkUsername(username);
        
        System.out.println("请输入您要注册的密码");
        password = sc.nextLine();
        sc.close();
       
    }
    
   // 3.定义一个方法，对用户输入的注册的用户名进行判断
    public static void checkUsername(String username) throws RegisterException {
    
        //遍历存储已经注册过用户名的数组，获取每一个用户名
        if (name.equals(username)) {
            //true: 用户名已经存在，抛出RegisterException异常，告知用户“亲，该用户名已经被注册”；
            throw new RegisterException("亲，该用户名已经被注册");
        }
        //如果循环结束了，还没有找到重复的用户名，提示用户“恭喜您，注册成功！”
        System.out.println("恭喜您，注册成功！");
    }
}
class RegisterException extends RuntimeException{
    //添加一个空参数的构造方法
    public RegisterException() {
        super();
    }

    //添加一个带异常信息的构造方法
    public RegisterException(String name) {
        super(name);
    }
}
class name{
    static Boolean equals(String username){
        return false;
    }
}
