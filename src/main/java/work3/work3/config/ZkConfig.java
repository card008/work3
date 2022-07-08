//package work3.work3.config;
//
//import org.I0Itec.zkclient.ZkClient;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
//
//@Configuration
//@PropertySource(value = {"classpath:config/system.properties"})
//public class ZkConfig {
//    @Value(value = "${rpc.registry.address}")
//    private String zkServer;
//    @Value(value = "${zk.sessionTimeoutMs}")
//    private int sessionTimeoutMs;
//    @Value(value = "${zk.connectionTimeoutMs}")
//    private int connectionTimeoutMs;
//    @Value(value = "${zk.maxRetries}")
//    private int maxRetries;
//    @Value(value = "${zk.baseSleepTimeMs}")
//    private int baseSleepTimeMs;
//    @Autowired
//    private Environment env;
//
//    @Bean(initMethod = "init",destroyMethod = "stop")
//    public ZkClient zkClient(){
//        ZkClient zkClient = new ZkClient();
//        zkClient.setz
//    }
//}
