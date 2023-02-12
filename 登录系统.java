public class java
{import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

    public class Login {



        public static void main(String[] args) {
            Login login = new Login();
            login.initUI();


        }


        public static void initUI() {

            JFrame frame = new JFrame();      //实例化JFrame对象

            frame.setTitle("Login");// 设置窗体的标题
            frame.setSize(400, 650);//
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);//
            frame.setResizable(false);//

            FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 10, 10);

            frame.setLayout(fl);  //frame框架调用流式布局方法；



            ImageIcon icon = new ImageIcon("C:\\Users\\zhuaba\\Desktop\\a.png");
            JLabel labIcon = new JLabel(icon);
            Dimension dim = new Dimension(400,300);  //调用Dimension类的构造方法，实例化dim对象  尺寸 dimension
            labIcon.setPreferredSize(dim);
            frame.add(labIcon);


            JLabel labName = new JLabel("账号：");    //实例化标签类 labName对象，显示字符串 “账号"
            frame.add(labName);  //将 labName对象 加载到窗体上

            // 文本输入框
            JTextField nameInput = new JTextField(); //实例化标签类 nameInput对象
            Dimension dim1 = new Dimension(300,30); //实例化 dim1对象
            nameInput.setPreferredSize(dim1);
            frame.add(nameInput);


            JLabel labpass= new JLabel("密码：");  //实例化标签类 labpass对象
            frame.add(labpass);  //将标签对象加载到窗体上


            //Pwd输入框
            JPasswordField pwdInput = new JPasswordField(); //实例化JPasswordField
            pwdInput.setPreferredSize(dim1);
            frame.add(pwdInput); //将输入框加载到窗体上

            JButton button=new JButton(); //实例化Jbutton
            //Dimension dim2 = new Dimension(100,30);
            button.setText("登录");
            button.setSize(100,30); //设置组件大小
            frame.add(button);  //将按钮加载到窗体上



            frame.setVisible(true);// 设置窗体为可见



            // 监听器 ：将实现了ActionListener的类 创建对象 绑定给按钮对象
            LoginListener loginListener = new LoginListener ();
            button.addActionListener (loginListener);

            String username=nameInput.getText();
            String pwd=pwdInput.getText();
            System.out.println("直接在界面初始化当中获取用户名：" + username+ " 密码: " + pwd);
            loginListener.textName2=nameInput;  //将输入框对象传给监听器
            loginListener.textPwd2=pwdInput;


            public class LoginListener implements ActionListener {
                JTextField textName2;
                JPasswordField textPwd2;

                public void actionPerformed(ActionEvent e) {
                    // 获取按钮上的字符串
                    String btnstr = e.getActionCommand(); //定义变量 btnstr 通过getActionCommand（）方法 ，获取按钮上的字符串；
                    //验证监听器 监听点击按钮的动作事件
                    System.out.println(btnstr);
                    System.out.println("登录按钮被点击了");


                    String username = textName2.getText();
                    String pwd = textPwd2.getText();
                    System.out.println("点击按钮后获取用户名：" + username + "点击按钮后获取密码" + pwd);//验证是否获取用户数输入的username和pwd

                    //验证账号登录的半段
                    if (username.equals("gc") && pwd.equals("123456")) {

                        JOptionPane.showMessageDialog(null, "登录成功");
                    } else {

                        JOptionPane.showMessageDialog(null,"登陆失败");
                    }
                }

            }

        }
}
