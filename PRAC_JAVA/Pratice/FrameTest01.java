import java.util.*;
import java.awt.Frame;

class MyFrame extends Frame{
	public MyFrame(){
		super("What");
		setSize(300,200);
		setVisible(true);
	}
}

class FrameTest01{
	public static void main(String [] args){
		MyFrame f1=new MyFrame();
	}
} 
