package com.imaginea.Hibernate;

import java.util.List;

import org.hibernate.Session;

import com.imaginea.Persistence.HibernateUtil;

public class Cric {
	Session session = HibernateUtil.getSessionFactory().openSession();
	
	public List returnTeam1() {
		// session.beginTransaction();
		List list = session.createQuery("from Team1").list();
//		System.out.println("the size of the team1 is "+list.size());
		return list;
	}

	public List returnTeam2() {
		List list = session.createQuery("from Team2").list();
		return list;
	}

	public List returnBallResults() {
		List list = session.createQuery("from BallResults").list();
		return list;
	}

	public List returnBatResults() {
		List list = session.createQuery("from BatResults").list();
		return list;
	}

}
