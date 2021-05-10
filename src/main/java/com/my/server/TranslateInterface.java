package com.my.server;


import org.springframework.stereotype.Service;

public interface TranslateInterface {
    /**
     * 繁体转简体
     * @param orgin
     * @return
     */
    String TCTOCN(String orgin);

    /**
     * 简体转繁体
     * @param orgin
     * @return
     */
    String CNTOTC(String orgin);
}
