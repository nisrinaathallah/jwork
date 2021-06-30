/**
 * @author Nisrina Athallah - 1806148813
 * @version 27 - 06 -2021
 */

package nisrinaathallah.jwork;
import java.util.ArrayList;

/**
 * inisiasi class Database Jobseeker
 */
public class DatabaseJobseeker {
    private static ArrayList<Jobseeker> JOBSEEKER_DATABASE = new ArrayList<Jobseeker>();
    ;
    private static int lastId = 0;

    /**
     * method getter database jobseeker
     * @return database jobseeker
     */
    public static ArrayList<Jobseeker> getDatabaseJobseeker() {
        return JOBSEEKER_DATABASE;
    }

    /**
     * method getter id terakhir
     * @return id terakhir
     */
    public static int getLastId() {
        return lastId;
    }

    /**
     * method getter jobseeker sesuai dengan id
     * @param id
     * @return jobseeker yang dicari
     * @throws JobSeekerNotFoundException
     */
    public static Jobseeker getJobseekerById(int id) throws JobseekerNotFoundException {
        Jobseeker val = null;
        for (Jobseeker js : JOBSEEKER_DATABASE)
            if (id == js.getId())
                return js;
        throw new JobseekerNotFoundException(id);
    }


    /**
     * method penambahan jobseeker
     * @param jobseeker
     * @return true jika berhasil ditambah
     * @throws EmailAlreadyExistsException
     */
    public static boolean addJobseeker(Jobseeker jobseeker) throws EmailAlreadyExistsException {
        for(Jobseeker jobseekers : JOBSEEKER_DATABASE)
            if(jobseekers.getEmail() == jobseeker.getEmail())
                throw new EmailAlreadyExistsException(jobseeker);

        JOBSEEKER_DATABASE.add(jobseeker);
        lastId = jobseeker.getId();
        return true;
    }


    /**
     * method penghapusan jobseeker
     * @param id
     * @return true jika jobseeker berhasil dihapus
     * @throws JobSeekerNotFoundException
     */
    public static boolean removeJobseeker(int id) throws JobseekerNotFoundException{
        for (Jobseeker js : JOBSEEKER_DATABASE) {
            if (js.getId() == id) {
                JOBSEEKER_DATABASE.remove(js);
                return true;
            }
        }
        throw new JobseekerNotFoundException(id);
    }

    /**
     * method untuk login jobseeker
     * @param email
     * @param password
     * @return jobseeker yang berhasil login
     */
    public static Jobseeker jobseekerLogin(String email, String password) {
        Jobseeker val = null;
        for (Jobseeker js : JOBSEEKER_DATABASE) {
            if (email.equals(js.getEmail()) && password.equals(js.getPassword())) {
                return js;
            }
        }
        return null;
    }
}