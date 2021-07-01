package nisrinaathallah.jwork;
import java.util.ArrayList;

/**
 * @author Nisrina Athallah - 1806148813
 * @version 27 - 06 -2021
 */

public class DatabaseRecruiter /** inisiasi class */
{
    private static ArrayList<Recruiter> RECRUITER_DATABASE = new ArrayList<Recruiter>();;
    private static int lastId = 0;

    /**
     * method getter proyek database recruiter
     * @return database recruiter
     */
    public static ArrayList<Recruiter> getRecruiterDatabase(){
        return RECRUITER_DATABASE;
    }

    /**
     * method getter id terakhir database recruiter
     * @return id terakhir database recruiter
     */
    public static int getLastId(){
        return lastId;
    }

    /**
     * method getter recruiter dengan id
     * @param id recruiter
     * @return id recruiter
     * @throws RecruiterNotFoundException jika recruiter tidak ada
     */
    public static Recruiter getRecruiterById(int id) throws RecruiterNotFoundException {
        Recruiter val = null;
        try {
            for (Recruiter rc : RECRUITER_DATABASE) {
                if (id == rc.getId()) {
                    val = rc;
                }
            }
        }
        catch (Exception error) {
            throw new RecruiterNotFoundException(id);
        }
        return val;
    }

    /**
     * method untuk menambahkan recruiter
     * @param recruiter database
     * @return true
     */
    public static boolean addRecruiter(Recruiter recruiter){
        RECRUITER_DATABASE.add(recruiter);
        lastId += 1;
        return true;
    }

    /**
     * method untuk menghapus recruiter
     * @param id recruiter
     * @return true jika berhasil
     * @throws RecruiterNotFoundException jika sesuai
     */
    public static boolean removeRecruiter(int id) throws RecruiterNotFoundException {
        for (Recruiter rc : RECRUITER_DATABASE) {
            if (rc.getId() == id) {
                RECRUITER_DATABASE.remove(rc);
                return true;
            }
        }
        throw new RecruiterNotFoundException(id);
    }
}