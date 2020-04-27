package com.github.danielfabela.partpicker.io;

import java.util.List;

public interface Dao<E> {
    void writeAll(List<E> e);

    List<E> File_Read();
}