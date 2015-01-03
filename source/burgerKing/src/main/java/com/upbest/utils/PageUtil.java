package com.upbest.utils;

public class PageUtil {
    public static int getStartRow(final int page, final int rows) {
        int startRow = 0;
        if (page > 1) {
            startRow = (page - 1) * rows;
        }
        return startRow;
    }

    public static int getEndRow(final int page, final int rows) {
        int endRow = 0;
        if (page > 0) {
            endRow = rows;
        }
        return endRow;
    }
}
