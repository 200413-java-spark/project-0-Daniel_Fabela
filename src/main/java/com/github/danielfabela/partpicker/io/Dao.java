package com.github.danielfabela.partpicker.io;

import java.util.List;

public interface Dao<E> {
    List<E> readAll();

}