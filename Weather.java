
public class Weather
{
	private double tempF;           //between -50 and 150
	private double windSpeed;  		//always <=0
	public double windChill;
	public boolean sever;

	//getter & setter
	public void setT(double n)
	{
		if(n<-50 || n>150)
			tempF=0;
		else
			tempF=n;
	}

	public double getT()
	{
		return tempF;
	}


	public void setV(double n)
	{
		if(n<0)
			windChill=0;
		else
			windChill =n;
	}

	public double getV()
	{
		return windChill;
	}

	//Constructor
	Weather()
		{
			
			if ( getT() < -15 )
				this.sever=true;
			else
				this.sever=false;

			tempF=0;
			windSpeed=0;

			this.windChill =35.74+0.6215*getT()-Math.pow(35.75 * getV(),0.16) + 0.4275 * getT()*Math.pow(getV(),0.16);
		}

	/**
	 * 	Weather overloaded constructor
 	 * @param tempF
	 * @param windSpeed
	 */

	//Overloaded Constructor
	Weather( double tempF, double windSpeed)
	{
		setV(windSpeed);
		setT(tempF);
		
		if (getT() < -15 )
				this.sever=true;
			else
				this.sever=false;

				this.windChill = 35.74 + 0.6215 * getT() - Math.pow(35.75 * getV(),0.16)+0.4275*getT()*Math.pow(getV(),0.16);

	}

	//overloaded toString
	public String toString()
	{
		String a="Current Temperature is "+getT()+" F. Feels Like "+getT()+" F and Wind Speed is "+getV()+" mph";
		return a;
	}
}
