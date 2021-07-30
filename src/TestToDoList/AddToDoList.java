package TestToDoList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ToDosPageObjects.PageElements;

public class AddToDoList {
	
private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		Login();
		
	}
	@Test
	public static void Login() throws InterruptedException
	
	{
		driver = new ChromeDriver();
		PageElements todos = new PageElements(driver);
	
		driver.get("https://todomvc.com/examples/react/#");
	   	
		todos.ToDoItem1("Download");		
		todos.ToDoItem2("Install");
		todos.ToDoItem3("Run");
		todos.ToDoItem4("Test");
		Thread.sleep(2000);
		todos.FilterComplete();	
		Thread.sleep(2000);
		todos.FilterAllItems();
		Thread.sleep(2000);
		todos.CompleteAToDoItem();
		todos.FilterComplete();
		
	}

}
