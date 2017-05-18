package com.meetups.dao;
import java.util.List;

import com.meetups.model.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
@ComponentScan("com.meetups")
@Repository
public interface MeetUpDao {
 void addMeetUp(MeetUpAdd meetUpAdd); 
 List<MeetUpAdd> viewMeetUps();
 void update(MeetUpAdd meetupadd);
 List<MeetUpAdd> viewUserByName(String presenter);
  void deleteTechtalk(int id);
}
