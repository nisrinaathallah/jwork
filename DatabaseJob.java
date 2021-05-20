package nisrinaathallah.jwork;

/**
 * @author: Nisrina Athallah - 1806148813
 * @version: Modul 8 - Case Study - 20 Mei 2021
 */

import java.util.ArrayList;

public class DatabaseJob
{
    // Mendefinisikan variabel
    private static ArrayList<Job> JOB_DATABASE = new ArrayList<Job>();
    private static int lastId = 0;

    /**
     * getter objek Database Job
     * @return nilai null
     */

    public static ArrayList<Job> getJobDatabase(){
        return JOB_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Job getJobById(int id) throws JobNotFoundException {
        Job val = null;
        try
        {
            for (Job job : JOB_DATABASE)
            {
                if (id == job.getId())
                {
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

    public ArrayList<Job> getJobByRecruiter(int recruiterId){
        ArrayList<Job> temp = new ArrayList<>();
        for (int i=0; i < JOB_DATABASE.size(); i++) {
            if(JOB_DATABASE.get(i).getRecruiter().getId() == recruiterId){
                temp.add(JOB_DATABASE.get(i));
                return temp;
            }
        }
        return null;
    }

    public ArrayList<Job> getJobByCategory(JobCategory category){
        ArrayList<Job> temp = new ArrayList<>();
        for (int i=0; i < JOB_DATABASE.size(); i++) {
            if(JOB_DATABASE.get(i).getCategory() == category){
                temp.add(JOB_DATABASE.get(i));
                return temp;
            }
        }
        return null;
    }

    public static boolean addJob(Job job){
        JOB_DATABASE.add(job);
        lastId = job.getId();
        return true;
    }

    public static boolean removeJob(int id) throws JobNotFoundException
    {
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