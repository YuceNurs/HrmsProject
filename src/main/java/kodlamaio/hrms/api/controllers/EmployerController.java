package hrms.demo.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import hrms.demo.business.abstracts.EmployerService;
import hrms.demo.core.utilities.results.DataResult;
import hrms.demo.core.utilities.results.Result;
import hrms.demo.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployerController {
	
private EmployerService employerService;

public EmployerController(EmployerService employerService) {
	super();
	this.employerService = employerService;
}
@PostMapping("/register") 
public Result register(@RequestBody Employer employer) {
	return this.employerService.add(employer);
}
@GetMapping("/getall")
public DataResult<List<Employer>> getAll(){
	return this.employerService.getAll();
}

}
