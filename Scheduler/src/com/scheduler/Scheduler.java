package com.scheduler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Scheduler {

	static ArrayList<Job> jobs = new ArrayList<Job>();
	static Comparator job_comparator =new JobComparator(); 

	static long total_completion_time=0;
	static long completion_time=0;
	public static void main(String args[]){
		
		try {
			FileReader file_reader = new FileReader("src/jobs.txt");
			BufferedReader buff_reader =new BufferedReader(file_reader);
			
			String line;
			
			while((line = buff_reader.readLine())!=null){
				
				Job job = new Job();
				String[] split = line.split(" ");
				job.setWeight(Long.parseLong(split[0]));
				job.setLength(Long.parseLong(split[1]));
			    job.setScore(job.getWeight()- job.getLength());
			    
			    jobs.add(job);
			}
	
			Collections.sort(jobs,job_comparator);
			Collections.reverse(jobs);
			
			for(Job job:jobs){
				completion_time += job.getLength();
				job.setCompletion_time(completion_time);
				total_completion_time += job.getWeight()*job.getCompletion_time();
				
				System.out.println("Score : "+ job.getScore()+" Weight : "+job.getWeight() +"Completion Time :"+job.getCompletion_time()+" Total :"+total_completion_time);
			}
			
			System.out.println("Overall Total :"+total_completion_time);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
