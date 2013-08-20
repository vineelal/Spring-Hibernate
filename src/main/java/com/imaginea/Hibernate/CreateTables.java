package com.imaginea.Hibernate;

import org.hibernate.Session;

import com.imaginea.Persistence.HibernateUtil;

public class CreateTables {
	public void createTables() {
		String[] balls = { "Catch", "Runout", "LBW", "Bowled", "Stumped" };
		String[] bats = { "Its a dot ball", "hits a single", "Scored two runs",
				"scored Three runs!!!", "hits a four!!!", "hits a six!!!" };
		String[] batsmen1 = { "Sachin Tendulkar", "Mahendra Singh Dhoni",
				"Virat Kohli", "Virender Sehwag", "Yuvraj Singh",
				"Gautam Gambhir", "Suresh Raina", "Harbhajan Singh",
				"Ravichandran Ashwin", "Zaheer Khan" };
		String[] batsmen2 = { "Shahid Afridi", "Saeed Ajmal",
				"Mohammad Hafeez", "Misbah-ul-Haq", "Umar Gul",
				"Kamran Akmal", "Younus Khan", "Shoaib Malik",
				"Umar Akmal", "Abdul Razzaq" };
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		for (int i = 0; i < 5; i++) {
			BallResults ball = new BallResults();
			ball.setBallScore(i);
			ball.setResult(balls[i]);
			session.save(ball);
		}
		session.getTransaction().commit();
		session.close();

		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		for (int i = 0; i < 6; i++) {
			BatResults bat = new BatResults();
			bat.setBatScore(i);
			bat.setResult(bats[i]);
			session.save(bat);
		}
		session.getTransaction().commit();
		session.close();

		 session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		for (int i = 0; i < 10; i++) {
			Team1 team1 = new Team1();
			team1.setRuns(0);
			team1.setBatsmen(batsmen1[i]);
			session.save(team1);
		}
		session.getTransaction().commit();
		session.close();
		
		 session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		for (int i = 0; i < 10; i++) {
			Team2 team2 = new Team2();
			team2.setRuns(0);
			team2.setBatsmen(batsmen2[i]);
			session.save(team2);
		}
		session.getTransaction().commit();
		session.close();

		System.out.println("Done");

	}
}
