package demo.service;

import org.springframework.stereotype.Service;

@Service("aspectDemo")
public class AspectDemo {
	public void log(){
		System.out.println("-------------------------------");
	}
}
