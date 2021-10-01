package mattress_factory_state_pattern;

class Context 
{
    private State currentState;
  
    public Context() 
    {
        currentState = new StartFactory();
    }
  
    public void setState(State state) 
    {
        currentState = state;
    }
  
    public void alert() 
    {
        currentState.alert(this);
    }
}
