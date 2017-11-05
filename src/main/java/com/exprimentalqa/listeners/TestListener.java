package com.exprimentalqa.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.exprimentalqa.screenrecorder.ScreenRecorder;

public class TestListener implements ITestListener {
	ScreenRecorder recordTest;
	public void onFinish(ITestContext arg0) {
		recordTest.releaseRecordingResources();
	}

	public void onStart(ITestContext arg0) {
		recordTest = new ScreenRecorder();
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		recordTest.stopRecording();
	}

	public void onTestFailure(ITestResult arg0) {
		recordTest.stopRecording();
	}

	public void onTestSkipped(ITestResult arg0) {
		recordTest.stopRecording();
	}

	public void onTestStart(ITestResult arg0) {
		recordTest.startRecording(arg0.getName());
	}

	public void onTestSuccess(ITestResult arg0) {
		recordTest.stopRecording();
	}
}
