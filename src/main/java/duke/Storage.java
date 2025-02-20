package duke;

import java.io.*;
import java.util.ArrayList;

/**
 * Contains methods to write the current tasks state to disk.
 * 
 * @author Siau Wee
 */
public class Storage {

    private static File saveFile;

    static {
        try {
            Storage.saveFile = createSaveDirectory();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }

    /**
     * Returns the present working directory of the program.
     * @return Present working directory in absolute path form
     */
    public static String getPresentWorkingDirectory() {
        return new File("").getAbsolutePath();
    }

    /**
     * Creates a directory for the output file to be saved in.
     * @return The directory created in which the output file is saved.
     * @throws IOException If the path cannot be found.
     */
    public static File createSaveDirectory() throws IOException {
        try {
            String path = Storage.getPresentWorkingDirectory() +
                    File.separator + "data";
            File dir = new File(path);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            File saveFile = new File(path + File.separator + "duketasks.txt");
            saveFile.createNewFile();
            return saveFile;
        } catch (IOException e) {
            throw e;
        }
    }
    
    /**
     * Saves the current task array to the output file.
     * @param tasks Current array of tasks
     */
    public static void saveToDirectory(ArrayList<Task> tasks) {
        try {
            PrintWriter printWriter = new PrintWriter(saveFile);
            tasks.forEach(task -> printWriter.write(task.toString() + "\n"));
            printWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Load, if it exists, the saved task file from disk
     * @return List of tasks that were saved to disk
     * @throws IOException If errors occur in opening or locating the save file
     */
    public static ArrayList<Task> loadFromDirectory() throws IOException {
        String path = Storage.getPresentWorkingDirectory() +
                File.separator + "data";
        File dir = new File(path);
        if (!dir.exists()) {
            return new ArrayList<>();
        }
        File saveFile = new File(path + File.separator + "duketasks.txt");
        ArrayList<Task> loadedTasks = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(saveFile));
        String lineFromFile;
        while ((lineFromFile = bufferedReader.readLine()) != null) {
            Task loadedTask = Parser.parseLoadedTask(lineFromFile);
            loadedTasks.add(loadedTask);
        }
        return loadedTasks;
    }
}
