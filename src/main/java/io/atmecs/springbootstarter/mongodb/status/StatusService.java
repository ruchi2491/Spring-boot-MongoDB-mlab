/**
 * 
 */
package io.atmecs.springbootstarter.mongodb.status;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.atmecs.springbootstarter.mongodb.exception.StatusNotFoundException;

/**
 * @author ruchira.more
 *
 */
@Service
public class StatusService {

	@Autowired
	private StatusRepository statusrepo;
	
	public List<Status> getAllStatuses(){
		List<Status> statuses=new ArrayList<>();
		statusrepo.findAll().forEach(statuses::add);
		return statuses;
	}

	public Status getstatus(String id) {
		// TODO Auto-generated method stub
		if(!statusrepo.findById(id).isPresent()) {
			throw new StatusNotFoundException("ID is not present");
		}
		Optional<Status> optinalEntity=statusrepo.findById(id);
		return optinalEntity.get();
	}

	public Status addStatus(Status status) {
		// TODO Auto-generated method stub
		statusrepo.save(status);
		return status;
	}

	public Status updateStatus(String id, Status status) {
		// TODO Auto-generated method stub
		status.setId(id);
		//statusrepo.save(status);
		return statusrepo.save(status);
	}

	public void deleteStatus(String id)  {
		try {
		statusrepo.deleteById(id);
		}catch (Exception e) {
			e=new RuntimeException("Id is already deleted");
		}
	}
}
