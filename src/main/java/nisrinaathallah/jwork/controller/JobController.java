package nisrinaathallah.jwork.controller;

import nisrinaathallah.jwork.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
/**
 * @author Bryan Dario Lesmana (1806199940)
 * @version 28/06/21
 */
@RequestMapping("/job")
@RestController
public class JobController {

    @RequestMapping("")
    public ArrayList<Job> getAllJob(){
        return DatabaseJob.getJobDatabase();
    }
    @RequestMapping("/{id}")
    public Job getJobById(@PathVariable int id) {
        Job js = null;
        js = DatabaseJob.getJobById(id);
        return js;
    }

    @RequestMapping(value = "/recruiter/{recruiterId}", method = RequestMethod.GET)
    public ArrayList<Job> getJobByRecruiter(@PathVariable int recruiterId) {
        return DatabaseJob.getJobByRecruiter(recruiterId);
    }

    @RequestMapping(value = "/category/{category}", method = RequestMethod.GET)
    public ArrayList<Job> getJobByCategory(@PathVariable JobCategory category) {
        return DatabaseJob.getJobByCategory(category);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Job addJob(@RequestParam(value="name") String name,
                      @RequestParam(value="fee") int fee,
                      @RequestParam(value="category") JobCategory category,
                      @RequestParam(value="recruiter id") int recruiterId)
            throws RecruiterNotFoundException{
        Recruiter recruiter = null;
        try {
            recruiter = DatabaseRecruiter.getRecruiterById(recruiterId);
        } catch (RecruiterNotFoundException error)
        {
            throw error;
        }
        Job job = new Job(DatabaseJob.getLastId(), name, recruiter, fee, category);
        boolean success = DatabaseJob.addJob(job);

        if (success){
            return job;
        }
        else{
            return null;
        }
    }
}
