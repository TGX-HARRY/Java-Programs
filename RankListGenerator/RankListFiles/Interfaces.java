package RankListFiles;

public class Interfaces {
    public interface userInterface {
        void generateRankList();
        void studentAtRank(int rank);
        void showRankList();
        void getTopRunner();
        void importFile(String fileName);
    }

    public interface adminInterface {
        void saveFileByName(String fileName);
        void loadFileByName(String fileName);
        void addStudentData();
        void removeStudentData(Long rollNum);
        void editStudentData(Long rollNum);
        void importFile(String fileName);
        void exportFile(String fileName);
    }
}
