package com.devopsbuddy.web.i18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.Locale;

/**
 * Created by adminuser on 7/6/17.
 */
@Service
public class I18NService {
    @Autowired
    private MessageSource messageSource;

    public String getMessage(String messageId){
        Locale local = LocaleContextHolder.getLocale();
        return getMessage(messageId,local);

    }

    private String getMessage(String messageId, Locale local) {
        return messageSource.getMessage(messageId,null,local);
    }
}
