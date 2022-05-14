package com.java;

public class Human {
	private Heart heart;

	//generate setter and getter method
	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	//generate method
	public void human_function()
	{
		if(heart!=null)
		{
			heart.pump();
		}
		else
		{
			System.out.println("Not Alive");
		}
	}

}
