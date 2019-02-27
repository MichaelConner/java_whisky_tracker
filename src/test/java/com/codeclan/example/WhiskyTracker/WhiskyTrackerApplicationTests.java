package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	WhiskyRepository whiskyRepository;

	@Autowired
	DistilleryRepository distilleryRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canFindWhiskyByYear(){
		List<Whisky> found = whiskyRepository.getWhiskyByYear(2018);
	}

	@Test
	public void canFindDistilleryByRegion(){
		List<Distillery> found = distilleryRepository.getDistilleryByRegion("Speyside");
	}

	@Test
	public void findWhiskyThatHasADistilleryAndAge(){
		List<Whisky> found = whiskyRepository.findWhiskyThatHasADistilleryAndAge("Macallan", 25);
	}

	@Test
	public void findWhiskyByRegion(){
		List<Whisky> found = whiskyRepository.getWhiskyByRegion("Highland");
	}

	@Test
	public void findDistilleryByWhiskyAge(){
		List<Distillery> found = distilleryRepository.getDistilleryByWhiskyAge(12);
	}

}
