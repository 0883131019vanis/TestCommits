package com.beanconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samsung  {
	@Autowired
	Microprocessor cpu;
	
  public Microprocessor getCpu() {
		return cpu;
	}

	public void setCpu(Microprocessor cpu) {
		this.cpu = cpu;
	}

public void config()
  {
	  System.out.println("samsung method");
	  cpu.process();
  }
}
