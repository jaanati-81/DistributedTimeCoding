package BT_Time_Coding;
import java.util.PriorityQueue;
import java.util.Queue;

//import BT_Time_Coding.Main.event_type;

class Ev implements Comparable<Ev>{
    double time;
    int id;
    int frame_num;
    public enum event_type{
        FRAME_GEN,
        FRAME_DROP
    }
    event_type e;
        
    public Ev(){
        
    }
    public Ev(event_type e){
        this.e = e;
    }

    
    public Ev(double time,int id) {
            this.time = time;
            this.id = id;
            //this.e
          }
     public Ev(double time, int id, int frame_num) {
        this.time = time;
        this.id = id;
        this.frame_num = frame_num;
      }
  
     public double getTime() {
            return time;
          }

          public void setTime(double time) {
            this.time = time;
          }

          public int getId() {
            return id;
          }

          public void setId(int id) {
            this.id = id;
          }
       public int getFramenum() {
                return frame_num;
              }

          public void setFramenum(int fn) {
            this.frame_num = fn;
          }
           
          public boolean equals(Object o) {
                if (!(o instanceof Ev)) {
                  return false;
                }
                Ev p = (Ev) o;
                if (this.id == p.getId()) {
                  return true;
                }

                return false;
              }
         /* public double hashCode() {
                return this.time;
              }*/
          public String toString() {
                return "(" + time + ", " + id + ")";
              }
          public int compareTo(Ev e1){ 
                if (this.getTime() < e1.getTime()) {
                    return -1;
                  }

                  if (this.getTime() > e1.getTime()) {
                    return 1;
                  }

                  if(this.getTime() == e1.getTime()){
                    return 0;
                  }
                  return 0;
              
                  
            }
          
        /*  public enum event_type{
        	  FRAME_GEN,
        	  FRAME_DROP
        	  
          }*/
          
}



