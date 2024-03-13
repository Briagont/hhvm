/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.basic;

import java.util.*;

public class FB303ServiceReactiveBlockingWrapper 
  implements FB303Service {
  private final FB303Service.Reactive _delegate;

  public FB303ServiceReactiveBlockingWrapper(FB303Service.Reactive _delegate) {
    
    this._delegate = _delegate;
  }

  public FB303ServiceReactiveBlockingWrapper(org.apache.thrift.ProtocolId _protocolId, reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient, Map<String, String> _headers, Map<String, String> _persistentHeaders) {
    this(new FB303ServiceReactiveClient(_protocolId, _rpcClient, _headers, _persistentHeaders));
  }

  @java.lang.Override
  public void close() {
    _delegate.dispose();
  }

  @java.lang.Override
  public test.fixtures.basic.ReservedKeyword simpleRpc( final int intParameter) throws org.apache.thrift.TException {
      return simpleRpcWrapper(intParameter, com.facebook.thrift.client.RpcOptions.EMPTY).getData();
  }

  @java.lang.Override
  public test.fixtures.basic.ReservedKeyword simpleRpc(
        final int intParameter,
        com.facebook.thrift.client.RpcOptions rpcOptions) throws org.apache.thrift.TException {
      return simpleRpcWrapper(intParameter,rpcOptions).getData();
  }

  @java.lang.Override
  public com.facebook.thrift.client.ResponseWrapper<test.fixtures.basic.ReservedKeyword> simpleRpcWrapper(
    final int intParameter,
    com.facebook.thrift.client.RpcOptions rpcOptions) throws org.apache.thrift.TException {
      try {
        return _delegate.simpleRpcWrapper(intParameter, rpcOptions).block();
      } catch (Throwable t) {
        throw com.facebook.thrift.util.ExceptionUtil.wrap(t);
      }
  }

}