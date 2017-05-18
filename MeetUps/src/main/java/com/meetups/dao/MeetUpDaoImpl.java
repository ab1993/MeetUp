package com.meetups.dao;
import java.util.List;

import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.meetups.model.MeetUpAdd;
@Transactional
@Repository(value="meetUpDao")
public class MeetUpDaoImpl implements MeetUpDao {
	@Autowired
	SessionFactory sessionFactory;
	public void addMeetUp(MeetUpAdd meetupadd) {
		  Session session=sessionFactory.getCurrentSession();
		  //user.setTechnical_capability("Java Specialist");
		  session.save(meetupadd);
		 System.out.println("meetup added successfully");
	}
	public List<MeetUpAdd> viewMeetUps() {
		Session session=sessionFactory.getCurrentSession();
		
		  @SuppressWarnings("unchecked")
		List<MeetUpAdd> list=session.createCriteria(MeetUpAdd.class).list();
		
		return list;
	}
	public void update(MeetUpAdd meetupadd) {
		Session session=sessionFactory.getCurrentSession();
		session.update(meetupadd);
		
	}
 /* public MeetUpAdd viewUserByName(String presenter) {
		
		Session session=sessionFactory.getCurrentSession();
		MeetUpAdd meetUpAdd=(MeetUpAdd)session.get(MeetUpAdd.class, presenter);
		return meetUpAdd;
	}*/
 /* public MeetUpAdd viewUserByName(String presenter) {
      
      
      String hql = "select m from meetupadd m where m.presenter=:name";
      return (MeetUpAdd) sessionFactory.getCurrentSession().createQuery(hql)
              .setParameter("name", presenter).uniqueResult();
  }*/
	public List<MeetUpAdd> viewUserByName(String presenter) {

		String hql = "select m from MeetUpAdd m where m.presenter=:presenter";

		@SuppressWarnings("unchecked")
		List<MeetUpAdd> meetUp = sessionFactory.getCurrentSession().createQuery(hql).setParameter("presenter", presenter).list();


		return meetUp;
		}
		
	  public void deleteTechtalk(int id) {
        Session session=sessionFactory.getCurrentSession();
        MeetUpAdd tech=(MeetUpAdd)session.get(MeetUpAdd.class,new Integer(id));
        session.delete(tech);
        
    }
}
