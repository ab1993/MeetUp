package com.meetups.dao;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.meetups.model.User;
@Transactional
@Repository(value="userDao")
public class UserDaoImpl implements UserDao{
	@Autowired
	SessionFactory sessionFactory;
	public void addUser(User user) {
		  Session session=sessionFactory.getCurrentSession();
		  //user.setTechnical_capability("Java Specialist");
		  session.save(user);
		 System.out.println("user added successfully");
	}
	public int validateUser(String email, String password) {
		int res=0;
		Session session=sessionFactory.getCurrentSession();
		Query result=session.createQuery("from User u where u.email='"+email+"'");
		  // result.setString("username",username);
		@SuppressWarnings("unchecked")
		List<User> user=result.list();
		System.out.println("user:"+user);
	if(user.size()==0)
	{
		res=0;
	}
	else
	{
		for(int i=0;i<user.size();i++)
		{
			System.out.println("inside for loop");
			String dbemail=user.get(i).getEmail();
			String dbpassword=user.get(i).getPassword();
			//String dbrole=user.get(i).getRole();
			if(dbemail.equals(email)&&dbpassword.equals(password))
			{
				res=1;
				System.out.println("the result is:"+res);
			}
			else
				if(dbemail.equals(email)&&dbpassword.equals(password))
			{
				res=2;
				System.out.println("the result  is:"+res);
			}
			}
	}	
	return res;
	}
}
