package MyPack;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Jobs {

	private int srNo;
	private String jobName;
	private Map<String, String> jobTypes;
	
	public Jobs() {
		super();
	}

	public Jobs(int srNo) {
		super();
		this.srNo = srNo;
	}

	public Jobs(String jobName) {
		super();
		this.jobName = jobName;
	}

	public Jobs(Map<String, String> jobTypes) {
		super();
		this.jobTypes = jobTypes;
	}

	public Jobs(int srNo, String jobName) {
		super();
		this.srNo = srNo;
		this.jobName = jobName;
	}

	public Jobs(String jobName, Map<String, String> jobTypes) {
		super();
		this.jobName = jobName;
		this.jobTypes = jobTypes;
	}

	public Jobs(int srNo, String jobName, Map<String, String> jobTypes) {
		super();
		this.srNo = srNo;
		this.jobName = jobName;
		this.jobTypes = jobTypes;
	}
	
	public void JobsInfo(){
		
		System.out.println("Serial No : "+srNo);
		System.out.println("Job Name : "+jobName);
		System.out.println("Available Jobs...");
		
		Set<Entry<String, String>> set = jobTypes.entrySet();
		
		Iterator<Entry<String, String>> itr = set.iterator();
		while(itr.hasNext()){
			
			Entry<String, String> entry = itr.next();
			System.out.println("Job : "+entry.getKey()+" "+"Posted By : "+entry.getValue());
		}
	}
}
