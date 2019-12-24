# Yazılım Mimarisi Ve Tasarım Ödevi

# Facade Design Patern(Ön Yüz Tasarım Deseni)

Bu tasarım deseninde , arka planda çalışan işlemlerin hiç biri kullanıcıya gösterilmez. Bu diagramda arka planda çalışan işlemlerin kullanıcı girdisine göre çalıştırılabilmesi için bir ara sınıf oluşturulur.Main fonksiyonundan gelen isteklere göre bu ara sınıf arka plandaki istenilen işlemleri gerçekleştirir

## Sınıf Diagramı

![Factory Disagn](https://github.com/Serhatcck/Factory-Design/blob/master/FactoryDesignClass.PNG)
Interaface sınıfımızın yapısı şu şekildedir
   ```java
public interface RouterOperation{  
    public void StartOperation();  
}
```
   Interface sınıfından türeyen sınıflar 'StartOperation' metodunu kendi özelliklerine göre çalıştırırlar. Örnek bir alt sınıf yapısı:
   ```java

public class Configuration implements RouterOperations{  
    @Override  
  public void StartOperation() {  
        System.out.println("Router is configured");  
    }  
}
```

Ara sınıf oluşturulurken arkaplandaki tüm sınıfları ,Yapıcı Metotu ile oluşturur , yani ara sınıf oluşturulurken arkaplandaki tüm sınıflar da aynı anda oluşur.
   ```java
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
    {configurtaion.StartOperation();}  
    public void OperationStart()  
    {start.StartOperation();}  
    public void OperationShutDown()  
    { shutDown.StartOperation(); }  
}
```

Main sınıfımızda ise arasınıf oluşturulur ve tüm işlemler o ara sınıf üzerinde gerçekleştirilir:
   ```java
public class FacaPaternDemo {  
    public static void main(String[] args)  
    {  
        CreateRouterOperations createRouterOperations = new CreateRouterOperations();  
        createRouterOperations.OperationStart();  
        createRouterOperations.OperationConfig();  
        createRouterOperations.OperationShutDown();  
    }  
}
```
