
#
# Autogenerated by Thrift for thrift/compiler/test/fixtures/empty-struct/src/module.thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

cimport module.types as _fbthrift_ctypes


cdef shared_ptr[_fbthrift_cbindings.cEmpty] Empty_convert_to_cpp(object inst) except*:
    return (<_fbthrift_ctypes.Empty?>inst)._cpp_obj_FBTHRIFT_ONLY_DO_NOT_USE

cdef object Empty_from_cpp(const shared_ptr[_fbthrift_cbindings.cEmpty]& c_struct):
    return _fbthrift_ctypes.Empty._create_FBTHRIFT_ONLY_DO_NOT_USE(c_struct)

cdef shared_ptr[_fbthrift_cbindings.cNada] Nada_convert_to_cpp(object inst) except*:
    return (<_fbthrift_ctypes.Nada?>inst)._cpp_obj_FBTHRIFT_ONLY_DO_NOT_USE

cdef object Nada_from_cpp(const shared_ptr[_fbthrift_cbindings.cNada]& c_struct):
    return _fbthrift_ctypes.Nada._create_FBTHRIFT_ONLY_DO_NOT_USE(c_struct)

