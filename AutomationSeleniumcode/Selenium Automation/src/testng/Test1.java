package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
@Test (invocationCount = 2)
public void calls() {
	Reporter.log("calls",true);
}
@Test (priority = -1)
public void settings() {
	Reporter.log("calls",true);
}
@Test  (priority = -1, enabled=false)
public void chats() {
	Reporter.log("calls",true);
}
}