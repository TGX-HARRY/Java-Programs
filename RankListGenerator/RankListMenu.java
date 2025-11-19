import java.text.SimpleDateFormat;
import java.util.*;
import RankListFiles.RankList;
public class RankListMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RankList list = new RankList();
        boolean exit = false;
        while (!exit) {
            System.out.println("\t\tWelcome to the Rank List Generator");
            System.out.println("Here are the options: ");
            System.out.println("1. Enter Student Data\n2. View Student Data\n3. Modify Student Data");
            System.out.println("4. Export Data Data (.bin file)\n5. Import Data (.bin file)");
            System.out.println("6. Export Data (.txt file)\n7. Import Data (.txt file)");
            System.out.println("8. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    list.getData();
                    break;
                case 2: 
                    list.showRankList();
                    break;
                case 3: 
                    boolean innerExit = false;
                    while(!innerExit) {
                        System.out.println("1. Remove an Entry\n2. Add an entry\n3. Edit an Entry\n4.Exit");
                        int innerChoice = sc.nextInt();
                        sc.nextLine();
                        if (innerChoice == 1) {
                            System.out.print("Enter student roll number to remove: ");
                            list.removeStudentData(sc.nextLong());
                            sc.nextLine(); // consume newline
                        }
                        else if (innerChoice == 2) {
                            list.addStudentData();
                        }
                        else if (innerChoice == 3) {
                            System.out.println("Enter roll number of student to edit: ");
                            list.editStudentData(sc.nextLong());
                            sc.nextLine(); // consume newline
                        }
                        else if(innerChoice == 4) {
                            innerExit = true;
                        }            
                   }
                   break;
                case 4:
                    System.out.println("Enter the file name to save: ");
                    list.saveFileByName(sc.nextLine());
                    break;
                case 5: 
                    System.out.println("Enter the file name to load: ");
                    list.loadFileByName(sc.nextLine());  
                    break;
                case 6:
                    System.out.println("Enter the file name to export: ");
                    list.exportFile(sc.nextLine());
                    break;
                case 7: 
                    System.out.println("Enter the file name to import: ");
                    list.importFile(sc.nextLine());
                    break;
                case 8: 
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid Choice, try again please!\n\n\n\n\n\n");
                    break;
            }
        }
        Date dt = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd_MMM_yyyy");
        list.saveFileByName("StudentData_" + formatter.format(dt));
        sc.close();
    }
}
