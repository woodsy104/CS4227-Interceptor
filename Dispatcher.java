public interface Dispatcher {
    public void registerInterceptor(Interceptor x);
    public void removeInterceptor(Interceptor x);
    public void notifyInterceptors(ContextObj contextObj);
}
