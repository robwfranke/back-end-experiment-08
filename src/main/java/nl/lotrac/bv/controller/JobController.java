package nl.lotrac.bv.controller;


import nl.lotrac.bv.service.JobService;
import nl.lotrac.bv.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge=3600)
@RestController
@RequestMapping(value = "/jobs")



public class JobController {

@Autowired
//    private OrderService orderService;
private JobService jobService;


@GetMapping(value="")
    public ResponseEntity<Object>getJobs(){

    return ResponseEntity.ok().body(jobService.getJobs());
}



}
