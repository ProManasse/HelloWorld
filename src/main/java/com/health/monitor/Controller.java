package com.health.monitor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/HelloWorld")
public class Controller {
	@GetMapping("/")
	public ResponseEntity<?> getMyFriends(){
		return new ResponseEntity<String>("Hello Hello",HttpStatus.OK);
	}
}
