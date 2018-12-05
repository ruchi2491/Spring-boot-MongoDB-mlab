package io.atmecs.springbootstarter.mongodb.status;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
	
	@Autowired
	private StatusService statusservice;

	@RequestMapping(method=RequestMethod.GET,value="/status")
	public List<Status> getAllStatuses() {
		return statusservice.getAllStatuses();
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/status/{id}")
	public Status getStatus(@PathVariable String id) {
		return statusservice.getstatus(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/status")
	public Status addStatus(@RequestBody Status status) {
		return statusservice.addStatus(status);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/status/{id}")
	public Status updateStatus(@PathVariable String id,@RequestBody Status status) {
		return statusservice.updateStatus(id,status);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/status/{id}")
	public void DeleteStatus(@PathVariable String id) {
		//AppException exception=new AppException("Id is already deleted");
		statusservice.deleteStatus(id);
		
	}
}
