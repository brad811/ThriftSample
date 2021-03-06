import org.apache.thrift.TException;

import tutorial.arithmetic.gen.ArithmeticService;

public class ArithmeticServiceImpl implements ArithmeticService.Iface
{
  public long add(int num1, int num2) throws TException
  {
  	return num1 + num2;
  }

  public long multiply(int num1, int num2) throws TException
  {
  	return num1 * num2;
  }
}
