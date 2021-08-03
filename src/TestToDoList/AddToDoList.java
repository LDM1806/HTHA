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
		
		//Navigate to the website
	
		driver.get("https://todomvc.com/examples/react/#");
		Thread.sleep(1000);
		
	   	//Add ToDos and verify if items have been saved
		todos.ToDoItem1("Download");				
		todos.ToDoItem2("Install");
		todos.ToDoItem3("Run");
		todos.ToDoItem4("Test");
		
		//Validate todos count
		todos.ToDoCount();
		
		// Wait for items to be listed
		Thread.sleep(1000);
		
		//Update a todos item
		todos.UpdateTodoItem();
		Thread.sleep(1000);
				
		//Complete an item
		todos.CompleteAToDoItem();
		
		//Verify if the completed item is in the Completed list
		todos.FilterCompleted();	
		Thread.sleep(1000);
		
		//Clear the completed item
		todos.ClearCompletedItems();
		Thread.sleep(1000);
		
		//Filter Active todos
		todos.Activetodos();
		Thread.sleep(1000);
		
		//View left todo items
		todos.FilterAllItems();
		Thread.sleep(1000);
		
		//Delete an item and verify todos left count
		todos.DeleteToDoItem();
	
		//driver.quit();
		
	}

}
