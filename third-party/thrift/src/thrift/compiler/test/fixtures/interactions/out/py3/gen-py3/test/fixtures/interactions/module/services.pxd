#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

from thrift.py3.server cimport ServiceInterface


cdef class MyServiceInterface(ServiceInterface):
    # these are to avoid weird Cython multiple inheritance issue
    cdef bint _for_cython_foo
    cdef bint _for_cython_interact
    cdef bint _for_cython_interactFast
    cdef bint _for_cython_serialize
    pass
