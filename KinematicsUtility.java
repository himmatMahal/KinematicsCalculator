import java.lang.Math;
public class KinematicsUtility
{

   public static String dispNoAcc(double t, double vi, double vf)
   {
      String output = "";
      double out = 0.5*(vf+vi)*t;
      output+=out;
      return output;
   }  
   public static String dispNoTime(double a, double vi, double vf)
   {
      String output = "";
      double out = ((vf*vf)-(vi*vi))/(2.0*a);
      output+=out;
      return output;
   }  
   public static String dispNoVi(double t, double a, double vf)
   {
      String output = "";
      double out = vf*t - (0.5*a*(t*t));
      output+=out;
      return output;
   }  
   public static String dispNoVf(double t, double vi, double a)
   {
      String output = "";
      double out = vi*t + (0.5*a*(t*t));
      output+=out;
      return output;
   }  
   // displacement methods
   
   
   public static String viNoAcc(double t, double d, double vf)
   {
      String output = "";
      double out = ((2.0*d)/t) - vf;
      output+=out;
      return output;
   }  
   public static String viNoTime(double a, double d, double vf)
   {
      String output = "";
      double out = Math.sqrt((vf*vf)-(2.0*a*d));
      output+=out;
      return output;
   }  
   public static String viNoVf(double t, double a, double d)
   {
      String output = "";
      double out = (d-(0.5*a*(t*t)))/t;
      output+=out;
      return output;
   }  
   public static String viNoDisp(double t, double vf, double a)
   {
      String output = "";
      double out = vf - a*t;
      output+=out;
      return output;
   }// Initial Velocity Methods
   
   
   public static String vfNoAcc(double t, double d, double vi)
   {
      String output = "";
      double out = ((2.0*d)/t) - vi;
      output+=out;
      return output;
   }  
   public static String vfNoTime(double a, double d, double vi)
   {
      String output = "";
      double out = Math.sqrt((vi*vi)+(2.0*a*d));
      output+=out;
      return output;
   }  
   public static String vfNoVi(double t, double a, double d)
   {
      String output = "";
      double out = (d+(0.5*a*(t*t)))/t;
      output+=out;
      return output;
   }  
   public static String vfNoDisp(double t, double vi, double a)
   {
      String output = "";
      double out = vi + a*t;
      output+=out;
      return output;
   }// Final Velocity Methods
   
   
   public static String accNoVf(double t, double d, double vi)
   {
      String output = "";
      double out = 2.0*(d-(vi*t))/(t*t);
      output+=out;
      return output;
   }  
   public static String accNoTime(double vi, double d, double vf)
   {
      String output = "";
      double out = ((vf*vf)-(vi*vi))/(2.0*d);
      output+=out;
      return output;
   }  
   public static String accNoDisp(double t, double vf, double vi)
   {
      String output = "";
      double out = (vf-vi)/t;
      output+=out;
      return output;
   }  
   public static String accNoVi(double t, double vf, double d)
   {
      String output = "";
      double out = ((-2.0)*(d-(vf*t)))/(t*t);
      output+=out;
      return output;
   }// Acceleration Methods
  
  
   public static String timeNoAcc(double vi, double d, double vf)
   {
      String output = "";
      double out = (2.0*d)/(vf+vi);
      output+=out;
      return output;
   }     
   public static String timeNoVi(double a, double d, double vf)
   {
      String output = "";
      double out1 = ((-1.0*vf)+(Math.sqrt((vf*vf)-(4.0*(-0.5*a)*(-1.0*d)))))/(-1.0*a);
      double out2 = ((-1.0*vf)-(Math.sqrt((vf*vf)-(4.0*(-0.5*a)*(-1.0*d)))))/(-1.0*a);
      output = output + (out1+ " or " +out2);
      return output;
   }  
   public static String timeNoVf(double vi, double a, double d)
   {
      String output = "";
      double out1 = ((-1.0*vi)+(Math.sqrt((vi*vi)-(4.0*(0.5*a)*(-1.0*d)))))/(a);
      double out2 = ((-1.0*vi)-(Math.sqrt((vi*vi)-(4.0*(0.5*a)*(-1.0*d)))))/(a);
      output = output + (out1+" or "+out2);
      return output;
   }  
   public static String timeNoDisp(double vi, double vf, double a)
   {
      String output = "";
      double out = (vf-vi)/a;
      output+=out;
      return output;
   }// Time Methods
}//end class