import java.awt.*;    
import java.awt.event.*;  

public class Calculator extends Frame implements ActionListener{
    TextField t= new TextField(); 
    Button add = new Button("ADD");  
    Button sub = new Button("SUB");  
    Button mul = new Button("MUL");  
    Button div = new Button("DIV");  
    Button result = new Button("RESULT");  
    static int n1,n2,n3;
    int flag;


    Calculator(){ 

    t.setBounds(20,40,390,100);
    add.setBounds(20,160,180,60);  
    sub.setBounds(230,160,180,60);  
    mul.setBounds(20,240,180,60);  
    div.setBounds(230,240,180,60);  
    result.setBounds(20,320,390,60);  
    
    add.addActionListener(this);
    sub.addActionListener(this);
    mul.addActionListener(this);
    div.addActionListener(this);
    result.addActionListener(this);

    add(t);
    add(add);
    add(sub);
    add(mul);
    add(div);
    add(result);

    
    setSize(430,420);  
    setTitle("This is our basic AWT example");   
    setLayout(null);   
    setVisible(true);  

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==add){
            n1=Integer.parseInt(t.getText());
            System.out.println(n1);
            t.setText("");
            flag=1;
        }
        else if(e.getSource()==sub){
            n1=Integer.parseInt(t.getText());
            System.out.println(n1);
            t.setText("");
            flag=2;
         }
         else if(e.getSource()==mul){
            n1=Integer.parseInt(t.getText());
            System.out.println(n1);
            t.setText("");
            flag=3;
         }
         else if(e.getSource()==div){
            n1=Integer.parseInt(t.getText());
            System.out.println(n1);
            t.setText("");
            flag=4;
         }
         else if(e.getSource()==result){
            n2=Integer.parseInt(t.getText());
            // n3=Integer.parseInt(t.getText());
            System.out.println(n2);
            if(flag==1){
            String str=Integer.toString(n1+n2);
            t.setText(str);
            }
            else if(flag==2){
            String str=Integer.toString(n1-n2);
            t.setText(str);      
            }
            else if(flag==3){
            String str=Integer.toString(n1*n2);
            t.setText(str);
            }
            else if(flag==4){
            String str=Integer.toString(n1/n2);
            t.setText(str);
            }
         }
         
    }

    public static void main(String args[]){
        new Calculator();    
        }  

}

 
