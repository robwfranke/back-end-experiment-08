package nl.lotrac.bv.service;


import nl.lotrac.bv.model.Job;
import nl.lotrac.bv.repository.JobRepository;
import nl.lotrac.bv.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class JobServiceImpl implements JobService{

    @Autowired
    private JobRepository jobRepository;

    @Override
    public Collection<Job>getJobs(){

        return jobRepository.findAll();
    }



}
