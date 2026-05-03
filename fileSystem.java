import java.nio.file.*;

public class fileSystem {
    public static void main(String[] args) {
        Path path = Paths.get("F:/JavaPrograms/RankListFiles");
        System.out.println(path.getFileName());
        System.out.println(path.getNameCount());
        System.out.println(path.getParent());
        System.out.println(path.getRoot());
        System.out.println(path.toUri().toString());
    }
}
