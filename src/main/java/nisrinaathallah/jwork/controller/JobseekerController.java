/**
 * @author Nisrina Athallah - 1806148813
 * @version 27 - 06 -2021
 */

package nisrinaathallah.jwork.controller;

import nisrinaathallah.jwork.*;
import org.springframework.web.bind.annotation.*;

/**
 * insiasi class Jobseeker Controller
 */
@RequestMapping("/jobseeker")
@RestController
public class JobseekerController {

    /**
     * method getter jobseeker dengan nama
     * @param name pada Jobseeker Controller
     * @return jobseeker dengan nama yang sesuai
     */
    @RequestMapping("")
    public String indexPage(@RequestParam(value="name", defaultValue="world") String name) {
        return "Hello " + name;
    }

    /**
     * method getter jobseeker dengan id
     * @param id pada Jobseeker Controller
     * @return jobseeker dengan id yang sesuai
     */
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

    /**
     * method untuk melakukan regist
     * @param name pada Jobseeker Controller
     * @param email pada Jobseeker Controller
     * @param password pada Jobseeker Controller
     * @return jobseeker yang telah regist
     */
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

    /**
     * method untuk melakukan login
     * @param email pada Jobseeker Controller
     * @param password pada Jobseeker Controller
     * @return jobseeker yang telah login
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Jobseeker loginJobseeker(@RequestParam(value="email") String email, @RequestParam(value="password") String password)
    {
        Jobseeker jobseeker = DatabaseJobseekerPostgre.getJobseekerLogin(email,password);
        return jobseeker;
    }
}