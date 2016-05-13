package BT_Time_Coding;

import java.util.PriorityQueue;
import java.util.Queue;

//import BT_Time_Coding.Ev.event_type;

public class Main {
	 public static double time = 0;
	 public static Queue<Ev> pq = new PriorityQueue<Ev>();
	 public Main(int t){
         this.time = t;
     }
         

	 public static void main (String[] args) throws java.lang.Exception
	    {
		 
	       
		 	CompleteTree b = new CompleteTree();
	        int n = 10;
	        //leaf nodes of the tree = n
	         //create binary tree set parent and child for all nodes
	        for (int i=0; i<n; i++) {
	            b.insertWrapper(i);
	        }
	        //check tree creation with inorder 
	        b.printInorder(b.root);
	       
	        //Node root = new Node();
	               
	        //create priority queue 
	        
	       //pushing frame gen event for all leaf nodes
	     
	        b.pushLeafNodes(b.root);
	        //bfs traversal
	        b.bfs(b.root);
	        Ev a = new Ev();
	        while (pq.size() != 0) {
	            a = pq.remove(); 
	            //System.out.println(a.getTime());
	            //System.out.println(a.getId());
	            int ev = a.getFramenum();
	            //print frame num of all events in PQ
	            System.out.println(a.getFramenum());//.getId());
	          //  time = a.getTime();
	            switch(ev){
	            case 0:{
	            	System.out.println("Test swtich case 1");
	            	//processGenEvent(a);
	            	}
	            	break;
	            default:
	            	{
	            	System.out.println("Test swtich case default");
	            	//processDropEvent(a);
	            	}
	            }
	            
	        }
	        
	        
	        
      }
	 void processGenEvent(Ev e){
		 CompleteTree b = new CompleteTree();
		 int id = e.getId();
		 int f = e.getFramenum();
		 b.addFrameBuffer(id,b.root,f);	
		 //;
		 	
		 	//e.setFramenum(e.getFramenum()+1);
		 	
	//	 	f++;
		// 	pq.add(new Ev())
		 	
     }
	 
	 void processDropEvent(Ev e){
		 
	 }
	 
	 void informParent(){
		 
	 }
	 
}
	            
	      	        
	        
	             
	        
   


