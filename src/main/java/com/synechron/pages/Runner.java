package com.synechron.pages;

import java.io.IOException;

public class Runner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//LaunchBrowserApp lb = new LaunchBrowserApp();
		LaunchBrowserApp.launchapp("Chrome", "http://startoursus.com/India");
		
		//Screenshot ss = new Screenshot();
		Screenshot.getScreenprint();
	}

}
