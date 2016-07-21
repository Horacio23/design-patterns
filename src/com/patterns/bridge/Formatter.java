package com.patterns.bridge;

import java.util.List;

/**
 * Created by Horacio on 7/21/2016.
 */
public interface Formatter {
    String format(String header, List<Detail> details);
}
