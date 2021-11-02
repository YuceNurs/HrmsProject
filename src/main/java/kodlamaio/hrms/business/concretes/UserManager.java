package hrms.demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.CodeGenerator;
import hrms.demo.business.abstracts.UserService;
import hrms.demo.business.constant.Messages;
import hrms.demo.core.utilities.results.DataResult;
import hrms.demo.core.utilities.results.ErrorResult;
import hrms.demo.core.utilities.results.Result;
import hrms.demo.core.utilities.results.SuccessDataResult;
import hrms.demo.core.utilities.results.SuccessResult;
import hrms.demo.dataAccess.abstracts.UserDao;
import hrms.demo.entities.abstracts.User;

@Service
public class UserManager<T extends User> implements UserService<T>{

	private final UserDao<T> userDao;
	

	@Autowired
	public UserManager(UserDao<T> userDao) {
		this.userDao = userDao;
	}
	
	public DataResult<List<T>> getAll() {
        return new SuccessDataResult<List<T>>(this.userDao.findAll(), Messages.userListed);
    }
	
	private Result isEmailExist(String email) {
        if(userDao.countUsersWithEmail(email)>0){
            return new ErrorResult(Messages.emailExist);
        }
        return new SuccessResult();
    }

	@Override
	public Result add(T t) {

		return null;
	}

}

