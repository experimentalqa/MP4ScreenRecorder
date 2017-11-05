package com.exprimentalqa.recordingdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.exprimentalqa.listeners.TestListener;

@Listeners(TestListener.class)
public class RecordingTest {

	private final Logger logger = LoggerFactory.getLogger(RecordingTest.class);

	@AfterTest
	public void afterTest() {
		
	}
	
	@Test
	public void test1() {
		logger.info("start 1");
		try {
			//let's wait for 10 second, to get enough recording
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			logger.error(e.getMessage());
		}
		logger.info("end of test 1");
	}

	@Test
	public void test2() {
		logger.info("start test 2");
		try {
			//let's wait for 10 second, to get enough recording
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			logger.error(e.getMessage());
		}
		logger.info("end of test 2");
	}
}
