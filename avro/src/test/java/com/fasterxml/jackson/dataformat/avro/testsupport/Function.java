package com.fasterxml.jackson.dataformat.avro.testsupport;

public interface Function<T, U> {
    U apply(T input);
}