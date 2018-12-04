/**
 * 
 */
package io.atmecs.springbootstarter.mongodb.status;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

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

	public Void deleteStatus(String id) {
		// TODO Auto-generated method stub
		statusrepo.deleteById(id);
		return null;
	}
}
