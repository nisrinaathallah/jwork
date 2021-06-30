package nisrinaathallah.jwork;
import java.util.ArrayList;

/**
 * @author Nisrina Athallah - 1806148813
 * @version 27 - 06 -2021
 */

public class DatabaseJob /** inisiasi class */
{
    private static ArrayList<Job> JOB_DATABASE = new ArrayList<Job>();;
    private static int lastId = 0;

    /**
     * method getter database job
     * @return database job
     */
    public static ArrayList<Job> getJobDatabase(){
        return JOB_DATABASE;
    }

    /**
     * method getter id terakhir
     * @return id terakhir
     */
    public static int getLastId(){
        return lastId;
    }

    /**
     * method getter dengan id
     * @param id
     * @return val jika nilainya sama dengan job
     * @throws JobNotFoundException
     */
    public static Job getJobById(int id) throws JobNotFoundException {
        Job val = null;
        try {
            for (Job job : JOB_DATABASE) {
                if (id == job.getId()) {
                    val = job;
                }
            }
        }
        catch (Exception error)
        {
            throw new JobNotFoundException(id);
        }
        return val;
    }

    /**
     * method getter job dengan recruiter
     * @param recruiterId
     * @return null
     */
    public static ArrayList<Job> getJobByRecruiter(int recruiterId){
        ArrayList<Job> a = new ArrayList<>();
        for (int i = 0; i < JOB_DATABASE.size(); i++) {
            if (JOB_DATABASE.get(i).getRecruiter().getId() == recruiterId) {
                a.add(JOB_DATABASE.get(i));
                return a;
            }
        }
        return null;
    }

    /**
     * method getter job berdasarkan kategori
     * @param category
     * @return null
     */
    public static ArrayList<Job> getJobByCategory(JobCategory category){
        ArrayList<Job> a = new ArrayList<>();
        for (int i = 0; i < JOB_DATABASE.size(); i++) {
            if (JOB_DATABASE.get(i).getCategory() == category) {
                a.add(JOB_DATABASE.get(i));
                return a;
            }
        }
        return null;
    }

    /**
     * method untuk menambahkan job
     * @param job
     * @return true jika job berhasil ditambah
     */
    public static boolean addJob(Job job){
        JOB_DATABASE.add(job);
        lastId = JOB_DATABASE.size()-1;
        lastId = job.getId();
        return true;
    }

    /**
     * method untuk menghapus job
     * @param id
     * @return true jika job berhasil dihapus
     * @throws JobNotFoundException jika job tidak ditemukan
     */
    public static boolean removeJob(int id) throws JobNotFoundException{
        for (Job job : JOB_DATABASE)
        {
            if (job.getId() == id)
            {
                JOB_DATABASE.remove(job);
                return true;
            }
        }
        throw new JobNotFoundException(id);
    }
}