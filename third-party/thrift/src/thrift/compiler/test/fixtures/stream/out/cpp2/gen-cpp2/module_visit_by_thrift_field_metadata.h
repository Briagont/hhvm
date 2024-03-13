/**
 * Autogenerated by Thrift for thrift/compiler/test/fixtures/stream/src/module.thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated @nocommit
 */
#pragma once

#include <thrift/lib/cpp2/visitation/visit_by_thrift_field_metadata.h>
#include "thrift/compiler/test/fixtures/stream/gen-cpp2/module_metadata.h"

namespace apache {
namespace thrift {
namespace detail {

template <>
struct VisitByFieldId<::cpp2::FooStreamEx> {
  template <typename F, typename T>
  void operator()([[maybe_unused]] F&& f, int32_t fieldId, [[maybe_unused]] T&& t) const {
    switch (fieldId) {
    default:
      throwInvalidThriftId(fieldId, "::cpp2::FooStreamEx");
    }
  }
};

template <>
struct VisitByFieldId<::cpp2::FooEx> {
  template <typename F, typename T>
  void operator()([[maybe_unused]] F&& f, int32_t fieldId, [[maybe_unused]] T&& t) const {
    switch (fieldId) {
    default:
      throwInvalidThriftId(fieldId, "::cpp2::FooEx");
    }
  }
};

template <>
struct VisitByFieldId<::cpp2::FooEx2> {
  template <typename F, typename T>
  void operator()([[maybe_unused]] F&& f, int32_t fieldId, [[maybe_unused]] T&& t) const {
    switch (fieldId) {
    default:
      throwInvalidThriftId(fieldId, "::cpp2::FooEx2");
    }
  }
};
} // namespace detail
} // namespace thrift
} // namespace apache