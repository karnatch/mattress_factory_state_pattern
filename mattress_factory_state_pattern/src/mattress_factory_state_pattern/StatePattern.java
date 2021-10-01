package mattress_factory_state_pattern;

  
class StatePattern
{
    public static void main(String[] args) 
    {
    	Context state = new Context();
    	state.alert();
    	state.setState(new StopFactory());
    	state.alert();     
    }
}
