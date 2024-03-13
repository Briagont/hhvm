#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

import folly.iobuf as _fbthrift_iobuf
import thrift.py3.types
import thrift.py3.client
import thrift.py3.common
import typing as _typing
from types import TracebackType

import module.types as _module_types


_AT = _typing.TypeVar('_AT', bound='A')


class A(thrift.py3.client.Client):

    async def foo(
        self,
        rpc_options: _typing.Optional[thrift.py3.common.RpcOptions]=None
    ) -> _module_types.Foo: ...

    def createI(self) -> A_I: ...

_A_I = _typing.TypeVar('_A_I', bound='A_I')


class A_I(thrift.py3.client.Client):

    async def interact(
        self,
        rpc_options: _typing.Optional[thrift.py3.common.RpcOptions]=None
    ) -> None: ...



_BT = _typing.TypeVar('_BT', bound='B')


class B(A):

    async def bar(
        self,
        foo: _module_types.Foo,
        rpc_options: _typing.Optional[thrift.py3.common.RpcOptions]=None
    ) -> None: ...

    async def stream_stuff(
        self,
        rpc_options: _typing.Optional[thrift.py3.common.RpcOptions]=None
    ) -> _module_types.ClientBufferedStream__i32: ...



_CT = _typing.TypeVar('_CT', bound='C')


class C(thrift.py3.client.Client):

    def createI(self) -> C_I: ...

_C_I = _typing.TypeVar('_C_I', bound='C_I')


class C_I(thrift.py3.client.Client):

    async def interact(
        self,
        rpc_options: _typing.Optional[thrift.py3.common.RpcOptions]=None
    ) -> None: ...
