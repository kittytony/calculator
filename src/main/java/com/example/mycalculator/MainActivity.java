package com.example.mycalculator;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class MainActivity extends AppCompatActivity {
    private  StringBuilder show_equation=new StringBuilder();//显示运算式
    private ArrayList calculate_equation;//计算式
    private  int t=0;//为0时表示有输入；为1时表示当前在输出结果上继续输入
    @Override
    protected void onCreate(Bundle savedInstanceState) {//Activity的生命周期法
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show_equation=new StringBuilder();
        calculate_equation=new ArrayList<>();
        Button zero=findViewById(R.id.btn_0);
        Button one=findViewById(R.id.btn_1);
        Button two=findViewById(R.id.btn_2);
        Button three=findViewById(R.id.btn_3);
        Button four=findViewById(R.id.btn_4);
        Button five=findViewById(R.id.btn_5);
        Button six=findViewById(R.id.btn_6);
        Button seven=findViewById(R.id.btn_7);
        Button eight=findViewById(R.id.btn_8);
        Button nine=findViewById(R.id.btn_9);
        Button add=findViewById(R.id.btn_add);
        Button sub=findViewById(R.id.btn_sub);
        Button mul=findViewById(R.id.btn_mul);
        Button div=findViewById(R.id.btn_div);
        Button C=findViewById(R.id.btn_clear);
        Button zhengfu=findViewById(R.id.btn_zhengfu);
        Button sin=findViewById(R.id.btn_sin);
        final Button dot=findViewById(R.id.btn_dot);
        final Button equal=findViewById(R.id.btn_equ);
        final EditText result=findViewById(R.id.et_result);
        show_equation.append("0");

        //数字0~9键按钮监听器
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(!(show_equation.toString().equals("0"))){//不等于0时(避免显示多个0)
                    if(t==0){//刚输入状态
                        show_equation.append("0");
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());//全选

                    }
                    else{               //有输出结果时
                        show_equation.delete(0,show_equation.length());//全删
                        show_equation.append("0");
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());
                        t=0;
                    }
                }
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char temp1=show_equation.charAt(show_equation.length()-1);
                if (!(show_equation.toString().equals("0"))) {
                    if (t == 0) {
                        show_equation.append("1");
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());
                    }
                    else{
                        show_equation.delete(0, show_equation.length());
                        show_equation.append("1");
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());
                        t = 0;
                    }
                }
                else{
                    show_equation.delete(0, show_equation.length());
                    show_equation.append("1");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    t = 0;
                }
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char temp1=show_equation.charAt(show_equation.length()-1);
                if (!(show_equation.toString().equals("0"))) {
                    if (t == 0) {
                        show_equation.append("2");
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());
                    }
                    else{
                        show_equation.delete(0, show_equation.length());
                        show_equation.append("2");
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());
                        t = 0;
                    }
                }
                else{
                    show_equation.delete(0, show_equation.length());
                    show_equation.append("2");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    t = 0;
                }
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char temp1=show_equation.charAt(show_equation.length()-1);
                if (!(show_equation.toString().equals("0"))) {
                    if (t == 0) {
                        show_equation.append("3");
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());
                    }
                    else{
                        show_equation.delete(0, show_equation.length());
                        show_equation.append("3");
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());
                        t = 0;
                    }
                }
                else{
                    show_equation.delete(0, show_equation.length());
                    show_equation.append("3");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    t = 0;
                }
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char temp1=show_equation.charAt(show_equation.length()-1);
                if (!(show_equation.toString().equals("0"))) {
                    if (t == 0) {
                        show_equation.append("4");
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());
                    }
                    else{
                        show_equation.delete(0, show_equation.length());
                        show_equation.append("4");
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());
                        t = 0;
                    }
                }
                else{
                    show_equation.delete(0, show_equation.length());
                    show_equation.append("4");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    t = 0;
                }
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char temp1=show_equation.charAt(show_equation.length()-1);
                if (!(show_equation.toString().equals("0"))) {
                    if (t == 0) {
                        show_equation.append("5");
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());
                    }
                    else{
                        show_equation.delete(0, show_equation.length());
                        show_equation.append("5");
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());
                        t = 0;
                    }
                }
                else{
                    show_equation.delete(0, show_equation.length());
                    show_equation.append("5");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    t = 0;
                }
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char temp1=show_equation.charAt(show_equation.length()-1);
                if (!(show_equation.toString().equals("0"))) {
                    if (t == 0) {
                        show_equation.append("6");
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());
                    }
                    else{
                        show_equation.delete(0, show_equation.length());
                        show_equation.append("6");
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());
                        t = 0;
                    }
                }
                else{
                    show_equation.delete(0, show_equation.length());
                    show_equation.append("6");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    t = 0;
                }
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char temp1=show_equation.charAt(show_equation.length()-1);
                if (!(show_equation.toString().equals("0"))) {
                    if (t == 0) {
                        show_equation.append("7");
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());
                    }
                    else{
                        show_equation.delete(0, show_equation.length());
                        show_equation.append("7");
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());
                        t = 0;
                    }
                }
                else{
                    show_equation.delete(0, show_equation.length());
                    show_equation.append("7");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    t = 0;
                }
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char temp1=show_equation.charAt(show_equation.length()-1);
                if (!(show_equation.toString().equals("0"))) {
                    if (t == 0) {
                        show_equation.append("8");
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());
                    }
                    else{
                        show_equation.delete(0, show_equation.length());
                        show_equation.append("8");
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());
                        t = 0;
                    }
                }
                else{
                    show_equation.delete(0, show_equation.length());
                    show_equation.append("8");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    t = 0;
                }
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char temp1=show_equation.charAt(show_equation.length()-1);
                if (!(show_equation.toString().equals("0"))) {
                    if (t == 0) {
                        show_equation.append("9");
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());
                    }
                    else{
                        show_equation.delete(0, show_equation.length());
                        show_equation.append("9");
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());
                        t = 0;
                    }
                }
                else{
                    show_equation.delete(0, show_equation.length());
                    show_equation.append("9");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    t = 0;
                }
            }
        });

        //清零按钮监听器
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_equation.delete(0,show_equation.length());//全删
                calculate_equation.clear();
                show_equation.append("0");
                result.setText(show_equation.toString());
                t=0;
            }
        });

        //小数点按钮监听器
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!show_equation.toString().contains(".")) {
                    if (t == 0) {   //未开始运算时
                        char temp1 = show_equation.charAt(show_equation.length() - 1);
                        if (!(temp1 == '+') && !(temp1 == '-') && !(temp1 == '/') && !(temp1 == '*') && !(temp1 == '.') && !(temp1 == '~')) {
                            show_equation.append(".");
                            result.setText(show_equation);
                        }
                    } else {
                        show_equation.delete(0, show_equation.length());
                        show_equation.append("0.");
                        result.setText("0.");
                        result.setSelection(result.getText().length());
                        t = 0;
                    }
                }
            }
        });


        sin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(!(show_equation.toString().equals(""))) {
                    t=0;
                    char temp=show_equation.charAt(show_equation.length()-1);
                    if(temp=='+'||temp=='-'||temp=='*'||temp=='/')
                    {
                        show_equation.deleteCharAt(show_equation.length()-1);
                        show_equation.append("~");
                    }
                    else if((temp>='0'&&temp<='9')||(temp=='.'))
                        show_equation.append("~");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }}
        });

        //等号按钮监听器
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //判断是否输入了内容
                if(!show_equation.toString().equals("")){//输入了内容
                    t=1;//有输出
                    char temp=show_equation.charAt(show_equation.length()-1);//文本框最后一个数
                    if(show_equation.charAt(0)=='+')
                        show_equation.deleteCharAt(0);
                    if(temp=='+'||temp=='-')
                        show_equation.append("0");//加减运算后不输入数，默认为0
                    if(temp=='*'||temp=='/')
                        show_equation.append("1");//乘除默认为1
                    StringBuilder temp1=new StringBuilder();
                    //调整文本内容，将数字当成一个整体存入运算式
                    for(int i=0;i<show_equation.length();i++){
                        if (show_equation.charAt(i) >= '0' && show_equation.charAt(i) <= '9' || show_equation.charAt(i) == '.' ) {
                            temp1.append((show_equation.charAt(i)));//将字符变量转化成字符串
                        }
                        else
                        {
                            if(temp1.length()!=0){
                                calculate_equation.add(temp1.toString());
                                temp1.delete(0,temp1.length());
                                calculate_equation.add(String.valueOf(show_equation.charAt(i)));//将字符变量转化成字符串

                            }
                            else if(show_equation.charAt(i)=='-'){
                                temp1.append((show_equation.charAt(i)));//将字符变量转化成字符串
                            }
                        }
                    }
                    if(temp1.length()!=0){
                        calculate_equation.add(temp1.toString());
                    }
                    calculate_equation.add("#");//#——运算结束标志
                    String temp8=calculate(calculate_equation);//返回的结果
                    result.setText(temp8);//设置结果
                    result.setSelection(result.getText().length());//全选
                    show_equation.delete(0,show_equation.length());//删掉之前的运算
                    calculate_equation.clear();//清空之间的运算操作
                    show_equation.append(temp8);//显示结果
                }
                else {
                    show_equation.append("0");
                    result.setText("0");
                    result.setSelection(result.getText().length());
                }
            }
        });

        //正负号监听器
        zhengfu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show_equation.length()==0){
                    show_equation.append("-");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }
                else if(!(show_equation.toString().equals("0"))) {//文本显示不为0时
                    t=0;
                    char temp=show_equation.charAt(show_equation.length()-1);
                    if(temp=='+')
                    {
                        show_equation.deleteCharAt(show_equation.length()-1);
                        show_equation.append("-");
                    }
                    else if(temp=='-')
                    {
                        show_equation.deleteCharAt(show_equation.length()-1);
                    }
                    else if(temp=='*'||temp=='/')
                    {
                        show_equation.append("-");
                    }
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }
                else if (show_equation.toString().equals("0")) {
                    show_equation.deleteCharAt(show_equation.length() - 1);
                    show_equation.append("-");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }
            }
        });

        //加号按钮监听器
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //判断用户是否输入了内容
                char temp=show_equation.charAt(show_equation.length()-1);
                if(!(show_equation.toString().equals(""))) {
                    t=0;
                    if(temp=='+'||temp=='-'||temp=='*'||temp=='/')
                    {
                        show_equation.deleteCharAt(show_equation.length()-1);
                        show_equation.append("+");
                    }
                    else if((temp>='0'&&temp<='9')||(temp=='.')||(temp=='~'))
                        show_equation.append("+");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }
            }
        });
        //减号按钮监听器
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //判断用户是否输入了内容
                if(!(show_equation.toString().equals(""))) {
                    t=0;
                    char temp=show_equation.charAt(show_equation.length()-1);
                    if(temp=='+'||temp=='-'||temp=='*'||temp=='/')
                    {
                        show_equation.deleteCharAt(show_equation.length()-1);
                        show_equation.append("-");
                    }
                    else if((temp>='0'&&temp<='9')||(temp=='.')||(temp=='~'))
                        show_equation.append("-");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }
            }
        });

        //乘号按钮监听器
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //判断用户是否输入了内容
                if(!(show_equation.toString().equals(""))) {
                    t=0;
                    char temp=show_equation.charAt(show_equation.length()-1);
                    if(temp=='+'||temp=='-'||temp=='*'||temp=='/')
                    {
                        show_equation.deleteCharAt(show_equation.length()-1);
                        show_equation.append("*");
                    }
                    else if((temp>='0'&&temp<='9')||(temp=='.')||(temp=='~'))
                        show_equation.append("*");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }
            }
        });

        //除号按钮监听器
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //判断用户是否输入了内容
                if(!(show_equation.toString().equals(""))) {
                    t=0;
                    char temp=show_equation.charAt(show_equation.length()-1);
                    if(temp=='+'||temp=='-'||temp=='*'||temp=='/')
                    {
                        show_equation.deleteCharAt(show_equation.length()-1);
                        show_equation.append("/");
                    }
                    else if((temp>='0'&&temp<='9')||(temp=='.')||(temp=='~'))
                        show_equation.append("/");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }
            }
        });
    }


    //sin
    public  String sin(String n1){
        double a1=Double.parseDouble(n1);//类型转换
        double a2=Math.sin(a1);
        String result=String.valueOf(a2);
        return  result;
    }

    //相加
    public static String Add(String n1,String n2) {
        BigDecimal b1 = new BigDecimal(n1);
        BigDecimal b2 = new BigDecimal(n2);
        return b1.add(b2).toString();
    }
    //相减
    public static String Sub(String  n1,String  n2){
        BigDecimal b1=new BigDecimal(n1);
        BigDecimal b2=new BigDecimal(n2);
        return b1.subtract(b2).toString();
    }

    //相乘
    public static String Mul(String n1,String n2){
        BigDecimal b1=new BigDecimal(n1);
        BigDecimal b2=new BigDecimal(n2);
        return b1.multiply(b2).toString();
    }

    //相除
    public static String Div(String n1,String n2){
        BigDecimal b1=new BigDecimal(n1);
        BigDecimal b2=new BigDecimal(n2);
        if(b2.compareTo(new BigDecimal("0.00000000000"))==0){
            return "?";
        }
        if(b1.compareTo(new BigDecimal("0.00000000000"))==0){
            return "0";
        }
        else
            return b1.divide(b2,8,BigDecimal.ROUND_HALF_UP).toString();
    }
    /*
    遍历运算式ArrayList，将数字和运算式分类放入两个数组；放置运算符时比较已存运算符的优先级，若要放进去的优先级低或等于它，
    则弹出一个两个运算符，进行运算.
    */
    protected boolean operatorPriorityCompare(char operator1,char operator2){//比较两个运算符的优先级
        int x1=0;
        int x2=0;
        switch (operator1){
            case '+':{x1=0;break;}
            case '-':{x1=0;break;}
            case '*':{x1=1;break;}
            case '/':{x1=1;break;}
        }
        switch (operator2){
            case '+':{x2=0;break;}
            case '-':{x2=0;break;}
            case '*':{x2=1;break;}
            case '/':{x2=1;break;}
        }
        if(x1<=x2) {
            return false;
        }
        else
            return true;
    }
    protected String calculate(ArrayList equation){//序列
        String temp2;
        String temp3;
        String result;//结果
        List operator=new ArrayList();//用来存运算符
        List<String> operand=new ArrayList();//double型数组用来存数
        for(int i=0;i<equation.size();i++)//遍历
        {
            String temp4=(String)equation.get(i);//把运算式转化成字符串
            if(temp4.equals("+")||temp4.equals("-")||temp4.equals("*")||temp4.equals("/")) {
                if(operator.size()>0&&(!(operand.contains("?")))&&(!(operand.contains("@"))))//运算符数组长度不为空
                {
                    String temp5=operator.get(operator.size()-1).toString();//temp5取运算符数组最后一个操作符
                    //如果要放进去的运算符优先级低于已存的运算符且运算符数组不为空
                    while(!(operatorPriorityCompare(temp4.charAt(0),temp5.charAt(0)))&&operator.size()>0&&(!(operand.contains("?")))&&(!(operand.contains("@"))))
                    {
                        operator.remove(operator.size()-1);//已存运算符出来
                        temp3=operand.get(operand.size()-1);//数字出
                        operand.remove(operand.size()-1);//删一个数字
                        temp2=operand.get(operand.size()-1);//再出一个数字
                        operand.remove(operand.size()-1);//删掉这个数字
                        switch (temp5.charAt(0)){
                            case '+':{result=Add(temp2,temp3);operand.add(result);break;}
                            case '-':{result=Sub(temp2,temp3);operand.add(result);break;}
                            case '*':{result=Mul(temp2,temp3);operand.add(result);break;}
                            case '/':{result=Div(temp2,temp3);operand.add(result);break;}

                        }
                        if(operator.size()>0)//运算符数组不为空
                        {
                            temp5=operator.get(operator.size()-1).toString();//去运算符最后一个字符
                        }
                        else
                            break;
                    }
                    operator.add(temp4);//又加一个新的字符进去
                }
                else   //运算符数组为空时
                    operator.add(temp4);//存
            }
            else if(temp4.equals("~"))
            {
                temp3=operand.get(operand.size()-1);
                operand.remove(operand.size()-1);
                result=sin(temp3);
                operand.add(result);
            }
            else if(temp4.equals("#"))//遍历到最后结束标志了
            {
                while(operator.size()>0&&(!(operand.contains("?")))&&(!(operand.contains("@"))))//还有运算未完成
                {
                    String temp6=(String)operator.get(operator.size()-1);
                    operator.remove(operator.size()-1);
                    temp3=operand.get(operand.size()-1);
                    operand.remove(operand.size()-1);
                    temp2=operand.get(operand.size()-1);
                    operand.remove(operand.size()-1);
                    switch (temp6.charAt(0)){
                        case '+':{result=Add(temp2,temp3);operand.add(result);break;}
                        case '-':{result=Sub(temp2,temp3);operand.add(result);break;}
                        case '*':{result=Mul(temp2,temp3);operand.add(result);break;}
                        case '/':{result=Div(temp2,temp3);operand.add(result);break;}

                    }
                }
            }

            else if(!(operand.contains("?"))&&(!(operand.contains("@"))))
                operand.add(temp4);//加一个运算数
        }
        if(operand.contains("?"))
            return"除数不能为0";
        else if(operand.contains("@"))
            return"错误~";
        else
            return operand.get(0);
    }
}