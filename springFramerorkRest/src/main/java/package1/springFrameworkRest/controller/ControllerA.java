package package1.springFrameworkRest.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import package1.springFrameworkRest.model.TestingRest;

@RestController
public class ControllerA {

	@RequestMapping(value = "/academy", method = RequestMethod.POST)
	public String academy() {
		return "helo tuuta";
	}
	
	@RequestMapping(value = "/schoolTime", method = RequestMethod.GET)
	public TestingRest fees() {
		TestingRest testingRest = new TestingRest (11, "Ruth", 9);
		return testingRest;
	}
	
	@RequestMapping(value = "/ebilooto", method = RequestMethod.GET)
	public String dreams(@RequestBody TestingRest testingRest ) {
		return "dreams are valid";
	}
	
	@RequestMapping(value = "/thetop", method = RequestMethod.POST)
	public TestingRest stream(@RequestBody TestingRest testingRest) {
		return testingRest;
	}
	
	
	
	
}
