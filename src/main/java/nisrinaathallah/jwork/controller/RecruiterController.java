package nisrinaathallah.jwork.controller;

/**
 * @author Nisrina Athallah - 1806148813
 * @version 27 - 06 -2021
 */

import nisrinaathallah.jwork.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * insiasi class Recruiter Controller
 */
@RequestMapping("/recruiter")
@RestController
public class RecruiterController {

    /**
     * method untuk mengambil semua data recruiter
     * @return database recruiter
     */
    @RequestMapping("")
    public ArrayList<Recruiter> getAllRecruiter(){
        ArrayList<Recruiter> recruiter = null;
        recruiter = DatabaseRecruiter.getRecruiterDatabase();
        return recruiter;
    }

    /**
     * method getter recruiter dengan id
     * @param id pada Recruiter controller
     * @return recruiter dengan id yang sesuai
     */
    @RequestMapping("/{id}")
    public Recruiter getRecruiterById(@PathVariable int id) {
        Recruiter recruiter = null;
        try {
            recruiter = DatabaseRecruiter.getRecruiterById(id);
        } catch (RecruiterNotFoundException e) {
            e.getMessage();
            return null;
        }
        return recruiter;
    }

    /**
     * method untuk melakukan penambahan recruiter
     * @param name pada Recruiter controller
     * @param email pada Recruiter controller
     * @param phoneNumber pada Recruiter controller
     * @param province pada Recruiter controller
     * @param city pada Recruiter controller
     * @param description pada Recruiter controller
     * @return recruiter yang telah ditambah
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Recruiter addRecruiter(@RequestParam(value ="name") String name,
                                  @RequestParam(value ="email") String email,
                                  @RequestParam(value ="phoneNumber") String phoneNumber,
                                  @RequestParam(value ="province") String province,
                                  @RequestParam(value ="city") String city,
                                  @RequestParam(value ="description") String description){
        Location location = new Location(province, city, description);
        Recruiter recruiter = new Recruiter(DatabaseRecruiter.getLastId()+1, name, email, phoneNumber, location);

        if (DatabaseRecruiter.addRecruiter(recruiter)){
            return recruiter;
        }
        else{
            return null;
        }
    }
}
