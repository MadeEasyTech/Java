
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 class login extends Frame
 
{
	 Button b1,b2;
	 Label l1,l2;
	 TextField t1,t2;

	 
	 
	 
	 login()
	 {
		 addWindowListener(new WindowAdapter()
		 {  
	            @Override
				public void windowClosing(WindowEvent e)
	            {  
	                dispose();  
	            }  
	        });  
		 this.setTitle("login App");
         this.setSize(500,150);
      
         this.setLayout(null);
         this.setLocation(300,300);
         l1=new Label("Uname:");
         l2=new Label("password:");
         t1=new TextField(30);
         t2=new TextField(30);
          b1=new Button("login");
          b2=new Button("cancel");
          
          this.add(l1);
          this.add(t1);
          this.add(l2);
          this.add(t2);
          this.add(b1);
          this.add(b2);
          this.setLayout(new GridLayout(3,3));
          this.setVisible(true);
         
         
         
         
        
         //this.setBackground(new Color(0,0,20));
	 }
	 
	
}
public class simple_frame {

	public simple_frame()
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		login one=new login();
		System.out.println("hi i m here");
		
	}

}
