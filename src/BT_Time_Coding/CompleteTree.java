package BT_Time_Coding;

import java.util.LinkedList;
//import java.util.PriorityQueue;
//import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Queue;



class Node {
    public int id;
    Node left;
    Node right;
    Node parent;
    int frame_num=0;
    LinkedList<Integer> frame_buff = new LinkedList<Integer>();
    LinkedList<Integer> left_frames = new LinkedList<Integer>();
    LinkedList<Integer> right_frames = new LinkedList<Integer>();
    
    public Node (int id) {
    this.id = id;
    left = null;
    right = null;
    parent = null;
    this.frame_buff = null;
    this.left_frames = null;
    this.right_frames = null;
    }

    public Node (int id, Node parent) {
    this.id = id;
    left = null;
    right = null;
    this.parent = parent;
    this.frame_buff = null;
    this.left_frames = null;
    this.right_frames = null;
    }
}

class CompleteTree {
    Node root;

public CompleteTree() {
    root = null;
    } 

void insertWrapper(int id) {
    if (root == null) root = new Node(id);
        else insert(root,new Node(id));
    }

void insert(Node root, Node newnode) {
    if (((newnode.id - 1) / 2) == root.id) {
       if (root.left == null) {
            newnode.parent = root;              
            root.left = newnode;
       }
       else {
            newnode.parent = root;
            root.right = newnode;
       }
    }
    else {
       //goal to get ancestor 1 level under root to base the decision which subtree to go next
       int ancestor = newnode.id;//parent;
       while (((ancestor - 1) / 2) > root.id) {
           ancestor = (ancestor - 1) / 2;
       }
       root = ((ancestor%2)==1) ? root.left : root.right;
       insert(root,newnode);
    }
    }


void printInorder(Node root) {
    if (root == null) return;
    printInorder(root.left);
    System.out.print("Hi, i am "+root.id+" and my parent is ");
    if (root.parent == null) System.out.println ("NULL");
        else System.out.println(root.parent.id);
    printInorder(root.right);
    }

 void pushLeafNodes(Node n)
{ 	
	 if(n == null)       
        return;
       if(n.left == null && n.right == null)      
           Main.pq.add(new Ev(Main.time,n.id));
    	pushLeafNodes(n.left); 
       pushLeafNodes(n.right);      
}

 void addFrameBuffer(int id, Node root,int f){
	// locate node,  with id = id, say nodenow, add framenumber to its framebuffer
	 // inform its parent 
	 
	// informParent(nodenow.parent,nodenow,nodenow.framenumber??)
	 
 }
void bfs(Node root){
    LinkedList<Node> ls = new LinkedList<Node>();
    LinkedList<Node> ls1 = new LinkedList<Node>();
    LinkedList<Node> t;
    ls.addLast(root);
   
    while (ls.size() != 0) {
        t = ls;
        ls = ls1;
        ls1 = t;  // swap two lists to get one level of all the children
        while(ls1.size()!=0) {
            Node temp = ls1.poll();
            System.out.print(temp.id+" ");
            if(temp.left != null) 
                ls.addLast(temp.left);
            if(temp.right != null) 
                ls.addLast(temp.right);
        }
        System.out.println();
    }
  }

}
   