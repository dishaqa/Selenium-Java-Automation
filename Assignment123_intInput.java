package DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment123_intInput
{

	@Test(dataProvider="data1")
	public void TakeInteger(int input)
	{
		System.out.println(input);
	}
	@DataProvider(name = "data1")
	public Object[][] datainput()
	{
		return new Object[][] {{14},{12},{20},{5},{30}};
	}
}
