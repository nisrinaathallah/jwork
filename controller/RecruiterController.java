package nisrinaathallah.jwork.controller;
/**
 * @author: Nisrina Athallah - 1806148813
 * @version: Modul 8 - Case Study - 20 Mei 2021
 */

import nisrinaathallah.jwork.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/recruiter")
@RestController
public class RecruiterController {
    @RequestMapping("")
    public ArrayList<Recruiter> getAllRecruiter(){
        ArrayList<Recruiter> recruiter = null;
        recruiter = DatabaseRecruiter.getRecruiterDatabase();
        return recruiter;
    }

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
