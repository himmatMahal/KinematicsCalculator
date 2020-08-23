import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class kinelator extends JFrame implements ActionListener
{

   JLabel heading1 = new JLabel("Enter 3 fields, then select what you are solving for") ;
   JLabel heading2 = new JLabel("(All units in Metres and Seconds)");
   JLabel heading3 = new JLabel("_________________BY: HIMMAT MAHAL_________________________") ;
   JLabel vfLabel = new JLabel("Enter Final Velocity(Vf):  ") ;
   TextField vf  = new TextField( 15 );
   JLabel viLabel = new JLabel("Enter Inital Velocity(Vi):  ") ;
   TextField vi  = new TextField( 15 );
   JLabel accLabel = new JLabel("Enter Acceleration(Acc):  ") ;
   TextField acc  = new TextField( 15 );
   JLabel timeLabel = new JLabel("Enter Time(Time):  ") ;
   TextField time  = new TextField( 15 );
   JLabel dispLabel = new JLabel("Enter Displacement(Disp):  ") ;
   TextField disp  = new TextField( 15 );

   JLabel outLabel   = new JLabel("                                Result:") ;
   TextField outText = new TextField( 15 );

   JButton dispNoAcc = new JButton("Disp w/o Acc");
   JButton dispNoTime = new JButton("Disp  w/o Time");
   JButton dispNoVi = new JButton("Disp  w/o Vi");
   JButton dispNoVf = new JButton("Disp  w/o Vf");
   JButton viNoAcc = new JButton("Vi  w/o Acc");
   JButton viNoTime = new JButton("Vi  w/o Time");
   JButton viNoVf = new JButton("Vi  w/o Vf");
   JButton viNoDisp = new JButton("Vi  w/o Disp");
   JButton vfNoAcc = new JButton("Vf  w/o Acc");
   JButton vfNoTime = new JButton("Vf  w/o Time");
   JButton vfNoVi = new JButton("Vf  w/o Vi");
   JButton vfNoDisp = new JButton("Vf  w/o Disp");
   JButton accNoVf = new JButton("Acc  w/o Vf");
   JButton accNoTime = new JButton("Acc  w/o Time");
   JButton accNoDisp = new JButton("Acc  w/o Disp");
   JButton accNoVi = new JButton("Acc  w/o Vi");
   JButton timeNoAcc = new JButton("Time  w/o Acc");
   JButton timeNoVi = new JButton("Time  w/o Vi");
   JButton timeNoVf = new JButton("Time  w/o Vf");
   JButton timeNoDisp = new JButton("Time w/o Disp");
   JButton clearFields = new JButton("CLEAR");
   
   public kinelator(String title)
   {  
      super(title);
      setLayout(new FlowLayout()); 
      add(heading1);
      add(heading2);
      add(heading3);
      add(vfLabel);
      add(vf);
      add(viLabel);
      add(vi);
      add(accLabel);
      add(acc);
      add(timeLabel);
      add(time);
      add(dispLabel);
      add(disp);
     
      add(dispNoAcc);
      add(dispNoTime);
      add(dispNoVi);
      add(dispNoVf);
      add(viNoAcc);
      add(viNoTime);
      add(viNoVf);
      add(viNoDisp);
      add(vfNoAcc);
      add(vfNoTime);
      add(vfNoVi);
      add(vfNoDisp);
      add(accNoVf);
      add(accNoTime);
      add(accNoDisp);
      add(accNoVi);
      add(timeNoAcc);
      add(timeNoVi);
      add(timeNoVf);
      add(timeNoDisp);
   
      add(outLabel) ;
      add(outText) ;
    
      dispNoAcc.setActionCommand("dispNoAcc");
      dispNoTime.setActionCommand("dispNoTime");
      dispNoVi.setActionCommand("dispNoVi");
      dispNoVf.setActionCommand("dispNoVf");
      viNoAcc.setActionCommand("viNoAcc");
      viNoTime.setActionCommand("viNoTime");
      viNoVf.setActionCommand("viNoVf");
      viNoDisp.setActionCommand("viNoDisp");
      vfNoAcc.setActionCommand("vfNoAcc");
      vfNoTime.setActionCommand("vfNoTime");
      vfNoVi.setActionCommand("vfNoVi");
      vfNoDisp.setActionCommand("vfNoDisp");
      accNoVf.setActionCommand("accNoVf");
      accNoTime.setActionCommand("accNoTime");
      accNoDisp.setActionCommand("accNoDisp");
      accNoVi.setActionCommand("accNoVi");
      timeNoAcc.setActionCommand("timeNoAcc");
      timeNoVi.setActionCommand("timeNoVi");
      timeNoVf.setActionCommand("timeNoVf");
      timeNoDisp.setActionCommand("timeNoDisp");
    
      dispNoAcc.addActionListener(this);
      dispNoTime.addActionListener(this);
      dispNoVi.addActionListener(this);
      dispNoVf.addActionListener(this);
      viNoAcc.addActionListener(this);
      viNoTime.addActionListener(this);
      viNoVf.addActionListener(this);
      viNoDisp.addActionListener(this);
      vfNoAcc.addActionListener(this);
      vfNoTime.addActionListener(this);
      vfNoVi.addActionListener(this);
      vfNoDisp.addActionListener(this);
      accNoVf.addActionListener(this);
      accNoTime.addActionListener(this);
      accNoDisp.addActionListener(this);
      accNoVi.addActionListener(this);
      timeNoAcc.addActionListener(this);
      timeNoVi.addActionListener(this);
      timeNoVf.addActionListener(this);
      timeNoDisp.addActionListener(this);
   
   
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );   
   }

   public void actionPerformed(ActionEvent clicked)  
   {
      if (clicked.getActionCommand().equals("dispNoAcc"))
      {
         double a = Double.parseDouble(time.getText()); 
         double b = Double.parseDouble(vi.getText()); 
         double c = Double.parseDouble(vf.getText()); 
         String out = KinematicsUtility.dispNoAcc(a,b,c);
         outText.setText(out);  
      }
      else if (clicked.getActionCommand().equals("dispNoTime"))
      {
         double a = Double.parseDouble(acc.getText()); 
         double b = Double.parseDouble(vi.getText()); 
         double c = Double.parseDouble(vf.getText()); 
         String out = KinematicsUtility.dispNoTime(a,b,c);
         outText.setText(out); 
      }
      else if (clicked.getActionCommand().equals("dispNoVi"))
      {
         double a = Double.parseDouble(time.getText()); 
         double b = Double.parseDouble(acc.getText()); 
         double c = Double.parseDouble(vf.getText()); 
         String out = KinematicsUtility.dispNoVi(a,b,c);
         outText.setText(out); 
      }
      else if (clicked.getActionCommand().equals("dispNoVf"))
      {
         double a = Double.parseDouble(time.getText()); 
         double b = Double.parseDouble(vi.getText()); 
         double c = Double.parseDouble(acc.getText()); 
         String out = KinematicsUtility.dispNoVf(a,b,c);
         outText.setText(out); 
      }
      else if (clicked.getActionCommand().equals("viNoAcc"))
      {
         double a = Double.parseDouble(time.getText()); 
         double b = Double.parseDouble(disp.getText()); 
         double c = Double.parseDouble(vf.getText()); 
         String out = KinematicsUtility.viNoAcc(a,b,c);
         outText.setText(out); 
      }
      else if (clicked.getActionCommand().equals("viNoTime"))
      {
         double a = Double.parseDouble(acc.getText()); 
         double b = Double.parseDouble(disp.getText()); 
         double c = Double.parseDouble(vf.getText()); 
         String out = KinematicsUtility.viNoTime(a,b,c);
         outText.setText(out); 
      }
      else if (clicked.getActionCommand().equals("viNoVf"))
      {
         double a = Double.parseDouble(time.getText()); 
         double b = Double.parseDouble(acc.getText()); 
         double c = Double.parseDouble(disp.getText()); 
         String out = KinematicsUtility.viNoVf(a,b,c);
         outText.setText(out); 
      }
      else if (clicked.getActionCommand().equals("viNoDisp"))
      {
         double a = Double.parseDouble(time.getText()); 
         double b = Double.parseDouble(vf.getText()); 
         double c = Double.parseDouble(acc.getText()); 
         String out = KinematicsUtility.viNoDisp(a,b,c);
         outText.setText(out); 
      }
      else if (clicked.getActionCommand().equals("vfNoAcc"))
      {
         double a = Double.parseDouble(time.getText()); 
         double b = Double.parseDouble(disp.getText()); 
         double c = Double.parseDouble(vi.getText()); 
         String out = KinematicsUtility.vfNoAcc(a,b,c);
         outText.setText(out); 
      }
      else if (clicked.getActionCommand().equals("vfNoTime"))
      {
         double a = Double.parseDouble(acc.getText()); 
         double b = Double.parseDouble(disp.getText()); 
         double c = Double.parseDouble(vi.getText()); 
         String out = KinematicsUtility.vfNoTime(a,b,c);
         outText.setText(out); 
      }
      else if (clicked.getActionCommand().equals("vfNoVi"))
      {
         double a = Double.parseDouble(time.getText()); 
         double b = Double.parseDouble(acc.getText()); 
         double c = Double.parseDouble(disp.getText()); 
         String out = KinematicsUtility.vfNoVi(a,b,c);
         outText.setText(out); 
      }
      else if (clicked.getActionCommand().equals("vfNoDisp"))
      {
         double a = Double.parseDouble(time.getText()); 
         double b = Double.parseDouble(vi.getText()); 
         double c = Double.parseDouble(acc.getText()); 
         String out = KinematicsUtility.vfNoDisp(a,b,c);
         outText.setText(out); 
      }
      else if (clicked.getActionCommand().equals("accNoVf"))
      {
         double a = Double.parseDouble(time.getText()); 
         double b = Double.parseDouble(disp.getText()); 
         double c = Double.parseDouble(vi.getText()); 
         String out = KinematicsUtility.accNoVf(a,b,c);
         outText.setText(out); 
      }
      else if (clicked.getActionCommand().equals("accNoTime"))
      {
         double a = Double.parseDouble(vi.getText()); 
         double b = Double.parseDouble(disp.getText()); 
         double c = Double.parseDouble(vf.getText()); 
         String out = KinematicsUtility.accNoTime(a,b,c);
         outText.setText(out); 
      }
      else if (clicked.getActionCommand().equals("accNoDisp"))
      {
         double a = Double.parseDouble(time.getText()); 
         double b = Double.parseDouble(vf.getText()); 
         double c = Double.parseDouble(vi.getText()); 
         String out = KinematicsUtility.accNoDisp(a,b,c);
         outText.setText(out); 
      }
      else if (clicked.getActionCommand().equals("accNoVi"))
      {
         double a = Double.parseDouble(time.getText()); 
         double b = Double.parseDouble(vf.getText()); 
         double c = Double.parseDouble(disp.getText()); 
         String out = KinematicsUtility.accNoVi(a,b,c);
         outText.setText(out); 
      }
      else if (clicked.getActionCommand().equals("timeNoAcc"))
      {
         double a = Double.parseDouble(vi.getText()); 
         double b = Double.parseDouble(disp.getText()); 
         double c = Double.parseDouble(vf.getText()); 
         String out = KinematicsUtility.timeNoAcc(a,b,c);
         outText.setText(out); 
      }
      else if (clicked.getActionCommand().equals("timeNoVi"))
      {
         double a = Double.parseDouble(acc.getText()); 
         double b = Double.parseDouble(disp.getText()); 
         double c = Double.parseDouble(vf.getText()); 
         String out = KinematicsUtility.timeNoVi(a,b,c);
         outText.setText(out); 
      }
      else if (clicked.getActionCommand().equals("timeNoVf"))
      {
         double a = Double.parseDouble(vi.getText()); 
         double b = Double.parseDouble(acc.getText()); 
         double c = Double.parseDouble(disp.getText()); 
         String out = KinematicsUtility.timeNoVf(a,b,c);
         outText.setText(out); 
      }
      else
      {
         double a = Double.parseDouble(vi.getText()); 
         double b = Double.parseDouble(vf.getText()); 
         double c = Double.parseDouble(acc.getText()); 
         String out = KinematicsUtility.timeNoDisp(a,b,c);
         outText.setText(out); 
      }
   }
}