/**
 * 
 */
package io.atmecs.springbootstarter.mongodb.status;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author ruchira.more
 *
 */
public interface StatusRepository extends MongoRepository<Status,String> {

	//public List<Status> findByName(String name);
	
}
