package hrms.demo.business.abstracts;

import java.util.List;

import hrms.demo.core.utilities.results.DataResult;
import hrms.demo.core.utilities.results.Result;
import hrms.demo.entities.abstracts.User;

public interface UserService <T extends User>{
	
	DataResult<List<T>> getAll();
    Result add(T t);
    
}
