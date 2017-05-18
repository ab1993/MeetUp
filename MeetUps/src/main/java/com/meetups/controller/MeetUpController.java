package com.meetups.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.meetups.dao.*;
import com.meetups.model.*;
@RestController
public class MeetUpController {
	@Autowired
	private MeetUpDao meetUpDao;
	@RequestMapping(value="/addMeetUp", method=RequestMethod.POST,headers="Accept=application/json")
	public void addMeetUp(@RequestBody MeetUpAdd meetupadd)
	{
		System.out.println("Inside the aaddMeetUp ");
		meetUpDao.addMeetUp(meetupadd);
	}
	 @RequestMapping(value = "/getUsers", method = RequestMethod.GET, headers = "Accept=application/json")  
	 public List<MeetUpAdd> getUsers()
	 {
		 List<MeetUpAdd> meetUpAdds=meetUpDao.viewMeetUps();
		return meetUpAdds;// JAVA OBJECTS-> JACKSON
	 }
	 @RequestMapping(value="/updateMeetUp",method=RequestMethod.PUT,headers="Accept=application/json")
	 public void updateUser(@RequestBody MeetUpAdd meetupadd)
	 {
		 meetUpDao.update(meetupadd);
	 }
	 /*@ResponseBody
	 @RequestMapping(value="/getUser/{presenter}",method=RequestMethod.GET,headers="Accept=application/json")
	 public MeetUpDao getUserByName(@PathVariable("presenter") String presenter)
	 {
		 System.out.println("User name:"+presenter);
		 return (MeetUpDao) meetUpDao.viewUserByName(presenter);
	 }*/
	 @ResponseBody
	 @RequestMapping(value="/viewUserByName/{presenter}",method = RequestMethod.GET, headers="Accept=application/json")
	   public List<MeetUpAdd> viewUserByName(@PathVariable String presenter)
	   {
		 System.out.println("User name:"+presenter);
	   	return meetUpDao.viewUserByName(presenter);
	   }  
	 @RequestMapping(value="/deleteTechtalk/{id}",method=RequestMethod.DELETE,headers="Accept=application/json")
	    public void deleteTechtalk(@PathVariable int id)
	    {
	        meetUpDao.deleteTechtalk(id);
	    }
}
