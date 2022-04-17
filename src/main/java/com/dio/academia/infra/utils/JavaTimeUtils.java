package com.dio.academia.infra.utils;

import lombok.NoArgsConstructor;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

@NoArgsConstructor
public class JavaTimeUtils {
    private static final Locale LOCALE_BR = new Locale("pt", "BR");
    public static final DateTimeFormatter LOCAL_DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss", LOCALE_BR);
    public static final DateTimeFormatter LOCAL_DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy", LOCALE_BR);
}
