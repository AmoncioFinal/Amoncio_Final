import java.util.*;
import javax.swing.*;
/**
 * Write a description of class mike here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mike
{
    public static void main(String [] args){
        
        String arr []= new String [100];
        Scanner in = new Scanner(System.in);
        
        while(true){
            
            System.out.println("\n\n\nWelcome to my Life");
            System.out.println("[1] View Friend");
            System.out.println("[2] Add Friend");
            System.out.println("[3] Search Friend");
            System.out.println("[4] Update Friend");
            System.out.println("[5] Delete Friend");
            System.out.println("[0] Exit");
            System.out.print(">> ");
            int choice = in.nextInt();
            
            switch(choice){
                case 1:
                    System.out.print("here are your friends: ");
                    for(int x = 0 ; x < arr.length;x++){
                        
                        if(arr[x] == null){
                            if(x == 0){
                                System.out.println("No Friend Available");
                            }
                            break;
                        }else{
                            System.out.print(arr[x] + "--");
                        }
                    }
                    break;
                case 2:
                    String newFriend = JOptionPane.showInputDialog("Enter name of a friend");
                    for(int x = 0 ; x < arr.length;x++){
                        
                        if(arr[x] == null){
                            arr[x] = newFriend;
                            break;
                        }
                    }
                    break;
                case 3:
                    String searchFriend = JOptionPane.showInputDialog("Enter name of a frien");
                    for(int x = 0 ; x < arr.length;x++){
                        
                        if(arr[x] != null){
                            if(searchFriend.equalsIgnoreCase(arr[x])){
                                System.out.println(searchFriend + "is your friend");
                                break;
                            }
                        }else{
                            System.out.println(searchFriend + " NOT A friend");
                            break;
                        }
                    }
                    break;
                case 4:
                    String searchF = JOptionPane.showInputDialog("Enter name of a friend to update");
                    for(int x = 0 ; x < arr.length;x++){
                        
                        if(arr[x] != null){
                            if(searchF.equalsIgnoreCase(arr[x])){
                                System.out.println(searchF + "Found");
                              String newName = JOptionPane.showInputDialog("Enter a new name for a friend");
                                arr[x] = newName;
                                System.out.println("Friend update Successfully!");
                                break;
                            }
                        }else{
                            System.out.println(searchF + "NOT A friend, cannot update");
                            break;
                        }
                    }
                    break;
                case 5:
                    String searchF2 = JOptionPane.showInputDialog("Enter name of a friend DELETE");
                    for(int x = 0 ; x < arr.length;x++){
                        
                        if(arr[x] != null){
                            if(searchF2.equalsIgnoreCase(arr[x])){
                                System.out.println(searchF2 + "Found");
                                String confirmDelete = "";
                                do{
                                    confirmDelete = JOptionPane.showInputDialog("type YES to confirm Delete");
                                }while(confirmDelete.equalsIgnoreCase("yes"));
                                
                                arr[x] = null;
                                System.out.println("Friend Deleted Successfully!");
                                break;
                            }
                        }else{
                            System.out.println(searchF2 + "NOT A friend, cannot delete");
                            break;
                        }
                    }
                    break;
                case 0:
                    System.out.print("Bye :");
                    System.exit(1);
                default:
                    System.out.println("Invalid input!");    
                }//gwapo kay ning ako sir
        }
    }
}