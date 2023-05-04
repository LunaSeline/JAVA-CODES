import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class Example extends Applet implements ActionListener{
 Label l,l2;
 Button b;
 int ch=0;
 String lal = "Off";
 public static void main(String args[]){
 Example eh = new Example();
 eh.init();
 }
 public void paint(Graphics g){
 g.drawString(lal,100,100);
 }
 public void init(){
 l = new Label("Click the button to change the text");
 b = new Button("Click me");
 // l2 = new Label("uwu");
 // l2.setBounds(150,150,100,100);
 add(l);
 add(b);
 //add(l2);
 b.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e){
 if(ch==0){
 lal = "On";
 ch =1;
 } else{
 lal = "Off";
 ch=0;
 }
 repaint();
 }
}
/**
<applet code="Example.class" width="300" height="300">
</applet>
**/
