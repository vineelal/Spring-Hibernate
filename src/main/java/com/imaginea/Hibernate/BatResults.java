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
@Table(name = "BatResults")
public class BatResults implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
//	Session session = HibernateUtil.getSessionFactory().openSession();

	@Id
	@Column(name = "batScore")
	private Integer batScore;

	@Column(name = "result")
	private String result;

	public BatResults() {
	}

	public void setBatScore(Integer batScore) {
		this.batScore = batScore;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	public String getResult() {
		return this.result;
	}
	
	public Integer getBatScore() {
		return this.batScore;
	}

	public List getResult(Integer score){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session
				.createQuery("select t.result from BatResults t where t.batScore=:score");
		query.setParameter("score", score);
		return query.list();
	}
}
