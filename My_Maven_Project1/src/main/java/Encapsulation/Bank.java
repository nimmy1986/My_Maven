package Encapsulation;

public class Bank 
{
		private int pin;

		public void validatePin()
		{
			if(pin==1001||pin==1234||pin==1212)
			{
				System.out.println("Pin is Valid");
			}
			else
			{
				System.out.println("Invalid Pin");
			}
		}

		public void setPin(int pin) 
		{
			this.pin=pin;
			validatePin();
		}

}
