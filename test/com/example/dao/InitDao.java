package com.example.dao;

import java.sql.Connection;

import com.cmwebgame.dao.BaseDao;
import com.example.connection.ConnectionManager;

public class InitDao<E> extends BaseDao<E> {

	@Override
	protected Connection getConnection() {
		// TODO Auto-generated method stub
		if(super.connection == null){
			super.connection = ConnectionManager.getConnection();
		}
		return super.connection;
	}
	
	@Override
	public void setConnection(Connection connection) {
		// TODO Auto-generated method stub
		super.connection = connection;
	}

}
