package com.mini.proj.spring.model;

public class StockData {

	private String symbol;
	private String companyName;

	public StockData() {
	}

	public StockData(String symbol, String companyName) {
		this.symbol = symbol;
		this.companyName = companyName;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
