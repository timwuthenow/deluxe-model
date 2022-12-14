package com.deluxedemo.deluxemodels;

import java.io.Serializable;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ComputerRequest implements Serializable {

	static final long serialVersionUID = 1L;

	private String cpu;
	private String ram;
	private String screensize;
	private String operatingSystem;
	private Double price;
	private String type;
	private String hardware;

	public ComputerRequest() {
	}

	public String getCpu() {
		return this.cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return this.ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getScreensize() {
		return this.screensize;
	}

	public void setScreensize(String screensize) {
		this.screensize = screensize;
	}

	public String getOperatingSystem() {
		return this.operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getHardware() {
		return this.hardware;
	}

	public void setHardware(String hardware) {
		this.hardware = hardware;
	}

	public ComputerRequest(String cpu, String ram,
			String screensize, String operatingSystem,
			Double price, String type,
			String hardware) {
		this.cpu = cpu;
		this.ram = ram;
		this.screensize = screensize;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.type = type;
		this.hardware = hardware;
	}

}