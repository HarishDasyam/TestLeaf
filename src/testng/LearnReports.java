package testng;
/*
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnReports {
	@Test
	public void name() throws IOException {
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(false);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);

		ExtentTest logger = extent.createTest("TC002_MergeLead", "Create a New Lead");
		logger.assignAuthor("sarath");
		logger.assignCategory("smoke");
		
		logger.log(Status.PASS, "The Data DemoSalesManager Entered Successfully"
		, MediaEntityBuilder.createScreenCaptureFromPath("./snaps/img1.png").build());

		logger.log(Status.PASS, "The Data crmsfa Entered Successfully"
		, MediaEntityBuilder.createScreenCaptureFromPath("./snaps/img2.png").build());

		logger.log(Status.PASS, "The Login Button Clicked Successfully"
		, MediaEntityBuilder.createScreenCaptureFromPath("./snaps/img3.png").build());

		extent.flush();
		

	}


}*/