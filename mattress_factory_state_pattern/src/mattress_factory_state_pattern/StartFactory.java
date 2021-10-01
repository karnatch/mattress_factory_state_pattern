package mattress_factory_state_pattern;


class StartFactory implements State 
{
    public void alert(Context context) 
    {
         System.out.println("!!! Mattress factory operations started !!!");
    }
  
}
  