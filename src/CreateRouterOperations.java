public class CreateRouterOperations {
    private Configuration configurtaion;
    private Start start;
    private ShutDown shutDown;

    public CreateRouterOperations()
    {
        configurtaion = new Configuration();
        start = new Start();
        shutDown = new ShutDown();
    }
    public void OperationConfig()
    {
        configurtaion.StartOperation();
    }

    public void OperationStart()
    {
        start.StartOperation();
    }
    public void OperationShutDown()
    {
        shutDown.StartOperation();
    }
}
