package com.journaldev.jackson.model;

import java.util.List;

public class SimpleObject{
    public String userName;
    public String role;
    public String department;
    public List<String> argumentsList;
    

    @Override
	public String toString() {
		return "SimpleObject [userName=" + userName + ", role=" + role + ", department=" + department
				+ ", argumentsList=" + argumentsList + "]";
	}

}
