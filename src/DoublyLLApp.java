import java.util.Scanner;

public class DoublyLLApp {
	    public static void main(String[] args) {
	        Scanner scan=new Scanner(System.in);
	        DoublyLL dll=new DoublyLL();
	        while(true){
	            System.out.println("Enter 1 for Insert at front");
	            System.out.println("Enter 2 for Delete at front");
	            System.out.println("Enter 3 for Insert at certain position");
	            System.out.println("Enter 4 for delete at certain position");
	            System.out.println("Enter 5 for Insert at rear");
	            System.out.println("Enter 6 for Delete");
	            System.out.println("Enter 7 for replace element using Position");
	            System.out.println("Enter 8 for replace element Using Data");
	            System.out.println("Enter 9 for Size of DLL");
	            System.out.println("Enter 10 for Display");
	            System.out.println("Enter 11 for Display in Reverse");
	            System.out.println("Enter any Other Number to Exit");
	            System.out.print("Enter your choice:");
	            int choice=scan.nextInt();
	            System.out.println();
	            switch(choice){
	                case 1:
	                dll.insertFront();
	                break;
	                case 2:
	                dll.deleteFront();
	                break;
	                case 3:
	                dll.insertAtRandomPos();
	                break;
	                case 4:
	                dll.deleteAtRandomPos();
	                break;
	                case 5:
	                dll.insertRear();
	                break;
	                case 6:
	                dll.deleteRear();
	                break;
	                case 7:
	                dll.replaceEleUsingPos();
	                break;
	                case 8:
	                dll.replaceEleUsingData();
	                break;
	                case 9:
	                dll.sizeOfDLL();
	                break;
	                case 10:
	                dll.display();
	                break;
	                case 11:
	                dll.displayRevese();
	                break;
	                default:
	                System.exit(0);
	            }
	        }
	    }
}
