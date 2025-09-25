package vn.com.hung.java_grpc.service;

import io.grpc.stub.StreamObserver;
import vn.com.hung.grpc.service.AccountBalance;
import vn.com.hung.grpc.service.BalanceCheckRequest;
import vn.com.hung.grpc.service.BankServiceGrpc;

public class BankImpl extends BankServiceGrpc.BankServiceImplBase {
    @Override
    public void getAccountBanlance(BalanceCheckRequest request, StreamObserver<AccountBalance> responseObserver) {
        var accountNumber = request.getAccountNumber();
        var accountBalance = AccountBalance.newBuilder().setAccountNumber(accountNumber)
                .setBalance(accountNumber *10)
                .build();
        responseObserver.onNext(accountBalance);
        responseObserver.onCompleted();
    }
}
