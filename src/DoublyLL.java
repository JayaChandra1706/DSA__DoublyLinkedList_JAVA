import java.util.Scanner;

public class DoublyLL {
	private Scanner scan=new Scanner(System.in);
    class Node{
        int data;
        Node firstlink;
        Node secondlink;
        public Node(int data,Node firstNode,Node seconNode){
            this.data=data;
            this.firstlink=firstNode;
            this.secondlink=seconNode;
        }
    }
    Node first=null;
    public void insertFront(){
        System.out.println("Enter Element to insert:");
        int ele=scan.nextInt();
        Node newNode=new Node(ele, null, null);
        if(first==null){
            first=newNode;
        }else{
            newNode.secondlink=first;
            first.firstlink=newNode;
            first=newNode;
        }
    }
    public void deleteFront(){
        if(first==null){
            System.out.println("Delete is not possible No elements present");
        }else if(first.secondlink==null){
            System.out.println(first.data+" is deleted");
            first=null;
        }else{
            System.out.println(first.data+" is deleted");
            first.secondlink.firstlink=null;
            first=first.secondlink;
        }
    }
    public void insertAtRandomPos(){
        System.out.println("Enter Position to Insert:");
        int pos=scan.nextInt();
        System.out.println("Enter element to Insert at "+pos+":");
        int ele=scan.nextInt();
        Node newNode=new Node(ele, null, null);
        if(first==null){
            first=newNode;
        }else{
            Node temp=first;
            for(int i=1;i<=pos-2;i++){
                temp=temp.secondlink;
            }
            newNode.firstlink=temp;
            newNode.secondlink=temp.secondlink;
            temp.secondlink.firstlink=newNode;
            temp.secondlink=newNode;
        }
    }
    public void deleteAtRandomPos(){
        if(first==null){
            System.out.println("Delete is not possible No elements present");
        }else{
            System.out.println("Enter the pos to delete:");
            int pos =scan.nextInt();
            Node temp=first;
            for(int i=1;i<=pos-2;i++){
                temp=temp.secondlink;
            }
            System.out.println(temp.secondlink.data+" is deleted");
            temp.secondlink=temp.secondlink.secondlink;
            temp.secondlink.firstlink=temp;
        }
    }
    public void insertRear(){
        System.out.println("Enter Element to insert:");
        int ele=scan.nextInt();
        Node newNode=new Node(ele,null,null);
        if(first==null){
            first=newNode;
        }else if(first.secondlink==null){
            first.secondlink=newNode;
            newNode.firstlink=first;
        }else{
            Node temp=first;
            while(temp.secondlink!=null){
                temp=temp.secondlink;
            }
            temp.secondlink=newNode;
            newNode.firstlink=temp;
        }
        }
        public void deleteRear(){
            if(first==null){
                System.out.println("Deletion not possible NO Elements present");
            }else if(first.secondlink==null){
                System.out.println(first.data+" is Deleted");
                first=null;
            }else{
                Node temp=first;
                while(temp.secondlink.secondlink!=null){
                temp=temp.secondlink;
                }
                System.out.println(temp.secondlink.data+" is Deleted");
                temp.secondlink=null;
            }
        }
        public void replaceEleUsingPos(){
            if(first==null){
                System.out.println("replace not possible No elements present");
            }else{
                System.out.println("Enter position to replace:");
                int pos=scan.nextInt();
                System.out.println("Enter new Element to replace at "+pos);
                int ele=scan.nextInt();
                Node temp=first;
                for(int i=1;i<=pos-1;i++){
                    temp=temp.secondlink;
                }
                System.out.println(temp.data+" is replaced by "+ele);
                temp.data=ele;
            }
        }
        public void replaceEleUsingData(){
            if(first==null){
                System.out.println("Replace is not possible No Elements present");
            }
            System.out.println("Enter Data which you want to replace:");
            int ele=scan.nextInt();
            System.out.println("Enter new Data to replace:");
            int newEle=scan.nextInt();
            Node temp=first;
            while(temp!=null){
                if(temp.data==ele){
                    temp.data=newEle;
                }
                temp=temp.secondlink;
            }
        }
        public void sizeOfDLL(){
            Node temp=first;
            int count=0;
            while(temp!=null){
            count++;
            temp=temp.secondlink;
            }
            System.out.println(count+" elements present in the DLL");
        }
        public void display(){
            if(first==null){
                System.out.println("Display is not Possible No Elements present");
            }else if(first.secondlink==null){
                System.out.println(first.data);
            }else{
                Node temp=first;
                while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.secondlink;
                }
                System.out.println();
            }
        }
        public void displayRevese(){
            Node temp=first;
            while(temp.secondlink!=null){
                temp=temp.secondlink;
            }
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.firstlink;
            }
            System.out.println();
        }
    }

