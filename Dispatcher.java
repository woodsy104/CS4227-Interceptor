import java.util.ArrayList;

public class Dispatcher {
    ArrayList<Interceptor> interceptors = new ArrayList<Interceptor>();
    public void registerInterceptor(Interceptor x){
        interceptors.add(x);
    }
    public void removeInterceptor(Interceptor x){
        interceptors.remove(x);
    }
    public void dispatch(ContextObject obj){
        for(Interceptor interceptor : interceptors){
                    interceptor.intercept(obj);
                 }
    }
}
