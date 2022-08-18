package com.bankApp.controller;

import java.io.IOException;
import java.util.regex.Pattern;

import com.bankApp.model.bankModel;

public class bankController {
	//checking username
	public boolean checkUsername(bankModel bm) throws IOException {
		String username= bm.getAccHolderName();
		
		if(Pattern.matches("[a-zA-Z]{5,13}", username))
		{
			return true;
		}
		else {
			throw new IOException("username can only alphabets and digits ");
		}
	}
	//checking password
	public boolean checkPassword(bankModel bm) throws IOException {
		String password= bm.getAccPassword();
		
		if(Pattern.matches("[a-zA-Z0-9@#]{6,}",password))
		{
			return true;
		}
		else {
			throw new IOException("password can have more than 6 chars ");
		}
	}
	//checking deposit details
	public boolean toDeposit(bankModel bm,String pwd) throws IOException{
		
		String password=bm.getAccPassword();
		if(pwd.equals(password)) {
			return true;
		}
		else {
			throw new IOException("wrong password");
		}	
	}
	//checking withdraw details
	public boolean toWithdraw(bankModel bm,String pwd,int withdrawAmt) throws IOException{
		
		String password=bm.getAccPassword();
		int accbal =bm.getAccBalance();
		if(pwd.equals(password)) {
			if(accbal>withdrawAmt) {
				return true;
			}
			else {
				throw new IOException("Not Enough Balance");
			}
		}
		else {
			throw new IOException("wrong password");
		}
		
		
	}
}






