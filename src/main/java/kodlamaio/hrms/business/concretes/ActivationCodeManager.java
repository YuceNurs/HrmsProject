package hrms.demo.business.concretes;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.time.LocalDate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.CodeGenerator;
import hrms.demo.business.constant.Messages;
import hrms.demo.core.utilities.results.DataResult;
import hrms.demo.core.utilities.results.Result;
import hrms.demo.core.utilities.results.SuccessDataResult;
import hrms.demo.core.utilities.results.SuccessResult;
import hrms.demo.dataAccess.abstracts.ActivationCodeDao;
import hrms.demo.entities.concretes.ActivationCode;

@Service
public class ActivationCodeManager {
	
	private ActivationCodeDao activationCodeDao;
	
	@Autowired 
	public ActivationCodeManager(ActivationCodeDao activationCodeDao) {
		this.activationCodeDao = activationCodeDao;
	}
	
	public DataResult<List<ActivationCode>> getAll(){
		return new SuccessDataResult<List<ActivationCode>>(this.activationCodeDao.findAll(), Messages.activationCodeListed);
	}
	
	//public Result add(ActivationCode activationCode) {
		//activationCode.setExpirationDate(LocalDateTime.now().plusMinutes(5));
		//activationCode.setUid(CodeGenerator.class);
		//setUid(CodeGenerator.generateUidCode());
		//activationCodeDao.save(activationCode);
		//return new SuccessResult(Messages.activationCodeAdded);
	//}
	public Result update(ActivationCode activationCode) {
		activationCodeDao.save(activationCode);
		return new SuccessResult(Messages.activationCodeUpdated);
	}
	//public DataResult<Optional<ActivationCode>> getByUserUui(String uid){
		//return new SuccessDataResult<Optional<ActivationCode>>(activationCodeDao.findById(id));
		

}
