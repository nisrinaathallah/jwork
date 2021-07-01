package nisrinaathallah.jwork.controller;

/**
 * @author Nisrina Athallah - 1806148813
 * @version 27 - 06 -2021
 */

import nisrinaathallah.jwork.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

/**
 * insiasi class Job Controller
 */
@RequestMapping("/job")
@RestController
public class JobController {

    /**
     * method getter untuk semua job
     * @return semua job
     */
    @RequestMapping("")
    public ArrayList<Job> getAllJob(){
        return DatabaseJob.getJobDatabase();
    }

    /**
     * method getter menggunakan id
     * @param id
     * @return job dengan id yang sesuai
     */
    @RequestMapping("/{id}")
    public Job getJobById(@PathVariable int id) {
        Job js = null;
        try {
            js = DatabaseJob.getJobById(id);
        } catch (JobnotFoundException e) {
            e.getMessage();
            return null;
        }
        return js;
    }

    /**
     * method getter dengan id recruiter
     * @param recruiterId
     * @return job dengan recruiter id yang sesuai
     */
    @RequestMapping(value = "/recruiter/{recruiterId}", method = RequestMethod.GET)
    public ArrayList<Job> getJobByRecruiter(@PathVariable int recruiterId) {
        return DatabaseJob.getJobByRecruiter(recruiterId);
    }

    /**
     * method getter dengan kategori
     * @param category
     * @return job dengan kategori yang sesuai
     */
    @RequestMapping(value = "/category/{category}", method = RequestMethod.GET)
    public ArrayList<Job> getJobByCategory(@PathVariable JobCategory category) {
        return DatabaseJob.getJobByCategory(category);
    }

    /**
     * method untuk menambahkan job
     * @param name nama pekerjaan
     * @param fee bonus
     * @param category kategori job
     * @param recruiterId
     * @return job yang telah dibuat
     * @throws RecruiterNotFoundException
     */
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

