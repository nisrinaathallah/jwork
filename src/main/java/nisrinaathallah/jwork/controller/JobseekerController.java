package nisrinaathallah.jwork.controller;

import nisrinaathallah.jwork.*;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/jobseeker")
@RestController
public class JobseekerController {

    @RequestMapping("")
    public String indexPage(@RequestParam(value="name", defaultValue="world") String name) {
        return "Hello " + name;
    }

    @RequestMapping("/{id}")
    public Jobseeker getJobseekerById(@PathVariable int id) {
        Jobseeker jobseeker = null;
        try {
            jobseeker = DatabaseJobseekerPostgre.getJobseekerById(id);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return jobseeker;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Jobseeker registerJobseeker(@RequestParam(value="name") String name,
                                       @RequestParam(value="email") String email,
                                        @RequestParam(value="password") String password)
    {
        Jobseeker jobseeker = new Jobseeker(DatabaseJobseekerPostgre.getLastId()+1, name, email, password);
        try {
            DatabaseJobseekerPostgre.addJobseeker(jobseeker);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return jobseeker;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Jobseeker loginJobseeker(@RequestParam(value="email") String email, @RequestParam(value="password") String password)
    {
        Jobseeker jobseeker = DatabaseJobseekerPostgre.getJobseekerLogin(email,password);
        return jobseeker;
    }
}