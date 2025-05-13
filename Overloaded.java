class Overloaded
{ public static void main(double s,double l,double b,double h,float r)
    { Volume(s);
      Volume(l,b,h);
      Volume(r);
    }
  public static double Volume(double side) 
  { double vol=side*side*side;
    
    return vol;  
  }
  public static double Volume(double length,double breadth,double height)
   { double vol=length*breadth*height;
     
     return vol;
   }
  public static float Volume(float r)
   { float vol=((4/3)*(22/7)*(r*r*r));
     
     return vol;
   }
}   