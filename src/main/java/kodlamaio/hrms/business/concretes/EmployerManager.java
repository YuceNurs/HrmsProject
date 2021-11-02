package hrms.demo.business.concretes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hrms.demo.business.abstracts.EmployerService;
import hrms.demo.business.validation.EmployerValidatorService;
import hrms.demo.core.utilities.business.Business;
import hrms.demo.core.utilities.results.DataResult;
import hrms.demo.core.utilities.results.Result;
import hrms.demo.core.utilities.results.SuccessDataResult;
import hrms.demo.core.utilities.results.SuccessResult;
import hrms.demo.dataAccess.abstracts.EmployerDao;
import hrms.demo.dataAccess.abstracts.UserDao;
import hrms.demo.entities.concretes.Employer;
@Service
public class EmployerManager extends UserManager<Employer> implements EmployerService {
	
	private EmployerValidatorService employerValidatorService;
	
	
    @Autowired
	public EmployerManager(UserDao<Employer> userDao, EmployerValidatorService employerValidatorService) {
    	super(userDao);
		this.employerValidatorService = employerValidatorService;
	}


	@Override
	public Result add(Employer employer) {
		 Result result = Business.run(employerValidatorService.employerNullCheck(employer),
	                employerValidatorService.isEmailDomainCheck(employer));
	        if (result.isSuccess()) {
	            return super.add(employer);
	        }
	        
	        return result;
		
	}

}
