package com.my.server;

import com.my.tool.TranslateTool;
import org.springframework.stereotype.Service;

@Service
public class TranslateImpl implements TranslateInterface{
    /**
     * 繁体转简体
     * @param orgin
     * @return
     */
    @Override
    public String TCTOCN(String orgin) {
        return TranslateTool.TCTOCN(orgin);
    }

    /**
     * 不管那么多直接转换成繁体
     * @param orgin
     * @return
     */
    @Override
    public String CNTOTC(String orgin) {

        return TranslateTool.CNTOTC(orgin);
    }
}
