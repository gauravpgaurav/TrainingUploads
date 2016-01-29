package com.training.domains;

import com.training.ifaces.Automobileable;

public class NewShowRoom extends ShowRoom{
	
	@Override
	public Automobileable getItem(int key)
	{
		if(key==4)
				return new SportsBike();
		else
				return super.getItem(key);
			
	
	}

}
