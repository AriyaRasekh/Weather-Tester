**/
	author: Ariya Rasekh <Ariya.Rasekh@gmail.com>
*/
public class WeatherTester
{
	public static void main ( String [] args)
		{
		//instantiating two object for testing
		Weather Obj1 = new Weather();
		Weather Obj2 = new Weather( 13, 3);

		System.out.println(Obj1.toString());
		System.out.println(Obj2.toString());
		}
}







