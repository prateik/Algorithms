package com.scheduler;

import java.util.Comparator;

public class JobComparator implements Comparator<Job> {

	@Override
	public int compare(Job job_1, Job job_2) {
	      if(job_1.getScore()!=job_2.getScore()) return (int)(job_1.getScore() - job_2.getScore());
	
	      else{
	    	  
	    	  return (int)(job_1.getWeight()-job_2.getWeight());
	      }
	}

	
}
