package com.imaginea.Hibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Query;
import org.hibernate.Session;

import com.imaginea.Persistence.HibernateUtil;

@Entity
@Table(name = "Team2")
public class Team2 implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	

	@Id
	@Column(name = "batsmen")
	private String batsmen;

	@Column(name = "runs")
	private Integer runs;

	public Team2() {
	}

	public String getBatsmen() {
		return this.batsmen;
	}

	public void setRuns(Integer batScore) {
		this.runs = batScore;
	}

	public Integer getRuns() {
		return this.runs;
	}

	public void setBatsmen(String batsmen) {
		this.batsmen = batsmen;
	}

	public List setRuns(String batsmenName,Integer runsScored) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		 Query query = session.createQuery("from Team2 where batsmen = :batsmenName ");
		 query.setParameter("batsmenName", batsmenName);
		 Team2 stockTran = (Team2)query.list().get(0);
		 stockTran.setRuns(runsScored);
		 session.update(stockTran);
//		 int result = query.executeUpdate();
//		 System.out.println("Rows affected: " + result);
		 return query.list();
		
//		Session session = HibernateUtil.getSessionFactory().openSession();
////		session.beginTransaction(); 
//		Query query = session.createQuery("update Team2 set runs = :runsScored where batsmen = :batsmenName");
//		query.setParameter("batsmenName", batsmenName);
//		query.setParameter("runsScored",runsScored);
//		int result = query.executeUpdate();
//		System.out.println("Rows affected: " + result);
//		return query.list();
	}
	
}
