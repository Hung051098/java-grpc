package vn.com.hung.java_grpc;

import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vn.com.hung.java_grpc.service.BankImpl;

import java.io.IOException;

//@SpringBootApplication
public class JavaGrpcApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(JavaGrpcApplication.class, args);
//	}

    public static void main(String[] args) throws Exception {
        var server = ServerBuilder.forPort(6565)
                .addService(new BankImpl())
                .build();
        server.start();
        server.awaitTermination();
    }
}
