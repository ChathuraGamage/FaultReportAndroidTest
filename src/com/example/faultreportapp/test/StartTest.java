package com.example.faultreportapp.test;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

import com.example.faultreportapp.Faultpage;
import com.example.faultreportapp.Incidentpage;
import com.example.faultreportapp.Start;
import com.jayway.android.robotium.solo.Solo;

import junit.framework.TestCase;


public class StartTest extends ActivityInstrumentationTestCase2<Start>  {
	
	public StartTest() {
		super(Start.class);
		
	}
	private Solo solo;

	protected void setUp() throws Exception {
		solo = new Solo(getInstrumentation(),getActivity());
	}
	
	public void testNavigationToIncidentPage() throws InterruptedException{
		Activity current = solo.getCurrentActivity();
		solo.clickOnButton("Incident Going On");	
		current = solo.getActivityMonitor().waitForActivity();
		Class cu = current.getClass();
		assertEquals(Incidentpage.class, cu);
		
		
	}
	
	public void testNavigationToFaultPage() throws InterruptedException{
		Activity current = solo.getCurrentActivity();
		/*solo.clickOnButton("Incident Going On");	
		current = solo.getActivityMonitor().waitForActivity();
		Class cu = current.getClass();
		assertEquals(Incidentpage.class, cu);*/
		
		solo.clickOnButton("Fault within University");	
		current = solo.getActivityMonitor().waitForActivity();
		Class cu = current.getClass();
		assertEquals(Faultpage.class, cu);
		
	}
	
	

	protected void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}

}
