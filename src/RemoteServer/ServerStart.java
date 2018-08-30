package RemoteServer;

import cn.RPCServer.HelloService;
import cn.RPCServer.HelloServiceImpl;
import hdu.Myserver.Server;

/**
 * Created by GEKL on 2018/8/28.
 */
public class ServerStart {
    public static void main(String args[]) throws Exception{
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Server server = new Server();
                    server.register(HelloService.class, HelloServiceImpl.class);
                    server.start();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }).start();
    }
}
