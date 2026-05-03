package RankListFiles;

// imports
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.nio.file.*;
import RankListFiles.Interfaces.*;

public class RankList implements adminInterface, userInterface {
    private int studentCount;
    private StudentData[] studentData;
    Scanner sc = new Scanner(System.in);

    /**
     This function collects student data from user input,
     including roll number, name, and marks for each student. 
     It initializes an array of StudentData objects to store the information.

     @since 1.0
     */
    public void getData() {
        System.out.print("Enter number of students: ");
        studentCount = sc.nextInt();

        sc.nextLine(); // consume newline

        studentData = new StudentData[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.println("\n\nEnter details for student " + (i + 1) + ":" );
            System.out.println("Enter Roll Number of student " + (i + 1) + ":");
            long rollnum = sc.nextLong();
            sc.nextLine(); // consume newline
            System.out.print("Enter Name of student " + (i + 1) + ": ");
            String name = sc.nextLine();
            System.out.print("Enter marks of " + name + ": ");
            Float marks = sc.nextFloat();
            sc.nextLine(); // consume newline
            studentData[i] = new StudentData(rollnum, name, marks);
        }
        generateRankList();
    }

    /**
     * This function generates the rank list of students
     * by sorting the student data in descending order based on their marks.
     * @implNote It uses a simple bubble sort algorithm to sort the students.
     * The sorting is done in-place, modifying the original array of student data.
     * @implNote The function iterates through the array multiple times,
     * comparing adjacent elements and swapping them if they are in the wrong order.
     * @since 1.0
     */
    public void generateRankList() {
        for (int i = 0; i < studentCount - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < studentCount - i - 1; j++) {
                if (studentData[j].getStudentMarks() < studentData[j + 1].getStudentMarks()) {
                    StudentData temp = studentData[j];
                    studentData[j] = studentData[j + 1];
                    studentData[j + 1] = temp;
                    swapped = true;
                }
                if (!swapped) break;
            }
        }
    }

    /**
     * This function retrieves the student at a specific rank.
     * 
     * @param rank The rank of the student to retrieve (1-based index).
     */
    public void studentAtRank(int rank) {
        if (rank < 1 || rank > studentData.length) {
            System.out.println("Invalid Rank, enter a valid rank value!");
            return;
        }
        System.out.println("\n\nStudent at Rank " + rank + " is " + studentData[rank - 1].getStudentName() +
                "(" + studentData[rank-1].getRollNumber() + ") with a score of " + studentData[rank - 1].getStudentMarks() + "!");
    }

    /** 
     * This function displays the rank list of students,
     * showing their names and scores in descending order. 
     */
    public void showRankList() {;
        System.out.println("\n\n\n\nRank List\n\nTotal Number of Students: " + studentCount);
        for (int i = 0; i < studentCount; i++) {
            System.out.println("Rank " + (i + 1) + "-> " + studentData[i].getRollNumber() +
            ": " + studentData[i].getStudentName() +
                    " (Score: " + studentData[i].getStudentMarks() + ")");
        }
        System.out.println("\n\n");
    }

    /**
     * This function retrieves the top runner from the rank list,
     * which is the student with the highest score.
     */
    public void getTopRunner() {
        System.out.println("\n\nHighest score is " + studentData[0].getStudentMarks() +
                " scored by roll number "+ studentData[0].getRollNumber() +": " + studentData[0].getStudentName() + "!");
    }

    /**
     * This function adds a new student to the rank list.
     * It prompts the user to enter the student's roll number, name, and marks.
     * After adding the student, it generates the updated rank list.
     */
    public void addStudentData() {
        System.out.println("Enter roll number of student: ");
        Long rollNumber = sc.nextLong();
        sc.nextLine(); // consume newline
        System.out.println("Enter name of student: ");
        String name = sc.nextLine();
        System.out.println("Enter marks of the student: ");
        float marks = sc.nextFloat();
        sc.nextLine(); // consume newline

        StudentData[] newStudentData = new StudentData[studentCount + 1];
        System.arraycopy(studentData, 0, newStudentData, 0, studentCount);
        newStudentData[studentCount] = new StudentData(rollNumber, name, marks);
        studentCount++;
        studentData = newStudentData;
        generateRankList();
    }

    /**
     * This function removes a student from the rank list by their name.
     * If the student is not found, it prints an error message.
     * 
     * @param rollNum The roll number of the student to be removed.
     * @implNote It shifts the remaining students in the array to fill the gap left by
     */
    public void removeStudentData(Long rollnum) {
        int i;
        for (i = 0; i < studentCount; i++) {
            if (studentData[i].getRollNumber().equals(rollnum))
                break;
        }
        if (i == studentCount) {
            System.out.println("Student Not Found!\n\n\n");
            return;
        }
        int pos = i;
        for (i = pos; i < studentCount - 1; i++) {
            studentData[i] = studentData[i + 1];
        }
        studentCount--;
        generateRankList();
    }

    /**
     * This function edits the data of a student by their name.
     * It allows the user to modify either the student's name or their marks.
     * 
     * @param rollnum The roll number of the student whose data is to be edited.
     * @implNote It searches for the student by their roll number and prompts the user
     */
    public void editStudentData(Long rollnum) {
        for (int i = 0; i < studentCount; i++) {
            if (studentData[i].getRollNumber().equals(rollnum)) {
                System.out.println("Current Information: ");
                System.out.println("Roll number: " + studentData[i].getRollNumber() + "\nName: " + studentData[i].getStudentName() +
                        "\nMarks: " + studentData[i].getStudentMarks());

                System.out.println("Which field to modify?\n1. Roll Number\n2. Name\n3. Marks");
                int fieldChoice = sc.nextInt();

                if (fieldChoice == 1) {
                    System.out.println("Enter new roll number: ");
                    Long stdRollNum = sc.nextLong();
                    sc.nextLine(); // consume newline
                    studentData[i] = new StudentData(stdRollNum, studentData[i].getStudentName(), studentData[i].getStudentMarks());
                }
                else if (fieldChoice == 2) {
                    System.out.println("Enter new name: ");
                    String stdName = sc.nextLine();
                    studentData[i] = new StudentData(studentData[i].getRollNumber(), stdName, studentData[i].getStudentMarks());
                } else if (fieldChoice == 3) {
                    System.out.println("Enter new score: ");
                    Float marks = sc.nextFloat();
                    sc.nextLine(); // consume newline
                    studentData[i] = new StudentData(studentData[i].getRollNumber(), studentData[i].getStudentName(), marks);
                }
                break;
            }
        }
        generateRankList();
    }

    /**
     * This function saves the student data to a binary file with the
     * given .bin format file.
     * 
     * @param fileName Name of the file to save data to
     * @implNote If the file name is not specified, it will be generated
     *           automatically in the format "RankList_dd_MMM_yyyy.bin".
     */
    public void saveFileByName(String fileName) {
        // if file name isn't specified, program will specify it by itself
        Date dt = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd_MMM_yyyy");
        if (fileName.equals(""))
            fileName = "RankList_" + formatter.format(dt);

        // to prevent absence of .bin file format
        if (!fileName.endsWith(".bin"))
            fileName += ".bin";

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(studentData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This function exports the student data to a text file in the format
     * "Name,Marks" per line.
     * 
     * @param fileName Name of the file to export data to
     * 
     * @implNote This function creates a new text file with the specified name
     *           and writes each student's name and marks on a new line in the
     */
    public void exportFile(String fileName) {
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (StudentData s : studentData) {
                writer.write(s.getRollNumber() + "," + s.getStudentName() + "," + s.getStudentMarks());
                writer.newLine();
            }
            System.out.println("Students written to text file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Retrives data from given .bin format file.
     * If the file does not end with ".bin", it appends ".bin" to
     * 
     * @param fileName Name of the file to import data from
     */
    public void loadFileByName(String fileName) {
        // to prevent absence of .bin file format
        if (!fileName.endsWith(".bin"))
            fileName += ".bin";
        Path filePath = Paths.get("../" + fileName);
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath.toFile()))) {
            studentData = (StudentData[]) in.readObject();
            studentCount = studentData.length; // update count after loading
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        generateRankList();
    }

    /**  
     * Retrives data from given .txt format file.
     * It assumes the file is in the format "Name,Marks" per line.
     * If the file does not end with ".txt", it appends ".txt" to     
     * @param fileName Name of the file to import data from
     */
    public void importFile(String fileName) {
        if (!fileName.endsWith(".txt")) fileName += ".txt";
        int count = 0;
        Path filePath = Paths.get("../" + fileName);
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                count++;
            }
            this.studentData = new StudentData[count];
            this.studentCount = count;
            count = 0;
            reader.close(); // Close and reopen to reset the reader
            
            try(BufferedReader reader2 = new BufferedReader(new FileReader(fileName))) {
                while ((line = reader2.readLine()) != null) {
                    String[] parts = line.split(",");
                    Long rollNumber = Long.parseLong(parts[0]);
                    String name = parts[1];
                    Float marks = Float.parseFloat(parts[2]);
                    this.studentData[count++] = new StudentData(rollNumber, name, marks);
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
