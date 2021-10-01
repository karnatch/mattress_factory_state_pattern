package mattress_factory_state_pattern;

class StopFactory implements State
{
    public void alert(Context context) 
    {
        System.out.println("!!! Mattress factory operations stopped !!!");
    }
  
}